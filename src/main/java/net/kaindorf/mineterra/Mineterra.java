package net.kaindorf.mineterra;

import net.kaindorf.mineterra.proxy.CommonProxy;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sun.security.krb5.internal.APRep;

@Mod(modid = Mineterra.MODID, name = Mineterra.NAME, version = Mineterra.VERSION)
public class Mineterra
{
    public static final String MODID = "mineterra";
    public static final String NAME = "Mineterra Mod";
    public static final String VERSION = "1.0";
    public static final TutorialTab creativeTab = new TutorialTab();
    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", MODID + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final ItemArmor.ArmorMaterial CrownArmorMaterial = EnumHelper.addArmorMaterial("CROWN", MODID + ":crown", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    @Mod.Instance
    public static Mineterra instance;

    @SidedProxy(serverSide = "net.kaindorf.mineterra.proxy.ServerProxy", clientSide = "net.kaindorf.mineterra.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
