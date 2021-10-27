import java.util.Scanner;

class Piramida{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();
        int space = num - 1;
        int star = 1;

        for(int i = 0; i < num; i++){

            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }

            for(int k = 0; k < star; k++){
                System.out.print("*");
            }

            System.out.println();

            space--;
            star +=2;

        }
    }
}
