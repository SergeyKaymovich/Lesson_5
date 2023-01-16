import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] mas = {
                { 8, 3, 6, 9 },
                { 4, 0, 1,  5 },
        };

        for ( int i = 0; i < mas.length; i++ ) {
            for ( int j = 0; j < mas[i].length; j++ ) {
                int k = j + 1;
                for ( int c = i; c < mas.length; c++ ) {
                    while ( k < mas[c].length) {
                        if ( mas[c][k] < mas[i][j] ) {
                            int mas1 = mas[i][j];
                            mas[i][j] = mas[c][k];
                            mas[c][k] = mas1;
                        }
                        k++;
                    }
                    k = 0;
                }
            }
        }

        for ( int i = 0; i < mas.length; i++ )
            System.out.println(Arrays.toString(mas[i]));
    }

}