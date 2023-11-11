package application;

import entities.Students;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Students> set = new HashSet<>();


        System.out.print("How many students for course A? ");
        int nA = sc.nextInt();
        for (int i = 1; i <= nA; i++) {
            System.out.println("Enter the ID of student #" + i + ": ");
            int id = sc.nextInt();
            set.add(new Students(id));
        }

        System.out.print("How many students for course B? ");
        int nB = sc.nextInt();
        for (int i = 1; i <= nB; i++) {
            System.out.println("Enter the ID of student #" + i + ": ");
            int id = sc.nextInt();
            set.add(new Students(id));
        }

        System.out.print("How many students for course C? ");
        int nC = sc.nextInt();
        for (int i = 1; i <= nC; i++) {
            System.out.println("Enter the ID of student #" + i + ": ");
            int id = sc.nextInt();
            set.add(new Students(id));
        }

        System.out.println("Total students: " + set.size());


        sc.close();
    }
}
