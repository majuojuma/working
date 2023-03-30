import java.util.Scanner;

public class AirlineReservationSystem {
  public static void main(String[] args) {
    boolean[] seats = new boolean[10]; // boolean array to keep track of seat availability
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("Please type 1 for First Class or 2 for Economy: ");
      int section = sc.nextInt();

      // Check if first class seats are available
      if (section == 1) {
        for (int i = 0; i < 5; i++) {
          if (!seats[i]) {
            seats[i] = true; // assign seat
            System.out.println("First Class. Seat number: " + (i + 1));
            break;
          }
          // If all first class seats are taken, offer economy class
          if (i == 4 && seats[i]) {
            System.out.println("First Class is full. Would you like to be placed in Economy? (yes/no)");
            String choice = sc.next();
            if (choice.equals("yes")) {
              section = 2;
            } else {
              System.out.println("Next flight leaves in 3 hours.");
              break;
            }
          }
        }
      }

      // Check if economy class seats are available
      if (section == 2) {
        for (int i = 5; i < 10; i++) {
          if (!seats[i]) {
            seats[i] = true; // assign seat
            System.out.println("Economy Class. Seat number: " + (i + 1));
            break;
          }
          // If all economy class seats are taken, offer first class
          if (i == 9 && seats[i]) {
            System.out.println("Economy Class is full. Would you like to be placed in First Class? (yes/no)");
            String choice = sc.next();
            if (choice.equals("yes")) {
              section = 1;
            } else {
              System.out.println("Next flight leaves in 3 hours.");
              break;
            }
          }
        }
      }
    }
    
  }
}
