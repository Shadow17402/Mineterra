package net.kaindorf.mineterra.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityPoroKing extends EntityLiving {

    public EntityPoroKing(World worldIn) {
        super(worldIn);
    }

    @Override
    public void onDeath(DamageSource cause) {
        //super.onDeath(cause);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

}
