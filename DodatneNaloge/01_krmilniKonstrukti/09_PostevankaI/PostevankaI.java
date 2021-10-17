import java.util.Scanner;

class PostevankaI{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = 1; i <= num2; i++){
            System.out.println(num1*i);
        }

    }
}
