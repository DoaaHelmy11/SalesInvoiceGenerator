
package com.sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AllInvoicesTableModel extends AbstractTableModel {
    private ArrayList<Invoice> invoices;
    private String [] tableColumnsHeaders = {"NO.", "Date", "Customer", "Total"};

    public AllInvoicesTableModel(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    

    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return tableColumnsHeaders.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Invoice invoice = invoices.get(rowIndex);
        switch (columnIndex) {
            case 0 :
                return invoice.getNum();
                case 1 :
                return invoice.getInvoiceDate();
                case 2 :
                return invoice.getCustomerName();
                case 3 :
                return invoice.calculateInvoiceTotal();
                default: return "";
        }
        
    }
    
   public String getColumnName (int column)
   {
       return tableColumnsHeaders [column];
   }
    
}
