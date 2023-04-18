package kwalifikowana;

import java.util.Arrays;

public class TestClasse {
    public static void main(String[] args) throws Exception {
        GameCategory actionCategory = new GameCategory(1, "Action");
        GameCategory adventureCategory = new GameCategory(2, "Adventure");
        GameCategory puzzleCategory = new GameCategory(3, "Puzzle");

        Game game1 = new Game(101, "Super Mario Bros.");
        Game game2 = new Game(102, "Tetris");
        Game game3 = new Game(103, "Minecraft");

        game1.addGameCategory(actionCategory);
        game2.addGameCategory(adventureCategory);
        game3.addGameCategory(puzzleCategory);


        Game minecraft = puzzleCategory.findGame("Minecraft");
        System.out.println(minecraft);

    }
}
