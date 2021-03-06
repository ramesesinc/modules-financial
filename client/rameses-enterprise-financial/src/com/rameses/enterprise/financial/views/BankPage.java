/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.enterprise.financial.views;

import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

/**
 *
 * @author dell
 */
@Template(CrudFormPage.class)
@StyleSheet
public class BankPage extends javax.swing.JPanel {

    /**
     * Creates new form BankPage
     */
    public BankPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xTabbedPane1 = new com.rameses.rcp.control.XTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        xSeparator2 = new com.rameses.rcp.control.XSeparator();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox6 = new com.rameses.rcp.control.XComboBox();
        xComboBox7 = new com.rameses.rcp.control.XComboBox();

        xTabbedPane1.setItems("sections");

        xFormPanel1.setCaptionWidth(200);

        xTextField1.setCaption("Bank Code");
        xTextField1.setName("entity.code"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        xFormPanel1.add(xTextField1);

        xTextField2.setCaption("Bank Name");
        xTextField2.setName("entity.name"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField2.setRequired(true);
        xFormPanel1.add(xTextField2);

        xTextField3.setCaption("Branch Name");
        xTextField3.setName("entity.branchname"); // NOI18N
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField3.setRequired(true);
        xFormPanel1.add(xTextField3);

        xTextField4.setCaption("Address");
        xTextField4.setName("entity.address"); // NOI18N
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField4.setRequired(true);
        xFormPanel1.add(xTextField4);

        xSeparator1.setCaption("Depository Information");
        xSeparator1.setCaptionWidth(140);
        xSeparator1.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator1Layout = new javax.swing.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator1);

        xCheckBox1.setCheckValue(1);
        xCheckBox1.setName("entity.depository"); // NOI18N
        xCheckBox1.setUncheckValue(0);
        xCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox1.setShowCaption(false);
        xCheckBox1.setText(" Is this a Depository Bank of the LGU?");
        xFormPanel1.add(xCheckBox1);

        xSeparator2.setCaption("Depository Information");
        xSeparator2.setCaptionWidth(140);
        xSeparator2.setCellPadding(new java.awt.Insets(10, 0, 0, 0));
        xSeparator2.setPreferredSize(new java.awt.Dimension(0, 20));

        javax.swing.GroupLayout xSeparator2Layout = new javax.swing.GroupLayout(xSeparator2);
        xSeparator2.setLayout(xSeparator2Layout);
        xSeparator2Layout.setHorizontalGroup(
            xSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );
        xSeparator2Layout.setVerticalGroup(
            xSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        xFormPanel1.add(xSeparator2);

        xComboBox1.setCaption("Check Deposit Type");
        xComboBox1.setDepends(new String[] {"entity.depository"});
        xComboBox1.setItems("listTypes.deposittype");
        xComboBox1.setName("entity.deposittype"); // NOI18N
        xComboBox1.setDynamic(true);
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xComboBox1);

        xComboBox6.setCaption("Cash Deposit Slip Handler");
        xComboBox6.setDepends(new String[] {"entity.depository"});
        xComboBox6.setExpression("#{ item.caption }");
        xComboBox6.setItemKey("name");
        xComboBox6.setItems("cashReportListHandler");
        xComboBox6.setName("entity.cashreport"); // NOI18N
        xComboBox6.setVisibleWhen("#{entity.depository == 1}");
        xComboBox6.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xComboBox6);

        xComboBox7.setCaption("Check Deposit Slip Handler");
        xComboBox7.setDepends(new String[] {"entity.depository"});
        xComboBox7.setExpression("#{ item.caption }");
        xComboBox7.setItemKey("name");
        xComboBox7.setItems("checkReportListHandler");
        xComboBox7.setName("entity.checkreport"); // NOI18N
        xComboBox7.setVisibleWhen("#{entity.depository == 1}");
        xComboBox7.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xComboBox7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        xTabbedPane1.addTab("General", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox6;
    private com.rameses.rcp.control.XComboBox xComboBox7;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XSeparator xSeparator2;
    private com.rameses.rcp.control.XTabbedPane xTabbedPane1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    // End of variables declaration//GEN-END:variables
}
