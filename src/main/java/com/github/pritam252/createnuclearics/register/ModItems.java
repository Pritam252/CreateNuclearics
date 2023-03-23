package com.github.pritam252.createnuclearics.register;

import com.github.pritam252.createnuclearics.CreateNuclearics;
import com.github.pritam252.createnuclearics.register.items.ReactorCasingBI;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.github.pritam252.createnuclearics.BuildConfig;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static CreativeModeTab itemGroup = new CreativeModeTab(BuildConfig.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REACTOR_CASING.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BuildConfig.MODID);

    public static final RegistryObject<Item> REACTOR_CASING = ITEMS.register("reactor_casing", ReactorCasingBI::get);

    public static void register(CreateRegistrate registrate) {
        registrate.creativeModeTab(()->itemGroup, BuildConfig.DISPLAY_NAME);
        ITEMS.register(CreateNuclearics.modEventBus);
    }
}
