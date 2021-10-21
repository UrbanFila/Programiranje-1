import java.util.Scanner;
import java.lang.Math;


class RazbijanjeStevil{


public static long Obrni(long n){
    long reverse = 0;
    long integer = 0;

    while(n > 0){

        integer = n % 10;

        reverse = reverse * 10 + integer; 
        n  = n / 10;
    }

    return reverse;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long rnum1 = Obrni(num1);
        long rnum2 = Obrni(num2);
        
        long exp = 0;
        long rez = 0;

        while(rnum2 > 0){

            exp = rnum2 % 10;
            rez = rnum1 % (long)(Math.pow(10,exp));

            rnum2 /= 10;
            rnum1 /= Math.pow(10,exp);

            System.out.println(Obrni(rez));
        }


    }
}
