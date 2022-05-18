
package com.sig.model;

public class Line {
    
    private Invoice invoice;
   // private int num;
    private String itemName;
    private double itemPrice;
    private int count;

    public Line() {
    }

    public Line(String itemName, double itemPrice, int count) {
        //this.num = num;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public Line(Invoice invoice, String itemName, double itemPrice, int count) {
        this.invoice = invoice;
        //this.num = num;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + '}';
    }
    
    
    
    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /*
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    */

    public Invoice getInvoice() {
        return invoice;
    }
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public double calculateLineTotal ()
    {
        return itemPrice * count ;
    }
    
}
