package pattern_factory_method.game;

import pattern_factory_method.game.factory.DarkForcesFactory;
import pattern_factory_method.game.factory.EasyGameDarkForcesFactory;
import pattern_factory_method.game.factory.HighGameDarkForcesFactory;
import pattern_factory_method.game.factory.MiddleGameDarkForcesFactory;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the game difficulty: " +
                "\n1) easy \n2) average \n3) hard");
        DarkForcesFactory darkForcesFactory;
        while (true) {
            try {
                darkForcesFactory = setGameLevelByUser(sc.next());
                break;
            } catch (RuntimeException e) {
                System.out.println("Please enter correct game level difficulty");
            }
        }
        Forest forest = Forest.getInstance();
        forest.setDarkForces(Arrays.asList(darkForcesFactory.createMonster()));

        System.out.println("loading...");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("This is your enemies: ");
        System.out.println(forest.getDarkForces());
        System.out.println("GAME STARTED!");
    }

    private static DarkForcesFactory setGameLevelByUser(String user) {
        if (user.equalsIgnoreCase("easy")) {
            return new EasyGameDarkForcesFactory();
        } else if (user.equalsIgnoreCase("average")) {
            return new MiddleGameDarkForcesFactory();
        } else if (user.equalsIgnoreCase("hard")) {
            return new HighGameDarkForcesFactory();
        } else {
            throw new RuntimeException("game level: " + user + " is unknown.");
        }
    }
}
