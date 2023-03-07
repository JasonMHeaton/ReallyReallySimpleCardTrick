
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;


    public class ReallyReallySimpleCardTrick {

        public static void main(String[] args) throws InterruptedException {


            System.out.println("I, THE GREAT WIZARD, SHALL NOW PERFORM A VERY SIMPLE CARD TRICK");
            Thread.sleep(1200);
            final Scanner userInput = new Scanner(System.in);

            String hearts = "H";
            String clubs = "C";
            String diamonds = "D";
            String spades = "S";
            int card = 5;


            System.out.print("Pick a card BETWEEN 4 and 6:");
            int rankPath = Integer.parseInt(userInput.nextLine());
            if (rankPath == card) {
                Thread.sleep(1000);
                System.out.println("Well done.");
                Thread.sleep(1000);
            } else {
                Thread.sleep(1000);
                System.out.println("You did not follow directions. ");
                Thread.sleep(1100);
                System.out.println("I'll make your choice for you.");

                Thread.sleep(1000);

                System.out.println("You picked 5");

                Thread.sleep(1200);
            }
        /*        System.out.println("NOW...LET ME PONDER");
                System.out.println("You chose H for Hearts");
                Thread.sleep(200);
                System.out.println(".");
                Thread.sleep(200);
                System.out.println(".");
                Thread.sleep(200);
                System.out.println("AHA, YOUR CARD IS THE 5 OF HEARTS!!");*/
            System.out.println("Okay, now pick one of these....");
            Thread.sleep(1000);
            System.out.println("For Clubs, type a capital C");
            Thread.sleep(500);
            System.out.println("For Diamonds, type a capital D");
            Thread.sleep(500);
            System.out.println("For Spades, type a capital S");
            Thread.sleep(500);
            System.out.println("For Hearts, type a capital H");

            String suiteChoice = userInput.nextLine();

            if (suiteChoice.equals(hearts)) {
                System.out.println("NOW...LET ME PONDER");
                Thread.sleep(1200);
                System.out.print("YOUR CARD IS THE 5 OF HEARTS.");
                Thread.sleep(1600);
                System.out.print("   THANK YOU.");
                Thread.sleep(1600);
                System.out.print("    THAT WILL BE $25.");

            } else if (suiteChoice.equals(spades)) {
                System.out.println("NOW...LET ME PONDER");
                Thread.sleep(1200);
                System.out.print("YOUR CARD IS THE 5 OF SPADES.");
                Thread.sleep(1600);
                System.out.print("   THANK YOU.");
                Thread.sleep(1600);
                System.out.print("    THAT WILL BE $25.");

            } else if (suiteChoice.equals(diamonds)) {
                System.out.println("NOW...LET ME PONDER");
                Thread.sleep(1200);
                System.out.print("YOUR CARD IS THE 5 OF DIAMONDS.");
                Thread.sleep(1600);
                System.out.print("   THANK YOU.");
                Thread.sleep(1600);
                System.out.print("    THAT WILL BE $25.");

            } else if (suiteChoice.equals(clubs)) {
                System.out.print("NOW...LET ME PONDER");
                Thread.sleep(1600);
                System.out.print("YOUR CARD IS THE 5 OF CLUBS.");
                Thread.sleep(1600);
                System.out.print("   THANK YOU.");
                Thread.sleep(1600);
                System.out.print("    THAT WILL BE $25.");
            }
            else {
                Thread.sleep(1200);
                System.out.println("Somehow, you were not able to follow my very easy to follow directions.");
                Thread.sleep(1800);
                System.out.println("I'll make your choice for you.");
                Thread.sleep(1000);
                System.out.println("You entered a capital H, for hearts.");
                Thread.sleep(1300);
                System.out.println("NOW...LET ME PONDER");
                Thread.sleep(1800);
                System.out.print("YOUR CARD IS THE 5 OF HEARTS.");
                Thread.sleep(1600);
                System.out.print("   THANK YOU.");
                Thread.sleep(1600);
                System.out.print("    THAT WILL BE $25.");
            }

        }
    }




