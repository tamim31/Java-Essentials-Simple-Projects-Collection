
package student;
import java.util.Scanner;


public class Student {

   
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int n=3,i=0,sum=0;
        for(i=0;i<3;i++){
            int b=Scanner.nextInt();
            sum+=b;
        }System.out.println(sum/n);
        
    }
    
}
