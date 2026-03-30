package org.example;

import java.util.ArrayList;

public class BubbleSort implements Sort {
    @Override
    public int sort(ArrayList<Integer> arr) {
        int changeCnt = 0;
        for (int i = arr.size(); i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if(arr.get(j-1) > arr.get(j)) {
                    changeCnt++;
                    int tmp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, tmp);
                }
            }
        }
        return changeCnt;
    }
}