package single_array;

import java.util.Scanner;

public class array_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEntered details:");
        System.out.println("Name: " + name);
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " = " + arr[i]);
        }

        sc.close();
    } // ✅ closing for main
} // ✅ closing for class
