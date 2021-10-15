import java.util.Scanner;

class PravokotniValj{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int period = sc.nextInt();
        int len = sc.nextInt();
        int amplitude = sc.nextInt();
        int z = sc.nextInt();
        
        if(z == 0){
            for(int j = 0; j < period; j++){
                for(int i = 0; i < len/2; i++){

                    if(i == len/2 -1){
                        System.out.print("+");
                    }
                    else{
                        System.out.print("-");
                    }

                }
                for(int i = 0; i < len/2; i++){

                    if(i == len/2 -1){
                        System.out.print("+");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();

            for(int i = 0; i < amplitude; i++){
                if(i < amplitude - 1){
                for(int c = 0; c < period; c++){
                    for(int j = 0; j < len/2; j++){
                
                        if(j==len/2-1){
                            System.out.print("|");
                        }
                        else{
                        System.out.print(" ");
                        }
                    }

                    for(int k = 0; k < len/2; k++){
                        if(k == len/2 -1){
                            System.out.print("|");
                        }
                        else{
                            System.out.print(" ");
                            }
                        }     
                    }
                }
                else{

                    for(int c = 0; c < period; c++){
                        for(int j = 0; j < len/2; j++){

                            if(j == len/2-1){
                                System.out.print("+");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }

                        for(int k = 0; k < len/2; k++){
                            if(k == len/ 2 -1){
                                System.out.print("+");
                            }
                            else{
                                System.out.print("-");
                            }
                        }
                    }

                }
                System.out.println();
            }
        }
        else if(z > 0 && len/2 > z){
            
            int x = len/2;
            int start= (len/2) - z;
            
            for(int i = 0 ; i < start; i++){
                if(i == start - 1){
                    System.out.print("+");
                }
                else{
                    System.out.print("-");
                }
            }

            for(int i = 0; i < period - 1; i++){
                for(int j = 0; j < len/2; j++){
                    if(j == len/2 - 1){
                        System.out.print("+");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(int j = 0; j < len/2; j++){
                    if(j == len/2 - 1){
                        System.out.print("+");
                    }
                    else{
                        System.out.print("-");
                    }
                }
            }
            
            for(int i = 0; i < len/2; i++){
                if(i == len/2 - 1){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int i = 0; i < z; i++){
                System.out.print("-");
            }
            System.out.println();

            for(int i = 0; i < amplitude - 1; i++){
                for(int j = 0; j < start; j++){
                    if(j == start - 1){
                        System.out.print("|");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                for(int j = 0; j < period - 1; j++){

                    for(int k = 0; k < len/2; k++){
                        if(k == len/2 - 1){
                            System.out.print("|");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }

                    for(int k = 0; k < len/2; k++){
                        if(k == len/2 - 1){
                            System.out.print("|");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }

                for(int j = 0; j < len/2; j++){
                    if(j == len/2 - 1){
                        System.out.print("|");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                for(int j = 0; j < z; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }

            for(int j = 0; j < start; j++){
                if(j == start - 1){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }

            for(int j = 0; j < period - 1; j++){
                for(int k = 0; k < len/2; k++){
                    if(k == len/2 - 1){
                        System.out.print("+");
                    }
                    else{
                        System.out.print("-");
                    }
                }

                for(int k = 0; k < len/2; k++){
                    if(k == len/2 - 1){
                        System.out.print("+");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }

            for(int j = 0; j < len/2; j++){
                if(j == len/2 - 1){
                    System.out.print("+");
                }
                else{
                    System.out.print("-");
                }
            }

            for(int j = 0; j < z; j++){
                System.out.print(" ");
            }
            
        }
        else if (z > 0 && len/2 <= z){

            int end = z - len/2;
            int start = len/2 - end;

            for(int i = 0; i < period; i++){
                if(i == 0){
                    for(int j = 0; j < start; j++){
                        if(j == start - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }

                    for(int j = 0 ; j < len/2; j++){
                        if(j == len/2 - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print("-");
                        }
                    }
                }
                else{
                    for(int j = 0; j < len/2; j++){
                        if(j == len/2 - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }

                    for(int j = 0; j < len/2; j++){
                        if(j == len/2 - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print("-");
                        }
                    }
                }
            }

            for(int i = 0; i < end; i++){
                System.out.print(" ");
            }
            System.out.println();


            for(int i = 0; i < amplitude - 1; i++){
               
                for(int k = 0; k < period; k++){
                    if(k == 0){
                        for(int j = 0; j < start; j++){
                            if(j == start - 1){
                                System.out.print("|");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
    
                        for(int j = 0 ; j < len/2; j++){
                            if(j == len/2 - 1){
                                System.out.print("|");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                    }
                    else{
                        for(int j = 0; j < len/2; j++){
                            if(j == len / 2 - 1){
                                System.out.print("|");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
    
                        for(int j = 0; j < len/2; j++){
                            if(j == len/2 -1){
                                System.out.print("|");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                    }
                }

                for(int k = 0; k < end; k++){
                    System.out.print(" ");
                }
                System.out.println(); 
            }

            for(int i = 0; i < period; i++){
                if(i == 0){
                    for(int j = 0; j < start; j++){
                        if(j == start - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print("-");
                        }
                    }

                    for(int j = 0 ; j < len/2; j++){
                        if(j == len/2 - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
                else{
                    for(int j = 0; j < len/2; j++){
                        if(j == len/2 - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print("-");
                        }
                    }

                    for(int j = 0; j < len/2; j++){
                        if(j == len/2 - 1){
                            System.out.print("+");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                }
            }

            for(int i = 0; i < end; i++){
                System.out.print("-");
            }
            
        }
    }
}
