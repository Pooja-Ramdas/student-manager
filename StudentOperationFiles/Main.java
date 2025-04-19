// Name: Pooja Ramdas
// PRN: 23070126091
// Batch: AIML B1 2023–2027

import java.util.Scanner;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations ops = new StudentOperations();

        while (true) {
            System.out.println("\n1. Add\n2. Display\n3. Search PRN\n4. Update\n5. Delete\n6. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            try {
                switch (ch) {
                    case 1 -> {
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("PRN: ");
                        long prn = sc.nextLong();
                        sc.nextLine();
                        System.out.print("DOB: ");
                        String dob = sc.nextLine();
                        System.out.print("Marks: ");
                        double marks = sc.nextDouble();
                        ops.addStudent(new Student(name, prn, dob, marks));
                        System.out.println("Student added.");
                    }
                    case 2 -> ops.displayStudents();
                    case 3 -> {
                        System.out.print("PRN: ");
                        long prn = sc.nextLong();
                        System.out.println(ops.searchByPRN(prn));
                    }
                    case 4 -> {
                        System.out.print("PRN to update: ");
                        long prn = sc.nextLong();
                        sc.nextLine();
                        System.out.print("New Name: ");
                        String name = sc.nextLine();
                        System.out.print("New DOB: ");
                        String dob = sc.nextLine();
                        System.out.print("New Marks: ");
                        double marks = sc.nextDouble();
                        ops.updateStudent(prn, name, dob, marks);
                        System.out.println("Updated.");
                    }
                    case 5 -> {
                        System.out.print("PRN to delete: ");
                        long prn = sc.nextLong();
                        ops.deleteStudent(prn);
                        System.out.println("Deleted.");
                    }
                    case 6 -> {
                        System.out.println("Exiting!");
                        return;
                    }
                    default -> System.out.println(" ");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
