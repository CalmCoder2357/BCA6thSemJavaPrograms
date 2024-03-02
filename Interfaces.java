
import java.util.Scanner;

// Interface for calculating total score
interface Calculable {
    int getTotalScore();
}

// Class representing a student with roll number
class Student {
    private int rollNo;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// Class representing test scores for 5 subjects
class Test extends Student implements Calculable {
    private int[] marks;

    public Test(int rollNo, int[] marks) {
        super(rollNo);
        this.marks = marks;
    }

    @Override
    public int getTotalScore() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
}

// Class representing sports score with weight
class Sports implements Calculable {
    private int sportsWeight;

    public Sports(int sportsWeight) {
        this.sportsWeight = sportsWeight;
    }

    @Override
    public int getTotalScore() {
        return sportsWeight;
    }
}

// Class representing the final result with total score
class Result extends Student implements Calculable {
    private Test test;
    private Sports sports;

    public Result(int rollNo, Test test, Sports sports) {
        super(rollNo);
        this.test = test;
        this.sports = sports;
    }

    @Override
    public int getTotalScore() {
        return test.getTotalScore() + sports.getTotalScore();
    }

    public void printResult() {
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Test Score: " + test.getTotalScore());
        System.out.println("Sports Score: " + sports.getTotalScore());
        System.out.println("Grand Total Score: " + getTotalScore());
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ": ");
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();

            System.out.print("Enter marks for 2 subjects (space separated): ");
            int[] marks = new int[2];
            for (int j = 0; j < 2; j++) {
                marks[j] = scanner.nextInt();
            }

            System.out.print("Enter sports weight: ");
            int sportsWeight = scanner.nextInt();

            Test test = new Test(rollNo, marks);
            Sports sports = new Sports(sportsWeight);
            Result result = new Result(rollNo, test, sports);

            result.printResult();
            System.out.println();
        }

        scanner.close();
    }
}