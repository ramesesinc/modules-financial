/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.enterprise.financial.views;

import com.rameses.osiris2.themes.FormPage;
import com.rameses.rcp.ui.annotations.Template;

/**
 * @author elmonazareno
 */
@Template(FormPage.class)
public class AccountMainGroupPage extends javax.swing.JPanel {

    /**
     * Creates new form AccountEntryPage
     */
    public AccountMainGroupPage() {
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

        jPanel4 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTree1 = new com.rameses.rcp.control.XTree();
        jToolBar1 = new javax.swing.JToolBar();
        xButton1 = new com.rameses.rcp.control.XButton();
        xButton2 = new com.rameses.rcp.control.XButton();
        xButton3 = new com.rameses.rcp.control.XButton();
        jPanel6 = new javax.swing.JPanel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        xTree3 = new com.rameses.rcp.control.XTree();
        jPanel5 = new javax.swing.JPanel();
        jToolBar5 = new javax.swing.JToolBar();
        xButton4 = new com.rameses.rcp.control.XButton();
        xButton5 = new com.rameses.rcp.control.XButton();
        xButton6 = new com.rameses.rcp.control.XButton();
        jToolBar6 = new javax.swing.JToolBar();
        xButton15 = new com.rameses.rcp.control.XButton();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        xTree2 = new com.rameses.rcp.control.XTree();
        jToolBar3 = new javax.swing.JToolBar();
        xButton7 = new com.rameses.rcp.control.XButton();
        xButton8 = new com.rameses.rcp.control.XButton();
        xButton9 = new com.rameses.rcp.control.XButton();
        jPanel2 = new javax.swing.JPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        xTree4 = new com.rameses.rcp.control.XTree();
        jToolBar2 = new javax.swing.JToolBar();
        xButton10 = new com.rameses.rcp.control.XButton();
        xButton11 = new com.rameses.rcp.control.XButton();
        xButton12 = new com.rameses.rcp.control.XButton();

        setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setHideBottom(true);
        xLineBorder1.setHideLeft(true);
        xLineBorder1.setHideRight(true);
        xLineBorder1.setHideTop(true);
        xLineBorder1.setLineColor(new java.awt.Color(180, 180, 180));
        jPanel4.setBorder(xLineBorder1);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jSplitPane1.setDividerLocation(510);

        jSplitPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane2.setDividerLocation(200);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel1.setLayout(new java.awt.BorderLayout());

        xLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        xLabel1.setFontStyle("font-weight: bold; font-size:12;");
        xLabel1.setForeground(new java.awt.Color(40, 40, 40));
        xLabel1.setText("Main Groups");
        jPanel1.add(xLabel1, java.awt.BorderLayout.PAGE_START);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setHideLeft(true);
        xLineBorder2.setHideRight(true);
        xLineBorder2.setLineColor(new java.awt.Color(180, 180, 180));
        jScrollPane1.setBorder(xLineBorder2);

        xTree1.setHandler("rootListModel");
        xTree1.setName("selectedRoot"); // NOI18N
        jScrollPane1.setViewportView(xTree1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        xButton1.setName("addRoot"); // NOI18N
        xButton1.setVisibleWhen("#{ entity.system == 0 }");
        xButton1.setFocusable(false);
        xButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton1.setIconResource("images/toolbars/plus.png");
        xButton1.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(xButton1);

        xButton2.setDepends(new String[] {"selectedRoot"});
        xButton2.setDisableWhen("#{selectedRoot == null}");
        xButton2.setName("editRoot"); // NOI18N
        xButton2.setVisibleWhen("#{ entity.system == 0 }");
        xButton2.setFocusable(false);
        xButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton2.setIconResource("images/toolbars/open.png");
        xButton2.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(xButton2);

        xButton3.setDepends(new String[] {"selectedRoot"});
        xButton3.setDisableWhen("#{selectedRoot == null}");
        xButton3.setName("removeRoot"); // NOI18N
        xButton3.setVisibleWhen("#{ entity.system == 0 }");
        xButton3.setFocusable(false);
        xButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton3.setIconResource("images/toolbars/trash.png");
        xButton3.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(xButton3);

        jPanel1.add(jToolBar1, java.awt.BorderLayout.SOUTH);

        jSplitPane2.setLeftComponent(jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel6.setLayout(new java.awt.BorderLayout());

        xLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        xLabel2.setFontStyle("font-weight: bold; font-size:12;");
        xLabel2.setForeground(new java.awt.Color(40, 40, 40));
        xLabel2.setText("Category Groups");
        jPanel6.add(xLabel2, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XLineBorder xLineBorder3 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder3.setHideLeft(true);
        xLineBorder3.setHideRight(true);
        xLineBorder3.setLineColor(new java.awt.Color(180, 180, 180));
        jScrollPane3.setBorder(xLineBorder3);

        xTree3.setDepends(new String[] {"selectedRoot"});
        xTree3.setHandler("groupListModel");
        xTree3.setName("selectedGroup"); // NOI18N
        xTree3.setDynamic(true);
        jScrollPane3.setViewportView(xTree3);

        jPanel6.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);

        xButton4.setDepends(new String[] {"selectedRoot"});
        xButton4.setDisableWhen("#{selectedRoot == null}");
        xButton4.setName("addGroup"); // NOI18N
        xButton4.setVisibleWhen("#{ entity.system == 0 }");
        xButton4.setFocusable(false);
        xButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton4.setIconResource("images/toolbars/plus.png");
        xButton4.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(xButton4);

        xButton5.setDepends(new String[] {"selectedGroup"});
        xButton5.setDisableWhen("#{selectedGroup == null}");
        xButton5.setName("editGroup"); // NOI18N
        xButton5.setVisibleWhen("#{ entity.system == 0 }");
        xButton5.setFocusable(false);
        xButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton5.setIconResource("images/toolbars/open.png");
        xButton5.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(xButton5);

        xButton6.setDepends(new String[] {"selectedGroup"});
        xButton6.setDisableWhen("#{selectedGroup == null}");
        xButton6.setName("removeGroup"); // NOI18N
        xButton6.setVisibleWhen("#{ entity.system == 0 }");
        xButton6.setFocusable(false);
        xButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton6.setIconResource("images/toolbars/trash.png");
        xButton6.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar5.add(xButton6);

        jPanel5.add(jToolBar5, java.awt.BorderLayout.WEST);

        jToolBar6.setFloatable(false);
        jToolBar6.setRollover(true);

        xButton15.setName("addSubGroup"); // NOI18N
        xButton15.setVisibleWhen("#{ entity.system == 0 }");
        xButton15.setFocusable(false);
        xButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton15.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton15.setText("Add Sub");
        xButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar6.add(xButton15);

        jPanel5.add(jToolBar6, java.awt.BorderLayout.EAST);

        jPanel6.add(jPanel5, java.awt.BorderLayout.SOUTH);

        jSplitPane2.setRightComponent(jPanel6);

        jSplitPane1.setLeftComponent(jSplitPane2);

        jSplitPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jSplitPane3.setDividerLocation(250);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel3.setLayout(new java.awt.BorderLayout());

        xLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        xLabel3.setFontStyle("font-weight: bold; font-size:12;");
        xLabel3.setForeground(new java.awt.Color(40, 40, 40));
        xLabel3.setText("Items");
        jPanel3.add(xLabel3, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XLineBorder xLineBorder4 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder4.setHideLeft(true);
        xLineBorder4.setHideRight(true);
        xLineBorder4.setLineColor(new java.awt.Color(180, 180, 180));
        jScrollPane2.setBorder(xLineBorder4);

        xTree2.setDepends(new String[] {"selectedRoot", "selectedGroup"});
        xTree2.setHandler("itemListModel");
        xTree2.setName("selectedItem"); // NOI18N
        xTree2.setDynamic(true);
        jScrollPane2.setViewportView(xTree2);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        xButton7.setDepends(new String[] {"selectedGroup"});
        xButton7.setDisableWhen("#{selectedGroup == null}");
        xButton7.setName("addItem"); // NOI18N
        xButton7.setVisibleWhen("#{ entity.system == 0 }");
        xButton7.setFocusable(false);
        xButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton7.setIconResource("images/toolbars/plus.png");
        xButton7.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(xButton7);

        xButton8.setDepends(new String[] {"selectedItem"});
        xButton8.setDisableWhen("#{selectedItem == null}");
        xButton8.setName("editItem"); // NOI18N
        xButton8.setVisibleWhen("#{ entity.system == 0 }");
        xButton8.setFocusable(false);
        xButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton8.setIconResource("images/toolbars/open.png");
        xButton8.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(xButton8);

        xButton9.setDepends(new String[] {"selectedItem"});
        xButton9.setDisableWhen("#{selectedItem == null}");
        xButton9.setName("removeItem"); // NOI18N
        xButton9.setVisibleWhen("#{ entity.system == 0 }");
        xButton9.setFocusable(false);
        xButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton9.setIconResource("images/toolbars/trash.png");
        xButton9.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(xButton9);

        jPanel3.add(jToolBar3, java.awt.BorderLayout.SOUTH);

        jSplitPane3.setLeftComponent(jPanel3);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel2.setLayout(new java.awt.BorderLayout());

        xLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 2, 0));
        xLabel4.setFontStyle("font-weight: bold; font-size:12;");
        xLabel4.setForeground(new java.awt.Color(40, 40, 40));
        xLabel4.setText("Item Details");
        jPanel2.add(xLabel4, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XLineBorder xLineBorder5 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder5.setHideLeft(true);
        xLineBorder5.setHideRight(true);
        xLineBorder5.setLineColor(new java.awt.Color(180, 180, 180));
        jScrollPane4.setBorder(xLineBorder5);

        xTree4.setDepends(new String[] {"selectedRoot", "selectedGroup", "selectedItem"});
        xTree4.setHandler("detailListModel");
        xTree4.setName("selectedDetail"); // NOI18N
        xTree4.setDynamic(true);
        jScrollPane4.setViewportView(xTree4);

        jPanel2.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        xButton10.setDepends(new String[] {"selectedItem"});
        xButton10.setDisableWhen("#{selectedItem == null}");
        xButton10.setName("addDetail"); // NOI18N
        xButton10.setFocusable(false);
        xButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton10.setIconResource("images/toolbars/plus.png");
        xButton10.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(xButton10);

        xButton11.setDepends(new String[] {"selectedDetail"});
        xButton11.setDisableWhen("#{selectedDetail == null}");
        xButton11.setName("editDetail"); // NOI18N
        xButton11.setFocusable(false);
        xButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton11.setIconResource("images/toolbars/open.png");
        xButton11.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(xButton11);

        xButton12.setDepends(new String[] {"selectedDetail"});
        xButton12.setDisableWhen("#{selectedDetail == null}");
        xButton12.setName("removeDetail"); // NOI18N
        xButton12.setFocusable(false);
        xButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        xButton12.setIconResource("images/toolbars/trash.png");
        xButton12.setMargin(new java.awt.Insets(0, 2, 0, 2));
        xButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(xButton12);

        jPanel2.add(jToolBar2, java.awt.BorderLayout.SOUTH);

        jSplitPane3.setRightComponent(jPanel2);

        jSplitPane1.setRightComponent(jSplitPane3);

        jPanel4.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JToolBar jToolBar6;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton10;
    private com.rameses.rcp.control.XButton xButton11;
    private com.rameses.rcp.control.XButton xButton12;
    private com.rameses.rcp.control.XButton xButton15;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XButton xButton4;
    private com.rameses.rcp.control.XButton xButton5;
    private com.rameses.rcp.control.XButton xButton6;
    private com.rameses.rcp.control.XButton xButton7;
    private com.rameses.rcp.control.XButton xButton8;
    private com.rameses.rcp.control.XButton xButton9;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XTree xTree1;
    private com.rameses.rcp.control.XTree xTree2;
    private com.rameses.rcp.control.XTree xTree3;
    private com.rameses.rcp.control.XTree xTree4;
    // End of variables declaration//GEN-END:variables
}
