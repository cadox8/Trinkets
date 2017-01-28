package com.gmail.cadox8.trinkets.utils;

import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<String> colorizeLore(List<String> lore){
        List<String> result = new ArrayList<>();

        lore.forEach(s -> result.add(ChatColor.translateAlternateColorCodes('&', s)));

        return result;
    }

    public static String colorizeName(String name){
        return ChatColor.translateAlternateColorCodes('&', name);
    }
}
