package com.sairu.teleportbow;

import Item.itemManager;
import com.sairu.teleportbow.events.events;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

public class Main extends JavaPlugin {
    events ev = new events();
    itemManager i = new itemManager();

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(" §2Plugin on start...");
        itemManager.init();
        registerEvents();
        registerCommands();
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(" §4Plugin Disable");
    }

    public void registerEvents() {
        getServer().getPluginManager().registerEvents((Listener)new events(), (Plugin)this);
    }

    public void registerCommands() {
        getCommand("bow").setExecutor(new Commandbow());
    }
}
