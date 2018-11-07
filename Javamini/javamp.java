import java.util.Scanner;
import java.lang.Math;

class javamp {
    public static void main(String args[]) {
        SplitString ob = new SplitString();
        int inputarr[] = ob.GivePosArray();
        // javaminiP_str2binary s2b = new javaminiP_str2binary();
        // s2b.Convert();
        int m = 0, n = 0, i, j, k, inputNumber = inputarr.length;
        ;
        Scanner s = new Scanner(System.in);
        Cell c = new Cell();
        // System.out.println("Enter number of variables");
        int var = ob.numvar / inputNumber;
        // System.out.println(var);
        if (var % 2 == 0) {
            m = (int) Math.pow(2.0, var / 2);
            n = m;
        } else {
            n = (int) Math.pow(2.0, (var - 1) / 2) * 2;
            m = (int) Math.pow(2.0, (var - 1) / 2);
        }
        // System.out.println(m + "x" + n);
        /*
         * System.out.println("Enter number of 1s");
         * System.out.println("Enter the position of 1s enter"); for (i = 0; i <
         * inputNumber; i++) { int buffer = s.nextInt(); if (buffer == 69) break; else
         * inputarr[i] = buffer; }
         */
        int a[][] = new int[m][n];
        int temp;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = 0;
                for (k = 0; k < inputNumber; k++) {
                    if (c.cellnumber == inputarr[k])
                        a[i][j] = 1;
                }
                c.cellnumber++;
            }
        }
        System.out.println("The KMAP is");
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if ((i + 1) % 3 == 0) {
                    temp = a[i + 1][j];
                    a[i + 1][j] = a[i][j];
                    a[i][j] = temp;
                    // System.out.println("Interchange i");
                }
                if ((j + 1) % 3 == 0) {
                    temp = a[i][j + 1];
                    a[i][j + 1] = a[i][j];
                    a[i][j] = temp;
                    // System.out.println("Interchange j");
                }
                if ((j + 1) % 3 == 0 && (i + 1) % 3 == 0) {
                    temp = a[i + 1][j + 1];
                    a[i + 1][j + 1] = a[i][j];
                    a[i][j] = temp;
                }
                // System.out.println(i + " " + j);
                // c.PrintKmap(m, n, a);
            }
        }
        c.PrintKmap(m, n, a);
    }
}

class Cell {
    int cellnumber;

    public void PrintKmap(int m, int n, int[][] a) {
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}