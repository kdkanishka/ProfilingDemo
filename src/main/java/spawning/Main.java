package spawning;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press enter to continue...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        ExecutorService executor = Executors.newFixedThreadPool(25);

        Random rand = new Random(System.currentTimeMillis());
        for (int i = 0; i < 10000; i++) {
            Runnable r1 = new Task(randomMatrix(1024, 2048,rand),randomMatrix(1024, 2048,rand));
            executor.execute(r1);
        }

        executor.shutdown();
        System.out.println("Done with tasks!");
    }

    private static int[][] randomMatrix(int x,int y,Random random){
        int[][] randMtx = new int[x][y] ;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                randMtx[i][j] = random.nextInt();
            }
        }
        return randMtx;
    }
}
