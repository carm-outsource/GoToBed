package com.carmwork.plugin.gotobed;

import com.carmwork.plugin.gotobed.listeners.PlayerListener;
import com.carmwork.plugin.gotobed.managers.ConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Main extends JavaPlugin {

    private static Main instance;

    public static Main getInstance() {
        return Main.instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        logInfo("加载配置文件中");
        ConfigManager.loadConfig();

        logInfo("注册监听器");
        Bukkit.getPluginManager().registerEvents(new PlayerListener(),this);

    }

    public static void logInfo(String message) {
        Main.getInstance().getLogger().log(Level.INFO, message);
    }

}