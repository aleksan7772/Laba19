package com.brain.lab19;

import javax.xml.stream.FactoryConfigurationError;

public class Game {
    private final String name;
    private final Ganre ganre;
    private final Type type;

    private Game(String name, Ganre ganre, Type type) {
        this.name = name;
        this.ganre = ganre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Ganre getGanre() {
        return ganre;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        VIRTUAL,
        PHYSICAL;
    }

//    static GameDisk getDisk() {
//        return gameDisk;
//    }

    static class GameDisk extends Game{
        private final String description;
        private String gameData;

        private GameDisk(String name, Ganre ganre, Type type) {
            super(name, ganre, type);
            this.gameData = gameData;
            this.description = "серия гоночных компьютерных игр";
            final Game game = new Game(gameData, Ganre.RACE, Type.PHYSICAL);
        }


        public String getDescription() {
            return description;
        }
    }

    static class VirtualGame {
        private int rating;
        private final String gameData;

        private VirtualGame(int rating, String gameData) {
            this.rating = 5;
            this.gameData = "Dota 2";
            final Game game = new Game(gameData, Ganre.ACTION, Type.VIRTUAL);
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }
}
