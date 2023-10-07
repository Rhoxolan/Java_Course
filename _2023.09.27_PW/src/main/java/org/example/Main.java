package org.example;

import java.util.Scanner;

interface Task {
    void doTask();
}

public class Main {
    public static void main(String[] args) {
        practicalWork();
    }

    private static void practicalWork() {
        short choice;
        do {
            System.out.println("\nPlease select the task (1 - 12)\n0 - Exit");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextShort();
            scanner.nextLine();
            System.out.println("\n\n\n\n\n");
            doTask(choice);
        } while (choice != 0);
    }

    private static void doTask(short index) {
        Tasks()[index].doTask();
        pressEnter();
    }

    private static Task[] Tasks() {
        Task[] tasks = new Task[12];
        tasks[0] = Main::task1;
        tasks[1] = Main::task2;
        tasks[2] = Main::task3;
        tasks[3] = Main::task4;
        tasks[4] = Main::task5;
        tasks[5] = Main::task6;
        tasks[6] = Main::task7;
        tasks[7] = Main::task8;
        tasks[8] = Main::task9;
        tasks[9] = Main::task10;
        tasks[10] = Main::task11;
        tasks[11] = Main::task12;
        return tasks;
    }

    private static void task1() {

    }

    private static void task2() {

    }

    private static void task3() {

    }

    private static void task4() {

    }

    private static void task5() {

    }

    private static void task6() {

    }

    private static void task7() {

    }

    private static void task8() {

    }

    private static void task9() {

    }

    private static void task10() {

    }

    private static void task11() {

    }

    private static void task12() {

    }

    private static void pressEnter() {
        System.out.println("\nPress ENTER");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("\n\n\n\n\n");
    }
}