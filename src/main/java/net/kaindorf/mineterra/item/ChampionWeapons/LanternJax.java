package net.kaindorf.mineterra.item.ChampionWeapons;

import net.kaindorf.mineterra.item.tool.ItemSword;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class LanternJax extends ItemSword {

    public LanternJax(ToolMaterial material, String name) {
        super(material, name);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.setFire(8);
        return super.hitEntity(stack, target, attacker);
    }
}
