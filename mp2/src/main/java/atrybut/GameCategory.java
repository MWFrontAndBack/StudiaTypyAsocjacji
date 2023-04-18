package atrybut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameCategory {
    private int id;
    private String name;
    private Set<GameAssociation> associations = new HashSet<>();

    public GameCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addAssociation(GameAssociation association) {
        associations.add(association);
    }

    public Set<Game> getGames() {
        Set<Game> games = new HashSet<>();
        for (GameAssociation association : associations) {
            games.add(association.getGame());
        }
        return games;
    }

    public Game findGame(String name) throws Exception {
        for (GameAssociation association : associations) {
            if (association.getGame().getName().equals(name)) {
                return association.getGame();
            }
        }
        throw new Exception("Unable to find a game: " + name);
    }

    @Override
    public String toString() {

        return "GameCategory [id=" + id + ", name=" + name + "]";
    }

}
