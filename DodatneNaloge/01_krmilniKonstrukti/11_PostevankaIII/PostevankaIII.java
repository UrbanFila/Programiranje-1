import java.util.Scanner;

class PostevankaIII{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int rez = 0;

        for(int i = 1; i <= num2; i++){

            rez = num1 * i;

            if(rez > num2){
                break;
            }
            else{
                System.out.printf("%d * %d = %d\n", num1, i, rez);
            }
        }
    }
}
