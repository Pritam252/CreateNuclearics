package com.github.pritam252.createnuclearics.register.items;

import com.github.pritam252.createnuclearics.register.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TooltipFlag;

import java.util.ArrayList;

public class GraphiteIngotItem extends Item {
    public static GraphiteIngotItem get() {
        GraphiteIngotItem obj = new GraphiteIngotItem(getProperties());
        ArrayList<Component> text = new ArrayList<Component>();
        text.add(Component.nullToEmpty("Graphite Ingot, Made from 100% Carbon"));
        obj.appendHoverText(null, null, text, TooltipFlag.Default.ADVANCED);
        return obj;
    }

    public GraphiteIngotItem(Properties pProperties) {
        super(pProperties);
    }

    public static Item.Properties getProperties() {
        Item.Properties props = new Item.Properties();
        props.tab(ModItems.itemGroup)
            .fireResistant();
        return props;
    }
}
