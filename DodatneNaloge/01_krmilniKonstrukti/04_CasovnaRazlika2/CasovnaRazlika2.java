import java.util.Scanner;
import java.lang.*;

class CasovnaRazlika2{
    
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int time1 = (h1 * 60) + m1;
        int time2 = (h2 * 60) + m2;

        int time = Math.abs(time1 - time2);

        int hour = time / 60;
        int minute = time % 60;

        if(minute < 10){

            System.out.println(hour+":0"+minute);

        }
        else{

            System.out.println(hour+":"+minute);

        }

    }
}
