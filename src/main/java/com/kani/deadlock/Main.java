package com.kani.deadlock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press enter to continue...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        final int[] counter1 = {1};   //supposed to be written by t1, read by t2
        final int[] counter2 = {1};   //supposed to be written by t2, read by t1
        final int[] counter3 = {1};   //supposed to be written by t3, read by t1

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (counter1) {
                        counter1[0]++;
                        synchronized (counter2) {
                            int i = counter2[0];
                        }
                    }
                }
            }
        });
        t1.start();


        Thread t2 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (counter2) {
                        counter2[0]++;
                        synchronized (counter3) {
                            int i = counter3[0];
                        }
                    }
                }
            }
        });
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    synchronized (counter3) {
                        counter3[0]++;
                        synchronized (counter1) {
                            int i = counter1[0];
                        }
                    }
                }
            }
        });
        t3.start();
    }

}
