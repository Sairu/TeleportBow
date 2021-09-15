package com.sairu.teleportbow.events;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityShootBowEvent;

public class events implements Listener {
    @EventHandler
    public static void onShootBow(EntityShootBowEvent e) {
        Projectile projectile = e.getEntity().launchProjectile(EnderPearl.class);
        projectile.setVelocity(e.getProjectile().getVelocity());
        e.setProjectile((Entity)projectile);
    }

    @EventHandler
    private static void noDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = ((Player)e.getEntity()).getPlayer();
            if (p.getLastDamage() > 5.0D)
                e.setCancelled(true);
        }
    }
}
