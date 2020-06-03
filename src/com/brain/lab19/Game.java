package com.brain.lab19;


public class Game {
    private final String name;
    private final Ganre ganre;
    private Type type;

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


    public enum Type {
        VIRTUAL,
        PHYSICAL;
    }

    public static GameDisk getDisk(String name, Ganre ganre, String description) {

        return new GameDisk(name, ganre, description);

    }

    public static VirtualGame getVirtualGame(String name, Ganre ganre) {
        return new VirtualGame(name, ganre);

    }

    static class GameDisk extends Game {
        private final String description; // описание

        private GameDisk(String name, Ganre ganre, String description) {
            super(name, ganre, Type.PHYSICAL);
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    static class VirtualGame extends Game {
        private int rating;


        private VirtualGame(String name, Ganre ganre) {
            super(name, ganre, Type.VIRTUAL);
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (name != null ? !name.equals(game.name) : game.name != null) return false;
        if (ganre != game.ganre) return false;
        return type == game.type;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (ganre != null ? ganre.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", ganre=" + ganre +
                '}';
    }
}
