package com.carmwork.plugin.gotobed.listeners;

import com.carmwork.plugin.gotobed.Main;
import com.carmwork.plugin.gotobed.managers.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class PlayerListener implements Listener {

    @EventHandler
    public void onBed(PlayerBedEnterEvent event) {
        if (event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            new BukkitRunnable() {
                @Override
                public void run() {
                    if (event.getPlayer().isOnline() && event.getPlayer().isSleeping()) {
                        Bukkit.getServer().broadcastMessage(ConfigManager.getAlertMessage(event.getPlayer()));
                    }
                }
            }.runTaskLater(Main.getInstance(), 5L);
        }
    }

}
