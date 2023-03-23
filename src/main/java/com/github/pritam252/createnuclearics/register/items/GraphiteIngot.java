package com.github.pritam252.createnuclearics.register.items;

import com.github.pritam252.createnuclearics.register.ModItems;
import net.minecraft.world.item.Item;

public class GraphiteIngot extends Item {
    public static GraphiteIngot get() {
        Item.Properties props = new Item.Properties();
        props.tab(ModItems.itemGroup);
        props.fireResistant();
        return new GraphiteIngot(props);
    }

    public GraphiteIngot(Properties pProperties) {
        super(pProperties);
    }
}
