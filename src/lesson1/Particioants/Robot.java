package lesson1.Particioants;

import lesson1.Barriers.Track;
import lesson1.Barriers.Wall;
import lesson1.Interfaces.Jumping;
import lesson1.Interfaces.Running;

public class Robot implements Running, Jumping {

    private int defaultLength;
    private double defaultHeight;

    public Robot(int defaultLength, double defaultHeight) {
        this.defaultLength = defaultLength;
        this.defaultHeight = defaultHeight;
    }
    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() <= getDefaultHeight()) {
            System.out.println("Робот перепрыгивает препятствие");
            return true;
        } else {
            System.out.println("Робот врезается в стену");
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if (track.getLenght() <= getDefaultLength()) {
            System.out.println("Робот пробегает трек");
            return true;
        } else {
            System.out.println("Робот не добежит до финиша");
            return false;
        }
    }

    public int getDefaultLength() {
        return defaultLength;
    }

    public double getDefaultHeight() {
        return defaultHeight;
    }
}
