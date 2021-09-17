package com.sairu.teleportbow;

import Item.itemManager;
import org.bukkit.Material;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commandbow implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            ItemStack arrow = new ItemStack(Material.ARROW,1);
            arrow.setAmount(32);
            player.getInventory().addItem(itemManager.TeleportBow,arrow);
            player.sendMessage("§dYou recive a Teleport Bow");
        }
        return true;
    }
}
