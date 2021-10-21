import java.util.Scanner;

class LedeneSvece{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int counter = 0;

        for(int i = 1; i < n; i++){
            counter = counter * 2 + 1;
        }

        counter = counter + 2;
        int space = 0;

        for(int i = 1; i <= n; i++){

            for(int j = 0; j < counter; j++){
                
                System.out.print("*");

                if(j == counter - 1){

                }
                else{
                    for(int k = 0; k < space; k++){
                        System.out.print(" ");
                    }
                }
                
            }

            counter = (counter / 2) + 1;
            space = (space * 2) + 1;
            System.out.println();
        }
    }
}
