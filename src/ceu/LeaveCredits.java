package ceu;

import java.util.Scanner;

public class LeaveCredits {
    public static void main(String[] args) {
        // Default leave credits
        double leaveCredits = 13.0;

        // Monthly increase
        double monthlyIncrease = 1.5;

        // Leaves already used
        int usedLeaves = 2;

        // Display initial leave credits
        System.out.println("Initial Leave Credits: " + leaveCredits);

        // Simulate monthly increase for 12 months
        for (int month = 1; month <= 12; month++) {
            leaveCredits += monthlyIncrease;
        }

        // Display leave credits after monthly increase
        System.out.println("Leave Credits after 12 months: " + leaveCredits);

        // Display leave credits after leaves used
        leaveCredits -= usedLeaves;
        System.out.println("Leave Credits after using 2 leaves: " + leaveCredits);

        // File for leave (decrease 1 leave credit)
        leaveCredits -= 1;

        // Add one used leave credit
        usedLeaves += 1;

        // Display leave credits after filing for leave
        System.out.println("Leave Credits after filing for leave: " + leaveCredits);
        System.out.println("Used Leave Credits: " + usedLeaves);

        // Check if leave credits are sufficient
        if (leaveCredits >= 0) {
            System.out.println("Leave approved. Remaining Leave Credits: " + leaveCredits);
        } else {
            System.out.println("Leave denied. Insufficient Leave Credits.");
        }
    }
}
