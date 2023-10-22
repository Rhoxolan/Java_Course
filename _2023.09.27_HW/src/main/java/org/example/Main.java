package org.example;

import java.util.Random;
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first value:");
        int firstVal = scanner.nextInt();
        System.out.println("Please enter the second value:");
        int secondVal = scanner.nextInt();
        System.out.println("Please enter the third value:");
        int thirdVal = scanner.nextInt();
        String valueString = Integer.toString(firstVal)
                + Integer.toString(secondVal)
                + Integer.toString(thirdVal);
        int concatenatedValue = Integer.parseInt(valueString);
        System.out.println("The concatenated value is " + concatenatedValue);
    }

    public static void task4() {
        System.out.println("Please enter the value:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String stringValue = Integer.toString(value);
        if (stringValue.length() != 6) {
            System.out.println("The value length isn`t 6!");
            return;
        }
        char[] charArrayValue = stringValue.toCharArray();
        char temp = charArrayValue[0];
        charArrayValue[0] = charArrayValue[5];
        charArrayValue[5] = temp;
        temp = charArrayValue[1];
        charArrayValue[1] = charArrayValue[4];
        charArrayValue[4] = temp;
        int replacedValue = Integer.parseInt(new String(charArrayValue));
        System.out.println("The replaced value is: " + replacedValue);
    }

    public static void task5() {
        System.out.println("Please enter the month:");
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn!");
                break;
            default:
                System.out.println("The value isn`t valid!");
        }
    }

    public static void task6() {
        System.out.println("Please enter the number of meters:");
        Scanner scanner = new Scanner(System.in);
        int meters = scanner.nextInt();
        System.out.println("Please select:\n1 - miles;\n2 - inches;\n3 - yards\n0 - exit");
        int choice = scanner.nextInt();
        if(choice < 0 || choice > 3){
            System.out.println("The input isn`t valid!");
        }
        else if (choice == 3) {
            System.out.println("The miles value is: " +
                    TaskUtils.convertMetersToYards(meters) + " yd");
        }
        else if (choice == 2) {
            System.out.println("The inches value is: " +
                    TaskUtils.convertMetersToInches(meters) + " in");
        }
        else if (choice == 1) {
            System.out.println("The inches value is: " +
                    TaskUtils.convertMetersToMiles(meters) + " mi");
        }
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the start of the diapason:");
        int start = scanner.nextInt();
        System.out.println("Please enter the end of the diapason:");
        int end = scanner.nextInt();
        System.out.println();
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the start of the diapason:");
        int start = scanner.nextInt();
        System.out.println("Please enter the end of the diapason:");
        int end = scanner.nextInt();
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            System.out.println("\n");
            for (int j = 2; j <= 9; j++){
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
        }
    }

    public static void task9() {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(201) - 100;
        }
        int minFromTheArray = TaskUtils.minFromTheArray(array);
        int maxFromTheArray = TaskUtils.maxFromTheArray(array);
        int countOfNegativeNumbers = TaskUtils.getNegativeNumbersCountFromTheArray(array);
        int countOfPositiveNumbers = TaskUtils.getPositiveNumbersCountFromTheArray(array);
        int countOfZero = TaskUtils.getZeroCountFromTheArray(array);
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\nThe min value from the array: " + minFromTheArray);
        System.out.println("The max value from the array: " + maxFromTheArray);
        System.out.println("The count of negative numbers from the array: " + countOfNegativeNumbers);
        System.out.println("The count of positive numbers from the array: " + countOfPositiveNumbers);
        System.out.println("The count of zero from the array: " + countOfZero);
    }

    public static void task10() {
        int[] firstArray = new int[50];
        Random rand = new Random();
        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = rand.nextInt(201) - 100;
        }
        int[] evenBufferArray = new int[firstArray.length];
        int[] oddBufferArray = new int[firstArray.length];
        int[] positiveBufferArray = new int[firstArray.length];
        int[] negativeBufferArray = new int[firstArray.length];
        int[] evenArray;
        int[] oddArray;
        int[] positiveArray;
        int[] negativeArray;
        int evenCount = -1;
        int oddCount = -1;
        int positiveCount = -1;
        int negativeCount = -1;
        for(int num : firstArray){
            if(num % 2 == 0){
                evenCount++;
                evenBufferArray[evenCount] = num;
            }
            else {
                oddCount++;
                oddBufferArray[oddCount] = num;
            }
            if(num > 0){
                positiveCount++;
                positiveBufferArray[positiveCount] = num;
            }
            else{
                negativeCount++;
                negativeBufferArray[negativeCount] = num;
            }
        }
        evenArray = new int[evenCount];
        oddArray = new int[oddCount];
        positiveArray = new int[positiveCount];
        negativeArray = new int[negativeCount];
        for(int i = 0; i < firstArray.length; i++){
            if(i < evenCount){
                evenArray[i] = evenBufferArray[i];
            }
            if(i < oddCount){
                oddArray[i] = oddBufferArray[i];
            }
            if(i < positiveCount){
                positiveArray[i] = positiveBufferArray[i];
            }
            if(i < negativeCount){
                negativeArray[i] = negativeBufferArray[i];
            }
        }
        System.out.print("First array: ");
        for (int num: firstArray) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.print("Even`s array: ");
        for (int num: evenArray) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.print("Odd`s array: ");
        for (int num: oddArray) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.print("Positive`s array: ");
        for (int num: positiveArray) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        System.out.print("Negative`s array: ");
        for (int num: negativeArray) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
    }

    public static void task11() {

    }

    public static void task12() {

    }
}

class TaskUtils {
    public static double convertMetersToInches(int meters) {
        return meters * 39.370;
    }

    public static double convertMetersToMiles(int meters) {
        return meters * 0.00062137;
    }

    public static double convertMetersToYards(int meters) {
        return meters * 1.0936;
    }

    public static Integer minFromTheArray(int[] array){
        if(array.length == 0){
            return null;
        }
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            min = Math.min(min, num);
        }
        return min;
    }

    public static Integer maxFromTheArray(int[] array){
        if(array.length == 0){
            return null;
        }
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            max = Math.max(max, num);
        }
        return max;
    }

    public static int getNegativeNumbersCountFromTheArray(int[] array){
        int count = 0;
        for (int num : array){
            if(num < 0){
                count++;
            }
        }
        return count;
    }

    public static int getPositiveNumbersCountFromTheArray(int[] array){
        int count = 0;
        for (int num : array){
            if(num > 0){
                count++;
            }
        }
        return count;
    }

    public static int getZeroCountFromTheArray(int[] array){
        int count = 0;
        for (int num : array){
            if(num == 0){
                count++;
            }
        }
        return count;
    }
}

interface Task {
    void doTask();
}