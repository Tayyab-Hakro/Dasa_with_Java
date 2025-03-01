public class Dsa {
 public static void Printa(int  n) {
    if(n == 0){return ; }
 System.out.println(n);
    Printa(n - 1);
    
 }
public static void main(String[] args) {

    Printa(5);
}


}

