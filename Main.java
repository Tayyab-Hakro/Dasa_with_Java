import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
    // Take a matix Input from a User,Search for x  indices oocur in matrix

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input rouws and colums");
        int rows =  sc.nextInt();

        int colums =  sc.nextInt();

        int[][] arr = new int [rows][colums];
    
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<colums ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i= 0 ; i<rows ; i++){
            for(int j = 0 ; j<colums ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
