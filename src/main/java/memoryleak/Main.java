package memoryleak;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which queue implementation to run ?");
        System.out.println("1) Memory leaked queue implementation");
        System.out.println("2) Default queue implementation");
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        if(selection == 1) {
            //Memory leak
            BadQueue<Element> badQueue = new BadQueue<Element>();
            for (int i = 0; i < 1000; i++) {
                badQueue.queue(new Element(i));
            }

            for (int i = 1000; i > 0; i--) {
                badQueue.dequeue();
            }
        }else {
            //Well written code
            PriorityQueue<Element> priorityQueue = new PriorityQueue<Element>();
            for (int i = 0; i < 1000; i++) {
                priorityQueue.add(new Element(i));
            }

            for (int i = 1000; i > 0; i--) {
                priorityQueue.poll();
            }
        }

        System.out.println("Press enter to exit...");
        sc.nextLine();
        sc.nextLine();
    }
}
