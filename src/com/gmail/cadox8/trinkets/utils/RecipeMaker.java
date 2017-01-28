package com.gmail.cadox8.trinkets.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RecipeMaker {

    private final ShapedRecipe recipe;

    public RecipeMaker(ItemStack result){
        recipe = new ShapedRecipe(result);
    }

    public RecipeMaker setShaped(String... shape){
        recipe.shape(shape[0] + shape[1] + shape[2], shape[3] + shape[4] + shape[5], shape[6] + shape[7] + shape[8]);
        return this;
    }

    public RecipeMaker setIngredient(char id, Material item, int data){
        recipe.setIngredient(id, item, data);
        return this;
    }

    public RecipeMaker setIngredient(char id, Material item){
        recipe.setIngredient(id, item);
        return this;
    }

    public ShapedRecipe build(){
        return recipe;
    }
}
