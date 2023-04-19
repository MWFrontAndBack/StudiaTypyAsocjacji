package Kompozycja;

public class Level {
    private int levelId;
    private String levelName;
    private String desc;
    private boolean isUnlocked  ;
    private Game game;

    public Level(int levelId, String levelName, String desc, boolean isUnlocked, Game allLevels) {
        this.levelId = levelId;
        this.levelName = levelName;
        this.desc = desc;
        this.isUnlocked = isUnlocked;
        this.game = allLevels;
    }

    public void createLevel(int levelId, String levelName, String desc, boolean isUnlocked, Game game) throws Exception {
        if(game==null){
            throw new Exception("no game like this exists");
        }
        Level l = new Level(levelId,levelName,desc,isUnlocked,game);
        game.addLevel(l);
    }
    public void createLevel(Game game) throws Exception {
        if(game==null){
            throw new Exception("There is no game");
        }

    }

    @Override
    public String toString() {
        return "Level{" +
                "levelId=" + levelId +
                ", levelName='" + levelName + '\'' +
                ", desc='" + desc + '\'' +
                ", isUnlocked=" + isUnlocked +
                ", game=" + game +
                '}';
    }
}
