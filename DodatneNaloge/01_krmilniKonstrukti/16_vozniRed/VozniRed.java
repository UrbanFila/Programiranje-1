import java.util.Scanner;

class VozniRed{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int startH = sc.nextInt();
        int startM = sc.nextInt();
        int endH = sc.nextInt();
        int endM = sc.nextInt();
        int interval = sc.nextInt();

        int startTime = (startH * 60) + startM;
        int endTime = (endH * 60) + endM;

        if(startH < 10){

            if(startM < 10){
                System.out.printf("0%d:0%d\n", startH, startM);
            }
            else{
                System.out.printf("0%d:%d\n", startH, startM);
            }

        }
        else{

            if(startM < 10){
                System.out.printf("%d:0%d\n", startH, startM);
            }
            else{
                System.out.printf("%d:%d\n", startH, startM);
            }

        }
        while(startTime < endTime){
            
            startTime = startTime + interval;
            
            if(startTime > endTime){
                break;
            }

            int timeH = startTime/ 60;
            int timeM = startTime % 60;
            
            if(timeH < 10){
                if(timeM < 10){
                    System.out.printf("0%d:0%d\n", timeH, timeM);
                }
                else{
                    System.out.printf("0%d:%d\n", timeH, timeM);
                }
            }
            else{

                if(timeM < 10){
                    System.out.printf("%d:0%d\n", timeH, timeM);
                }
                else{
                    System.out.printf("%d:%d\n", timeH, timeM);
                }

            }
        }
    }
}
