/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sig.view;

import com.sig.controller.Controller;
import com.sig.model.AllInvoicesTableModel;
import com.sig.model.Invoice;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;


public class SIGFrame extends javax.swing.JFrame {

    public SIGFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        allInvoicesTable = new javax.swing.JTable();
        allInvoicesTable.getSelectionModel().addListSelectionListener(controller);
        createNewInvoiceBtn = new javax.swing.JButton();
        createNewInvoiceBtn.addActionListener(controller);
        deleteInvoiceBtn = new javax.swing.JButton();
        deleteInvoiceBtn.addActionListener(controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customerNameLbl = new javax.swing.JLabel();
        invoiceDateLbl = new javax.swing.JLabel();
        invoiceNumLbl = new javax.swing.JLabel();
        invoiceTotalLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceItemsTable = new javax.swing.JTable();
        createNewItemBtn = new javax.swing.JButton();
        createNewItemBtn.addActionListener(controller);
        deleteItemBtn = new javax.swing.JButton();
        deleteItemBtn.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(controller);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        allInvoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(allInvoicesTable);

        createNewInvoiceBtn.setText("Create New Invoice");
        createNewInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewInvoiceBtnActionPerformed(evt);
            }
        });

        deleteInvoiceBtn.setText("Delete Invoice");

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        invoiceItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(invoiceItemsTable);

        createNewItemBtn.setText("Create New Item");
        createNewItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewItemBtnActionPerformed(evt);
            }
        });

        deleteItemBtn.setText("Delete Item");

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save File");
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(invoiceNumLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoiceTotalLbl)
                                    .addComponent(invoiceDateLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(customerNameLbl)))
                        .addGap(308, 308, 308))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(createNewInvoiceBtn)
                .addGap(37, 37, 37)
                .addComponent(deleteInvoiceBtn)
                .addGap(179, 179, 179)
                .addComponent(createNewItemBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItemBtn)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoiceNumLbl))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoiceDateLbl))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customerNameLbl))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invoiceTotalLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewInvoiceBtn)
                    .addComponent(deleteInvoiceBtn)
                    .addComponent(createNewItemBtn)
                    .addComponent(deleteItemBtn))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createNewInvoiceBtnActionPerformed

    private void createNewItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewItemBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createNewItemBtnActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SIGFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SIGFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allInvoicesTable;
    private javax.swing.JButton createNewInvoiceBtn;
    private javax.swing.JButton createNewItemBtn;
    private javax.swing.JLabel customerNameLbl;
    private javax.swing.JButton deleteInvoiceBtn;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JLabel invoiceDateLbl;
    private javax.swing.JTable invoiceItemsTable;
    private javax.swing.JLabel invoiceNumLbl;
    private javax.swing.JLabel invoiceTotalLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables
   
    // Create array of invoice to read and load all the invoices from the file
    private ArrayList<Invoice> invoices;
    private Controller controller = new Controller(this);
    private AllInvoicesTableModel allInvoicesTableModel;

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }
    

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public AllInvoicesTableModel getAllInvoicesTableModel() {
        return allInvoicesTableModel;
    }

    public void setAllInvoicesTableModel(AllInvoicesTableModel allInvoicesTableModel) {
        this.allInvoicesTableModel = allInvoicesTableModel;
    }

    public JTable getAllInvoicesTable() {
        return allInvoicesTable;
    }

    public JTable getInvoiceItemsTable() {
        return invoiceItemsTable;
    }

    public JLabel getCustomerNameLbl() {
        return customerNameLbl;
    }

    public JLabel getInvoiceDateLbl() {
        return invoiceDateLbl;
    }

    public JLabel getInvoiceNumLbl() {
        return invoiceNumLbl;
    }

    public JLabel getInvoiceTotalLbl() {
        return invoiceTotalLbl;
    }

    public Controller getController() {
        return controller;
    }
    
    public int getNextInvoiceNum()
    {
        int num = 0;
        for(Invoice invoice : invoices)
        {
            if (invoice.getNum() > num)
            {
                num = invoice.getNum();
            }
        }
        return num;
    }
}


