/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorypanbox;

import javax.swing.UIManager;

/**
 *
 * @author Admin
 */
public class newCompound extends javax.swing.JFrame {

    /**
     * Creates new form newCompound
     */
    public newCompound() {
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

        subProductsTwo = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable23 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subProductsTwo.setBackground(new java.awt.Color(255, 255, 255));
        subProductsTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Abadi MT Condensed", 1, 24)); // NOI18N
        jLabel69.setText("New Compound Raw Material");
        subProductsTwo.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        subProductsTwo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 10, 670));

        jTable21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product Name", "Product Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane21.setViewportView(jTable21);

        subProductsTwo.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 610));

        jLabel26.setFont(new java.awt.Font("Abadi MT Condensed", 1, 24)); // NOI18N
        jLabel26.setText("Basic Information");
        subProductsTwo.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));
        subProductsTwo.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 420, 10));

        jLabel29.setFont(new java.awt.Font("Abadi MT Condensed", 0, 18)); // NOI18N
        jLabel29.setText("Product Name:");
        subProductsTwo.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 135, -1, -1));
        subProductsTwo.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 230, 30));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        subProductsTwo.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 230, 30));

        jLabel30.setFont(new java.awt.Font("Abadi MT Condensed", 0, 18)); // NOI18N
        jLabel30.setText("Product Category:");
        subProductsTwo.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 175, -1, -1));
        subProductsTwo.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 190, 30));

        jLabel36.setFont(new java.awt.Font("Abadi MT Condensed", 0, 18)); // NOI18N
        jLabel36.setText("Price:");
        subProductsTwo.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 215, -1, -1));

        jLabel38.setFont(new java.awt.Font("Abadi MT Condensed", 0, 18)); // NOI18N
        jLabel38.setText("Php");
        subProductsTwo.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 215, -1, -1));

        jLabel40.setFont(new java.awt.Font("Abadi MT Condensed", 1, 24)); // NOI18N
        jLabel40.setText("Ingredients");
        subProductsTwo.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));
        subProductsTwo.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 750, 10));

        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Raw Materials Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane22.setViewportView(jTable22);

        subProductsTwo.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 190, 310));

        jTable23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Raw Material  Name", "Product  Quantity", "Unit of Measure", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane23.setViewportView(jTable23);

        subProductsTwo.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 550, 310));

        jButton23.setText("New");
        subProductsTwo.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jButton24.setText("Save");
        subProductsTwo.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jButton25.setText("Delete");
        subProductsTwo.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jButton26.setText("Deactivate");
        subProductsTwo.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jButton27.setText("Reactivate");
        subProductsTwo.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jButton28.setText("Add");
        subProductsTwo.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 610, 60, -1));

        jButton29.setText("Save");
        subProductsTwo.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 60, -1));

        jButton30.setText("Delete");
        subProductsTwo.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(subProductsTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(subProductsTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newCompound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCompound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCompound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCompound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newCompound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable22;
    private javax.swing.JTable jTable23;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JPanel subProductsTwo;
    // End of variables declaration//GEN-END:variables
}
