import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input values
        System.out.print("Enter Part Number: ");
        String partNumber = scanner.nextLine();

        System.out.print("Enter Part Description: ");
        String partDescription = scanner.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Price Per Item: ");
        double pricePerItem = scanner.nextDouble();

        // 1. Create an Invoice object using the constructor with user input
        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        // 2. Print the initial state of the object
        System.out.println("\nInitial Part Number: " + invoice.getPartNumber());
        System.out.println("Initial Part Description: " + invoice.getPartDescription());
        System.out.println("Initial Quantity: " + invoice.getQuantity());
        System.out.println("Initial Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Initial Invoice Amount: " + invoice.getInvoiceAmount());

        // 3. Update quantity and price to negative values (should be handled as 0)
        invoice.setQuantity(-8);
        invoice.setPricePerItem(-1.50);

        // 4. Print the updated state of the object
        System.out.println("\nUpdated Part Number: " + invoice.getPartNumber());
        System.out.println("Updated Part Description: " + invoice.getPartDescription());
        System.out.println("Updated Quantity (should be 0): " + invoice.getQuantity());
        System.out.println("Updated Price Per Item (should be 0.0): " + invoice.getPricePerItem());
        System.out.println("Updated Invoice Amount: " + invoice.getInvoiceAmount());

        scanner.close();
    }
}