class MPL {
    int standard;
    int numOfStudents;
    int[] marks;
    int firstMark;

    public MPL(int standard, int numOfStudents) {
        this.standard = standard;
        this.numOfStudents = numOfStudents;
        this.marks = new int[numOfStudents];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        firstMark = marks[0];
        for (int i = 1; i < numOfStudents; i++) {
            if (marks[i] < firstMark) {
                firstMark = marks[i];
            }
        }
    }

    public void findBestClass() {
        int maxStandard = 0;
        int maxFirstMark = 0;
        for (int i = 0; i < 4; i++) {
            if (MPL[i].firstMark > maxFirstMark) {
                maxStandard = MPL[i].standard;
                maxFirstMark = MPL[i].firstMark;
            }
        }
        System.out.println("The standard with the highest first mark is: " + maxStandard);
    }

    public void findBestClass(int option) {
        int maxStandard = 0;
        int maxAverage = 0;
        int sum;
        int average;
        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < MPL[i].numOfStudents; j++) {
                sum += MPL[i].marks[j];
            }
            average = sum / MPL[i].numOfStudents;
            if (average > maxAverage) {
                maxStandard = MPL[i].standard;
                maxAverage = average;
            }
        }
        System.out.println("The standard with the highest class average is: " + maxStandard);
    }
}

public class Main {
    public static void main(String[] args) {
        MPL[] MPL = new MPL[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter standard: ");
            int standard = sc.nextInt();
            System.out.print("Enter number of students: ");
            int numOfStudents = sc.nextInt();
            MPL[i] = new MPL(standard, numOfStudents);
        }

        MPL.findBestClass();
        MPL.findBestClass(1);
    }
}
