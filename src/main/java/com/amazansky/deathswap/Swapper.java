package com.amazansky.deathswap;

import org.bukkit.Bukkit;

//This class handles the swapping
public class Swapper implements Runnable {

    DSgame game;

    public Swapper(DSgame g){
        game = g;
    }

    @Override
    public void run() {
        if(game.swapping){
            game.swap();

            game.startTimer(game.getSwapInterval());
        }
    }
}
