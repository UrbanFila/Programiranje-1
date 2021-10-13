import java.util.Scanner;

class Zidak{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tip = sc.nextInt();
        int result = 0;

        if(tip == 1){

            int a = sc.nextInt();

            result = a * a * a;
            System.out.println(result);
        }
        else if(tip == 2){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            result = a * b * c;
            System.out.println(result);
        }
        else if(tip == 3){

            int a = sc.nextInt();
            
            for(int i = a; i > 0; i--){

                result += a * a;
                a--;
            }

            System.out.println(result);
        }
        else if(tip == 4){

            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int i = a; i > 0; i--){
                result += a * b;
                a--;
            }

            System.out.println(result);
        }
        else if(tip == 5){

            int a = sc.nextInt();

            for(int i = a ; i > 0; i--){

                if(i <= 2){
                    if(i == 2){
                        result += 4;
                    }
                    else{
                        result += 1;
                    }
                }
                else{
                    result += a + 2 * (a - 1) + (a - 2);
                }
                a--;
            }

            System.out.println(result);
        }
        else if(tip == 6){

            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int i = a ; i > 0; i--){

                if(i <= 2){

                    if(i == 2){
                        result += 2 * b;
                    }
                    else{
                        result += b;
                    }

                }
                else{
                    result += 2*a + 2*(b-2);
                }
    
                a--;
            }
    
            System.out.println(result);
        }
    }
}
