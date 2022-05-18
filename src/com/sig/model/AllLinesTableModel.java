
package com.sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AllLinesTableModel extends AbstractTableModel {
    
    private ArrayList<Line> lines;
    private String [] tableColumnsHeaders = {"NO.", "Item Name", "Item Price", "Count", "Item Total"};

    public AllLinesTableModel(ArrayList<Line> lines) {
        this.lines = lines;
    }

    @Override
    public int getRowCount() {
        return lines.size();
        
    }

    @Override
    public int getColumnCount() {
        return tableColumnsHeaders.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Line line = lines.get(rowIndex);
        switch (columnIndex) {
            case 0 :
                return line.getInvoice().getNum();
                
                case 1 :
                return line.getItemName();
                
                case 2 :
                return line.getItemPrice();
                
                case 3 :
                return line.getCount();
                
                case 4 : 
                return line.calculateLineTotal();
                    
                default: return "";
        }
       
    }
    
    public String getColumnName (int column)
   {
       return tableColumnsHeaders [column];
   }
}
