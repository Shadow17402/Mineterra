package net.kaindorf.mineterra.item.ChampionWeapons;

import net.kaindorf.mineterra.item.tool.ItemAxe;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class DariusAxe extends ItemAxe {

    public DariusAxe(ToolMaterial material, String name) {
        super(material, name);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.addPotionEffect(new PotionEffect(MobEffects.WITHER,10,1));
        return super.hitEntity(stack, target, attacker);
    }
}
