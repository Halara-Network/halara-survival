package me.coopersully.Survival;

import me.coopersully.Survival.tokens.TokenItems;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class HalaraSurvivalPlugin extends JavaPlugin {

    public static String economyPrefix = "&eEconomy&r \u00BB ";
    public static String prefix = "&eHalara&r \u00BB ";
    private static Economy econ;

    public static Economy getEconomy() {
        return econ;
    }

    public void onEnable() {

        // Vault hook
        if (!setupEconomy()) {
            this.getLogger().severe("No Vault-compatible economy plugin was found; disabling plugin.");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        // Generate config
        saveDefaultConfig();

        // Register items & menus
        TokenItems.registerCurrencyItems();
    }

    public void onDisable() {

    }

    private boolean setupEconomy() {
        if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
            return false;
        }

        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return (econ != null);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        switch (label) {
            case "token", "tokens" -> {
                SurvivalCommands.token(sender, args);
                return true;
            }
            case "withdraw", "buytoken", "buytokens" -> {
                SurvivalCommands.withdraw(sender, args);
                return true;
            }
            case "deposit", "selltoken", "selltokens" -> {
                SurvivalCommands.deposit(sender, args);
                return true;
            }
        }

        return false;
    }

}
