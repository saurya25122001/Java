 import java.util.Scanner;
 class addition  {
 int add(int a, int b){
     int ans = a+b;
    System.out.println("sum is "+ans);
     return ans;
}
    
}
public class adduMethods {
    public static void main(String[] args) {
        addition aa = new addition();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number ");

        int a = sc.nextInt();
        System.out.println("enter your Second  number ");
        
        int b = sc.nextInt();
        aa.add(a, b);
        sc.close();
    }
}
