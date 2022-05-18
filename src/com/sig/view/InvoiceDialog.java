
package com.sig.view;

import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvoiceDialog extends JDialog {
    private JLabel customerNameLabel;
    private  JLabel invoiceDateLabel;
    private JTextField customerNameField;
    private JTextField InvoiceDateField;
    private JButton okButton;
    private JButton cancelButton;
    
     public JTextField getCustomerNameField() {
        return customerNameField;
    }

    public void setCustomerNameField(JTextField customerNameField) {
        this.customerNameField = customerNameField;
    }

    public JTextField getInvoiceDateField() {
        return InvoiceDateField;
    }

    public void setInvoiceDateField(JTextField InvoiceDateField) {
        this.InvoiceDateField = InvoiceDateField;
    }

    public InvoiceDialog(SIGFrame f) {
        customerNameLabel = new JLabel("Customer Name: ");
        invoiceDateLabel = new JLabel("Invoice Date: ");
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        customerNameField = new JTextField(20);
        InvoiceDateField = new JTextField(20);
        
        okButton.setActionCommand("createNewInvoiceOK");
        cancelButton.setActionCommand("createNewInvoiceCancel");
        okButton.addActionListener(f.getController());
        cancelButton.addActionListener(f.getController());
        
        setLayout(new GridLayout(3,2));
        
        add(invoiceDateLabel);
        add(InvoiceDateField);
        add(customerNameLabel);
        add(customerNameField);
        add(okButton);
        add(cancelButton);
        pack();
    }
}
