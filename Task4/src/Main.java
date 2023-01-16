public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[3][3];
        int summ = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) ((Math.random() * 9)+1);
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                summ += mas[i][j];
            }
        }
        System.out.println(" \n  " + summ);
    }
}