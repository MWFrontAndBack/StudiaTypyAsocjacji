package atrybut;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private int id;
    private String name;
    private Set<GameAssociation> associations = new HashSet<>();

    public Game(int id, String name) {
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

    public Set<GameCategory> getCategories() {
        Set<GameCategory> categories = new HashSet<>();
        for (GameAssociation association : associations) {
            categories.add(association.getCategory());
        }
        return categories;
    }

    public void removeAssociation(GameAssociation association) {
        associations.remove(association);
    }

    @Override
    public String toString() {
        return "Game [id=" + id + ", name=" + name + "]";
    }

}
