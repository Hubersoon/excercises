package helloApp;

import java.util.Scanner;

public class HelloApp {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
