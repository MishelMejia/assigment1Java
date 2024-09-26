import java.util.Scanner;

public class SalesCalculator {
  
        public static void main(String[] args) {

         // Declare variables
         int itemCode = 0; 
         int itemQuantity = 0; 
         double totalRevenue = 0.0; 
 
         // Create a scanner to get user input
         Scanner inputScanner = new Scanner(System.in);
 
         // Display instructions to the user
         System.out.println("Please enter the item code (1 to 5) and the quantity sold.");
         System.out.println("Enter 0 as the product code to stop entering data.");
 
         // While itemCode is not 0, keep asking for input
         while (true) {
             System.out.print("Enter the product code (1-5, or 0 to quit): ");
             itemCode = inputScanner.nextInt(); // Get the product code
 
             // Check if the product code is 0 to exit
             if (itemCode == 0) {
                 break; // Exit the loop if the product is 0
             }
 
             // Check if the product code is valid
             if (itemCode < 1 || itemCode > 5) {
                 System.out.println("Invalid product code. Make sure it's between 1 and 5.");
                 continue; // Continue to the next iteration if the code is invalid
             }
 
             // Ask for the quantity sold
             System.out.print("Enter the quantity sold: ");
             itemQuantity = inputScanner.nextInt(); // Get the quantity
             
            
             double itemPrice = 0.0;
             
             // Use a switch to assign prices based on the product code
             switch (itemCode) {
                 case 1:
                     itemPrice = 2.98;
                     break;
                 case 2:
                     itemPrice = 4.50;
                     break;
                 case 3:
                     itemPrice = 9.98;
                     break;
                 case 4:
                     itemPrice = 4.49;
                     break;
                 case 5:
                     itemPrice = 6.87;
                     break;
                
             }
 
             // Display product details 
             System.out.println("You entered product " + itemCode + " with quantity " + itemQuantity);
             System.out.println("The price of the product is: $" + itemPrice);
 
             // Calculate the total
             totalRevenue = totalRevenue + (itemPrice * itemQuantity);
         }
 
         // Display the total value after all entries
         System.out.printf("The total value of all products sold is: $%.2f%n", totalRevenue);
 
         // Close the scanner to prevent possible issues
         inputScanner.close();
     }
 }