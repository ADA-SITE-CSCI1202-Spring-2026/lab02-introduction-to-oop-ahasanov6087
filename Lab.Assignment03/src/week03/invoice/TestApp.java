package week03.invoice;

public class TestApp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setQuantity(10);
        invoice.setPrice(5.5);
        System.out.println("Amount is "+ invoice.getInvoiceAmount());
    }

}
