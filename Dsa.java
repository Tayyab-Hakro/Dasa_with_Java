public class Dsa {

public static Number LargestEle(int arr[]) {
    // Find the Largest Element in an Array
int max = arr[0];
    for(int i = 0 ; i <arr.length ;i++){
        if (  arr[i]   >  max){
            max = arr[i];
        }
    }
return max;
}
public static void main(String[] args) {
    int arr[] = {1,2,3,10,23,9,4};
    
    System.out.println(LargestEle(arr));
}
}
