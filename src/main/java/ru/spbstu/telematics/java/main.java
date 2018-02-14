package ru.spbstu.telematics.java;

import java.util.LinkedList;

public class main{

    public static final int Size = 100;


    public static int[][] Initialize() {
        final int [][] matrix = new int[Size][Size];
        LinkedList<Thread> threads = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                final Integer I = i;
                final Integer J = j;
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        matrix[I][J] = (int)(I*100 + J);
                    }
                });
                t.start();
                threads.add(t);
            }
        }
        try {
            for (Thread t : threads) {
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return matrix;
    }

}
