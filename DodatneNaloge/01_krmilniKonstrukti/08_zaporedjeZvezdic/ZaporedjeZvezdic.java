import java.util.Scanner;

class ZaporedjeZvezdic{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for(int i = 0; i < star; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
