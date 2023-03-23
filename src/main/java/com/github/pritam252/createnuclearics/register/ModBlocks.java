package com.github.pritam252.createnuclearics.register;

import com.github.pritam252.createnuclearics.BuildConfig;
import com.github.pritam252.createnuclearics.CreateNuclearics;
import com.github.pritam252.createnuclearics.register.blocks.ReactorCasing;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildConfig.MODID);

    public static final RegistryObject<Block> REACTOR_CASING = BLOCKS.register("reactor_casing", ReactorCasing::get);
    public static void register(CreateRegistrate registrate) {
        BLOCKS.register(CreateNuclearics.modEventBus);
    }
}
