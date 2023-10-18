package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PracticalWork.practicalWork();
    }
}

class PracticalWork {
    public static void practicalWork() {
        short choice;
        do {
            System.out.println("\nPlease select the task (1 - 12)\n0 - Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextShort();
            scanner.nextLine();
            if (choice < 0 || choice > 12) {
                System.out.println("There is no selected task!");
            }
            else if (choice != 0) {
                System.out.println("\n\n\n\n\n");
                doTask(choice);
            }
        } while (choice != 0);
    }

    private static void doTask(short index) {
        Tasks()[--index].doTask();
        pressEnter();
    }

    private static Task[] Tasks() {
        Task[] tasks = new Task[12];
        tasks[0] = Tasks::task1;
        tasks[1] = Tasks::task2;
        tasks[2] = Tasks::task3;
        tasks[3] = Tasks::task4;
        tasks[4] = Tasks::task5;
        tasks[5] = Tasks::task6;
        tasks[6] = Tasks::task7;
        tasks[7] = Tasks::task8;
        tasks[8] = Tasks::task9;
        tasks[9] = Tasks::task10;
        tasks[10] = Tasks::task11;
        tasks[11] = Tasks::task12;
        return tasks;
    }

    private static void pressEnter() {
        System.out.println("\n\n\nPress ENTER");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("\n\n\n\n\n");
    }
}

class Tasks {
    public static void task1() {
        System.out.println("\"Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\"" +
                "\n\t\t\tSteve Jobs");
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first value:");
        double firstVal = scanner.nextDouble();
        System.out.println("Please enter the second value:");
        double secondVal = scanner.nextDouble();
        double sum = firstVal + secondVal;
        double diff = firstVal - secondVal;
        double product = firstVal * secondVal;
        System.out.println("Sum of the values: " + sum);
        System.out.println("Difference of the values: " + diff);
        System.out.println("Product of the values: " + product);
    }

    public static void task3() {

    }

    public static void task4() {

    }

    public static void task5() {

    }

    public static void task6() {

    }

    public static void task7() {

    }

    public static void task8() {

    }

    public static void task9() {

    }

    public static void task10() {

    }

    public static void task11() {

    }

    public static void task12() {

    }
}

class TaskUtils {

}

interface Task {
    void doTask();
}