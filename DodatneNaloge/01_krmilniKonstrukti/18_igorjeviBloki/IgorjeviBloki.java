import java.util.Scanner;

class IgorjeviBloki{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int counter1 = 0;
        int counter2 = 0;

        if(num1 > num2 && num1 > num3){

            for(int i = 1; i <= num1; i++){

                for(int j = 0; j < num1; j++){
                        System.out.print(num1);
                }

                if(counter1 < num2){
                    
                    System.out.print(" ");

                    for(int j = 0; j < num2; j++){
                        System.out.print(num2);
                    }

                    counter1++;
                }

                if(counter2 < num3){

                    System.out.print(" ");

                    for(int j = 0; j < num3; j++){
                        System.out.print(num3);
                    }

                    System.out.println();
                    counter2++;
                }
                else{
                    System.out.println();
                }
                
            }

        }
        else if(num2 > num1 && num2 > num3){

            for(int i = 0; i < num2; i++){
                
                if(counter1 < num1){
                    
                    for(int j = 0; j < num1; j++){
                        System.out.print(num1);
                    }

                    System.out.print(" ");
                    counter1++;

                }
                else{
                    for(int j = 0; j < num1; j++){
                        System.out.print(" ");
                    }
                    
                    System.out.print(" ");

                }

                for(int j = 0; j < num2; j++){
                    System.out.print(num2);
                }
              

                if(counter2 < num3){
                    System.out.print(" ");

                    for(int j = 0; j < num3; j++){
                        System.out.print(num3);    
                    }

                    System.out.println();

                    counter2++;
                }
                else{
                    System.out.println();
                }
    
            }
        }
        else if(num3 > num1 && num3 > num2){

            for(int i = 0; i < num3; i++){

                if(counter1 < num1){
                    
                    for(int j = 0; j < num1; j++){
                        System.out.print(num1);
                    }
                    System.out.print(" ");

                    counter1++;
                }
                else{

                    for(int j = 0; j <= num1; j++){
                        System.out.print(" ");
                    }

                }

                if(counter2 < num2){

                    for(int j = 0; j < num2; j++){
                        System.out.print(num2);
                    }
                    counter2++;
                }
                else{

                    for(int j = 0; j < num2; j++){
                        System.out.print(" ");
                    }
                }

                System.out.print(" ");

                for(int j = 0; j < num3; j++){
                    System.out.print(num3);
                }
                System.out.println();
            }

        }
        else{
            for(int i = 0; i < num1; i++){
                    
                for(int j = 0; j < num1; j++){
                    System.out.print(num1);
                }

                System.out.print(" ");

                for(int j = 0; j < num1; j++){
                    System.out.print(num1);
                }

                System.out.print(" ");

                for(int j = 0; j < num1; j++){
                    System.out.print(num1);
                }

                System.out.println();
            }

        }
    }    
}
