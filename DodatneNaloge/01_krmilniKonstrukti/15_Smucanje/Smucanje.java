import java.util.Scanner;

class Smucanje{

    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        int competitiors = sc.nextInt();

        int time1 = 0;
        int time2 = 0;
        int bestTime = 0;
        int rez = 1000000000;
        int winner = 0;

        for(int i = 1; i <= competitiors; i++){

            time1 = sc.nextInt();

            if(time1 == 0){

            }
            else{
                time2 = sc.nextInt();

                if(time2 == 0){

                }
                else{
                    bestTime = time1 + time2;

                    if(bestTime < rez){
                        rez = bestTime;
                        winner = i;
                    }
                }

            }

       }
       if(bestTime == 0){
           System.out.println("NIHCE");
       }
       else{
            System.out.println(winner);
            System.out.println(rez);
        }
    }
}
