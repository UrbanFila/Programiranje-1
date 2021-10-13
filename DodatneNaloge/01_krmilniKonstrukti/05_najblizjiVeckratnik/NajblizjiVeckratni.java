import java.util.Scanner;
import java.lang.*;

class NajblizjiVeckratnik{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int multi = 0;
        int result1 = 0;
        int result2 = 0;

        for(int i = 1; i <= 1000000000; i++){
            multi = num1 * i;

            if(multi > num2){
              
                result1 = num1 * (i-1);
                result2 = num1 * i;
                break;

            }

        }

        int res1 = Math.abs(num2 - result1);
        int res2 = Math.abs(num2 - result2);

        if(res1 > res2){
            System.out.println(result2);
        }
        else if(res2 > res1){
            System.out.println(result1);
        }
        else if(res1 == res2){
           
            if(result1 > result2){
                System.out.println(result2);
            }
            else{
                System.out.println(result1);
            }
            
        }
    }
}
