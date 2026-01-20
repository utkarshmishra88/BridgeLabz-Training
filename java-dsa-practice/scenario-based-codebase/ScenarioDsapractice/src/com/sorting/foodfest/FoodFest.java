package com.sorting.foodfest;
public class FoodFest {

    static void mergeSort(Stall[] stalls, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(stalls, left, mid);
            mergeSort(stalls, mid + 1, right);

            merge(stalls, left, mid, right);
        }
    }

    static void merge(Stall[] stalls, int left, int mid, int right) {

        Stall[] temp = new Stall[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (stalls[i].footfall <= stalls[j].footfall) {
                temp[k++] = stalls[i++];   // stability preserved
            } else {
                temp[k++] = stalls[j++];
            }
        }

        while (i <= mid) temp[k++] = stalls[i++];
        while (j <= right) temp[k++] = stalls[j++];

        for (i = left, k = 0; i <= right; i++, k++) {
            stalls[i] = temp[k];
        }
    }

    static void display(Stall[] stalls) {
        for (Stall s : stalls) {
            System.out.println(s.name + " - Footfall: " + s.footfall);
        }
    }

    public static void main(String[] args) {

        Stall[] stalls = {
            new Stall("PizzaHub", 120),
            new Stall("BurgerPoint", 150),
            new Stall("TacoTown", 150),
            new Stall("NoodleNest", 180),
            new Stall("SweetCorner", 200)
        };

        mergeSort(stalls, 0, stalls.length - 1);
        display(stalls);
    }
}
