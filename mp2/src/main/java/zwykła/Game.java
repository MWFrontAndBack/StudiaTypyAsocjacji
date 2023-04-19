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


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public static List<Game> getExtend() {
        return extend;
    }

    public static void setExtend(List<Game> extend) {
        Game.extend = extend;
    }

    public static Game findGame(int id) throws Exception {
        return extend.stream().filter(e -> e.gameId == id).findFirst().orElseThrow(() -> new RuntimeException("Nie znaleziono obiektu z id " + id));

    }

    public void deleteCategory(GameCategory category) throws Exception {
        List<Integer> categoryIdsCopy = new ArrayList<>(categoryIds);
        if (categoryIdsCopy.remove((Integer) category.getId())) {
            categoryIds = categoryIdsCopy;
        } else {
            throw new Exception("Category not found.");
        }
        if (categoryIds.isEmpty()) {
            extend.remove(gameId);
        }

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
