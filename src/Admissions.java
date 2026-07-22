// This program compares two applicants GPA weighted and either they're SAT or ACT scores.
// Then, it caculates a score using a formula and compares the two.
// It reports which applicant has a stronger score. 

import java.util.*;

public class Admissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printIntro();
        double score1 = processApplicant(console, 1);
        double score2 = processApplicant(console, 2);
        reportResults(score1, score2);
    }

    // This method is void and does not return anything, it is a collection of print statements
    // that only introduce the program to the user.
    public static void printIntro() {
        System.out.println("This program compares two applicants to");
        System.out.println("determine which one seems like the stronger");
        System.out.println("applicant.  For each candidate I will need");
        System.out.println("either SAT or ACT scores plus a weighted GPA.");
    }

    // This method returns a double which is the exam and gpa scores added together, it takes 
    // in the scanner input from the user and the number of which applicant is being looked at.
    // it calls examScore and gpascore methods to get the scores and adds them up.
    public static double processApplicant(Scanner console, int number) {
        System.out.println("Information for applicant #" + number + ":");
        double exam = examScore(console);
        System.out.printf("    exam score = %.1f%n", exam);
        double gpa = gpaScore(console);
        System.out.printf("    GPA score = %.1f%n", gpa);
        return exam + gpa;
    }

    // This method prompts the user to either input if they have SAT or ACT scores,
    // SAT is 1 and ACT is 2, whichever is prompted in , the corresponding method is then
    // called and score is returned to the processapplicant method.
    public static double examScore(Scanner console) {
        System.out.print("    do you have 1) SAT scores or 2) ACT scores? ");
        int choice = console.nextInt();
        if (choice == 1) {
            return satScore(console);
        } else {
            return actScore(console);
        }
    }

    // This mehtod returns the formualted score for the SAT, it takes in a scanner input from the,
    // user and then asks for further information regarding the SAT scores. Formula is then applied
    // and the score is returned to the examscore method.
    public static double satScore(Scanner console) {
        System.out.print("    SAT math? ");
        int math = console.nextInt();
        System.out.print("    SAT critical reading? ");
        int reading = console.nextInt();
        System.out.print("    SAT writing? ");
        int writing = console.nextInt();
        return (2 * math + reading + writing) / 32.0;
    }

    // This method returns a double which is the formulated score for the ACT,
    // it takes in a ascanner input and then asks the user more questions regarding the ACT scores,
    // afterwards those inputs are collated and using a formula are turned into a score,
    // then it is returned to the examscore method.
    public static double actScore(Scanner console) {
        System.out.print("    ACT English? ");
        int english = console.nextInt();
        System.out.print("    ACT math? ");
        int math = console.nextInt();
        System.out.print("    ACT reading? ");
        int reading = console.nextInt();
        System.out.print("    ACT science? ");
        int science = console.nextInt();
        return (english + 2 * math + reading + science) / 1.8;
    }

    // This method returns a double which is the formualted score for the GPA based on
    // further factors. It takes in a scanner input and then prompts the user to input 
    // more deciding factors. Then, using a formula the score is calculated and then
    // returned to the processapplicant method.
    public static double gpaScore(Scanner console) {
        System.out.print("    overall GPA? ");
        double gpa = console.nextDouble();
        System.out.print("    max GPA? ");
        double maxGpa = console.nextDouble();
        System.out.print("    Transcript Multiplier? ");
        double multiplier = console.nextDouble();
        return gpa / maxGpa * 100 * multiplier;
    }

    // This method is void and does not return anything, it takes in the
    // two processed scores from the processapplicatn method and compares them,
    // it will then print out which applicant had a better score of if they were equal.
    public static void reportResults(double score1, double score2) {
        System.out.printf("First applicant overall score  = %.1f%n", score1);
        System.out.printf("Second applicant overall score = %.1f%n", score2);
        if (score1 > score2) {
            System.out.println("The first applicant seems to be better");
        } else if (score2 > score1) {
            System.out.println("The second applicant seems to be better");
        } else {
            System.out.println("The two applicants seem to be equal");
        }
    }
}

/*
Sample Output (user input shown between __ underscores __):

This program compares two applicants to
determine which one seems like the stronger
applicant.  For each candidate I will need
either SAT or ACT scores plus a weighted GPA.
Information for applicant #1:
    do you have 1) SAT scores or 2) ACT scores? __1__
    SAT math? __450__
    SAT critical reading? __530__
    SAT writing? __490__
    exam score = 60.0
    overall GPA? __3.4__
    max GPA? __4.0__
    Transcript Multiplier? __0.9__
    GPA score = 76.5
Information for applicant #2:
    do you have 1) SAT scores or 2) ACT scores? __2__
    ACT English? __25__
    ACT math? __20__
    ACT reading? __18__
    ACT science? __15__
    exam score = 54.4
    overall GPA? __3.3__
    max GPA? __4.0__
    Transcript Multiplier? __0.95__
    GPA score = 78.4
First applicant overall score  = 136.5
Second applicant overall score = 132.8
The first applicant seems to be better
*/
