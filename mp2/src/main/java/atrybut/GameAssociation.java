package atrybut;

public class GameAssociation {
    private Game game;
    private GameCategory category;

    public GameAssociation(Game game, GameCategory category) {
        this.game = game;
        this.category = category;

        game.addAssociation(this);
        category.addAssociation(this);
    }

    public Game getGame() {
        return game;
    }

    public GameCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "GameAssociation{" +
                "game=" + game +
                ", category=" + category +
                '}';
    }
}
