package com.carmwork.plugin.gotobed.managers;

import com.carmwork.plugin.gotobed.Main;
import com.carmwork.plugin.gotobed.utils.MessageParser;
import net.minecraft.util.MathHelper;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

import java.util.Objects;

public class ConfigManager {


    private static FileConfiguration configuration;

    public static void loadConfig() {

        Main.getInstance().saveDefaultConfig();
        Main.getInstance().reloadConfig();

        configuration = Main.getInstance().getConfig();

    }

    /**
     * #  - 支持使用 “&” 代替小结号作为颜色符号
     * #  - 变量： %(player)  躺上床的玩家名
     * #  - 变量： %(sleeping)已经躺上床的玩家数
     * #  - 变量： %(online)  在线玩家数
     *
     * @return 通知消息
     */
    public static String getAlertMessage(Player player) {
        return MessageParser.parseColor(Objects.requireNonNull(getConfiguration().getString(
                        "settings.message",
                        "&8☾ &f%(player) &7喊你睡觉啦！(&f%(sleeping)/%(online)&7)"
                )))
                .replace("%(player)", player.getName())
                .replace("%(online)", Integer.toString(getNightSkippingRequirement(player.getWorld())))
                .replace("%(sleeping)", Integer.toString(getSleepingPlayers(player.getWorld())));
    }

    public static int getSleepingPlayers(World world) {
        return (int) world.getPlayers().stream().filter(LivingEntity::isSleeping).count();
    }

    public static int getNightSkippingRequirement(World world) {
        int percentage = world.getGameRuleValue(GameRule.PLAYERS_SLEEPING_PERCENTAGE);
        return Math.max(1, MathHelper.f((float) (world.getPlayers().size() * percentage) / 100.0f));
    }

    public static FileConfiguration getConfiguration() {
        return configuration;
    }
}
