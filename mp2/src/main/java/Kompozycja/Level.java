package Kompozycja;

public class Level {
    private int levelId;
    private String levelName;
    private String desc;
    private boolean isUnlocked  ;

    public Level(int levelId, String levelName, String desc, boolean isUnlocked) {
        this.levelId = levelId;
        this.levelName = levelName;
        this.desc = desc;
        this.isUnlocked = false;
    }
    public void createLevel(Game game) throws Exception {
        if(game==null){
            throw new Exception("There is no game");
        }

    }
}
