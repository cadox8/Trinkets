package com.gmail.cadox8.trinkets;

import com.gmail.cadox8.trinkets.trinket.TrinketManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class Trinkets extends JavaPlugin{

    @Getter private static Trinkets instance;

    @Getter private TrinketManager trinketManager;

    @Override
    public void onEnable(){
        instance = this;

        trinketManager = new TrinketManager();
        loadRecipes();
    }

    private void loadRecipes(){
        trinketManager.getTrinkets().forEach(t -> getServer().addRecipe(t.recipe()));
    }
}
