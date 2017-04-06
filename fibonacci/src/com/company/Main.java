package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah angka : ");
        int angka = in.nextInt();
        long fib[] = new long[angka];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i < angka; i++){
            fib[i] = fib[i-1];
        }
        for(int i = 0; i < angka; i++){
            System.out.print(fib[i] + " ");
        }

    }
}
