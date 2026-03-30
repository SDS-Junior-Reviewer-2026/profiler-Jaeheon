package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Profiler profiler_1 = new Profiler(
                new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)),
                new BubbleSort()
        );

        profiler_1.runLib();
        profiler_1.showResult();

        Profiler profiler_2 = new Profiler(
                new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)),
                new SelectionSort()
        );

        profiler_2.runLib();
        profiler_2.showResult();
    }
}