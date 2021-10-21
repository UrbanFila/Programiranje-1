import java.util.Scanner;

class Sahovnica{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();

        int w = s*d;

        System.out.print("+");

        for(int i = 1; i <= w*2; i++){

            if(i % 2 == 0){
                System.out.print("-");
            }
            else{
                System.out.print(" ");
            }

        }

        System.out.println(" +");

        int counter = 0;
        int counter2 = 0;


        for(int i = 0; i < v*d; i++){

            System.out.print("| ");

            if(counter < d){
                
                for(int j = 0; j <= w; j++){

                    if(j == w){

                    }
                    else{

                        if(counter2 < d){
                            
                            System.out.print("  "); 
                            counter2++;

                        }
                        else{
                            
                            System.out.print("* ");
                            
                            counter2++;
                            
                            if(counter2 >= d*2){
                                counter2 = 0;
                            }

                        }

                    }
                }
            }
            else{

                            
                for(int j = 0; j <= w; j++){

                    if(j == w){

                    }
                    else{

                        if(counter2 < d){
                            
                            System.out.print("* "); 
                            counter2++;

                        }
                        else{
                            
                            System.out.print("  ");
                            
                            counter2++;
                            
                            if(counter2 >= d*2){
                                counter2 = 0;
                            }

                        }

                    }
                }

            }

            counter2 = 0;
            counter++;
            if(counter >= 2*d){
                counter = 0;
            }
            System.out.println("|");

        }

        System.out.print("+");

        for(int i = 1; i <= w*2; i++){

            if(i % 2 == 0){
                System.out.print("-");
            }
            else{
                System.out.print(" ");
            }

        }

        System.out.println(" +");
    }
}
