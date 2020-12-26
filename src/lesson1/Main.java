package lesson1;

import lesson1.Barriers.Track;
import lesson1.Barriers.Wall;
import lesson1.Particioants.Cat;
import lesson1.Particioants.Human;
import lesson1.Particioants.Robot;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(100, 2);
        Cat cat = new Cat(50, 1.5);
        Robot robot = new Robot(10, 0.5);

        Object[] barriers = new Object[]{new Track(5), new Wall(0.5), new Track(40), new Wall(1.0), new Track(10)};
        Object[] participants = new Object[]{human, cat, robot};

        for (Object participant : participants) {
            start(barriers, participant);
        }
    }

    private static void start(Object[] barriers, Object participant) {
        Human human = null;
        Cat cat = null;
        Robot robot = null;

        if (participant instanceof Human) {
            human = (Human) participant;
            raceWithHuman(barriers, human);
        } else if (participant instanceof Cat) {
            cat = (Cat) participant;
            raceWithHuman(barriers, cat);
        } else if (participant instanceof Robot) {
            robot = (Robot) participant;
            raceWithHuman(barriers, robot);
        }
    }

    private static void raceWithHuman(Object[] barriers, Human human) {
        Wall wall = null;
        Track track = null;
        boolean isSuccess = true;
        for (int i = 0; i < barriers.length; i++) {
            if (barriers[i] instanceof Wall) {
                wall = (Wall) barriers[i];
                isSuccess = human.jump(wall);
            } else if (barriers[i] instanceof Track) {
                track = (Track) barriers[i];
                isSuccess = human.run(track);
            }
            if (!isSuccess) break;
        }
        if (isSuccess) {
            System.out.println("Человек преодолел все препятствия\n");
        } else {
            System.out.println("Человек не смог преодолеть полосу препятствий\n");
        }
    }

    private static void raceWithHuman(Object[] barriers, Cat cat) {
        Wall wall = null;
        Track track = null;
        boolean isSuccess = true;
        for (int i = 0; i < barriers.length; i++) {
            if (barriers[i] instanceof Wall) {
                wall = (Wall) barriers[i];
                isSuccess = cat.jump(wall);
            } else if (barriers[i] instanceof Track) {
                track = (Track) barriers[i];
                isSuccess = cat.run(track);
            }
            if (!isSuccess) break;
        }
        if (isSuccess) {
            System.out.println("Кот преодолел все препятствия\n");
        } else {
            System.out.println("Кот не смог преодолеть полосу препятствий\n");
        }
    }

    private static void raceWithHuman(Object[] barriers, Robot robot) {
        Wall wall = null;
        Track track = null;
        boolean isSuccess = true;
        for (int i = 0; i < barriers.length; i++) {
            if (barriers[i] instanceof Wall) {
                wall = (Wall) barriers[i];
                isSuccess = robot.jump(wall);
            } else if (barriers[i] instanceof Track) {
                track = (Track) barriers[i];
                isSuccess = robot.run(track);
            }
            if (!isSuccess) break;
        }
        if (isSuccess) {
            System.out.println("Робот преодолел все препятствия\n");
        } else {
            System.out.println("Робот не смог преодолеть полосу препятствий\n");
        }
    }
}