package me.coopersully.Survival.tokens;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class TokenItems {

    public static ItemStack token1 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token1Meta = token1.getItemMeta();

    public static ItemStack token5 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token5Meta = token5.getItemMeta();

    public static ItemStack token10 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token10Meta = token10.getItemMeta();

    public static ItemStack token20 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token20Meta = token20.getItemMeta();

    public static ItemStack token50 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token50Meta = token50.getItemMeta();

    public static ItemStack token100 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token100Meta = token100.getItemMeta();

    public static ItemStack token500 = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token500Meta = token500.getItemMeta();

    public static ItemStack token1k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token1kMeta = token1k.getItemMeta();

    public static ItemStack token5k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token5kMeta = token5k.getItemMeta();

    public static ItemStack token10k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token10kMeta = token10k.getItemMeta();

    public static ItemStack token20k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token20kMeta = token20k.getItemMeta();

    public static ItemStack token50k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token50kMeta = token50k.getItemMeta();

    public static ItemStack token100k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token100kMeta = token100k.getItemMeta();

    public static ItemStack token500k = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token500kMeta = token500k.getItemMeta();

    public static ItemStack token1m = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token1mMeta = token1m.getItemMeta();

    public static ItemStack token5m = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token5mMeta = token5m.getItemMeta();

    public static ItemStack token10m = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token10mMeta = token10m.getItemMeta();

    public static ItemStack token50m = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token50mMeta = token50m.getItemMeta();

    public static ItemStack token100m = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token100mMeta = token100m.getItemMeta();

    public static ItemStack token500m = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token500mMeta = token500m.getItemMeta();

    public static ItemStack token1b = new ItemStack(Material.CHAIN_COMMAND_BLOCK);
    public static ItemMeta token1bMeta = token1b.getItemMeta();

    public static List<String> temporaryLore = new ArrayList<String>();

    public static void registerCurrencyItems() {

        token1Meta.setCustomModelData(1);
        token1Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.add(ChatColor.DARK_GRAY + "This token holds a value of $1.00");
        token1Meta.setLore(temporaryLore);
        token1.setItemMeta(token1Meta);

        token5Meta.setCustomModelData(5);
        token5Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $5.00");
        token5Meta.setLore(temporaryLore);
        token5.setItemMeta(token5Meta);

        token10Meta.setCustomModelData(10);
        token10Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $10.00");
        token10Meta.setLore(temporaryLore);
        token10.setItemMeta(token10Meta);

        token20Meta.setCustomModelData(20);
        token20Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $20.00");
        token20Meta.setLore(temporaryLore);
        token20.setItemMeta(token20Meta);

        token50Meta.setCustomModelData(50);
        token50Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $50.00");
        token50Meta.setLore(temporaryLore);
        token50.setItemMeta(token50Meta);

        token100Meta.setCustomModelData(100);
        token100Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $100.00");
        token100Meta.setLore(temporaryLore);
        token100.setItemMeta(token100Meta);

        token500Meta.setCustomModelData(500);
        token500Meta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $500.00");
        token500Meta.setLore(temporaryLore);
        token500.setItemMeta(token500Meta);

        token1kMeta.setCustomModelData(1000);
        token1kMeta.setDisplayName(ChatColor.YELLOW + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $1,000.00");
        token1kMeta.setLore(temporaryLore);
        token1k.setItemMeta(token1kMeta);

        token5kMeta.setCustomModelData(5000);
        token5kMeta.setDisplayName(ChatColor.AQUA + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $5,000.00");
        token5kMeta.setLore(temporaryLore);
        token5k.setItemMeta(token5kMeta);

        token10kMeta.setCustomModelData(10000);
        token10kMeta.setDisplayName(ChatColor.AQUA + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $10,000.00");
        token10kMeta.setLore(temporaryLore);
        token10k.setItemMeta(token10kMeta);

        token20kMeta.setCustomModelData(20000);
        token20kMeta.setDisplayName(ChatColor.AQUA + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $20,000.00");
        token20kMeta.setLore(temporaryLore);
        token20k.setItemMeta(token20kMeta);

        token50kMeta.setCustomModelData(50000);
        token50kMeta.setDisplayName(ChatColor.AQUA + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $50,000.00");
        token50kMeta.setLore(temporaryLore);
        token50k.setItemMeta(token50kMeta);

        token100kMeta.setCustomModelData(100000);
        token100kMeta.setDisplayName(ChatColor.AQUA + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $100,000.00");
        token100kMeta.setLore(temporaryLore);
        token100k.setItemMeta(token100kMeta);

        token500kMeta.setCustomModelData(500000);
        token500kMeta.setDisplayName(ChatColor.AQUA + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $500,000.00");
        token500kMeta.setLore(temporaryLore);
        token500k.setItemMeta(token500kMeta);

        token1mMeta.setCustomModelData(1000000);
        token1mMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $1,000,000.00");
        token1mMeta.setLore(temporaryLore);
        token1m.setItemMeta(token1mMeta);

        token5mMeta.setCustomModelData(5000000);
        token5mMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $5,000,000.00");
        token5mMeta.setLore(temporaryLore);
        token5m.setItemMeta(token5mMeta);

        token10mMeta.setCustomModelData(10000000);
        token10mMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $10,000,000.00");
        token10mMeta.setLore(temporaryLore);
        token10m.setItemMeta(token10mMeta);

        token50mMeta.setCustomModelData(50000000);
        token50mMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $50,000,000.00");
        token50mMeta.setLore(temporaryLore);
        token50m.setItemMeta(token50mMeta);

        token100mMeta.setCustomModelData(100000000);
        token100mMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $100,000,000.00");
        token100mMeta.setLore(temporaryLore);
        token100m.setItemMeta(token100mMeta);

        token500mMeta.setCustomModelData(500000000);
        token500mMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $500,000,000.00");
        token500mMeta.setLore(temporaryLore);
        token500m.setItemMeta(token500mMeta);

        token1bMeta.setCustomModelData(1000000000);
        token1bMeta.setDisplayName(ChatColor.RED + "Currency Token");
        temporaryLore.set(0, ChatColor.DARK_GRAY + "This token holds a value of $1,000,000,000.00");
        token1bMeta.setLore(temporaryLore);
        token1b.setItemMeta(token1bMeta);

    }

}
