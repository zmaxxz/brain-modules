package ua.zp.bainacad.lab19;

public class Game {
    private final String name;
    private final Genre genre;
    private final Type type;

    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public static GameDisk getDisk(String name, Game.Genre genre, String description) {
        return new GameDisk(name, genre, description);
    }

    public static VirtualGame getVirtualGame(String name, Game.Genre genre) {
        return new VirtualGame(name, genre);
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }

    enum Type {
        VIRTUAL,
        PHYSICAL;
    }

    enum Genre {
        ACTION,
        SPORT,
        RACE;
    }
    static class GameDisk {
        final String description;
        final Game data;

        GameDisk(String name, Game.Genre genre, String description) {
            this.description = description;
            this.data = new Game(name, genre, Game.Type.PHYSICAL);
        }

        String getDescription() {
            return description;
        }

        Game getData() {
            return data;
        }

    }

    static class VirtualGame {
        int rating;
        final Game data;

        VirtualGame(String name, Game.Genre genre) {
            this.data = new Game(name, genre, Game.Type.VIRTUAL);
        }

        int getRating() {
            return rating;
        }

        void setRating(int rating) {
            this.rating = rating;
        }

        Game getData() {
            return data;
        }

    }
}
