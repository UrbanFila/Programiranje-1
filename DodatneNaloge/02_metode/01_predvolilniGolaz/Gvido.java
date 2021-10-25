import java.util.Scanner;
import java.lang.Math;



class Gvido{


    public static int Expenses (int lp, int nl, int d){

        if(d == 0){
            return nl * lp;
        }
        else{

            double check = lp * nl;
            check = Math.ceil((check)/2 + check);
        
            int neki = (int) check;
            return neki;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int budget = sc.nextInt();

        loop: while(sc.hasNextInt()){

            int lunchprice = sc.nextInt();
            int numLunch = sc.nextInt();
            int drinks = sc.nextInt();

            budget = budget - Expenses(lunchprice, numLunch, drinks);

            if(budget >= 0){

                System.out.println(Expenses(lunchprice, numLunch, drinks)+" "+budget);

                if(budget == 0){
                    break loop;
                }

            }
            else{

                System.out.println(Expenses(lunchprice, numLunch, drinks)+" -");
                break loop;
            }
        }
    }
}
