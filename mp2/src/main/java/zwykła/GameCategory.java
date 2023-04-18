package zwykła;

import java.util.ArrayList;
import java.util.List;

public class GameCategory {
    private int id;
    public String categoryName;
    public List<Integer> gamesId;

    public static ArrayList<GameCategory> extend = new ArrayList<>();

    public GameCategory(int id, String categoryName, List<Integer> gamesId) {
        extend.add(this);
        this.id = id;
        this.categoryName = categoryName;
        this.gamesId = gamesId;
    }

    public static GameCategory findCategory(int id) throws Exception {
        return extend.stream().filter(e -> e.id == id).findFirst().orElseThrow(() -> new RuntimeException("Nie znaleziono obiektu z id " + id));

    }

    @Override
    public String toString() {
        return "zwykła.GameCategory{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", gamesId=" + gamesId +
                '}';
    }
}
