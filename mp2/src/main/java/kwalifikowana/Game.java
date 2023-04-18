package kwalifikowana;

import kwalifikowana.GameCategory;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int gameId;
    public String name;

    public static List<GameCategory> extend = new ArrayList<>();

    public Game(int gameId, String name) {
        this.gameId = gameId;
        this.name = name;
    }

    public void addGameCategory(GameCategory gameCategory){
        if(!extend.contains(gameCategory)){
            extend.add(gameCategory);
            gameCategory.addGame(this);
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameId=" + gameId +
                ", name='" + name + '\'' +
//                ", lista: " + extend +
                '}';
    }
}
