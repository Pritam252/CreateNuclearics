package com.github.pritam252.createnuclearics.register.items;

import com.github.pritam252.createnuclearics.radiation.IItemRadiation;
import com.github.pritam252.createnuclearics.register.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;

import java.awt.*;
import java.util.ArrayList;

public class Uranium235IngotItem extends Item implements IItemRadiation {

    public static Uranium235IngotItem get()
    {
        Uranium235IngotItem obj = new Uranium235IngotItem(getProperties());
        ArrayList<Component> text = new ArrayList<Component>();
        text.add(Component.nullToEmpty("A Radioactive U-235 Isotope, outputs 1.25 RADS"));
        obj.appendHoverText(null, null, text, TooltipFlag.Default.ADVANCED);
        return obj;
    }
    public Uranium235IngotItem(Properties pProperties) {
        super(pProperties);
    }

    public static Properties getProperties() {
        Properties props = new Properties();
        props.tab(ModItems.itemGroup)
            .stacksTo(64)
            .rarity(Rarity.UNCOMMON);
        return props;
    }

    @Override
    public float getRadiation() {
        return 1.25f;
    }
}
