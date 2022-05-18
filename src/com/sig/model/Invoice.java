
package com.sig.model;

import java.util.ArrayList;


public class Invoice {
    
    private ArrayList<Line> invoiceLines;
    private int num;
    private String invoiceDate;
    private String customerName;
   // private double invoiceTotal;

    public Invoice() {
    }

    public Invoice(int num, String invoiceDate, String customerName) {
        this.num = num;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", invoiceDate=" + invoiceDate + ", customerName=" + customerName + '}';
    }

    public ArrayList<Line> getInvoiceLines() {
        
        if(invoiceLines == null)
        {
            invoiceLines = new ArrayList<>();
        }
        return invoiceLines;
    }
    
    

    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    
    
    public double calculateInvoiceTotal ()
    {
        double invoiceTotal = 0.0;
        for (Line line : getInvoiceLines())
        {
            invoiceTotal += line.calculateLineTotal();
        }
        return invoiceTotal;
    }
    
}
