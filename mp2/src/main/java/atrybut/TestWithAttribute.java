package atrybut;

import java.util.List;
import java.util.Set;

public class TestWithAttribute {
    public static void main(String[] args) {
        GameCategory actionCategory = new GameCategory(1, "Action");
        GameCategory adventureCategory = new GameCategory(2, "Adventure");
        GameCategory puzzleCategory = new GameCategory(3, "Puzzle");

        Game game1 = new Game(101, "Super Mario Bros.");
        Game game2 = new Game(102, "Tetris");
        Game game3 = new Game(103, "Minecraft");
        Set<GameAssociation> associations = Set.of(
        new GameAssociation(game1, adventureCategory),
        new GameAssociation(game2, puzzleCategory),
        new GameAssociation(game3, actionCategory),
        new GameAssociation(game3, adventureCategory),
        new GameAssociation(game3, puzzleCategory));

//        associations.forEach(System.out::println);

        // testowanie get get all games
        System.out.println("Gry dla kategorii " + actionCategory.getName());
        Set<Game> games = actionCategory.getGames();
        System.out.println(games);
        System.out.println("gra " + game3.getName());
        System.out.println(game3.getCategories());

        List<GameAssociation> list = associations.stream().toList();
        GameAssociation gameAssociation = list.get(3);
        gameAssociation.removeAssociation();

        System.out.println(game3.getCategories());


    }
}
