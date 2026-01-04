public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Task1.1");
        int[] one = new int[]{1, 2, 3};
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }



        System.out.println();
        System.out.println("Task1.2");
        double[] two = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);
        }



        System.out.println();
        System.out.println("Task1.3");
        int[] thre = new int[]{34, 6546, 45, 546, 4572, 2356, 457, 5472657, 898, 23123, 67, 346 ,2 , 65467, 467 , 457, 6};
        for (int thre1 = 0; thre1 < thre.length; thre1++) {
            System.out.println(thre[thre1]);
        }



        System.out.println();
        System.out.println("task2");
        System.out.print("Вывод Task1.1");
        for (int one1 = 0; one1 < one.length; one1++) {
            System.out.print(", " + one[one1]);
        }
        System.out.println();
        System.out.print("Вывод Task1.2");
        for (int two1 = 0; two1 < two.length; two1++) {
            System.out.print(", " + two[two1]);
        }
        System.out.println();
        System.out.print("Вывод Task1.3");
        for (int thre1 = 0; thre1 < thre.length; thre1++) {
            System.out.print(", " + thre[thre1]);
        }

        System.out.println();
        System.out.println();
        System.out.println("Task3");
        System.out.print("Вывод Task1.1");
        for (int one1 = one.length - 1; one1 >= 0; one1--) {
            System.out.print(", " + one[one1]);
        }
        System.out.println();
        System.out.print("Вывод Task1.2");
        for (int two1 = two.length - 1; two1 >= 0; two1--) {
            System.out.print(", " + two[two1]);
        }
        System.out.println();
        System.out.print("Вывод Task1.3");
        for (int thre1 = thre.length - 1; thre1 >= 0; thre1--) {
            System.out.print(", " + thre[thre1]);
        }

        System.out.println();
        System.out.println();
        System.out.println("Task4");
        System.out.print("Task1.1 все четные");
        for (int one1 = 0; one1 < one.length; one1++) {
            if ( one[one1] % 2 != 0){
                one[one1] = one[one1] + 1;
            }
            System.out.print(", " + one[one1]);
        }
    }
}