package Item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class itemManager {
    public static ItemStack TeleportBow;

    public static void init(){
        createBow();
    };
    public static void createBow(){
        ItemStack item = new ItemStack(Material.BOW,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§2Teleport Bow");
        meta.addEnchant(Enchantment.ARROW_DAMAGE,1,false);
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        TeleportBow = item;
    }
}
