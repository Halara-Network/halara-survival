package me.coopersully.Survival;

import me.coopersully.Survival.tokens.TokenItems;
import me.coopersully.Survival.tokens.Tokens;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class SurvivalCommands {

    public static void token(CommandSender sender, String[] args) {

        if (!(sender instanceof Player player)) return;

        if (args.length >= 1) {
            String parameter = args[0].toLowerCase();
            switch (parameter) {
                case "help", "info", "about", "?" -> {
                }
                case "buy", "b", "withdraw" -> {
                    withdraw(sender, args);
                    return;
                }
                case "sell", "s", "deposit" -> {
                    deposit(sender, args);
                    return;
                }
                default -> {
                    player.sendMessage(ChatColor.RED + "Usage: /token [help/buy/sell] [amount]");
                    return;
                }
            }
        }

        player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "What are tokens?");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Currency tokens are a physical form of currency used in Halara's survival servers."));
        player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "How do I use them?");
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Currency token items can be converted to/from digital currency with the commands &a/withdraw <amount> &7and &a/deposit&7."));

    }

    public static void withdraw(CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) return;

        Player player = ((Player) sender).getPlayer();
        if (player == null) return;

        if (args.length < 1) {
            player.sendMessage(ChatColor.RED + "Usage: /withdraw <amount>");
            return;
        }

        long total;

        try {
            total = Long.parseLong(args[0]);
        } catch (NumberFormatException e) {
            player.sendMessage(ChatColor.RED + "Currency tokens can only represent whole longegers.");
            return;
        }

        if (total <= 0) {
            player.sendMessage(ChatColor.RED + "Currency tokens can only represent numbers >= 1.");
            return;
        }

        if (HalaraSurvivalPlugin.getEconomy().getBalance(player) < total) {
            player.sendMessage(ChatColor.RED + "You do not have enough money to withdraw that amount.");
            return;
        }

        long currentTotal = total;
        int tokenNum_1b = 0;
        int tokenNum_500m = 0;
        int tokenNum_100m = 0;
        int tokenNum_50m = 0;
        int tokenNum_10m = 0;
        int tokenNum_5m = 0;
        int tokenNum_1m = 0;
        int tokenNum_500k = 0;
        int tokenNum_100k = 0;
        int tokenNum_50k = 0;
        int tokenNum_20k = 0;
        int tokenNum_10k = 0;
        int tokenNum_5k = 0;
        int tokenNum_1k = 0;
        int tokenNum_500 = 0;
        int tokenNum_100 = 0;
        int tokenNum_50 = 0;
        int tokenNum_20 = 0;
        int tokenNum_10 = 0;
        int tokenNum_5 = 0;
        int tokenNum_1 = 0;

        if (currentTotal >= 1000000000) {
            tokenNum_1b = (int) Math.floorDiv(currentTotal, 1000000000);
            currentTotal = currentTotal % 1000000000;
        }

        if (currentTotal >= 500000000) {
            tokenNum_500m = (int) Math.floorDiv(currentTotal, 500000000);
            currentTotal = currentTotal % 500000000;
        }

        if (currentTotal >= 100000000) {
            tokenNum_100m = (int) Math.floorDiv(currentTotal, 100000000);
            currentTotal = currentTotal % 100000000;
        }

        if (currentTotal >= 50000000) {
            tokenNum_50m = (int) Math.floorDiv(currentTotal, 50000000);
            currentTotal = currentTotal % 50000000;
        }

        if (currentTotal >= 10000000) {
            tokenNum_10m = (int) Math.floorDiv(currentTotal, 10000000);
            currentTotal = currentTotal % 10000000;
        }

        if (currentTotal >= 5000000) {
            tokenNum_5m = (int) Math.floorDiv(currentTotal, 5000000);
            currentTotal = currentTotal % 5000000;
        }

        if (currentTotal >= 1000000) {
            tokenNum_1m = (int) Math.floorDiv(currentTotal, 1000000);
            currentTotal = currentTotal % 1000000;
        }

        if (currentTotal >= 500000) {
            tokenNum_500k = (int) Math.floorDiv(currentTotal, 500000);
            currentTotal = currentTotal % 500000;
        }

        if (currentTotal >= 100000) {
            tokenNum_100k = (int) Math.floorDiv(currentTotal, 100000);
            currentTotal = currentTotal % 100000;
        }

        if (currentTotal >= 50000) {
            tokenNum_50k = (int) Math.floorDiv(currentTotal, 50000);
            currentTotal = currentTotal % 50000;
        }

        if (currentTotal >= 20000) {
            tokenNum_20k = (int) Math.floorDiv(currentTotal, 20000);
            currentTotal = currentTotal % 20000;
        }

        if (currentTotal >= 10000) {
            tokenNum_10k = (int) Math.floorDiv(currentTotal, 10000);
            currentTotal = currentTotal % 10000;
        }

        if (currentTotal >= 5000) {
            tokenNum_5k = (int) Math.floorDiv(currentTotal, 5000);
            currentTotal = currentTotal % 5000;
        }

        if (currentTotal >= 1000) {
            tokenNum_1k = (int) Math.floorDiv(currentTotal, 1000);
            currentTotal = currentTotal % 1000;
        }

        if (currentTotal >= 500) {
            tokenNum_500 = (int) Math.floorDiv(currentTotal, 500);
            currentTotal = currentTotal % 500;
        }

        if (currentTotal >= 100) {
            tokenNum_100 = (int) Math.floorDiv(currentTotal, 100);
            currentTotal = currentTotal % 100;
        }

        if (currentTotal >= 50) {
            tokenNum_50 = (int) Math.floorDiv(currentTotal, 50);
            currentTotal = currentTotal % 50;
        }

        if (currentTotal >= 20) {
            tokenNum_20 = (int) Math.floorDiv(currentTotal, 20);
            currentTotal = currentTotal % 20;
        }

        if (currentTotal >= 10) {
            tokenNum_10 = (int) Math.floorDiv(currentTotal, 10);
            currentTotal = currentTotal % 10;
        }

        if (currentTotal >= 5) {
            tokenNum_5 = (int) Math.floorDiv(currentTotal, 5);
            currentTotal = currentTotal % 5;
        }

        if (currentTotal >= 1) {
            tokenNum_1 = (int) currentTotal;
        }

        TokenItems.token1.setAmount(tokenNum_1);
        if (tokenNum_1 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token1);

        TokenItems.token5.setAmount(tokenNum_5);
        if (tokenNum_5 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token5);

        TokenItems.token10.setAmount(tokenNum_10);
        if (tokenNum_10 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token10);

        TokenItems.token20.setAmount(tokenNum_20);
        if (tokenNum_20 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token20);

        TokenItems.token50.setAmount(tokenNum_50);
        if (tokenNum_50 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token50);

        TokenItems.token100.setAmount(tokenNum_100);
        if (tokenNum_100 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token100);

        TokenItems.token500.setAmount(tokenNum_500);
        if (tokenNum_500 > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token500);

        TokenItems.token1k.setAmount(tokenNum_1k);
        if (tokenNum_1k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token1k);

        TokenItems.token5k.setAmount(tokenNum_5k);
        if (tokenNum_5k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token5k);

        TokenItems.token10k.setAmount(tokenNum_10k);
        if (tokenNum_10k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token10k);

        TokenItems.token20k.setAmount(tokenNum_20k);
        if (tokenNum_20k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token20k);

        TokenItems.token50k.setAmount(tokenNum_50k);
        if (tokenNum_50k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token50k);

        TokenItems.token100k.setAmount(tokenNum_100k);
        if (tokenNum_100k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token100k);

        TokenItems.token500k.setAmount(tokenNum_500k);
        if (tokenNum_500k > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token500k);

        TokenItems.token1m.setAmount(tokenNum_1m);
        if (tokenNum_1m > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token1m);

        TokenItems.token5m.setAmount(tokenNum_5m);
        if (tokenNum_5m > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token5m);

        TokenItems.token10m.setAmount(tokenNum_10m);
        if (tokenNum_10m > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token10m);

        TokenItems.token50m.setAmount(tokenNum_50m);
        if (tokenNum_50m > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token50m);

        TokenItems.token100m.setAmount(tokenNum_100m);
        if (tokenNum_100m > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token100m);

        TokenItems.token500m.setAmount(tokenNum_500m);
        if (tokenNum_500m > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token500m);

        TokenItems.token1b.setAmount(tokenNum_1b);
        if (tokenNum_1b > 0) player.getWorld().dropItem(player.getLocation(), TokenItems.token1b);

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', HalaraSurvivalPlugin.economyPrefix + "&7You were granted &a&l$" + Tokens.amountWithCommas(total) + " &7in currency tokens."));
        HalaraSurvivalPlugin.getEconomy().withdrawPlayer(player, total);

    }

    public static void deposit(CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) return;

        Player player = ((Player) sender).getPlayer();
        assert player != null;

        if (args.length > 0) {
            player.sendMessage(ChatColor.RED + "Usage: /deposit");
            return;
        }

        ItemStack[] inv = player.getInventory().getContents();

        long amountDeposited = 0;
        for (ItemStack item : inv) {
            if (item == null) continue;
            if (item.isSimilar(TokenItems.token1)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount());
                amountDeposited += item.getAmount();
            }
            if (item.isSimilar(TokenItems.token5)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 5);
                amountDeposited += (long) item.getAmount() * 5;
            }
            if (item.isSimilar(TokenItems.token10)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 10);
                amountDeposited += (long) item.getAmount() * 10;
            }
            if (item.isSimilar(TokenItems.token20)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 20);
                amountDeposited += (long) item.getAmount() * 20;
            }
            if (item.isSimilar(TokenItems.token50)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 50);
                amountDeposited += (long) item.getAmount() * 50;
            }
            if (item.isSimilar(TokenItems.token100)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 100);
                amountDeposited += (long) item.getAmount() * 100;
            }
            if (item.isSimilar(TokenItems.token500)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 500);
                amountDeposited += (long) item.getAmount() * 500;
            }
            if (item.isSimilar(TokenItems.token1k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 1000);
                amountDeposited += (long) item.getAmount() * 1000;
            }
            if (item.isSimilar(TokenItems.token5k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 5000);
                amountDeposited += (long) item.getAmount() * 5000;
            }
            if (item.isSimilar(TokenItems.token10k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 10000);
                amountDeposited += (long) item.getAmount() * 10000;
            }
            if (item.isSimilar(TokenItems.token20k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 20000);
                amountDeposited += (long) item.getAmount() * 20000;
            }
            if (item.isSimilar(TokenItems.token50k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 50000);
                amountDeposited += (long) item.getAmount() * 50000;
            }
            if (item.isSimilar(TokenItems.token100k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 100000);
                amountDeposited += (long) item.getAmount() * 100000;
            }
            if (item.isSimilar(TokenItems.token500k)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 500000);
                amountDeposited += (long) item.getAmount() * 500000;
            }
            if (item.isSimilar(TokenItems.token1m)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 1000000);
                amountDeposited += (long) item.getAmount() * 1000000;
            }
            if (item.isSimilar(TokenItems.token5m)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() *  5000000);
                amountDeposited += (long) item.getAmount() * 5000000;
            }
            if (item.isSimilar(TokenItems.token10m)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 10000000);
                amountDeposited += (long) item.getAmount() * 10000000;
            }
            if (item.isSimilar(TokenItems.token50m)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 50000000);
                amountDeposited += (long) item.getAmount() * 50000000;
            }
            if (item.isSimilar(TokenItems.token100m)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 100000000);
                amountDeposited += (long) item.getAmount() * 100000000;
            }
            if (item.isSimilar(TokenItems.token500m)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 500000000);
                amountDeposited += (long) item.getAmount() * 500000000;
            }
            if (item.isSimilar(TokenItems.token1b)) {
                player.getInventory().remove(item);
                HalaraSurvivalPlugin.getEconomy().depositPlayer(player, (long) item.getAmount() * 1000000000);
                amountDeposited += (long) item.getAmount() * 1000000000;
            }
        }

        if (amountDeposited == 0) {
            player.sendMessage(ChatColor.RED + "No tokens were found currently in your inventory.");
            return;
        }

        player.sendMessage(ChatColor.translateAlternateColorCodes('&', HalaraSurvivalPlugin.economyPrefix + "&7You deposited &a&l$" + Tokens.amountWithCommas(amountDeposited) + "&7 to your account."));

    }

}
