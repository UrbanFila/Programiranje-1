import java.util.Scanner;

class Potenca{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exp = sc.nextInt();

        int rez = 1;

        for(int i = 0; i < exp; i++){
            
            rez = rez * base;
        }

        System.out.println(rez);
    }
}
