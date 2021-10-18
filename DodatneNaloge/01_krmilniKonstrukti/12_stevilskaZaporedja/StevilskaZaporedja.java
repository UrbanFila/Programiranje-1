import java.util.Scanner;

class StevilskaZaporedja{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if(k == 0){
            System.out.println("NAPAKA");
        }
        else{
          
            if(a < b && k > 0){

                for(int i = a; i < b; i = i + k){
                    System.out.println(i);
                }
            }
            else if(a > b && k < 0){
               for(int i = a; i >= b; i = i + k){
                   System.out.println(i);
               }
            }
            else if(a == b){
                System.out.println(a);
            }
            else{
                System.out.println("NAPAKA");
            }
          
        }
    }
}
