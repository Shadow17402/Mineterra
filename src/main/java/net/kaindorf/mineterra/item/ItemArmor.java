package net.kaindorf.mineterra.item;

import net.kaindorf.mineterra.Mineterra;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemArmor extends net.minecraft.item.ItemArmor {

    private String name;

    public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        Mineterra.proxy.registerItemRenderer(this, 0, name);
    }

}
