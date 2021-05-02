package assignment1;

import java.util.*;

public class matrix_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size_loop = 0;
        int selection;
        int index = 0;
        int index1 = 0;
        int size;
        int matrics_num;
        int row_size;
        int column_size;
        System.out.println("\tWELCOME SIMPLE MATRIX CALCULATOR");
        System.out.println("NOTE:");
        System.out.println("Calculator Function: Addition, Subtracttion and Multiplication");
        System.out.println("Automatic assume all Matrices size is SAME");
        System.out.print("\nOnly Allow 2x2 and 3x3 only");

        System.out.println("**************************************************************");
        System.out.println("\t\t\tPresented by: MUHAMMAD AZRI BIN ABDULLAH 259378"
                + "\n\t\t\t\t\t" + "      " + "SAFWAN BIN SUFIAN CHANG 261251 " +
                "\n\t\t\t\t\t\t" + "      " + "AHMAD ZULHUSNI BIN MAHMAD BASRI 264169" +
                "\n\t\t\t\t\t\t" + "      " + "MUHAMMAD SYAHMI AIMAN BIN MULIYADI  263082");
        System.out.println("**************************************************************");

        System.out.println("CALCULATOR FUNCTION");
        System.out.println("1   Addition");
        System.out.println("2   Substraction");
        System.out.println("3   Multiplication");

        while (index < 1) {
            System.out.print("\nYour choice:");
            selection = input.nextInt();
            if (selection == 1) {
                index += 1;

                System.out.println("**************************************************************");
                System.out.println("\t" + "    " + "CALCULATOR FUNCTION: ADDITION");
                System.out.println("**************************************************************");

                while (size_loop < 1) {
                    System.out.print("\nDIMENSION OF MATRICES");
                    System.out.print("\n2   2x2");
                    System.out.print("\n3   3x3");
                    System.out.print("\nYour choice:");
                    size = input.nextInt();

                    if (size > 1 && size < 4) {
                        System.out.println("The dimension of matrices: " + size + " x " + size);
                        size_loop += 1;

                        System.out.println("\nHow many matrices in this calculation:");
                        System.out.println("2   2 matrices");
                        System.out.println("3   3 matrices");

                        while (index1 < 1) {
                            System.out.print("\nYour choice:");
                            matrics_num = input.nextInt();

                            if (size == 2) {
                                if (matrics_num == 2) {
                                    index1 += 1;
                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];

                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2 |");
                                    System.out.println("\t| b1  b2 |");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1] + " |");
                                    System.out.print(" " + "+" + " | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1] + " |");
                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1] + " |");
                                    System.out.print(" " + " " + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " + " + add_matrics2[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " + " + add_matrics2[0][1] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " + " + add_matrics2[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " + " + add_matrics2[1][1] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] + add_matrics2[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] + add_matrics2[0][1]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] + add_matrics2[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] + add_matrics2[1][1]) + "|");
                                    System.out.println("\n**************************************************************");
                                } else if (matrics_num == 3) {
                                    index1 += 1;

                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];
                                    int[][] add_matrics3 = new int[size][size];
                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2 |");
                                    System.out.println("\t| b1  b2 |");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();

                                    System.out.println("Input number for THIRD matrices:");
                                    System.out.print("a1:");
                                    add_matrics3[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics3[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics3[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics3[1][1] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1] + " |");
                                    System.out.print(" " + "+" + " | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1] + " |");
                                    System.out.print(" " + "+" + " | " + add_matrics3[0][0]);
                                    System.out.print("   " + add_matrics3[0][1] + " |");
                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1] + " |");
                                    System.out.print(" " + " " + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1] + " |");
                                    System.out.print(" " + " " + " | " + add_matrics3[1][0]);
                                    System.out.print("   " + add_matrics3[1][1] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " + " + add_matrics2[0][0] + " + " + add_matrics3[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " + " + add_matrics2[0][1] + " + " + add_matrics3[0][1] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " + " + add_matrics2[1][0] + " + " + add_matrics3[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " + " + add_matrics2[1][1] + " + " + add_matrics3[1][1] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] + add_matrics2[0][0] + add_matrics3[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] + add_matrics2[0][1] + add_matrics3[0][1]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] + add_matrics2[1][0] + add_matrics3[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] + add_matrics2[1][1] + add_matrics3[1][1]) + "|");
                                    System.out.println("\n**************************************************************");
                                } else {
                                    System.out.print("Error input.This System not support  the inputed Matrices number");
                                    index1 = 0;
                                }
                            } else if (size == 3) {
                                if (matrics_num == 2) {
                                    index1 += 1;
                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];

                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2  a3|");
                                    System.out.println("\t| b1  b2  b3|");
                                    System.out.println("\t| c1  c2  c3|");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics1[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics1[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics1[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics1[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics1[2][2] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics2[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics2[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics2[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics2[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics2[2][2] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1]);
                                    System.out.print("   " + add_matrics1[0][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1]);
                                    System.out.print("   " + add_matrics2[0][2] + " |");

                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1]);
                                    System.out.print("   " + add_matrics1[1][2] + " |");
                                    System.out.print(" " + "+" + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1]);
                                    System.out.print("   " + add_matrics2[1][2] + " |");

                                    System.out.print("\n| " + add_matrics1[2][0]);
                                    System.out.print("   " + add_matrics1[2][1]);
                                    System.out.print("   " + add_matrics1[2][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics2[2][0]);
                                    System.out.print("   " + add_matrics2[2][1]);
                                    System.out.print("   " + add_matrics2[2][2] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " + " + add_matrics2[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " + " + add_matrics2[0][1] + ")");
                                    System.out.print("  (" + add_matrics1[0][2] + " + " + add_matrics2[0][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " + " + add_matrics2[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " + " + add_matrics2[1][1] + ")");
                                    System.out.print("  (" + add_matrics1[1][2] + " + " + add_matrics2[1][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[2][0] + " + " + add_matrics2[2][0] + ")");
                                    System.out.print("  (" + add_matrics1[2][1] + " + " + add_matrics2[2][1] + ")");
                                    System.out.print("  (" + add_matrics1[2][2] + " + " + add_matrics2[2][2] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] + add_matrics2[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] + add_matrics2[0][1]));
                                    System.out.print("  " + (add_matrics1[0][2] + add_matrics2[0][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] + add_matrics2[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] + add_matrics2[1][1]));
                                    System.out.print("  " + (add_matrics1[1][2] + add_matrics2[1][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[2][0] + add_matrics2[2][0]));
                                    System.out.print("  " + (add_matrics1[2][1] + add_matrics2[2][1]));
                                    System.out.print("  " + (add_matrics1[2][2] + add_matrics2[2][2]) + "|");
                                    System.out.println("\n**************************************************************");
                                } else if (matrics_num == 3) {
                                    index1 += 1;
                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];
                                    int[][] add_matrics3 = new int[size][size];

                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2  a3|");
                                    System.out.println("\t| b1  b2  b3|");
                                    System.out.println("\t| c1  c2  c3|");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics1[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics1[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics1[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics1[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics1[2][2] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics2[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics2[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics2[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics2[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics2[2][2] = input.nextInt();

                                    System.out.println("Input number for THIRD matrices:");
                                    System.out.print("a1:");
                                    add_matrics3[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics3[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics3[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics3[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics3[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics3[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics3[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics3[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics3[2][2] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1]);
                                    System.out.print("   " + add_matrics1[0][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1]);
                                    System.out.print("   " + add_matrics2[0][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics3[0][0]);
                                    System.out.print("   " + add_matrics3[0][1]);
                                    System.out.print("   " + add_matrics3[0][2] + " |");

                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1]);
                                    System.out.print("   " + add_matrics1[1][2] + " |");
                                    System.out.print(" " + "+" + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1]);
                                    System.out.print("   " + add_matrics2[1][2] + " |");
                                    System.out.print(" " + "+" + " | " + add_matrics3[1][0]);
                                    System.out.print("   " + add_matrics3[1][1]);
                                    System.out.print("   " + add_matrics3[1][2] + " |");

                                    System.out.print("\n| " + add_matrics1[2][0]);
                                    System.out.print("   " + add_matrics1[2][1]);
                                    System.out.print("   " + add_matrics1[2][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics2[2][0]);
                                    System.out.print("   " + add_matrics2[2][1]);
                                    System.out.print("   " + add_matrics2[2][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics3[2][0]);
                                    System.out.print("   " + add_matrics3[2][1]);
                                    System.out.print("   " + add_matrics3[2][2] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " + " + add_matrics2[0][0] + " + " + add_matrics3[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " + " + add_matrics2[0][1] + " + " + add_matrics3[0][1] + ")");
                                    System.out.print("  (" + add_matrics1[0][2] + " + " + add_matrics2[0][2] + " + " + add_matrics3[0][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " + " + add_matrics2[1][0] + " + " + add_matrics3[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " + " + add_matrics2[1][1] + " + " + add_matrics3[1][1] + ")");
                                    System.out.print("  (" + add_matrics1[1][2] + " + " + add_matrics2[1][2] + " + " + add_matrics3[1][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[2][0] + " + " + add_matrics2[2][0] + " + " + add_matrics3[2][0] + ")");
                                    System.out.print("  (" + add_matrics1[2][1] + " + " + add_matrics2[2][1] + " + " + add_matrics3[2][1] + ")");
                                    System.out.print("  (" + add_matrics1[2][2] + " + " + add_matrics2[2][2] + " + " + add_matrics3[2][2] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] + add_matrics2[0][0] + add_matrics3[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] + add_matrics2[0][1] + add_matrics3[0][1]));
                                    System.out.print("  " + (add_matrics1[0][2] + add_matrics2[0][2] + add_matrics3[0][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] + add_matrics2[1][0] + add_matrics3[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] + add_matrics2[1][1] + add_matrics3[1][1]));
                                    System.out.print("  " + (add_matrics1[1][2] + add_matrics2[1][2] + add_matrics3[1][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[2][0] + add_matrics2[2][0] + add_matrics3[2][0]));
                                    System.out.print("  " + (add_matrics1[2][1] + add_matrics2[2][1] + add_matrics3[2][1]));
                                    System.out.print("  " + (add_matrics1[2][2] + add_matrics2[2][2] + add_matrics3[2][2]) + "|");
                                    System.out.println("\n**************************************************************");
                                }
                            } else {
                                System.out.print("\n This System NOT support Matrices Size more than 3");
                                index1 = 0;
                            }
                        }
                    } else {
                        System.out.print("Please input the valid Size");
                        size_loop = 0;
                    }
                }
            } else if (selection == 2) {
                index += 1;

                System.out.println("**************************************************************");
                System.out.println("\t" + "    " + "CALCULATOR FUNCTION: SUBTRACTION");
                System.out.println("**************************************************************");

                while (size_loop < 1) {
                    System.out.print("\nDIMENSION OF MATRICES");
                    System.out.print("\n2   2x2");
                    System.out.print("\n3   3x3");
                    System.out.print("\nYour choice:");
                    size = input.nextInt();

                    if (size > 1 && size < 4) {
                        System.out.println("The dimension of matrices: " + size + " x " + size);
                        size_loop += 1;

                        System.out.println("\nHow many matrices in this calculation:");
                        System.out.println("2   2 matrices");
                        System.out.println("3   3 matrices");

                        while (index1 < 1) {
                            System.out.print("\nYour choice:");
                            matrics_num = input.nextInt();

                            if (size == 2) {
                                if (matrics_num == 2) {
                                    index1 += 1;

                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];
                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2 |");
                                    System.out.println("\t| b1  b2 |");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1] + " |");
                                    System.out.print(" " + "-" + " | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1] + " |");
                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1] + " |");
                                    System.out.print(" " + " " + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " - " + add_matrics2[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " - " + add_matrics2[0][1] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " - " + add_matrics2[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " - " + add_matrics2[1][1] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] - add_matrics2[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] - add_matrics2[0][1]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] - add_matrics2[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] - add_matrics2[1][1]) + "|");
                                    System.out.println("\n**************************************************************");
                                } else if (matrics_num == 3) {
                                    index1 += 1;

                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];
                                    int[][] add_matrics3 = new int[size][size];
                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2 |");
                                    System.out.println("\t| b1  b2 |");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();

                                    System.out.println("Input number for THIRD matrices:");
                                    System.out.print("a1:");
                                    add_matrics3[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics3[0][1] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics3[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics3[1][1] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1] + " |");
                                    System.out.print(" " + "-" + " | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1] + " |");
                                    System.out.print(" " + "-" + " | " + add_matrics3[0][0]);
                                    System.out.print("   " + add_matrics3[0][1] + " |");
                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1] + " |");
                                    System.out.print(" " + " " + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1] + " |");
                                    System.out.print(" " + " " + " | " + add_matrics3[1][0]);
                                    System.out.print("   " + add_matrics3[1][1] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " - " + add_matrics2[0][0] + " - " + add_matrics3[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " - " + add_matrics2[0][1] + " - " + add_matrics3[0][1] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " - " + add_matrics2[1][0] + " - " + add_matrics3[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " - " + add_matrics2[1][1] + " - " + add_matrics3[1][1] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] - add_matrics2[0][0] - add_matrics3[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] - add_matrics2[0][1] - add_matrics3[0][1]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] - add_matrics2[1][0] - add_matrics3[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] - add_matrics2[1][1] - add_matrics3[1][1]) + "|");
                                    System.out.println("\n**************************************************************");
                                } else {
                                    System.out.print("Error input.This System not support  the inputed Matrices number");
                                    index1 = 0;
                                }
                            } else if (size == 3) {
                                if (matrics_num == 2) {
                                    index1 += 1;
                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];

                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2  a3|");
                                    System.out.println("\t| b1  b2  b3|");
                                    System.out.println("\t| c1  c2  c3|");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics1[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics1[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics1[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics1[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics1[2][2] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics2[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics2[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics2[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics2[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics2[2][2] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1]);
                                    System.out.print("   " + add_matrics1[0][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1]);
                                    System.out.print("   " + add_matrics2[0][2] + " |");

                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1]);
                                    System.out.print("   " + add_matrics1[1][2] + " |");
                                    System.out.print(" " + "-" + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1]);
                                    System.out.print("   " + add_matrics2[1][2] + " |");

                                    System.out.print("\n| " + add_matrics1[2][0]);
                                    System.out.print("   " + add_matrics1[2][1]);
                                    System.out.print("   " + add_matrics1[2][2] + " |");
                                    System.out.print(" " + "  | " + add_matrics2[2][0]);
                                    System.out.print("   " + add_matrics2[2][1]);
                                    System.out.print("   " + add_matrics2[2][2] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " - " + add_matrics2[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " - " + add_matrics2[0][1] + ")");
                                    System.out.print("  (" + add_matrics1[0][2] + " - " + add_matrics2[0][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " - " + add_matrics2[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " - " + add_matrics2[1][1] + ")");
                                    System.out.print("  (" + add_matrics1[1][2] + " - " + add_matrics2[1][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[2][0] + " - " + add_matrics2[2][0] + ")");
                                    System.out.print("  (" + add_matrics1[2][1] + " - " + add_matrics2[2][1] + ")");
                                    System.out.print("  (" + add_matrics1[2][2] + " - " + add_matrics2[2][2] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] - add_matrics2[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] - add_matrics2[0][1]));
                                    System.out.print("  " + (add_matrics1[0][2] - add_matrics2[0][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] - add_matrics2[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] - add_matrics2[1][1]));
                                    System.out.print("  " + (add_matrics1[1][2] - add_matrics2[1][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[2][0] - add_matrics2[2][0]));
                                    System.out.print("  " + (add_matrics1[2][1] - add_matrics2[2][1]));
                                    System.out.print("  " + (add_matrics1[2][2] - add_matrics2[2][2]) + "|");
                                    System.out.println("\n**************************************************************");
                                } else if (matrics_num == 3) {
                                    index1 += 1;
                                    int[][] add_matrics1 = new int[size][size];
                                    int[][] add_matrics2 = new int[size][size];
                                    int[][] add_matrics3 = new int[size][size];

                                    System.out.println("Example POSITION for number matrices");
                                    System.out.println("\t| a1  a2  a3|");
                                    System.out.println("\t| b1  b2  b3|");
                                    System.out.println("\t| c1  c2  c3|");

                                    System.out.println("Input number for FIRST matrices:");
                                    System.out.print("a1:");
                                    add_matrics1[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics1[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics1[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics1[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics1[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics1[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics1[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics1[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics1[2][2] = input.nextInt();

                                    System.out.println("Input number for SECOND matrices:");
                                    System.out.print("a1:");
                                    add_matrics2[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics2[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics2[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics2[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics2[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics2[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics2[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics2[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics2[2][2] = input.nextInt();

                                    System.out.println("Input number for THIRD matrices:");
                                    System.out.print("a1:");
                                    add_matrics3[0][0] = input.nextInt();
                                    System.out.print("a2:");
                                    add_matrics3[0][1] = input.nextInt();
                                    System.out.print("a3:");
                                    add_matrics3[0][2] = input.nextInt();
                                    System.out.print("b1:");
                                    add_matrics3[1][0] = input.nextInt();
                                    System.out.print("b2:");
                                    add_matrics3[1][1] = input.nextInt();
                                    System.out.print("b3:");
                                    add_matrics3[1][2] = input.nextInt();
                                    System.out.print("c1:");
                                    add_matrics3[2][0] = input.nextInt();
                                    System.out.print("c2:");
                                    add_matrics3[2][1] = input.nextInt();
                                    System.out.print("c3:");
                                    add_matrics3[2][2] = input.nextInt();

                                    System.out.println("**************************************************************");
                                    System.out.println("\t\tCalculation STARTED");
                                    System.out.print("\n| " + add_matrics1[0][0]);
                                    System.out.print("   " + add_matrics1[0][1]);
                                    System.out.print("   " + add_matrics1[0][2] + " |");
                                    System.out.print("  " + " | " + add_matrics2[0][0]);
                                    System.out.print("   " + add_matrics2[0][1]);
                                    System.out.print("   " + add_matrics2[0][2] + " |");
                                    System.out.print("  " + " | " + add_matrics3[0][0]);
                                    System.out.print("   " + add_matrics3[0][1]);
                                    System.out.print("   " + add_matrics3[0][2] + " |");

                                    System.out.print("\n| " + add_matrics1[1][0]);
                                    System.out.print("   " + add_matrics1[1][1]);
                                    System.out.print("   " + add_matrics1[1][2] + " |");
                                    System.out.print(" " + "-" + " | " + add_matrics2[1][0]);
                                    System.out.print("   " + add_matrics2[1][1]);
                                    System.out.print("   " + add_matrics2[1][2] + " |");
                                    System.out.print(" " + "-" + " | " + add_matrics3[1][0]);
                                    System.out.print("   " + add_matrics3[1][1]);
                                    System.out.print("   " + add_matrics3[1][2] + " |");

                                    System.out.print("\n| " + add_matrics1[2][0]);
                                    System.out.print("   " + add_matrics1[2][1]);
                                    System.out.print("   " + add_matrics1[2][2] + " |");
                                    System.out.print("  " + " | " + add_matrics2[2][0]);
                                    System.out.print("   " + add_matrics2[2][1]);
                                    System.out.print("   " + add_matrics2[2][2] + " |");
                                    System.out.print("  " + " | " + add_matrics3[2][0]);
                                    System.out.print("   " + add_matrics3[2][1]);
                                    System.out.print("   " + add_matrics3[2][2] + " |");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + "(" + add_matrics1[0][0] + " - " + add_matrics2[0][0] + " - " + add_matrics3[0][0] + ")");
                                    System.out.print("  (" + add_matrics1[0][1] + " - " + add_matrics2[0][1] + " - " + add_matrics3[0][1] + ")");
                                    System.out.print("  (" + add_matrics1[0][2] + " - " + add_matrics2[0][2] + " - " + add_matrics3[0][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[1][0] + " - " + add_matrics2[1][0] + " - " + add_matrics3[1][0] + ")");
                                    System.out.print("  (" + add_matrics1[1][1] + " - " + add_matrics2[1][1] + " - " + add_matrics3[1][1] + ")");
                                    System.out.print("  (" + add_matrics1[1][2] + " - " + add_matrics2[1][2] + " - " + add_matrics3[1][2] + ")|");
                                    System.out.print("\n |" + "(" + add_matrics1[2][0] + " - " + add_matrics2[2][0] + " - " + add_matrics3[2][0] + ")");
                                    System.out.print("  (" + add_matrics1[2][1] + " - " + add_matrics2[2][1] + " - " + add_matrics3[2][1] + ")");
                                    System.out.print("  (" + add_matrics1[2][2] + " - " + add_matrics2[2][2] + " - " + add_matrics3[2][2] + ")|");

                                    System.out.print("\n");
                                    System.out.print("\n=|" + (add_matrics1[0][0] - add_matrics2[0][0] - add_matrics3[0][0]));
                                    System.out.print("  " + (add_matrics1[0][1] - add_matrics2[0][1] - add_matrics3[0][1]));
                                    System.out.print("  " + (add_matrics1[0][2] - add_matrics2[0][2] - add_matrics3[0][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[1][0] - add_matrics2[1][0] - add_matrics3[1][0]));
                                    System.out.print("  " + (add_matrics1[1][1] - add_matrics2[1][1] - add_matrics3[1][1]));
                                    System.out.print("  " + (add_matrics1[1][2] - add_matrics2[1][2] - add_matrics3[1][2]) + "|");
                                    System.out.print("\n |" + (add_matrics1[2][0] - add_matrics2[2][0] - add_matrics3[2][0]));
                                    System.out.print("  " + (add_matrics1[2][1] - add_matrics2[2][1] - add_matrics3[2][1]));
                                    System.out.print("  " + (add_matrics1[2][2] - add_matrics2[2][2] - add_matrics3[2][2]) + "|");
                                    System.out.println("\n**************************************************************");
                                }
                            } else {
                                System.out.print("\n This System NOT support Matrices Size more than 3");
                                index1 = 0;
                            }
                        }
                    } else {
                        System.out.print("Please input the valid Size");
                        size_loop = 0;
                    }
                }
            } else if (selection == 3) {
                index += 1;
                int combination_check = 0;
                int combination_choice;

                System.out.println("**************************************************************");
                System.out.println("\t" + "    " + "CALCULATOR FUNCTION: MULTIPLICATION");
                System.out.println("**************************************************************");

                while (combination_check < 1) {
                    System.out.print("\nCOMBINATION OF MULTIPLICATION");
                    System.out.print("\n1   (2x2) (2x2)");
                    System.out.print("\n2   (3x3) (3x3)");
                    System.out.print("\n3   (2x3) (3x2)");
                    System.out.print("\n4   (3x2) (2x3)");
                    System.out.print("\n\nYour Choice:");
                    combination_choice = input.nextInt();

                    if (combination_choice == 1) {
                        combination_check += 1;

                        int[][] add_matrics1 = new int[2][2];
                        int[][] add_matrics2 = new int[2][2];
                        System.out.println("Example POSITION for number matrices");
                        System.out.println("\t| a1  a2 |");
                        System.out.println("\t| b1  b2 |");

                        System.out.println("Input number for FIRST matrices:");
                        System.out.print("a1:");
                        add_matrics1[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics1[0][1] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics1[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics1[1][1] = input.nextInt();

                        System.out.println("Input number for SECOND matrices:");
                        System.out.print("a1:");
                        add_matrics2[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics2[0][1] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics2[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics2[1][1] = input.nextInt();

                        System.out.println("**************************************************************");
                        System.out.println("\t\tCalculation STARTED");

                        System.out.print("\n| " + add_matrics1[0][0]);
                        System.out.print("   " + add_matrics1[0][1] + " |");
                        System.out.print(" " + " " + " | " + add_matrics2[0][0]);
                        System.out.print("   " + add_matrics2[0][1] + " |");
                        System.out.print("\n| " + add_matrics1[1][0]);
                        System.out.print("   " + add_matrics1[1][1] + " |");
                        System.out.print(" " + "*" + " | " + add_matrics2[1][0]);
                        System.out.print("   " + add_matrics2[1][1] + " |");

                        System.out.print("\n");
                        System.out.print("\n=|" + "[(" + add_matrics1[0][0] + ")(" + add_matrics2[0][0] + ")+(" + add_matrics1[0][1] + ")" + "(" + add_matrics2[1][0] + ")]");
                        System.out.print("  [(" + add_matrics1[0][0] + ")(" + add_matrics2[0][1] + ")+(" + add_matrics1[0][1] + ")" + "(" + add_matrics2[1][1] + ")]|");
                        System.out.print("\n=|" + "[(" + add_matrics1[1][0] + ")(" + add_matrics2[0][0] + ")+(" + add_matrics1[1][1] + ")" + "(" + add_matrics2[1][0] + ")]");
                        System.out.print("  [(" + add_matrics1[1][0] + ")(" + add_matrics2[0][1] + ")+(" + add_matrics1[1][1] + ")" + "(" + add_matrics2[1][1] + ")]|");

                        System.out.print("\n");
                        System.out.print("\n=|" + (add_matrics1[0][0] * add_matrics2[0][0]) + " + " + (add_matrics1[0][1] * add_matrics2[1][0]));
                        System.out.print("   " + (add_matrics1[0][0] * add_matrics2[0][1]) + " + " + add_matrics1[0][1] * add_matrics2[1][1] + "|");
                        System.out.print("\n=|" + (add_matrics1[1][0] * add_matrics2[0][0]) + " + " + (add_matrics1[1][1] * add_matrics2[1][0]));
                        System.out.print("   " + (add_matrics1[1][0] * add_matrics2[0][1]) + " + " + add_matrics1[1][1] * add_matrics2[1][1] + "|");

                        int a1 = (add_matrics1[0][0] * add_matrics2[0][0]) + (add_matrics1[0][1] * add_matrics2[1][0]);
                        int a2 = (add_matrics1[0][0] * add_matrics2[0][1]) + (add_matrics1[0][1] * add_matrics2[1][1]);
                        int a3 = (add_matrics1[1][0] * add_matrics2[0][0]) + (add_matrics1[1][1] * add_matrics2[1][0]);
                        int a4 = (add_matrics1[1][0] * add_matrics2[0][1]) + (add_matrics1[1][1] * add_matrics2[1][1]);

                        System.out.print("\n");
                        System.out.print("\n=|" + a1);
                        System.out.print("  " + a2 + "|");
                        System.out.print("\n |" + a3);
                        System.out.print("  " + a4 + "|");
                        System.out.println("\n**************************************************************");

                    } else if (combination_choice == 2) {
                        combination_check += 1;

                        int[][] add_matrics1 = new int[3][3];
                        int[][] add_matrics2 = new int[3][3];

                        System.out.println("Example POSITION for number matrices");
                        System.out.println("\t| a1  a2  a3|");
                        System.out.println("\t| b1  b2  b3|");
                        System.out.println("\t| c1  c2  c3|");

                        System.out.println("Input number for FIRST matrices:");
                        System.out.print("a1:");
                        add_matrics1[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics1[0][1] = input.nextInt();
                        System.out.print("a3:");
                        add_matrics1[0][2] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics1[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics1[1][1] = input.nextInt();
                        System.out.print("b3:");
                        add_matrics1[1][2] = input.nextInt();
                        System.out.print("c1:");
                        add_matrics1[2][0] = input.nextInt();
                        System.out.print("c2:");
                        add_matrics1[2][1] = input.nextInt();
                        System.out.print("c3:");
                        add_matrics1[2][2] = input.nextInt();

                        System.out.println("Input number for SECOND matrices:");
                        System.out.print("a1:");
                        add_matrics2[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics2[0][1] = input.nextInt();
                        System.out.print("a3:");
                        add_matrics2[0][2] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics2[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics2[1][1] = input.nextInt();
                        System.out.print("b3:");
                        add_matrics2[1][2] = input.nextInt();
                        System.out.print("c1:");
                        add_matrics2[2][0] = input.nextInt();
                        System.out.print("c2:");
                        add_matrics2[2][1] = input.nextInt();
                        System.out.print("c3:");
                        add_matrics2[2][2] = input.nextInt();

                        System.out.println("**************************************************************");
                        System.out.println("\t\tCalculation STARTED");
                        System.out.print("\n| " + add_matrics1[0][0]);
                        System.out.print("   " + add_matrics1[0][1]);
                        System.out.print("   " + add_matrics1[0][2] + " |");
                        System.out.print("  " + " | " + add_matrics2[0][0]);
                        System.out.print("   " + add_matrics2[0][1]);
                        System.out.print("   " + add_matrics2[0][2] + " |");

                        System.out.print("\n| " + add_matrics1[1][0]);
                        System.out.print("   " + add_matrics1[1][1]);
                        System.out.print("   " + add_matrics1[1][2] + " |");
                        System.out.print(" " + "*" + " | " + add_matrics2[1][0]);
                        System.out.print("   " + add_matrics2[1][1]);
                        System.out.print("   " + add_matrics2[1][2] + " |");

                        System.out.print("\n| " + add_matrics1[2][0]);
                        System.out.print("   " + add_matrics1[2][1]);
                        System.out.print("   " + add_matrics1[2][2] + " |");
                        System.out.print("  " + " | " + add_matrics2[2][0]);
                        System.out.print("   " + add_matrics2[2][1]);
                        System.out.print("   " + add_matrics2[2][2] + " |");

                        System.out.print("\n");
                        System.out.print("\n=|" + "[(" + add_matrics1[0][0] + ")(" + add_matrics2[0][0] + ")+(" + add_matrics1[0][1] + ")" + "(" + add_matrics2[1][0] + ")+(" + add_matrics1[0][2] + ")(" + add_matrics2[2][0] + ")]");
                        System.out.print("  [(" + add_matrics1[0][0] + ")(" + add_matrics2[0][1] + ")+(" + add_matrics1[0][1] + ")" + "(" + add_matrics2[1][1] + ")+(" + add_matrics1[0][2] + ")(" + add_matrics2[2][1] + ")]");
                        System.out.print("  [(" + add_matrics1[0][0] + ")(" + add_matrics2[0][2] + ")+(" + add_matrics1[0][1] + ")" + "(" + add_matrics2[1][2] + ")+(" + add_matrics1[0][2] + ")(" + add_matrics2[2][2] + ")]|");

                        System.out.print("\n |" + "[(" + add_matrics1[1][0] + ")(" + add_matrics2[0][0] + ")+(" + add_matrics1[1][1] + ")" + "(" + add_matrics2[1][0] + ")+(" + add_matrics1[1][2] + ")(" + add_matrics2[2][0] + ")]");
                        System.out.print("  [(" + add_matrics1[1][0] + ")(" + add_matrics2[0][1] + ")+(" + add_matrics1[1][1] + ")" + "(" + add_matrics2[1][1] + ")+(" + add_matrics1[1][2] + ")(" + add_matrics2[2][1] + ")]");
                        System.out.print("  [(" + add_matrics1[1][0] + ")(" + add_matrics2[0][2] + ")+(" + add_matrics1[1][1] + ")" + "(" + add_matrics2[1][2] + ")+(" + add_matrics1[1][2] + ")(" + add_matrics2[2][2] + ")]|");

                        System.out.print("\n |" + "[(" + add_matrics1[2][0] + ")(" + add_matrics2[0][0] + ")+(" + add_matrics1[2][1] + ")" + "(" + add_matrics2[1][0] + ")+(" + add_matrics1[2][2] + ")(" + add_matrics2[2][0] + ")]");
                        System.out.print("  [(" + add_matrics1[2][0] + ")(" + add_matrics2[0][1] + ")+(" + add_matrics1[2][1] + ")" + "(" + add_matrics2[1][1] + ")+(" + add_matrics1[2][2] + ")(" + add_matrics2[2][1] + ")]");
                        System.out.print("  [(" + add_matrics1[2][0] + ")(" + add_matrics2[0][2] + ")+(" + add_matrics1[2][1] + ")" + "(" + add_matrics2[1][2] + ")+(" + add_matrics1[2][2] + ")(" + add_matrics2[2][2] + ")]|");


                        System.out.print("\n");
                        System.out.print("\n=|" + (add_matrics1[0][0] * add_matrics2[0][0]) + " + " + (add_matrics1[0][1] * add_matrics2[1][0] + " + " + (add_matrics1[0][2] * add_matrics2[2][0])));
                        System.out.print("    " + (add_matrics1[0][0] * add_matrics2[0][1]) + " + " + (add_matrics1[0][1] * add_matrics2[1][1]) + " + " + (add_matrics1[0][2] * add_matrics2[2][1]));
                        System.out.print("    " + (add_matrics1[0][0] * add_matrics2[0][2]) + " + " + (add_matrics1[0][1] * add_matrics2[1][2]) + " + " + (add_matrics1[0][2] * add_matrics2[2][2]) + "|");
                        System.out.print("\n");
                        System.out.print(" |" + (add_matrics1[1][0] * add_matrics2[0][0]) + " + " + (add_matrics1[1][1] * add_matrics2[1][0] + " + " + (add_matrics1[1][2] * add_matrics2[2][0])));
                        System.out.print("   " + (add_matrics1[1][0] * add_matrics2[0][1]) + " + " + (add_matrics1[1][1] * add_matrics2[1][1]) + " + " + (add_matrics1[1][2] * add_matrics2[2][1]));
                        System.out.print("   " + (add_matrics1[1][0] * add_matrics2[0][2]) + " + " + (add_matrics1[1][1] * add_matrics2[1][2]) + " + " + (add_matrics1[1][2] * add_matrics2[2][2]) + "|");
                        System.out.print("\n");
                        System.out.print(" |" + (add_matrics1[2][0] * add_matrics2[0][0]) + " + " + (add_matrics1[2][1] * add_matrics2[1][0] + " + " + (add_matrics1[2][2] * add_matrics2[2][0])));
                        System.out.print("   " + (add_matrics1[2][0] * add_matrics2[0][1]) + " + " + (add_matrics1[2][1] * add_matrics2[1][1]) + " + " + (add_matrics1[2][2] * add_matrics2[2][1]));
                        System.out.print("   " + (add_matrics1[2][0] * add_matrics2[0][2]) + " + " + (add_matrics1[2][1] * add_matrics2[1][2]) + " + " + (add_matrics1[2][2] * add_matrics2[2][2]) + "|");

                        int a1 = (add_matrics1[0][0] * add_matrics2[0][0]) + (add_matrics1[0][1] * add_matrics2[1][0]) + (add_matrics1[0][2] * add_matrics2[2][0]);
                        int a2 = (add_matrics1[0][0] * add_matrics2[0][1]) + (add_matrics1[0][1] * add_matrics2[1][1]) + (add_matrics1[0][2] * add_matrics2[2][1]);
                        int a3 = (add_matrics1[0][0] * add_matrics2[0][2]) + (add_matrics1[0][1] * add_matrics2[1][2]) + (add_matrics1[0][2] * add_matrics2[2][2]);
                        int b1 = (add_matrics1[1][0] * add_matrics2[0][0]) + (add_matrics1[1][1] * add_matrics2[1][0]) + (add_matrics1[1][2] * add_matrics2[2][0]);
                        int b2 = (add_matrics1[1][0] * add_matrics2[0][1]) + (add_matrics1[1][1] * add_matrics2[1][1]) + (add_matrics1[1][2] * add_matrics2[2][1]);
                        int b3 = (add_matrics1[1][0] * add_matrics2[0][2]) + (add_matrics1[1][1] * add_matrics2[1][2]) + (add_matrics1[1][2] * add_matrics2[2][2]);
                        int c1 = (add_matrics1[2][0] * add_matrics2[0][0]) + (add_matrics1[2][1] * add_matrics2[1][0]) + (add_matrics1[2][2] * add_matrics2[2][0]);
                        int c2 = (add_matrics1[2][0] * add_matrics2[0][1]) + (add_matrics1[2][1] * add_matrics2[1][1]) + (add_matrics1[2][2] * add_matrics2[2][1]);
                        int c3 = (add_matrics1[2][0] * add_matrics2[0][2]) + (add_matrics1[2][1] * add_matrics2[1][2]) + (add_matrics1[2][2] * add_matrics2[2][2]);

                        System.out.print("\n");
                        System.out.print("\n=|" + a1);
                        System.out.print("  " + a2);
                        System.out.print("  " + a3 + "|");
                        System.out.print("\n |" + b1);
                        System.out.print("  " + b2);
                        System.out.print("  " + b3 + "|");
                        System.out.print("\n |" + c1);
                        System.out.print("  " + c2);
                        System.out.print("  " + c3 + "|");
                        System.out.println("\n**************************************************************");


                    } else if (combination_choice == 3) {
                        combination_check += 1;

                        int[][] add_matrics1 = new int[2][3];
                        int[][] add_matrics2 = new int[3][2];

                        System.out.println("Example POSITION for number matrices");
                        System.out.println("\t| a1  a2  a3|");
                        System.out.println("\t| b1  b2  b3|");


                        System.out.println("Input number for FIRST matrices:");
                        System.out.print("a1:");
                        add_matrics1[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics1[0][1] = input.nextInt();
                        System.out.print("a3:");
                        add_matrics1[0][2] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics1[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics1[1][1] = input.nextInt();
                        System.out.print("b3:");
                        add_matrics1[1][2] = input.nextInt();

                        System.out.println("Input number for SECOND matrices:");
                        System.out.print("a1:");
                        add_matrics2[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics2[0][1] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics2[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics2[1][1] = input.nextInt();
                        System.out.print("c1:");
                        add_matrics2[2][0] = input.nextInt();
                        System.out.print("c2:");
                        add_matrics2[2][1] = input.nextInt();

                        System.out.println("**************************************************************");
                        System.out.println("\t\tCalculation STARTED");
                        System.out.print("\n| " + add_matrics1[0][0]);
                        System.out.print("   " + add_matrics1[0][1]);
                        System.out.print("   " + add_matrics1[0][2] + " |");
                        System.out.print(" " + "  | " + add_matrics2[0][0]);
                        System.out.print("   " + add_matrics2[0][1] + " |");

                        System.out.print("\n| " + add_matrics1[1][0]);
                        System.out.print("   " + add_matrics1[1][1]);
                        System.out.print("   " + add_matrics1[1][2] + " |");
                        System.out.print(" " + "*" + " | " + add_matrics2[1][0]);
                        System.out.print("   " + add_matrics2[1][1] + " |");
                        System.out.print("\n\t\t\t\t\t | " + add_matrics2[2][0]);
                        System.out.print("   " + add_matrics2[2][1] + " |");

                        System.out.print("\n");
                        System.out.print("\n=|" + "[(" + add_matrics1[0][0] + ")(" + add_matrics2[0][0] + ")+");
                        System.out.print("(" + add_matrics1[0][1] + ")(" + add_matrics2[1][0] + ")+");
                        System.out.print("(" + add_matrics1[0][2] + ")(" + add_matrics2[2][0] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[0][0] + ")(" + add_matrics2[0][1] + ")+");
                        System.out.print("(" + add_matrics1[0][1] + ")(" + add_matrics2[1][1] + ")+");
                        System.out.print("(" + add_matrics1[0][2] + ")(" + add_matrics2[2][1] + ")]|");
                        System.out.print("\n |" + "[(" + add_matrics1[1][0] + ")(" + add_matrics2[0][0] + ")+");
                        System.out.print("(" + add_matrics1[1][1] + ")(" + add_matrics2[1][0] + ")+");
                        System.out.print("(" + add_matrics1[1][2] + ")(" + add_matrics2[2][0] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[1][0] + ")(" + add_matrics2[0][1] + ")+");
                        System.out.print("(" + add_matrics1[1][1] + ")(" + add_matrics2[1][1] + ")+");
                        System.out.print("(" + add_matrics1[1][2] + ")(" + add_matrics2[2][1] + ")]|");

                        System.out.print("\n");
                        System.out.print("\n=|" + (add_matrics1[0][0] * add_matrics2[0][0]) + "+");
                        System.out.print((add_matrics1[0][1] * add_matrics2[1][0]) + "+");
                        System.out.print((add_matrics1[0][2] * add_matrics2[2][0]));
                        System.out.print("   " + (add_matrics1[0][0] * add_matrics2[0][1]) + "+");
                        System.out.print((add_matrics1[0][1] * add_matrics2[1][1]) + "+");
                        System.out.print((add_matrics1[0][2] * add_matrics2[2][1]) + "|");

                        System.out.print("\n |" + (add_matrics1[1][0] * add_matrics2[0][0]) + "+");
                        System.out.print((add_matrics1[1][1] * add_matrics2[1][0]) + "+");
                        System.out.print((add_matrics1[1][2] * add_matrics2[2][0]));
                        System.out.print("   " + (add_matrics1[1][0] * add_matrics2[0][1]) + "+");
                        System.out.print((add_matrics1[1][1] * add_matrics2[1][1]) + "+");
                        System.out.print((add_matrics1[1][2] * add_matrics2[2][1]) + "|");

                        int a1 = (add_matrics1[0][0] * add_matrics2[0][0]) + (add_matrics1[0][1] * add_matrics2[1][0]) + (add_matrics1[0][2] * add_matrics2[2][0]);
                        int a2 = (add_matrics1[0][0] * add_matrics2[0][1]) + (add_matrics1[0][1] * add_matrics2[1][1]) + (add_matrics1[0][2] * add_matrics2[2][1]);
                        int b1 = (add_matrics1[1][0] * add_matrics2[0][0]) + (add_matrics1[1][1] * add_matrics2[1][0]) + (add_matrics1[1][2] * add_matrics2[2][0]);
                        int b2 = (add_matrics1[1][0] * add_matrics2[0][1]) + (add_matrics1[1][1] * add_matrics2[1][1]) + (add_matrics1[1][2] * add_matrics2[2][1]);

                        System.out.print("\n");
                        System.out.print("\n=|" + a1);
                        System.out.print("   " + a2 + "|");
                        System.out.print("\n |" + b1);
                        System.out.print("   " + b2 + "|");
                        System.out.println("\n**************************************************************");

                    } else if (combination_choice == 4) {
                        combination_check += 1;

                        int[][] add_matrics1 = new int[3][2];
                        int[][] add_matrics2 = new int[2][3];

                        System.out.println("Example POSITION for number matrices");
                        System.out.println("\t| a1  a2  |");
                        System.out.println("\t| b1  b2  |");
                        System.out.println("\t| c1  c2  |");


                        System.out.println("Input number for FIRST matrices:");
                        System.out.print("a1:");
                        add_matrics1[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics1[0][1] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics1[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics1[1][1] = input.nextInt();
                        System.out.print("c1:");
                        add_matrics1[2][0] = input.nextInt();
                        System.out.print("c2:");
                        add_matrics1[2][1] = input.nextInt();

                        System.out.println("Input number for SECOND matrices:");
                        System.out.print("a1:");
                        add_matrics2[0][0] = input.nextInt();
                        System.out.print("a2:");
                        add_matrics2[0][1] = input.nextInt();
                        System.out.print("a3:");
                        add_matrics2[0][2] = input.nextInt();
                        System.out.print("b1:");
                        add_matrics2[1][0] = input.nextInt();
                        System.out.print("b2:");
                        add_matrics2[1][1] = input.nextInt();
                        System.out.print("b3:");
                        add_matrics2[1][2] = input.nextInt();

                        System.out.println("**************************************************************");
                        System.out.println("\t\tCalculation STARTED");
                        System.out.print("\n| " + add_matrics1[0][0]);
                        System.out.print("   " + add_matrics1[0][1] + " |");
                        System.out.print(" " + "  | " + add_matrics2[0][0]);
                        System.out.print("   " + add_matrics2[0][1]);
                        System.out.print("   " + add_matrics2[0][2] + " |");
                        System.out.print("\n| " + add_matrics1[1][0]);
                        System.out.print("   " + add_matrics1[1][1] + " |");
                        System.out.print(" " + "*" + " | " + add_matrics2[1][0]);
                        System.out.print("   " + add_matrics2[1][1]);
                        System.out.print("   " + add_matrics2[1][2] + " |");
                        System.out.print("\n| " + add_matrics1[2][0]);
                        System.out.print("   " + add_matrics1[2][1] + " |");

                        System.out.print("\n");
                        System.out.print("\n=|[(" + add_matrics1[0][0] + ")" + "(" + add_matrics2[0][0] + ")+");
                        System.out.print("(" + add_matrics1[0][1] + ")(" + add_matrics2[1][0] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[0][0] + ")(" + add_matrics2[0][1] + ")+");
                        System.out.print("(" + add_matrics1[0][1] + ")(" + add_matrics2[1][1] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[0][0] + ")(" + add_matrics2[0][2] + ")+");
                        System.out.print("(" + add_matrics1[0][1] + ")(" + add_matrics2[1][2] + ")]|");
                        System.out.print("\n |[(" + add_matrics1[1][0] + ")" + "(" + add_matrics2[0][0] + ")+");
                        System.out.print("(" + add_matrics1[1][1] + ")(" + add_matrics2[1][0] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[1][0] + ")(" + add_matrics2[0][1] + ")+");
                        System.out.print("(" + add_matrics1[1][1] + ")(" + add_matrics2[1][1] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[1][0] + ")(" + add_matrics2[0][2] + ")+");
                        System.out.print("(" + add_matrics1[1][1] + ")(" + add_matrics2[1][2] + ")]|");
                        System.out.print("\n |[(" + add_matrics1[2][0] + ")" + "(" + add_matrics2[0][0] + ")+");
                        System.out.print("(" + add_matrics1[2][1] + ")(" + add_matrics2[1][0] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[2][0] + ")(" + add_matrics2[0][1] + ")+");
                        System.out.print("(" + add_matrics1[2][1] + ")(" + add_matrics2[1][1] + ")]");
                        System.out.print("   " + "[(" + add_matrics1[2][0] + ")(" + add_matrics2[0][2] + ")+");
                        System.out.print("(" + add_matrics1[2][1] + ")(" + add_matrics2[1][2] + ")]|");

                        System.out.print("\n");
                        System.out.print("\n=|" + (add_matrics1[0][0] * add_matrics2[0][0]) + "+");
                        System.out.print((add_matrics1[0][1] * add_matrics2[1][0]));
                        System.out.print("   " + (add_matrics1[0][0] * add_matrics2[0][1]) + "+");
                        System.out.print((add_matrics1[0][1] * add_matrics2[1][1]));
                        System.out.print("   " + (add_matrics1[0][0] * add_matrics2[0][2]) + "+");
                        System.out.print((add_matrics1[0][1] * add_matrics2[1][2] + "|"));

                        System.out.print("\n |" + (add_matrics1[1][0] * add_matrics2[0][0]) + "+");
                        System.out.print((add_matrics1[1][1] * add_matrics2[1][0]));
                        System.out.print("   " + (add_matrics1[1][0] * add_matrics2[0][1]) + "+");
                        System.out.print((add_matrics1[1][1] * add_matrics2[1][1]));
                        System.out.print("   " + (add_matrics1[1][0] * add_matrics2[0][2]) + "+");
                        System.out.print((add_matrics1[1][1] * add_matrics2[1][2] + "|"));

                        System.out.print("\n |" + (add_matrics1[2][0] * add_matrics2[0][0]) + "+");
                        System.out.print((add_matrics1[2][1] * add_matrics2[1][0]));
                        System.out.print("   " + (add_matrics1[2][0] * add_matrics2[0][1]) + "+");
                        System.out.print((add_matrics1[2][1] * add_matrics2[1][1]));
                        System.out.print("   " + (add_matrics1[2][0] * add_matrics2[0][2]) + "+");
                        System.out.print((add_matrics1[2][1] * add_matrics2[1][2] + "|"));

                        int a1 = (add_matrics1[0][0] * add_matrics2[0][0]) + (add_matrics1[0][1] * add_matrics2[1][0]);
                        int a2 = (add_matrics1[0][0] * add_matrics2[0][1]) + (add_matrics1[0][1] * add_matrics2[1][1]);
                        int a3 = (add_matrics1[0][0] * add_matrics2[0][2]) + (add_matrics1[0][1] * add_matrics2[1][2]);
                        int b1 = (add_matrics1[1][0] * add_matrics2[0][0]) + (add_matrics1[1][1] * add_matrics2[1][0]);
                        int b2 = (add_matrics1[1][0] * add_matrics2[0][1]) + (add_matrics1[1][1] * add_matrics2[1][1]);
                        int b3 = (add_matrics1[1][0] * add_matrics2[0][2]) + (add_matrics1[1][1] * add_matrics2[1][2]);
                        int c1 = (add_matrics1[2][0] * add_matrics2[0][0]) + (add_matrics1[2][1] * add_matrics2[1][0]);
                        int c2 = (add_matrics1[2][0] * add_matrics2[0][1]) + (add_matrics1[2][1] * add_matrics2[1][1]);
                        int c3 = (add_matrics1[2][0] * add_matrics2[0][2]) + (add_matrics1[2][1] * add_matrics2[1][2]);

                        System.out.print("\n");
                        System.out.print("\n=|" + a1);
                        System.out.print("   " + a2);
                        System.out.print("   " + a3 + "|");
                        System.out.print("\n |" + b1);
                        System.out.print("   " + b2);
                        System.out.print("   " + b3 + "|");
                        System.out.print("\n |" + c1);
                        System.out.print("   " + c2);
                        System.out.print("   " + c3 + "|");
                        System.out.println("\n**************************************************************");

                    } else {
                        combination_check = 0;
                        System.out.print("\nError input. Please Choose again");
                    }
                }
            } else {
                System.out.println("Error input.Please insert your choice again");
                index = 0;
            }
        }
    }
}








