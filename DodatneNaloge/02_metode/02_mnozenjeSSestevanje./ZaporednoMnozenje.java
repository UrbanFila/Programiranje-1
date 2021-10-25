import java.util.Scanner;

class ZaporednoMnozenje{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int rez = 0;

        for(int i = 0; i < num2; i++){

            rez = rez + num1;
        }

        System.out.println(rez);
    }
}
