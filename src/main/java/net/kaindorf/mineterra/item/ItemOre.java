package net.kaindorf.mineterra.item;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemBase{

    private String oreName;

    public ItemOre (String name, String oreName){
        super(name,oreName);
        this.oreName = oreName;
    }

    public void initOreDic(){
        OreDictionary.registerOre(oreName,this);
    }

}
