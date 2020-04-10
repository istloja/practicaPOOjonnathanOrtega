/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Bladilu_xxx
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        // inicio los  componentes
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTBebidas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Bañadir1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTPlatos = new javax.swing.JTable();
        Bañadir = new javax.swing.JButton();
        Btotal = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        ltxtTotal = new javax.swing.JLabel();
        Bfactura = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTBebidas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Jugo de naranja",  new Double(0.5)},
                {"Jugo de coco",  new Double(0.5)},
                {"Jugo de mora",  new Double(0.5)},
                {"Jugo de guanabana",  new Double(0.5)},
                {"Coca-cola",  new Double(0.5)},
                {"Fanta",  new Double(0.5)},
                {"Inka cola",  new Double(0.5)},
                {"Sprite",  new Double(0.5)},
                {"Morocho",  new Double(0.75)},
                {"Cafe",  new Double(0.5)},
                {"Chocolate",  new Double(0.5)},
                {"Horchata",  new Double(0.5)},
                {"Cerveza",  new Double(1.25)},
                {"Club ",  new Double(1.25)}
            },
            new String [] {
                "         Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTBebidas.setColumnSelectionAllowed(true);
        JTBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTBebidas.setGridColor(new java.awt.Color(255, 153, 153));
        JTBebidas.setSelectionBackground(new java.awt.Color(255, 255, 102));
        JTBebidas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTBebidas);
        JTBebidas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (JTBebidas.getColumnModel().getColumnCount() > 0) {
            JTBebidas.getColumnModel().getColumn(1).setMinWidth(50);
            JTBebidas.getColumnModel().getColumn(1).setPreferredWidth(50);
            JTBebidas.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 250, 260));

        tabla.setBackground(new java.awt.Color(255, 204, 204));
        tabla.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 0)));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(51, 51, 255));
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setMinWidth(0);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(12);
            tabla.getColumnModel().getColumn(1).setMaxWidth(0);
            tabla.getColumnModel().getColumn(2).setMinWidth(60);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(60);
            tabla.getColumnModel().getColumn(2).setMaxWidth(60);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 230, 290));

        Bañadir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        Bañadir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bañadir1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bañadir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 160, 60));

        JTPlatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sancocho",  new Double(1.5)},
                {"Guatita",  new Double(1.25)},
                {"Arroz con pollo frito",  new Double(2.25)},
                {"Fritada",  new Double(2.5)},
                {"Llapingacho con chorizo",  new Double(2.75)},
                {"Seco de chivo",  new Double(2.5)},
                {"Encocado de pescado",  new Double(3.5)},
                {"Encocado de camaron ",  new Double(3.5)},
                {"Pescado apanado",  new Double(4.25)},
                {"Seco de pollo",  new Double(1.5)},
                {"Camarones apanados",  new Double(3.5)}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTPlatos.setColumnSelectionAllowed(true);
        JTPlatos.setGridColor(new java.awt.Color(255, 153, 204));
        JTPlatos.setInheritsPopupMenu(true);
        JTPlatos.setSelectionBackground(new java.awt.Color(255, 255, 153));
        JTPlatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(JTPlatos);
        JTPlatos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (JTPlatos.getColumnModel().getColumnCount() > 0) {
            JTPlatos.getColumnModel().getColumn(1).setMinWidth(50);
            JTPlatos.getColumnModel().getColumn(1).setPreferredWidth(5);
            JTPlatos.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 250, 210));

        Bañadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        Bañadir.setText("Añadir plato");
        Bañadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BañadirActionPerformed(evt);
            }
        });
        getContentPane().add(Bañadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 170, 60));

        Btotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/total.png"))); // NOI18N
        Btotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtotalActionPerformed(evt);
            }
        });
        getContentPane().add(Btotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 200, 70));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 120, 40));
        getContentPane().add(ltxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        Bfactura.setText("Generar Factura");
        Bfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfacturaActionPerformed(evt);
            }
        });
        getContentPane().add(Bfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 770, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 100, 280, 520));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 390, 530));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bebidas.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 270, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/platillos.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 0, 350, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bañadir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bañadir1ActionPerformed
