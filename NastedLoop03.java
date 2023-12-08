import java.util.Scanner;

public class NastedLoop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double [5][7];
        double[] average = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            double sum = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps [i][j] = sc.nextDouble();
                sum += temps[i][j];
            }
            average[i] = sum / temps[i].length;
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps[0].length; j++) {
               System.out.print(temps[i][j] + " ");
             }
            System.out.println("Average: " + average[i]);
        }
    }
}
