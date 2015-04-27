// Programming Challenge 1: Invoice.java
// Invoice class.

public class Invoice 
{
    // declare private data
    private String partNumber;
    private String partDescription;
    private int quantity = 0;
    private double pricePerItem = 0.0;
    // four-argument constructor
   
    public Invoice( String part, String description, int count, double price )
    {
        // determine whether count is positive
        // valid count assigned to quantity
        // determine whether price is positive
        // valid price assigned to pricePerItem
        partNumber = part;
        partDescription = description;
        if(count > 0)
        {
            quantity = count;
        }
        if(price > 0.0)
        {
            pricePerItem = price;
        }
    } // end four-argument Invoice constructor

    // set part number
    public void setPartNumber(String part)
    {
        partNumber = part;
    } // end method setPartNumber

    // get part number
    public String getPartNumber()
    {
        return partNumber;
    } // end method getPartNumber

    // set description
    public void setPartDescription(String description)
    {
        partDescription = description;
    } // end method setPartDescription

    // get description
    public String getPartDescription()
    {
        return partDescription;
    } // end method getPartDescription

    // set quantity
    public void setQuantity( int count )
    {
        // determine whether count is positive
        // valid count assigned to quantity
        // determine whether count is zero or negative
        // invalid count; quantity set to 0
        if(count <= 0){
            count = 0;
            quantity = count;
        }
        else{
            quantity = count;
        }
    } // end method setQuantity

    // get quantity
    public int getQuantity()
    {
        return quantity;  
    } // end method getQuantity

    // set price per item
    public void setPricePerItem( double price )
    {
        // determine whether price is positive
        // valid price assigned to pricePerItem
        // determine whether price is zero or negative
        // invalid price; pricePerItem set to 0.0
        if(price < 0.0)
        {
            price = 0.0;
            pricePerItem = price;
        }
        else
        {
            pricePerItem = price;
        }
    } // end method setPricePerItem

    // get price per item
    public double getPricePerItem()
    {
        return pricePerItem;
    } // end method getPricePerItem

    // calculates and returns the invoice amount
    public double getInvoiceAmount() 
    {
        // calculate total cost
        return quantity * pricePerItem;
    } // end method getPaymentAmount
    public void displayInvoice()
    {
        //This replaces the Display Invoice functionality within InvoiceTest2.java
        System.out.printf( "Part number: %s\n", getPartNumber() );
        System.out.printf( "Description: %s\n", getPartDescription() );
        System.out.printf( "Quantity: %d\n", getQuantity() );
        System.out.printf( "Price: %.2f\n", getPricePerItem() );
        System.out.printf( "Invoice amount: %.2f\n", getInvoiceAmount() );
    }
} // end class Invoice
