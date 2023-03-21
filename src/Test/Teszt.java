/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import oraisort.OraiSort;
import static oraisort.OraiSort.HOSSZ;
import static oraisort.OraiSort.MAX;
import static oraisort.OraiSort.MIN;
import static oraisort.OraiSort.maxSort;

/**
 *
 * @author KoncsikBenedek(SZF_A
 */
public class Teszt {

    public static void main(String[] args) {
        tesztMaxSort();
    }

    private static void tesztMaxSort() {
        OraiSort o = new OraiSort();
        int[] rndTomb = o.rndArray(MIN, MAX, HOSSZ);
        int[] rendezettArray = o.maxSort(rndTomb);
        boolean kapott = o.rendezettsegEllen(rendezettArray);
        boolean vart = true;
        assert kapott == vart : "Nem jól rendezett  a maxSort()";

    }

}
