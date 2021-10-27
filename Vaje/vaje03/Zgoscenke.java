import java.util.Scanner;

class Zgoscenke{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k =sc.nextInt();

        int counter = 1;
        int volumen = 0;

        loop: while(sc.hasNextInt()){

            int space = sc.nextInt();

            if(counter > n){
                break loop;
            }

            volumen = volumen + space;

            if(volumen <= k){
                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", space, counter, volumen);

                if(volumen == k){
                    volumen = 0;
                    counter++;
                }
            }
            else{

                counter++;

                if(counter > n){
                    break loop;
                }
                
                volumen = space;

                System.out.printf("%d EP -> zgoscenka %d (%d EP)\n", space, counter, volumen);
            }
        }
    }
}
