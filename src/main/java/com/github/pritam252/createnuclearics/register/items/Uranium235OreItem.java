package com.github.pritam252.createnuclearics.register.items;

import com.github.pritam252.createnuclearics.radiation.IItemRadiation;
import com.github.pritam252.createnuclearics.register.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;

import java.util.ArrayList;

public class Uranium235OreItem extends Item implements IItemRadiation {

    public static Uranium235OreItem get() {
        Uranium235OreItem obj = new Uranium235OreItem(getProperties());
        ArrayList<Component> text = new ArrayList<Component>();
        text.add(Component.nullToEmpty("A Radioactive U-235 Isotope, outputs 1.00 RADS (Because of Ore)"));
        obj.appendHoverText(null, null, text, TooltipFlag.Default.ADVANCED);
        return obj;
    }
    public Uranium235OreItem(Properties pProperties) {
        super(pProperties);
    }

    public static Item.Properties getProperties() {
        Item.Properties props = new Item.Properties();
        props.tab(ModItems.itemGroup)
            .stacksTo(64)
            .rarity(Rarity.UNCOMMON);
        return props;
    }

    @Override
    public float getRadiation() {
        return 1.0f;
    }
}
