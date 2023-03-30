import java.util.Scanner;

class TestDetails {
    float[][] marks;
    int rows, cols;

    TestDetails(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        marks = new float[rows][cols];
    }

    void storeMarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter number of tests taken by student " + (i + 1));
            int testsTaken = sc.nextInt();
            System.out.println("Enter marks scored in each test:");
            for (int j = 0; j < testsTaken; j++) {
                marks[i][j] = sc.nextFloat();
            }
        }
    }

    void displayMarks() {
        System.out.println("Student marks:");
        for (int i = 0; i < rows; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class NoticePeriod extends TestDetails {
    NoticePeriod(int rows, int cols) {
        super(rows, cols);
    }

    void countAndPrintNoticePeriodStudents() {
        int count = 0;
        System.out.println("Notice Period Students:");
        for (int i = 0; i < rows; i++) {
            int testsTaken = 0, testsPassed = 0;
            for (int j = 0; j < cols; j++) {
                if (marks[i][j] != 0) {
                    testsTaken++;
                    if (marks[i][j] >= 50) {
                        testsPassed++;
                    }
                }
                if (testsPassed >= 3) {
                    break;
                }
            }
            if (testsTaken < 3 || testsPassed < 3) {
                count++;
                System.out.println("ID: " + (i + 1));
            }
        }
        System.out.println("Number of notice period students: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int rows = sc.nextInt();
        System.out.println("Enter number of tests:");
        int cols = sc.nextInt();
        TestDetails td = new TestDetails(rows, cols);
        td.storeMarks();
        td.displayMarks();
        NoticePeriod np = new NoticePeriod(rows, cols);
        np.countAndPrintNoticePeriodStudents();
    }
}
