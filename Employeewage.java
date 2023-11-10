package com.bridgelab.java;
import java.util.Scanner;
public class Employeewage {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input: Employee details
            System.out.print("Enter employee name: ");
            String employeeName = scanner.nextLine();

            System.out.print("Enter hourly wage: ");
            double hourlyWage = scanner.nextDouble();

            System.out.print("Enter hours worked in a week: ");
            int hoursWorked = scanner.nextInt();

            // Calculate the weekly wage
            double weeklyWage = calculateWeeklyWage(hourlyWage, hoursWorked);

            // Display the result
            System.out.println("\nEmployee Name: " + employeeName);
            System.out.println("Hourly Wage: $" + hourlyWage);
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Weekly Wage: $" + weeklyWage);

            scanner.close();
        }

        // Function to calculate the weekly wage
        private static double calculateWeeklyWage(double hourlyWage, int hoursWorked) {
            double regularHours = Math.min(hoursWorked, 40); // Regular hours (up to 40 hours)
            double overtimeHours = Math.max(0, hoursWorked - 40); // Overtime hours (over 40 hours)

            // Calculate total wage with overtime pay (1.5 times hourly wage for overtime)
            double totalWage = (regularHours * hourlyWage) + (overtimeHours * 1.5 * hourlyWage);

            return totalWage;
        }
    }



