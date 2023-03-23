package com.github.pritam252.createnuclearics.register.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class ReactorCasing extends Block {

    public static ReactorCasing get() {
        Block.Properties props = BlockBehaviour.Properties.of(Material.METAL);
        props.explosionResistance(10.0f);
        props.strength(0.2f);
        props.sound(SoundType.METAL);
        return new ReactorCasing(props);
    }
    public ReactorCasing(Properties pProperties) {
        super(pProperties);
    }
}
