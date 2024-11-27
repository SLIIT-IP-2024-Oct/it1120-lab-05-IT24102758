import java.util.Scanner;

          
public class IT24102758Lab5Q3 {
    public static final double ROOM_CHARGE = 48000.0;
    public static final int MIN_DAYS_FOR_DISCOUNT = 3;
    public static final int MIN_DAYS_FOR_HIGHER_DISCOUNT = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    System.out.print("Enter Start data (1 - 31): ");
    int startDate = scanner.nextInt();
    System.out.print("Enter End Date (1 - 31): ");
    int endDate = scanner.nextInt();

    if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31)  {
    System.out.println("Error: Days must be between 1 and 31");
    return;
  } else if (startDate >= endDate) {
    System.out.println("Error: Start Date must be less than End Date");
    return;
  }

    int numDays = endDate - startDate;
   
    double discountRate = 0;
    if(numDays >= MIN_DAYS_FOR_HIGHER_DISCOUNT) {
       discountRate = 0.2;
    } else if (numDays >= MIN_DAYS_FOR_DISCOUNT){
        discountRate = 0.1;
    }
  
    double totalAmount = ROOM_CHARGE * numDays * (1 - discountRate);
   
    System.out.println();
    System.out.println("Room Charge per Day: Rs. " + ROOM_CHARGE + "/=");
    System.out.println("Number of Days Reserved: + numDays");
    System.out.println("Total Amount to be paid: " + totalAmount);
 
    scanner.close();
  }
}
