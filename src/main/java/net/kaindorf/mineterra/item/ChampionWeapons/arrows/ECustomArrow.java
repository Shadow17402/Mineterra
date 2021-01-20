package net.kaindorf.mineterra.item.ChampionWeapons.arrows;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ECustomArrow extends EntityArrow {

    public ECustomArrow(World world, EntityLivingBase shooter) {
        super(world);
    }

    @Override
    protected void arrowHit(EntityLivingBase living) {
        super.arrowHit(living);
        if(living != shootingEntity){
            living.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS,10*20,1));
        }
    }

    @Override
    protected ItemStack getArrowStack() {
        return null;
    }
}
