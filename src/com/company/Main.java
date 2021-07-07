// 4 задачи в одном проекте
package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // 1 ая задача
        
//        final int N = 12;
//        float[][] matricks = new float[N][N];
//
//
//        float k = 1.5f, b = - 60.f;
//        for(int i = 0;i < matricks.length;i++){
//
//            for(int j = 0;j < matricks.length;j++){
//                matricks[i][j] = k*j+b;
//            }
//        }
//
//
//        for(int i = 0;i < 12;i++){
//
//                matricks[i][i]=0;
//
//
//
//        }
//
//        for(int i = 0;i < matricks.length;i++){
//            for(int j = i;j < matricks.length;j++)
//                if(matricks[i][j]!=0){                      //обнуляемся
//                    matricks[i][j]=0;
//
//                }
//
//
//        }
//
//
//        for(int i = 0;i < matricks.length;i++){
//            for(int j = 0;j < matricks.length;j++)
//                System.out.print(matricks[i][j]+"      ");
//            System.out.print("\n");
//
//        }



            //  2 ая задача

//        System.out.println("Введите число");
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        for(int i = 1;i < n;i++)
//        {
//            for(int j = 1; j < n;j++)
//            {
//                if(n >= (i*i + j*j))
//                {
//                    System.out.println("Квадраты чисел  "+ j + "  и  " + i);
//                }
//            }
//        }

//     3 ья задача




//        int i, j, l, i1, i2, j1, j2, k, kmax = 0, imax, all = 0,  found2;
//        int found;
//
//        System.out.println("Введите число");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] mnojestvo = new int[n][n];
//        //зададим дабы не вводить руками огромный массив вручную и строить вручную сложный генератор , воспользуемся рандомизатором из библиотеки Math
//
//
//        for ( i = 0; i < mnojestvo.length; i++) {
//            for ( j = 0; j < mnojestvo.length; j++) {
//                mnojestvo[i][j] = (int) (Math.random() * 30) -15;
//
//            }
//
//        }
//        for( i = 0;i < mnojestvo.length;i++){
//            for( j = 0;j < mnojestvo.length;j++)
//                System.out.print(mnojestvo[i][j]+"              ");
//            System.out.print("\n");
//
//        }
//        for (i = 0; i < n * n - 1; i++) {
//            found = 1;
//            i1 = i / n; j1 = i % n;
//            for (l = 0; l < i; l++) {
//                i2 = l / n; j2 = l % n;
//                if (mnojestvo[i1][j1] == mnojestvo[i2][j2]) { found = 0; break; }
//            }
//            if (found ==1 ) {
//                found2 = 0;
//                for (j = i + 1; j < n * n; j++) {
//                    i2 = j / n; j2 = j % n;
//                    if (mnojestvo[i1][j1] == mnojestvo[i2][j2]) {
//                        all++; found2 = 1;
//                    }
//                }
//                if (found2 ==1) all++;
//            }
//
//            k = 0;
//            for (j = 0; j < n; j++) if (mnojestvo[i1][j] == mnojestvo[i1][j1]) k++;
//            if (k > kmax) { kmax = k; imax = i1; }
//        }
//
//
//        if (all > 0) {
//            System.out.println("Всего элементов с повторами значений: "+all);
//
//        }
//        else System.out.println("\nНет повторов!");



// 4 ая задача



        int i;
        int j;
        int m;
        int k;

        boolean logik;

        System.out.println("Введите число");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] posledovatelnost = new int[n];
        int[] vihodnoj = new int[n];



        //зададим дабы не вводить руками огромный массив вручную и строить вручную сложный генератор , воспользуемся рандомизатором из библиотеки Math


        for (i = 0; i < n; i++) {


            posledovatelnost[i] = ((int) (Math.random() * n) + (int) (Math.random() * n)) + (int) (Math.random() * n) - n;      //немного заколхозил
        }
        for (i = 0; i < n; i++) {

            vihodnoj[i] = posledovatelnost[i];
        }


        for (i = 0; i < n; i++) {

            System.out.print(posledovatelnost[i] + "              ");
            System.out.print("\n");

        }

        k = 1;
        for (i = 2; i < n; i++) {
            logik = true;
            for (j = 1; j < k; j++)

                if (posledovatelnost[i] == vihodnoj[j])

                    logik = false;
            if (logik) {
                k++;
                vihodnoj[k] = posledovatelnost[i];
            }
        }
        for (i = 1; i < k; i++) {
            for (j = 1; j < i ; j++)
                if (vihodnoj[i] < vihodnoj[j]) {
                    m = vihodnoj[i];
                    vihodnoj[i] = vihodnoj[j];
                    vihodnoj[j] = m;
                }

        }
        System.out.print("Выводим    "   + k +"  различных чисел в порядке возрастания: ");
        for (i = 1 ;i< n; i++){
            System.out.print(vihodnoj[i] + "              ");
            System.out.print("\n");

        }
    }
}




