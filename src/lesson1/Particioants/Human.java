package lesson1.Particioants;

import lesson1.Barriers.Track;
import lesson1.Barriers.Wall;
import lesson1.Interfaces.Jumping;
import lesson1.Interfaces.Running;

public class Human implements Running, Jumping {

    private int defaultLength;
    private double defaultHeight;

    public Human(int defaultLength, double defaultWeight) {
        this.defaultLength = defaultLength;
        this.defaultHeight = defaultWeight;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() <= getDefaultHeight()) {
            System.out.println("Человек перепрыгивает препятствие");
            return true;
        } else {
            System.out.println("Человек врезается в стену");
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if (track.getLenght() <= getDefaultLength()) {
            System.out.println("Человек пробегает трек");
            return true;
        } else {
            System.out.println("Человек не добежит до финиша");
            return false;
        }
    }

    public double getDefaultLength() {
        return defaultLength;
    }

    public double getDefaultHeight() {
        return defaultHeight;
    }
}
