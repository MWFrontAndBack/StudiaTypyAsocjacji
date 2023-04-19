package Kompozycja;

public class TestKomposition {
    public static void main(String[] args) throws Exception {
        Game g = new Game("GTA 5",16);
        Level level1 = new Level(1, "Liberty City", "The first city in GTA III", true,g);
        Level level2 = new Level(2, "Vice City", "The setting for GTA Vice City", true, g);
        Level level3 = new Level(3, "San Andreas", "The largest and most diverse setting in GTA", false, g);
        g.addLevel(level1);
        g.addLevel(level2);
        g.addLevel(level3);
        System.out.println(g);
        g.printLevels();

    }
}
