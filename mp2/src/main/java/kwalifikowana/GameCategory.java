package kwalifikowana;

import kwalifikowana.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GameCategory {
    private int id;
    public String categoryName;

    private Map<String, Game> games = new TreeMap<>();

    public GameCategory(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public void addGame(Game game) {
        if (!games.containsKey(game.name)) {
            games.put(game.name, game);
            game.addGameCategory(this);
        }
    }

    public Game findGame(String name) throws Exception {
        if (!games.containsKey(name)) {
            throw new Exception("Unable to find a game: " + name);
        }
        return games.get(name);
    }

    @Override
    public String toString() {
        return "GameCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
//                ", games=" + games +
                '}';
    }
}
