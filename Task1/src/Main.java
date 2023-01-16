import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] [] [] mas = new int[3][3][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the number:");
        int input = scanner.nextInt();

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++){
                for (int k = 0; k < mas[i][j].length; k++ ){
                    mas[i][j][k] = k + input;
                    System.out.print(mas[i][j][k] +  "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
