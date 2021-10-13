import java.util.Scanner;

class SkritiKvadrati{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a - 1;
        b = b - 1;
        int result = 0;

        for(int i = a; i > 0; i--){

            result += a*b;
            a--;
            b--;

            if(b <= 0){
                break;
            }
            
        }

        System.out.println(result);

    }
}
