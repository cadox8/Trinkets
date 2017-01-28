package com.gmail.cadox8.trinkets.trinket.list;

import com.gmail.cadox8.trinkets.effects.Effects;
import com.gmail.cadox8.trinkets.trinket.Trinket;
import com.gmail.cadox8.trinkets.utils.ItemMaker;
import com.gmail.cadox8.trinkets.utils.RecipeMaker;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Arrays;
import java.util.List;

public class RabbitBoots extends Trinket{

    private static List<String> lore = Arrays.asList("&rJump like a rabbit :D");

    public RabbitBoots(){
        super("&aRabbit Boots", lore, Effects.JUMP);
    }

    public ItemStack getItem(){
        return new ItemMaker(Material.CHAINMAIL_BOOTS).setDisplayName(getName()).setLore(lore).addItemFlag(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS).addUnsafeEnchant(Enchantment.ARROW_DAMAGE, 1).build();
    }

    public ShapedRecipe recipe(){
        RecipeMaker recipe = new RecipeMaker(getItem());
        recipe.setShaped("x", "a", "x", "x", "g", "x", "d", "a", "d");
        recipe.setIngredient('x', Material.IRON_INGOT);
        recipe.setIngredient('a', Material.AIR);
        recipe.setIngredient('g', Material.GOLD_INGOT);
        recipe.setIngredient('d', Material.RABBIT_FOOT);
        return recipe.build();
    }
}
