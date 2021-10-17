import java.util.Scanner;

class MedianaTrojiceI{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 > num3){

            if(num2 > num3){
                System.out.print(num2);
            }
            else{
                System.out.print(num3);
            }

        }
        else if(num2 > num1 && num2 > num3){

            if(num1 > num3){
                System.out.print(num1);
            }
            else{
                System.out.print(num3);
            }
        }
        else if(num3 >= num1 && num3 >= num2){
            
            if(num2 > num1){
                System.out.print(num2);
            }
            else{
                System.out.print(num1);
            }
        }
    }
}
