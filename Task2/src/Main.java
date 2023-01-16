public class Main {
    public static void main(String[] args) {
        String [] [] mas =  new String[8][8];
        for (int i = 0;i < mas.length; i++){
            for (int j = 0; j < mas[i].length; j++){
                if ((i + j) % 2 == 0) mas[i][j] = "W";
                else mas[i][j] = "B";
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
