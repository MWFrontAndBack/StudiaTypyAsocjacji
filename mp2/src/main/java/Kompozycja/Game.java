package Kompozycja;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Level> levels = new ArrayList<>();

    private String GameName;
    private int minAgeRange;

    public Game(String gameName, int minAgeRange) {
        GameName = gameName;
        this.minAgeRange = minAgeRange;
    }

    public void addLevel(Level l) throws  Exception{
        if(!levels.contains(l)){
            levels.add(l);
        }
    }
public void printLevels (){
        levels.forEach(System.out::println);
}
    @Override
    public String toString() {
        return "Game{" +
//                "levels=" + levels +
                ", GameName='" + GameName + '\'' +
                ", minAgeRange=" + minAgeRange +
                '}';
    }
}
