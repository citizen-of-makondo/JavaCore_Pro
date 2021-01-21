package lesson5;

public class Main {
    static final int size = 10_000_000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] a1 = new float[h];
    static float[] a2 = new float[h];

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    private static void exercise1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long start = System.currentTimeMillis();
        calculated(arr);
        long finish = System.currentTimeMillis();
        System.out.println("Время в однопоточном режиме " + (finish - start));
    }

    private static void calculated(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void exercise2() {
        fillingArr();
        long start = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        new Thread(Main::methodFirstHalf).start();
        new Thread(Main::methodSecondHalf).start();
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        long finish = System.currentTimeMillis();
        System.out.println("Время в двухпоточном режиме " + (finish - start));
    }

    private static float[] fillingArr() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    private static void methodFirstHalf() {
        calculated(a1);
    }

    private static void methodSecondHalf() {
        calculated(a2);
    }
}