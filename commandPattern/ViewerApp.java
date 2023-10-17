package commandPattern;

import java.util.Scanner;
public class ViewerApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tv tvAction = new Tv();
        Tv tv = new Tv();

        int choice;

        do {
            RemoteControl rc = new RemoteControl();

            PowerOn powerOn = new PowerOn(tv);
            PowerOff powerOff = new PowerOff(tv);



            System.out.print("Main Menu:");
            System.out.println("\n[1]Tv switch (ON): ");
            System.out.println("[2]Tv switch (OFF) ");
            System.out.println("[3]Sound System (-)");
            System.out.println("[4]Sound Sytem (+) ");
            System.out.println("[5]Aircon (-) ");
            System.out.println("[6]Aircon (+) ");
            System.out.println("[7]LED Lights Brightness (-)");
            System.out.println("[8LED Lights Brightness (+)");
            System.out.println("[9]Play my Favorite song playlist");
            System.out.println("[0]Exit");
            System.out.print("\nSelect Action: ");
            choice = input.nextInt();


            switch (choice) {
                case 1:
                    System.out.println(powerOn.execute());
                    break;
                case 2:
                    System.out.println(powerOff.execute());
                    break;
                case 3:
                    System.out.println(tvAction.decreaseVol());
                    break;
                case 4:
                    System.out.println(tvAction.increaseVol());
                    break;
                case 5:
                    System.out.println(tvAction.tempDown());
                    break;
                case 6:
                    System.out.println(tvAction.tempUp());
                    break;
                case 7:
                    System.out.println(tvAction.brightDeduct());
                    break;
                case 8:
                    System.out.println(tvAction.brightRise());
                    break;
                case 9:
                    System.out.println(tvAction.playSong());
                    break;
                case 0:
                    System.out.println(tvAction.exit());
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    return;
            }
        }while (choice!=9);
    }
}
