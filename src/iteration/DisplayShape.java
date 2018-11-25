
package iteration;
import java.util.Scanner;
public class DisplayShape {

    public static void main(String[] args) {
        int num;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Size of the Square?");
        num=keyboard.nextInt();
        for (int i = num; i <= num; i--) 
        {
            for (int j = 1; j <=num; j++)
             {
            System.out.print(" * ");
             }
                  
               System.out.println();
        }
       
    }
}
