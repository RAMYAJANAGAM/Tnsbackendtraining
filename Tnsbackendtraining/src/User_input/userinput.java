package User_input;

import java.util.Scanner;

public class userinput {

    public static void main(String[] args) {
        System.out.println("Enter the following details");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();  // accepts text input

        System.out.println("Enter ID:");
        String id = sc.nextLine();    // use String instead of int

        System.out.println("\n--- Entered Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);

        sc.close();
    }
}

