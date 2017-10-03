/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Integer;

public class Grades {

    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int[] gradeDistribution = {0, 0, 0, 0, 0, 0};

    public Grades() {
    }

    private void printStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private double percentageAccepted(int[] grades) {
        int s = 0;
        for (int i = 1; i <= 5; i++) {
            s += grades[i];
        }
        int all = s + grades[0];
        return (double) (100 * s) / all;
    }

    private void gradeDistribution(int a) {
        if ((a >= 0) && (a <= 29)) {
            gradeDistribution[0]++;
        } else if ((a >= 50) && (a <= 60)) {
            gradeDistribution[5]++;
        } else {
            int j = 1;
            for (int i = 30; i <= 45; i += 5) {
                if ((a >= i) && (a <= (i + 4))) {
                    gradeDistribution[j]++;
                    break;
                }
                j++;
            }
        }
    }

    public void addGrades(int grade) {
        grades.add(grade);
        gradeDistribution(grade);

    }

    public void printDistribution() {
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(gradeDistribution[i]);
        }
        System.out.println("Acceptance percentage: " + percentageAccepted(gradeDistribution));
    }

}
