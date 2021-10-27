import java.util.Scanner;

class KolikoStevil{

    public static int Number (int n, int r){

        while(n > 0){

            int num = n % 10;

            if(num == r){
                return 1;
            }
            
            n /= 10;

        }

        return 0;
    }

    public static int Deli (int n, int r){

        while(n > 0){

            if(n % r == 0){

            }
            else{
                return 0;
            }

            n = n / 10;
        }

        return 1;
    }

    public static int NumOfInt(int n, int r){

        int before = -1;
        int first = 1;
        int counter = 0;
        int kva = n;
        
        while(n > 0){

            if(counter == r){
                return 1;
            }

            int num = n % 10;

            if(first == 1){
                
                before = num;
                first = 0;
                counter++;

            }
            else{

                if(before == num){
                    counter++;
                }
                else{

                    counter = 0;
                    before = num;
                    counter++;

                }

            }

            if(counter == r){
           
                return 1;
            }
            n = n / 10;
        }

        return 0;
    }

    public static int SequencePlus (int n, int r){

        int counter = 0;
        int first = 1;
        int before = 0;
       
        while(n > 0){

            int num = n % 10;

            if(first == 1){

                first = 0;
                before = num;
                counter++;
            }
            else{

                if(before + 1 == num){
                    before = num;
                    counter++;
                    
                }
                else{
                    counter = 0;
                    before = num;
                    counter++;
                }
            }

            if(counter == r){
                return 1;
            }

            n = n / 10;
        }

   

        return 0;
    }


    public static int SequenceMinus (int n, int r){

        int counter = 0;
        int first = 1;
        int before = 0;
       
        while(n > 0){

            int num = n % 10;

            if(first == 1){

                first = 0;
                before = num;
                counter++;
            }
            else{

                if(before - 1 == num){
                    before = num;
                    counter++;
                    
                }
                else{
                    counter = 0;
                    before = num;
                    counter++;
                }
            }

            if(counter == r){
                return 1;
            }

            n = n / 10;
        }

   

        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int ukaz = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if(ukaz == 1){
            
            int counter = 0;

            for(int i = a; i <= b; i++){
                
                if(i % k == 0){
                    counter++;
                }

            }

            System.out.println(counter);

        }
        else if(ukaz == 2){

            int counter = 0;

            for(int i = a; i <= b; i++){
                
                if(Number(i, k) == 1){
                    counter++;
                }

            }

            System.out.println(counter);
        }
        else if(ukaz == 3){

            int counter = 0;

            for(int i = a; i <= b; i++){

                if(Deli(i, k)== 1){
                    counter++;
                }
            }

            System.out.println(counter);

        }
        else if(ukaz == 4){

            int counter = 0; 

            for(int i = a; i <= b; i++){

                if(NumOfInt(i, k) > 0){
                    counter++;
                }
            }

            System.out.println(counter);
        }
        else{
            int counter = 0;

            for(int i = a; i <= b; i++){

                if(SequencePlus(i, k) == 1){
                    counter++;
                }

                if(SequenceMinus(i, k) == 1){
                    counter++;
                }

            }
            System.out.println(counter);
        }
    }
}
