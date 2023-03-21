package oraisort;

import java.util.Random;

public class OraiSort {

    public static final int MIN = 0;
    public static final int MAX = 10;
    public static final int HOSSZ = 100000;

//    public static void main(String[] args) {
//        int[] rndTomb = rndArray(MIN, MAX, HOSSZ);
//
//        int[] rendezettArray = maxSort(rndTomb);
//        for (int i : rendezettArray) {
//            System.out.print(i + " ");
//        }
//
//    }

    public  static int[] rndArray(int min, int max, int hossz) {
        int[] tempArray = new int[HOSSZ];
        Random rnd = new Random();
        for (int i = 0; i < hossz; i++) {
            tempArray[i] = rnd.nextInt(max - min + 1) + min;
        }

        return tempArray;
    }

    public static boolean rendezettsegEllen(int[] rendezett) {
        int i = 0;
        while (i < rendezett.length - 1 && rendezett[i] <= rendezett[i + 1]) {
            i++;
        }

        return i >= rendezett.length - 1;

    }

    public static int[] maxSort(int[] a) {
        int lepes = 0;
        for (int i = a.length - 1; i >= 1; i--) {
            int max = 0;
            for (int j = 1; j <= i; j++) {
                lepes++;
                if (a[max] < a[j]) {
                    max = j;
                }
            }
            lepes++;
            int csere = a[i];
            a[i] = a[max];
            a[max] = csere;
        }
        System.out.println("Lépések száma: " + lepes);
        return a;
    }
}
