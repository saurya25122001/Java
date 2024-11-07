import java.util.*;
class arrayp{
    Scanner sc = new Scanner(System.in);
    void rolll(){
        int sum =0;
        int a= 0;
        int []roll = new int[5];
        for (int i = 0; i < roll.length; i++) {
            System.out.println("Enter your roll no "+ i);
            roll[i]= sc.nextInt();
        }
        for (int i = 0; i < roll.length; i++) {
            System.out.print("array at index "+ i + " = ");
            System.out.println(" " +roll[i]);
            if (roll[i]>a) {                                    //  checking for greatest number in an array
                 a = roll[i];
            }
            System.out.println(a);
            sum = roll[i]+sum;                                  // sum of array 
        }
        System.out.println("sum of this array is "+ sum);       //
        System.out.println("greatest number in the array is "+ a);
        sc.close();
}
    void multiArray(){
        int [][]a = new int[2][3];
       
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("Enter your array at index "+ i +" "+ j);
                a[i][j] = sc.nextInt();
            }
    }
    for (int i = 0; i < a.length; i++) {

        for (int j = 0; j < a[i].length; j++) {
            System.out.println(a[i][j]);
            System.out.println("array length is "+ a.length); 

    
}
}
    }
}

public class Arr {
    public static void main(String[] args) {
        arrayp a = new arrayp();
        a.rolll();
     //a.multiArray();
    }
}
