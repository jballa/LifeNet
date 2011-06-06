/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InboxWindow.java
 *
 * Created on Jun 5, 2011, 4:28:19 PM
 */

package com.app.lifeNet;

import javax.swing.DefaultListModel;

/**
 *
 * @author hrushi
 */
public class InboxWindow extends javax.swing.JFrame {

    DefaultListModel listModel;

    /** Creates new form InboxWindow */
    public InboxWindow() {
        initComponents();

        listModel = new DefaultListModel();
        jList1.setModel(listModel);
        jList1.setLayoutOrientation(jList1.HORIZONTAL_WRAP);
        listModel.clear();

        if (MessageQueue.readCount == 0) {
            listModel.addElement("No messages");
        } else {
            for (int i = 0; i < MessageQueue.readCount; i++) {
                ChatMessage msg = (ChatMessage) MessageQueue.readMessageVector.elementAt(i);
                listModel.addElement("[" + msg.rxTime.toString() + "] " + msg.srcName + "\n" + msg.payload);
            }
        }



    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inbox");

        jList1.setFont(new java.awt.Font("Bitstream Charter", 0, 11)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InboxWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}