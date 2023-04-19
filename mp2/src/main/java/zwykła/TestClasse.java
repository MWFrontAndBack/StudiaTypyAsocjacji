package zwykła;

import java.util.Arrays;

public class TestClasse {
    public static void main(String[] args) throws Exception {
        Game game1 = new Game(1, "GTA V", Arrays.asList(1, 2, 3));
        Game game2 = new Game(2, "Minecraft", Arrays.asList(2, 4));
        GameCategory category1 = new GameCategory(1, "Action", Arrays.asList(1));
        GameCategory category2 = new GameCategory(2, "Adventure", Arrays.asList(1, 2));
        GameCategory category3 = new GameCategory(3, "Simulation", Arrays.asList(2));
        GameCategory category4 = new GameCategory(4, "Indie", Arrays.asList(2));
        System.out.println(game1.name);
        for (int i = 0; i < game1.categoryIds.size(); i++) {
            System.out.println(" " + GameCategory.findCategory(game1.categoryIds.get(i)).categoryName);

        }
        System.out.println(category1.categoryName);
        for (int i = 0; i < category1.gamesId.size(); i++) {
            System.out.println(" " + Game.findGame(category1.gamesId.get(i)).name);

        }
        System.out.println(game2.name);
        for (int i = 0; i < game2.categoryIds.size(); i++) {
            System.out.println(" " + GameCategory.findCategory(game2.categoryIds.get(i)).categoryName);

        }
        System.out.println("po usunieciu kateogorii");
        game1.deleteCategory(category1);
        game1.deleteCategory(category2);
//        game1.deleteCategory(category3);
        System.out.println(game1);
        for (int i = 0; i < game1.categoryIds.size(); i++) {

            System.out.println(" " + GameCategory.findCategory(game1.categoryIds.get(i)).categoryName);

        }

    }

}
