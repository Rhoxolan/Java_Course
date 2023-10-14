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
            System.out.println("\n\n\n\n\n");
            if(choice != 0){
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
        System.out.println("Fall seven times");
        System.out.println("and");
        System.out.println("stand up eight");
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value:");
        double number = scanner.nextDouble();
        System.out.println("Please enter the percent:");
        double percentage = scanner.nextDouble();
        double result = (percentage / 100) * number;
        System.out.println(percentage + "% from " + number + " is " + result);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value:");
        int number = scanner.nextInt();
        String reversedString = new StringBuilder(Integer.toString((number)))
                .reverse()
                .toString();
        System.out.println(reversedString);
    }

    public static void task4() {
        System.out.println("Please enter the value of hours:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 23) {
            System.out.println("There is no such hour!");
        }
        else if (number > 16) {
            System.out.println("Good Evening!");
        }
        else if (number > 12) {
            System.out.println("Good Day!");
        }
        else if (number > 5) {
            System.out.println("Good Morning!");
        }
        else if (number > -1) {
            System.out.println("Good Night!");
        }
        else if (number < 0) {
            System.out.println("There is no such hour!");
        }
    }

    public static void task5() {
        System.out.println("Please enter the value:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String stringValue = Integer.toString(value);
        if (stringValue.length() > 6) {
            System.out.println("The value is bigger then 6!");
            return;
        }
        char[] firstPart = stringValue.substring(0, stringValue.length() / 2).toCharArray();
        char[] secondPart = stringValue.substring(stringValue.length() / 2).toCharArray();
        int firstPartValue = 0;
        int secondPartValue = 0;
        for (char number: firstPart) {
            firstPartValue += Character.getNumericValue(number);
        }
        for (char number: secondPart) {
            secondPartValue += Character.getNumericValue(number);
        }
        if(firstPartValue == secondPartValue){
            System.out.println("The number " + stringValue + " is lucky!");
        }
        else {
            System.out.println("The number " + stringValue + " isn`t lucky!");
        }
    }

    public static void task6() {
        System.out.println("Please enter the value:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if(value < 1 || value > 100) {
            System.out.println("The value isn't valid!");
        }
        else if(value % 3 == 0 && value % 5 == 0) {
            System.out.println("Fizz Buzz");
        }
        else if (value % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (value % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(value);
        }
    }

    public static void task7() {
        System.out.println("Please enter the value:");
        Scanner scanner = new Scanner(System.in);
        long value = scanner.nextLong();
        System.out.println("The factorial of the " + value +
                " value is " + TaskUtils.getFactorial(value));
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the start of the diapason:");
        int startNumber = scanner.nextInt();
        System.out.println("Please enter the end of the diapason:");
        int endNumber = scanner.nextInt();
        System.out.println("\n\nThe simple numbers of the the diapason:");
        for (int i = startNumber; i <= endNumber; i++) {
            if(TaskUtils.isSimple(i)){
                System.out.println(i);
            }
        }
    }

    public static void task9() {
        //Shall be written!
    }

    public static void task10() {
        //Shall be written!
    }

    public static void task11() {
        //Shall be written!
    }

    public static void task12() {
        //Shall be written!
    }
}

class TaskUtils {
    public static long getFactorial(long number) {
        if(number == 0 || number == 1){
            return  1;
        }
        long factorial = 1;
        for (long i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static boolean isSimple(int num){
        boolean isSimple = true;
        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
}

interface Task {
    void doTask();
}