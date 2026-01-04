import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int[] one = new int[]{1, 2, 3};
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }


        System.out.println();
        double[] two = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);
        }


        System.out.println();
        int[] thre = new int[]{34, 6546, 45, 546, 4572, 2356, 457, 5472657, 898, 23123, 67, 346, 2, 65467, 467, 457, 6};
        for (int i = 0; i < thre.length; i++) {
            System.out.println(thre[i]);
        }


        System.out.println();
        System.out.println("task2");
        System.out.println(Arrays.toString(one));

        System.out.println();
        System.out.println(Arrays.toString(two));

        System.out.println();
        System.out.println(Arrays.toString(thre));

        System.out.println();
        System.out.println("Task3");
        for (int i = one.length - 1; i >= 0; i--) {
            System.out.print(one[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            System.out.print(two[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = thre.length - 1; i >= 0; i--) {
            System.out.print(thre[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Task4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] = one[i] + 1;
            }
            System.out.println(one[i]);
        }
    }
}