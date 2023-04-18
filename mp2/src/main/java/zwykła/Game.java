package zwykła;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private int gameId;
    public String name;

    public List<Integer> categoryIds;
    public static List<Game> extend = new ArrayList<>();

    public Game(int gameId, String name, List<Integer> categoryIds) {
        extend.add(this);
        this.gameId = gameId;
        this.name = name;
        this.categoryIds = categoryIds;
    }

    public static Game findGame(int id) throws Exception {
        return extend.stream().filter(e -> e.gameId == id).findFirst().orElseThrow(() -> new RuntimeException("Nie znaleziono obiektu z id " + id));

    }

    @Override
    public String toString() {
        return "zwykła.Game{" +
                "gameId=" + gameId +
                ", name='" + name + '\'' +
                ", categoryIds=" + categoryIds +
                '}';
    }
}
