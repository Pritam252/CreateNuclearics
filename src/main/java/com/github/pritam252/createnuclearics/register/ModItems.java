package com.github.pritam252.createnuclearics.register;

import com.github.pritam252.createnuclearics.CreateNuclearics;
import com.github.pritam252.createnuclearics.radiation.IItemRadiation;
import com.github.pritam252.createnuclearics.radiation.RadListItem;
import com.github.pritam252.createnuclearics.register.items.GraphiteIngotItem;
import com.github.pritam252.createnuclearics.register.items.ReactorCasingBI;
import com.github.pritam252.createnuclearics.register.items.Uranium235IngotItem;
import com.github.pritam252.createnuclearics.register.items.Uranium235OreItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.github.pritam252.createnuclearics.BuildConfig;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static CreativeModeTab itemGroup = new CreativeModeTab(BuildConfig.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REACTOR_CASING.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BuildConfig.MODID);

    public static final RegistryObject<Item> REACTOR_CASING = regitem("reactor_casing", ReactorCasingBI::get);

    public static final RegistryObject<Item> GRAPHITE_INGOT = regitem("graphite_ingot", GraphiteIngotItem::get);

    public static final RegistryObject<Item> URANIUM235_ORE = regitem("uranium235_ore", Uranium235OreItem::get);

    public static final RegistryObject<Item> URANIUM235_INGOT = regitem("uranium235_ingot", Uranium235IngotItem::get);

    public static void register(CreateRegistrate registrate) {
        registrate.creativeModeTab(()->itemGroup, BuildConfig.DISPLAY_NAME);
        ITEMS.register(CreateNuclearics.modEventBus);
    }

    public static RegistryObject<Item> regitem(String key, Supplier<? extends Item> lambda) {
        Class<?>[] interfaces = lambda.getClass().getInterfaces();
        RegistryObject<Item> prepReturn = ITEMS.register(key, lambda);
        System.out.println("Registering object: " + prepReturn.getId());
        for (Class<?> implemented : interfaces) {
            System.out.println("Object has interface: " + interfaces.getClass().getName());
            if (implemented.equals(IItemRadiation.class)) {
                RadListItem.radList.add(prepReturn);
                javax.swing.JOptionPane.showMessageDialog(null, "Registering radioactive object: " + prepReturn.getId());
            }
        }
        return prepReturn;
    }
}
