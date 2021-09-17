package com.sairu.teleportbow;

import Item.itemManager;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commandbow implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String lable, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player)sender;
            player.getInventory().addItem(itemManager.TeleportBow);
            player.sendMessage("§dYou recive a Teleport Bow");
        }
        return true;
    }
}
