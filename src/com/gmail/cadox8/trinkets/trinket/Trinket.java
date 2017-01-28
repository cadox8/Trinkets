package com.gmail.cadox8.trinkets.trinket;

import com.gmail.cadox8.trinkets.effects.Effects;
import com.gmail.cadox8.trinkets.utils.Utils;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import java.util.Arrays;
import java.util.List;

public abstract class Trinket {

    @Getter @Setter private String name;
    @Getter private List<String> lore;
    @Getter @Setter private List<Effects> effects;

    public Trinket(String name, List<String> lore, Effects effects){
        this(name, lore, Arrays.asList(effects));
    }

    public Trinket(String name, List<String> lore, List<Effects> effects){
        this.name = Utils.colorizeName(name);
        this.lore = Utils.colorizeLore(lore);
        this.effects = effects;

        new TrinketManager().registerTrinket(this);
    }

    public abstract ItemStack getItem();
    public abstract ShapedRecipe recipe();
}
