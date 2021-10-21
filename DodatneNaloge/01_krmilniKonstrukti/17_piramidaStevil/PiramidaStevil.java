import java.util.Scanner;

class PiramidaStevil{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int counter = 1;
        int rez = 1;
        int space = num;

        for(int i = 1; i <= num; i++){
            rez = i;

            if(rez >=  10){
                rez %= 10;
            }

            for(int j = 0; j < space -1; j++){
                System.out.print(" ");
            }

            for(int j = 0; j < counter; j++){
                System.out.print(rez);
                rez++;

                if(rez == 10){
                    rez = 0;
                }
                
            }

            space = space - 1;
            counter = counter + 2;

            System.out.println();
        }
    }
}
