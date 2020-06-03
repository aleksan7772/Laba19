package com.brain.lab19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayRoom {
    public static void main(String[] args) {
        List<Game> physicalGame = new ArrayList<>();
        physicalGame.add(Game.getDisk("NFS", Ganre.RACE, "компьютерная игра в жанре аркадного автосимулятора"));
        physicalGame.add(Game.getDisk("FIFA", Ganre.SPORT, "серия симуляторов футбола, которая разрабатывается студией EA Canada"));
        physicalGame.add(Game.getDisk("DOOM", Ganre.ACTION, "серия компьютерных игр в жанре шутера от первого лица"));
        physicalGame.add(Game.getDisk("Death Stranding", Ganre.ACTION, "Игра рассказывает историю постапокалиптической Америки"));
        List<Game> virtualGame = new ArrayList<>();
        virtualGame.add(Game.getVirtualGame("CSGO", Ganre.ACTION));
        virtualGame.add(Game.getVirtualGame("Dota2", Ganre.ACTION));
        virtualGame.add(Game.getVirtualGame("Crossout", Ganre.RACE));
        virtualGame.add(Game.getVirtualGame("MotoGP", Ganre.SPORT));
        GameConsole gameConsole = new GameConsole(Brand.SONY,"6165486");
        //        for (Game game : physicalGame) System.out.println(game);
        List<Game> physicalGameS =physicalGame.stream()
                .sorted(Comparator.comparing(Game::getGanre))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println();

    }



}
