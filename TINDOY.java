import java.util.Scanner;

import javax.swing.table.TableColumn;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your First name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastn = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your ID number: ");
        int idnum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the program you would pursue or enroll: ");
        String program = scanner.nextLine();

        System.out.print("Enter if Intended Major or concentration: ");
        String major = scanner.nextLine();

        System.out.print("Enter your High school Grade (GPA): ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your address: ");
        String add = scanner.nextLine();

        System.out.print("Enter your Guardian or Emergency contact's Full name: ");
        String Guardian = scanner.nextLine();

        System.out.print("Enter your Guardian's contact number: ");
        long cnum = scanner.nextLong();
        scanner.nextLine();

        System.out.print("\n------- College Enrollment Receipt -------");

        System.out.print("\nStudent Name: " + name + " "+ lastn);
        System.out.println("\nAge: " + age);
        System.out.println("Student ID: " + idnum);
        System.out.println("Program: " + program);
        System.out.println("Intended Major/Concentration: " + major);
        System.out.println("High School GPA: " + grade);
        System.out.println("Address: " + add);
        System.out.println("Guardian/Emergency Contact: " + Guardian);
        System.out.println("Guardian's contact number: " + cnum);

         
    }
}