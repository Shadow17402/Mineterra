package net.kaindorf.mineterra.item;

import net.kaindorf.mineterra.Mineterra;
import net.kaindorf.mineterra.item.ChampionWeapons.BowAshe;
import net.kaindorf.mineterra.item.ChampionWeapons.DariusAxe;
import net.kaindorf.mineterra.item.ChampionWeapons.LanternJax;
import net.kaindorf.mineterra.item.ChampionWeapons.SwordYi;
import net.kaindorf.mineterra.item.ChampionWeapons.arrows.AsheArrow;
import net.kaindorf.mineterra.item.tool.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase ingotCopper = new ItemBase("ingot_copper","ingotCopper");
    public static ItemBase voidGem = new ItemBase("void_gem","voidGem");
    public static ItemSword copperSword = new ItemSword(Mineterra.copperToolMaterial, "copper_sword");
    public static ItemPickaxe copperPickaxe = new ItemPickaxe(Mineterra.copperToolMaterial, "copper_pickaxe");
    public static ItemAxe copperAxe = new ItemAxe(Mineterra.copperToolMaterial,"copper_axe");
    public static ItemShovel copperShovel = new ItemShovel(Mineterra.copperToolMaterial,"copper_shovel");
    public static ItemHoe copperHoe = new ItemHoe(Mineterra.copperToolMaterial,"copper_hoe");
    public static ItemArmor copperHelmet = new ItemArmor(Mineterra.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copper_helmet");
    public static ItemArmor copperChestplate = new ItemArmor(Mineterra.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copper_chestplate");
    public static ItemArmor copperLeggings  = new ItemArmor(Mineterra.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copper_leggings");
    public static ItemArmor copperBoots = new ItemArmor(Mineterra.copperArmorMaterial, EntityEquipmentSlot.FEET, "copper_boots");
    public static ItemArmor poroKingCrown = new ItemArmor(Mineterra.CrownArmorMaterial, EntityEquipmentSlot.HEAD, "poro_king_crown");
    public static SwordYi swordYi = new SwordYi(Mineterra.copperToolMaterial,"sword_yi");
    public static LanternJax lanternJax = new LanternJax(Mineterra.copperToolMaterial,"lantern_jax");
    public static DariusAxe axeDarius = new DariusAxe(Mineterra.copperToolMaterial,"darius_axe");
    public static BowAshe bowAshe = new BowAshe("ashe_bow",7000,5000);
    public static AsheArrow arrowAshe = new AsheArrow("ashe_arrow");

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                ingotCopper,
                voidGem,
                copperSword,
                copperPickaxe,
                copperAxe,
                copperShovel,
                copperHoe,
                copperHelmet,
                copperChestplate,
                copperLeggings,
                copperBoots,
                poroKingCrown,
                swordYi,
                lanternJax,
                axeDarius,
                bowAshe,
                arrowAshe
        );
    }

    public static void registerModels() {
        ingotCopper.registerItemModel();
        voidGem.registerItemModel();
        copperSword.registerItemModel();
        copperPickaxe.registerItemModel();
        copperAxe.registerItemModel();
        copperShovel.registerItemModel();
        copperHoe.registerItemModel();
        copperHelmet.registerItemModel();
        copperChestplate.registerItemModel();
        copperLeggings.registerItemModel();
        copperBoots.registerItemModel();
        poroKingCrown.registerItemModel();
        swordYi.registerItemModel();
        lanternJax.registerItemModel();
        axeDarius.registerItemModel();
        bowAshe.registerItemModel();
        arrowAshe.registerItemModel();
    }

}
