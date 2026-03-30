package org.example;

import java.util.ArrayList;

public class Profiler {
    ArrayList<Integer> arr;
    int changeCnt;
    Sort lib;

    public Profiler(ArrayList<Integer> arr, Sort _sort){
        this.arr = arr;
        this.lib = _sort;
        this.changeCnt = 0;
    }

    public void setData(ArrayList<Integer> _arr) {
        this.arr.clear();
        this.arr.addAll(_arr);
    }

    public void setLib(Sort _sort){
        this.lib = _sort;
    }

    public void runLib() {
        changeCnt = this.lib.sort(arr);
    }

    public void showResult() {
        System.out.println(this.arr);
        System.out.println(this.changeCnt);
    }
}