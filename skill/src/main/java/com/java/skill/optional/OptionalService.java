package com.java.skill.optional;

import java.util.HashMap;
import java.util.Optional;

public class OptionalService {
    HashMap<String, Player> storePlayer = new HashMap<>();
    HashMap<String,Bat> storeBat = new HashMap<>();

    Optional<Player> findPlayerByName(String name){
        return Optional.ofNullable(storePlayer.get(name)); //null probability
    }

}
