package com.sairu.teleportbow.events;

import Item.itemManager;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.MainHand;

public class events implements Listener {

    @EventHandler
    public static void onShootBow(EntityShootBowEvent e) {
        if (e.getEntity() instanceof Player) {
            if (e.getBow().equals(itemManager.TeleportBow)) {
                Projectile projectile = e.getEntity().launchProjectile(EnderPearl.class);
                projectile.setVelocity(e.getProjectile().getVelocity());
                e.setProjectile((Entity) projectile);
            }
        }
    }

    @EventHandler
    public static void noDamageTeleport(PlayerTeleportEvent e) {
        Player p = e.getPlayer();
            if (e.getCause() == PlayerTeleportEvent.TeleportCause.ENDER_PEARL) {
                e.setCancelled(true);
                p.setNoDamageTicks(1);
                p.teleport(e.getTo());
        }
    }
}