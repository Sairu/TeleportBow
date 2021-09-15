package com.sairu.teleportbow;

import org.bukkit.command.CommandExecutor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commandbow implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            ItemStack bow = new ItemStack(Material.BOW);
            ItemStack arrow = new ItemStack(Material.ARROW);
            bow.setAmount(1);
            arrow.setAmount(12);
            player.getInventory().addItem(new ItemStack[] { bow, arrow });
        }
        return true;
    }
}
