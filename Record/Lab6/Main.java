import CIE.Internal;
import SEE.External;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Akshat Basra 1BM23CS020");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Internal[] internalStudents = new Internal[n];
        External[] externalStudents = new External[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.println("Enter Internal Marks (5 courses) for " + name + ": ");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Enter External Marks (5 courses) for " + name + ": ");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter Marks: ");
                externalMarks[j] = sc.nextInt();
            }
            sc.nextLine();
            internalStudents[i] = new Internal(name, internalMarks);
            externalStudents[i] = new External(name, externalMarks);
        }
        System.out.println("\nFinal Marks for all students:");
        for (int i = 0; i < n; i++)
        {
            int[] internalMarks = internalStudents[i].getMarks();
            int[] externalMarks = externalStudents[i].getMarks();
            System.out.println("\nStudent: " + internalStudents[i].getName());
            System.out.print("Internal Marks: ");
            for (int mark : internalMarks) {
                System.out.print(mark + " ");
            }
            System.out.print("\nExternal Marks: ");
            for (int mark : externalMarks) {
                System.out.print(mark + " ");
            }
            System.out.print("\nFinal Marks: ");
            for (int j = 0; j < 5; j++) {
                int finalMark = internalMarks[j] + externalMarks[j];
                System.out.print(finalMark + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
