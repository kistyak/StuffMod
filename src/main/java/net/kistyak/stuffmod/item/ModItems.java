package net.kistyak.stuffmod.item;

import net.kistyak.stuffmod.StuffMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StuffMod.MOD_ID);

    public static final RegistryObject<Item> CHEEPS = ITEMS.register("cheeps",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CHEEPS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
