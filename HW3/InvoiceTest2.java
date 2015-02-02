// Programming Challenge 1: InvoiceTest2.java
// Application to test class Invoice.

public class InvoiceTest2
{
    public static void main( String args[] )
    {
        Invoice invoice1 = new Invoice( "1234", "Hammer", 2, 14.95 );
 
        // display invoice1
        System.out.println( "Original invoice information" );
        invoice1.displayInvoice();

        // change invoice1's data
        invoice1.setPartNumber( "001234" );
        invoice1.setPartDescription( "Yellow Hammer" );
        invoice1.setQuantity(3);
        invoice1.setPricePerItem(19.49);

        // display invoice1 with new data
        System.out.println( "\nUpdated invoice information" );
        invoice1.displayInvoice();

        Invoice invoice2 = new Invoice( "5678", "Paint Brush", -5, -9.99 );
 
        // display invoice2
        System.out.println( "\nOriginal invoice information" );
        invoice2.displayInvoice();

        // change invoice2's data
        invoice2.setQuantity(3);
        invoice2.setPricePerItem(9.49);

        // display invoice2 with new data
        System.out.println( "\nUpdated invoice information" );
        invoice2.displayInvoice();

    } // end main

} // end class InvoiceTest
