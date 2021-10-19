import java.util.Scanner;

class EvroSop{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int counter1 = 0;
        int counter2 = 0;
        int bankrot = 0;

        loop: while(sc.hasNext()){

            int coin = sc.nextInt();

            if(coin == 1){
                counter1++;
            }
            else{

                counter2++;
                counter1--;

                if(counter1 < 0){
                    bankrot = 1;
                    break loop;
                }
            }
        }

        if(bankrot == 1){
            System.out.println("BANKROT");
        }
        else{

            System.out.println(counter1);
            System.out.println(counter2);

        }
    }
}