// fijo la tabla de bebidas al modelo1
        TableModel modelo1 = JTBebidas.getModel();
// creo un array para guardar la fila selecionada 
        int[] filas = JTBebidas.getSelectedRows();
        int ca=0;

        Object[] row = new Object[2];
        // envio las filas selecionadas a la tabla 
        DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
// mediante un for envio las filas seleccinadas 
        for (int i = 0; i < filas.length; i++) {
            // seleciono las columnas que voy a enviar recordadndo que nombre esta en la posicion 0 y precio en la posicion 1
            row[0] = modelo1.getValueAt(filas[i], 0);
            row[1] = modelo1.getValueAt(filas[i], 1);
            
            modelo2.addRow(row);
        }
    }//GEN-LAST:event_Bañadir1ActionPerformed

    private void BañadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BañadirActionPerformed
// fijo la tabla de bebidas al modelo3
        TableModel modelo3 = JTPlatos.getModel();
        // creo un array para guardar la fila selecionada
        int[] filas1 = JTPlatos.getSelectedRows();
        Object[] row = new Object[2];
           // envio las filas selecionadas a la tabla 
        DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
// mediante un for envio las filas seleccinadas 
        for (int j = 0; j < filas1.length; j++) {
         // seleciono las columnas que voy a enviar recordadndo que nombre esta en la posicion 0 y precio en la posicion 1
            row[0] = modelo3.getValueAt(filas1[j], 0);
            row[1] = modelo3.getValueAt(filas1[j], 1);

            modelo2.addRow(row);
        }
    }//GEN-LAST:event_BañadirActionPerformed

    private void BtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtotalActionPerformed
// pongo el valor de 0 al campo total en caso de que no selecione ningun platillo o bebida
        txtTotal.setText("0");
        // fijo el total de registros  de la tabla a ala variable t
        int t = tabla.getRowCount();
        // declaro el contador
        int c = 0;
// delaro el resultado del total
        double re = 0;
        // mediante un while saco el total a pagar
        do {
            
            try {
// fijo el contador a f 
                int f = c++;
                //guardo el precio en la variable n1 que se encuentra en la columna 1
                double n1 = Double.parseDouble(tabla.getValueAt(f, 1).toString());
                     //guardo la cantidad   variable n2 que se encuentra en la columna 2
                double n2 = Double.parseDouble(tabla.getValueAt(f, 2).toString());
// sumno y multiplico el preecio por la cantidad y guardo en la variable re
                re = re + n1 * n2;
// muestro el resulatdo en el campo txtTotal
                txtTotal.setText(String.valueOf(re));

            } catch (Exception e) {
                System.out.println("errror");
            }
            // mientras la cantidad de registros no sea igual a contador
        } while (c <= t);
    }//GEN-LAST:event_BtotalActionPerformed

    private void BfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfacturaActionPerformed
Factura n=new Factura();
// muestro la ventana
  new Factura().setVisible(true);
  // defino el iva
  double Piva=0.12;
  // convierto sitrng a double
  double total = Double.parseDouble(txtTotal.getText());
  // multiplico
  double iva=total*Piva;
  // convierto double a string
  String Tiva = String.valueOf(iva);
  // mando el iva campo  Factura
  Factura.txtTotaliva.setText(Tiva);
  // mando precio a Factura
    Factura.txtTotalF.setText(txtTotal.getText());
  // mando los datos de tabla a tablaF
  TableModel model = tabla.getModel();
Factura.tablaF.setModel(model);
    }//GEN-LAST:event_BfacturaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bañadir;
    private javax.swing.JButton Bañadir1;
    private javax.swing.JButton Bfactura;
    private javax.swing.JButton Btotal;
    private javax.swing.JTable JTBebidas;
    private javax.swing.JTable JTPlatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel ltxtTotal;
    public static javax.swing.JTable tabla;
    public static javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
