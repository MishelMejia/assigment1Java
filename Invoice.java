// Invoice Class
public class Invoice {
    // Instance variables
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor to initialize the instance variables
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        // Validation to ensure that quantity is positive
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;  // Handling negative quantity
        }
        // Validation to ensure that price per item is positive
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;  // Handling negative price
        }
    }

    // Getters for each instance variable
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Setters with validation for quantity and price
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;  // Set to 0 if negative
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;  // Set to 0.0 if negative
        }
    }

    // Method to calculate total invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}