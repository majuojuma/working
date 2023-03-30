import java.util.Scanner;

class Student {
    String regNo;
    String name;
    float cgpa;
    String programName;
    String schoolName;
    String proctorName;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];
        sc.nextLine(); // to consume the newline character after reading the integer

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.print("Enter registration number of student " + (i + 1) + ": ");
            students[i].regNo = sc.nextLine();

            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i].name = sc.nextLine();

            System.out.print("Enter CGPA of student " + (i + 1) + ": ");
            students[i].cgpa = sc.nextFloat();
            sc.nextLine(); // to consume the newline character after reading the float

            System.out.print("Enter programme name of student " + (i + 1) + ": ");
            students[i].programName = sc.nextLine();

            System.out.print("Enter school name of student " + (i + 1) + ": ");
            students[i].schoolName = sc.nextLine();

            System.out.print("Enter proctor name of student " + (i + 1) + ": ");
            students[i].proctorName = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            System.out.println("Registration number: " + students[i].regNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("CGPA: " + students[i].cgpa);
            System.out.println("Programme name: " + students[i].programName);
            System.out.println("School name: " + students[i].schoolName);
            System.out.println("Proctor name: " + students[i].proctorName);
        }
    }
}
