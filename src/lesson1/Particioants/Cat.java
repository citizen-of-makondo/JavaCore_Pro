package lesson1.Particioants;

import lesson1.Barriers.Track;
import lesson1.Barriers.Wall;
import lesson1.Interfaces.Jumping;
import lesson1.Interfaces.Running;

public class Cat implements Running, Jumping {

    private int defaultLenght;
    private double defaultHeight;

    public Cat(int defaultLenght, double defaultHeight) {
        this.defaultLenght = defaultLenght;
        this.defaultHeight = defaultHeight;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() <= getDefaultHeight()) {
            System.out.println("Кот перепрыгивает препятствие");
            return true;
        } else {
            System.out.println("Кот врезается в стену");
            return false;
        }
    }

    @Override
    public boolean run(Track track) {
        if (track.getLenght() <= getDefaultLenght()) {
            System.out.println("Кот пробегает трек");
            return true;
        } else {
            System.out.println("Кот не добежит до финиша");
            return false;
        }
    }

    public int getDefaultLenght() {
        return defaultLenght;
    }

    public double getDefaultHeight() {
        return defaultHeight;
    }
}
