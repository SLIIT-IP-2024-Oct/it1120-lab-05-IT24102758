import java.util.Scanner;

          
public class IT24102758Lab5Q2 {
    public static void main(String[] args) {
         Scanner scanner =  new Scanner(System.in);
         
        System.out.print("Enter the number of new members introduced: ");
        int numMembers = scanner.nextInt();
    
        if (numMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
            return;
          }

       System.out.println();

 
            switch (numMembers) {
              case 0:
                 System.out.println("No Prize");
                  break;
              case 1:
                 System.out.println("prize is a: pen");
                  break;
              case 2:
                 System.out.println("prize is a: Umbrella");
                  break;
              case 3:
                  System.out.println("prize is a: Bag");
                  break;
              case 4:
                  System.out.println("prize is a: Travelling Chair");
                  break;
              default:
                  System.out.println("prize is a: Headphone");
                    
         }
             scanner.close();
         
      }
  }

