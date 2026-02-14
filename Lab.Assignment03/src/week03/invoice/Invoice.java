package week03.invoice;

public class Invoice {
    private String partNumber;
    private String description;
    private Integer quantity;
    private Double price;

    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setQuantity(Integer quantity){
        if(quantity<0){
            quantity=0;
        }
        this.quantity=quantity;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }

    public Double getInvoiceAmount(){
        return price*quantity;
    }

}
