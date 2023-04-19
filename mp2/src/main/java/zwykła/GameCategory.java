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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Integer> getGamesId() {
        return gamesId;
    }

    public void setGamesId(List<Integer> gamesId) {
        this.gamesId = gamesId;
    }

    public static ArrayList<GameCategory> getExtend() {
        return extend;
    }

    public static void setExtend(ArrayList<GameCategory> extend) {
        GameCategory.extend = extend;
    }

    public static GameCategory findCategory(int id) throws Exception {
        return extend.stream().filter(e -> e.id == id).findFirst().orElseThrow(() -> new RuntimeException("Nie znaleziono obiektu z id " + id));

    }

    public void deleteGame(Game game){
        gamesId.remove(game.getGameId());
        if(gamesId.isEmpty()){
            extend.remove(id);
        }

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
