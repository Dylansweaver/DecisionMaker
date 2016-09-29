package com.example;
import java.util.*;
import java.lang.String;
public class MyClass {
    public static void main(String[] args){

        System.out.println("Hello! Let's Detail a Motorcycle!\n\n"+ "On a Scale of 1-10, 1 Being completely clean, being how Dirty is the Motorcycle?");

        boolean onLift= false;
        boolean polished = false;

        Scanner scanner = new Scanner(System.in);
        String decision1= scanner.nextLine();

        if(decision1.equals("5") || decision1.equals("6") ||decision1.equals("7") ||
                decision1.equals("8") ||decision1.equals("9") ||decision1.equals("10") ){
            System.out.println("First You Must Wash the Bike with Soap and Water!");

            System.out.print("Once Bike is Clean Put it on a Bike lift to begin Detailing it!\n\n" );
            onLift=true;
        }

        if(decision1.equals("2") ||decision1.equals("3") ||
                decision1.equals("4")){
            System.out.println("Put the Bike on a Bike lift to begin Detailing it!\n");
            onLift=true;
        }
        if(decision1.equals("1")){
            System.out.println("There's no Detailing to be Done!!\n");
            polished=true;
        }

//********************************************NEXT STEP*********************************
        if(onLift==true) {
            System.out.print("Does the Bike have Chrome? Yes or No\n");

            String decision2 = scanner.nextLine();

            if (decision2.equals("Yes") || decision2.equals("yes")) {
                System.out.print("\nSteel Wool any spots that won't come out with just wiping, Than procede to polish all metals, and wipe everything down\n\n");
                polished = true;
            } else {
                System.out.print("\nPolish all metals and wipe down everything\n\n");
                polished = true;
            }
//********************************************NEXT STEP***********************************
        }
            if(polished==true){

                System.out.print("Is the paint Glossy or Denim?\n");
                String decision3= scanner.nextLine();
                if(decision3.equals("glossy")||decision3.equals("Glossy")){
                    System.out.print("\nMake sure to wipe down the paint well then buff it using an orbital buffer and polishing compound\n"+"Wipe off the compound then wax the paint\n"+"Congrats the bike is done!\n");

                }
                if(decision3.equals("Denim")||decision3.equals("denim")){
                    System.out.print("\nWipe down the paint using a Denim Paint Cleaner"+"Congrats the bike is done!\n");
                }
            }






    }
}
