import java.util.Scanner;

class Stevke{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long x = 0;

        while(num > 0){
            
            x = num % 10;

            System.out.println(x);

            num /= 10;
        }

    }
}