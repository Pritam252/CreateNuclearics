package com.github.pritam252.createnuclearics.register.items;

import com.github.pritam252.createnuclearics.register.ModBlocks;
import com.github.pritam252.createnuclearics.register.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

import com.github.pritam252.createnuclearics.register.blocks.ReactorCasing;

public class ReactorCasingBI extends BlockItem {

    public static ReactorCasingBI get() {
        return new ReactorCasingBI(ModBlocks.REACTOR_CASING.get(), ReactorCasingBI.getProperties());
    }
    public ReactorCasingBI(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    public static Item.Properties getProperties() {
        Item.Properties props = new Item.Properties();
        props.tab(ModItems.itemGroup)
            .fireResistant()
            .rarity(Rarity.EPIC)
            .stacksTo(64)
            .setNoRepair();
        return props;
    }
}
