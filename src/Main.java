import java.util.*;
public class Main {
    public static void main(String[] args) {



        //det foraller user (spiller hvad mange round)
        System.out.println("Spilleren spiller og spiller derefter igen, indtil en af jer får 40 point ");
        // user ipout user  nams
        Scanner input = new Scanner (System.in);
         //first playr
        System.out.println("Please write the first player's name");
        String Fplayr = input.nextLine();
        System.out.println("Please write the second player's name");
        String Splayr = input.next();
        int play1= 0; // spille 1 point ( counter)
        int play2 = 0; // spille 2 point (counter)

        while(play1 <=40 && play2 <=40 ){
            int zero=0;
           // send besked til user at hans ture
            System.out.println(" Write number 1 if you are player number one and two if you are player two");
           int startGame = input.nextInt();
            if(startGame!=1 ||startGame!=2 ){
                System.out.println(" You put a wrong number please restart game");
            }
            //terninger result
            int tal1 = (int) (Math.random() * 6 + 1);
            int tal2 = (int) (Math.random() * 6 + 1);

            //viser resulttil too terninger et hver kasting
            System.out.println(tal1 + ", " + tal2);
            // sum of to terninger
            int sum = tal1 + tal2;
            // print the result of sum to dice
            System.out.println(" sum = "+ sum);
            // hvis tal1 og tal2  equal


           if (tal1 == tal2) {
               System.out.println(" you get another round");

            }
            if (sum == 2) {
                System.out.println(" mist all points you wil start from zero ");

               break;
            }
            if (sum == 12) {
                System.out.println("you won the game");
                break;
            }
            if(startGame ==1){

                play1=+sum;

            }else if(startGame ==2){
                play2+=sum;
            }

           if(play1==40){
               System.out.println(" playr on one"+Fplayr);
               break;
           }
           if(play2==40){
               System.out.println(" playr on one"+Splayr);
               break;
           }
        }
    }
    }
