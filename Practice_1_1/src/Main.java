import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     System.out.println("----- Created by Mykhailo Skovorodin  Practice 1_1 -----");

      /*  short n = 4;
        short m = 4;

        // short[][] array = new short[n][m];
        short[][] array = { {1, 5, 4, 9, 5},
                            {2, 5, 9, 7, 1},
                            {8, 6, 1, 5, 3} };

        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(String.valueOf(array[i][j]));
            }
            System.out.println();

        }

        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] > array[i][j+1]){
                    short temp = array[i][j];
                    array[i][j] = array[i][j+1];
                    array[i][j+1] = temp;
                }
            }
        }

        System.out.println("Processed array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(String.valueOf(array[i][j]));
            }
            System.out.println();

        }*/

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int col = in.nextInt();

        System.out.print("Enter the number of colums: ");
        int row = in.nextInt();
        short matr[][] = new short[col][row];

        for(int i = 0; i < matr.length; i++){
            for(int j = 0; j < matr[i].length; j++){
                matr[i][j] = (short)(Math.random()*100);
            }
        }

        for(int i = 0; i < matr.length; i++){
            for(int j = 0; j < matr[i].length; j++){
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        //System.out.println("По какой строке отсортировать: ");
        //int l = in.nextInt();

       /* for(int i = 0; i < N; i++){
            for(int l = 0; l < N - 1; l++){
                if(matr[1][l + 1] > matr[1][l]){
                    for(int j = 0; j < N; j++){
                        short temp = matr[j][l];
                        matr[j][l] = matr[j][l + 1];
                        matr[j][l + 1] = temp;
                    }
                }
            }
        }*/

        for(int i = 0; i < col; i++){
            for(int l = 0; l < row - 1; l++){
                if(matr[1][l + 1] > matr[1][l]){
                    for(int j = 0; j < col; j++){
                        short temp = matr[j][l];
                        matr[j][l] = matr[j][l + 1];
                        matr[j][l + 1] = temp;
                    }
                }
            }
        }

        System.out.println("-----------------------");

        for(int i = 0; i < matr.length; i++){
            for(int j = 0; j < matr[i].length; j++){
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
