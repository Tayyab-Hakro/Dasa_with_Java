public class Dsa {
//Bubble Sort 
   public static void PrintArr( int val[]){
    for(int i = 0; i<val.length ;i++){
        System.out.println(val[i]);
    }
} 
public static void main(String[] args) {
 int arr[] = {7,8,3,4,1};
 for(int i = 0 ; i<arr.length-1;i++){
    for(int j = 0 ;j<arr.length-i-1 ;j++){
        if(arr[j] > arr[j+1]){
          
            int tem = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tem;
        }
    }
 } 
 PrintArr(arr);
}

}
