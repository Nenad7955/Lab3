package ru.spbstu.telematics.java;

import org.junit.Test;
import static org.junit.Assert.*;



public class test {


    @Test
    public void test() {

        int[][] Matrix = new int[main.Size][main.Size];

        for (int i = 0; i < main.Size; i++)
            for (int j = 0; j < main.Size; j++)
                Matrix[i][j] = 100 * i + j;


        int[][] Matrix2;
        Matrix2 = main.Initialize();


        boolean different = false;

        for (int i = 0; i < main.Size; i++)
            for (int j = 0; j < main.Size; j++)
                if (Matrix[i][j]!=Matrix2[i][j])
                    different = true;

        assertEquals(false,different);
    }
}