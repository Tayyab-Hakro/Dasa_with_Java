import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int size = sc.nextInt();       
 int arr[] = {1,2,3,4,5,6} ;
 for(int i =  0 ; i<arr.length ; i++){
    if(arr[i] ==size){
        System.out.println("index" +i);
    }
}
    }
}
