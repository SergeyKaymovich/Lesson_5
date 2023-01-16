public class Main {
    public static void main(String[] args) {
        int[][] mas = new int[3][3];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length;j++) {
                mas[i][j]= j + 5;
                System.out.print(" " + mas[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = mas.length - 1; i >= 0; i--) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j){
                    System.out.print(mas[i][j] + " ");
                }
            }
        } System.out.println();
        for (int i = 0; i < (Math.min(mas[0].length, mas.length)); i++) {
            System.out.print(mas[i][i] + " ");
        }
    }
}
