import java.util.Scanner;

class RomanjeI{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();

        int counter = 1;
        int pot = d;
        int prvic = 1;

        loop: while(d > 0){
            
            pot = d - p;

            if(p < 0){
                break loop;
            }
            else if(p == 0){
                break loop;
            }

            if(pot < 0){
                System.out.printf("%d: %d -> 0\n", counter, d, pot);
            }
            else{

                System.out.printf("%d: %d -> %d\n", counter, d, pot);

            }
            d = pot;
            p = p -z;
            counter++;

        }
    }
}
