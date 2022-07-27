package net.kistyak.stuffmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHEEPS = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.5F).build();
    public static final FoodProperties BEER = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 150, 0), 1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 150, 1), 1.0f).build();
}
