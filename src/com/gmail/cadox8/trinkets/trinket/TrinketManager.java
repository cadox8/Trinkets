package com.gmail.cadox8.trinkets.trinket;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class TrinketManager {

    @Getter private List<Trinket> trinkets;

    public TrinketManager(){
        trinkets = new ArrayList<>();
    }

    public void registerTrinket(Trinket trinket){
        trinkets.add(trinket);
    }

    public void registerTrinket(Trinket... trinkets){
        for (Trinket t : trinkets){
            registerTrinket(t);
        }
    }
}
