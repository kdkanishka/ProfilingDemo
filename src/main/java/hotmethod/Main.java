package hotmethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which queue implementation to run ?");
        System.out.println("1) Bad string concatenation");
        System.out.println("2) Appending string");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        if (selection == 1) {
            m1();
        } else {
            m2();
        }

        System.out.println("Press enter to exit...");
        sc.nextLine();
        sc.nextLine();
    }

    private static void m1() {
        String result = "";
        for (int i = 0; i < 50000; i++) {
            result += i;
        }
    }

    private static void m2() {
        System.out.println("M2!");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            result.append(i);
        }
    }
}
