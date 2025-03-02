public class Dsa {
 public static void Printa(int  n ) {
    int multiply  = n;
    if( n ==0 ){return  ;};
    Printa(  multiply * (n-1));
}
public static void main(String[] args) {
    System.out.println("This is string");

    Printa(5);
}


}

