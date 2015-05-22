/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HectorJavier
 */
public class UI extends javax.swing.JFrame {
    
    DefaultListModel<Instruccion> instrucciones;
    //Para el archivo
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    //
    private HashMap<String,Integer> X;
    private HashMap<String,Integer> Y;
    private HashMap<String,Integer> Z;
    /**
     * Creates new form UI
     */
    public UI() {
        this.instrucciones = new DefaultListModel<>();
        initComponents();
        this.jPanel1.setVisible(false);
        this.jButton3.setVisible(false);
        this.jButton2.setVisible(false);
        this.jButton5.setVisible(false);
        X = new HashMap<>();
        Y = new HashMap<>();
        Z = new HashMap<>();
        X.put("x0",0);X.put("x1",0);X.put("x2",0);X.put("x3",0);X.put("x4",0);
        X.put("x5",0);X.put("x6",0);X.put("x7",0);X.put("x8",0);X.put("x9",0);
        Y.put("y0",0);Y.put("y1",0);Y.put("y2",0);Y.put("y3",0);Y.put("y4",0);
        Y.put("y5",0);Y.put("y6",0);Y.put("y7",0);Y.put("y8",0);Y.put("y9",0);
        Z.put("z0",0);Z.put("z1",0);Z.put("z2",0);Z.put("z3",0);Z.put("z4",0);
        Z.put("z5",0);Z.put("z6",0);Z.put("z7",0);Z.put("z8",0);Z.put("z9",0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        la_x0 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        la_x1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        la_x2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        la_x3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        la_x4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        la_x5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        la_x6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        la_x7 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        la_x8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        la_x9 = new javax.swing.JLabel();
        la_y0 = new javax.swing.JLabel();
        la_y1 = new javax.swing.JLabel();
        la_y2 = new javax.swing.JLabel();
        la_y3 = new javax.swing.JLabel();
        la_y4 = new javax.swing.JLabel();
        la_y5 = new javax.swing.JLabel();
        la_y6 = new javax.swing.JLabel();
        la_y7 = new javax.swing.JLabel();
        la_y8 = new javax.swing.JLabel();
        la_y9 = new javax.swing.JLabel();
        la_z0 = new javax.swing.JLabel();
        la_z1 = new javax.swing.JLabel();
        la_z2 = new javax.swing.JLabel();
        la_z3 = new javax.swing.JLabel();
        la_z4 = new javax.swing.JLabel();
        la_z5 = new javax.swing.JLabel();
        la_z6 = new javax.swing.JLabel();
        la_z7 = new javax.swing.JLabel();
        la_z8 = new javax.swing.JLabel();
        la_z9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Siguente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Iniciarlizar Variables");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Variables de entrada");

        jLabel2.setText("x0:");

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("x1:");

        jTextField2.setText("0");

        jLabel4.setText("x2:");

        jLabel5.setText("x3:");

        jTextField3.setText("0");

        jTextField4.setText("0");

        jLabel6.setText("x4:");

        jTextField5.setText("0");

        jLabel7.setText("x5:");

        jTextField6.setText("0");

        jLabel8.setText("x6:");

        jLabel9.setText("x7:");

        jTextField7.setText("0");

        jTextField8.setText("0");

        jLabel10.setText("x8:");

        jTextField9.setText("0");

        jLabel11.setText("x9:");

        jTextField10.setText("0");

        jButton4.setText("Aceptar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField3))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField8)
                                    .addComponent(jTextField10)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(24, 24, 24))
        );

        jLabel12.setText("x");

        jLabel13.setText("y");

        jLabel14.setText("z");

        jLabel16.setText("0");

        la_x0.setText("00");

        jLabel17.setText("1");

        la_x1.setText("00");

        jLabel18.setText("2");

        la_x2.setText("00");

        jLabel19.setText("3");

        la_x3.setText("00");

        jLabel20.setText("4");

        la_x4.setText("00");

        jLabel21.setText("5");

        la_x5.setText("00");

        jLabel22.setText("6");

        la_x6.setText("00");

        jLabel23.setText("7");

        la_x7.setText("00");

        jLabel24.setText("8");

        la_x8.setText("00");

        jLabel25.setText("9");

        la_x9.setText("00");

        la_y0.setText("00");

        la_y1.setText("00");

        la_y2.setText("00");

        la_y3.setText("00");

        la_y4.setText("00");

        la_y5.setText("00");

        la_y6.setText("00");

        la_y7.setText("00");

        la_y8.setText("00");

        la_y9.setText("00");

        la_z0.setText("00");

        la_z1.setText("00");

        la_z2.setText("00");

        la_z3.setText("00");

        la_z4.setText("00");

        la_z5.setText("00");

        la_z6.setText("00");

        la_z7.setText("00");

        la_z8.setText("00");

        la_z9.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(la_x0))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(la_y0))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(la_z0)))))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(la_x1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(la_y1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(la_z1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(la_x2)
                    .addComponent(la_y2)
                    .addComponent(la_z2))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(la_x3)
                    .addComponent(la_y3)
                    .addComponent(la_z3))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(la_x4)
                    .addComponent(la_y4)
                    .addComponent(la_z4))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(la_x5)
                    .addComponent(la_y5)
                    .addComponent(la_z5))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(la_x6)
                    .addComponent(la_y6)
                    .addComponent(la_z6))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(la_x7)
                    .addComponent(la_y7)
                    .addComponent(la_z7))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(la_x8)
                    .addComponent(la_y8)
                    .addComponent(la_z8))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(la_z9)
                    .addComponent(la_y9)
                    .addComponent(la_x9)
                    .addComponent(jLabel25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(la_x0)
                    .addComponent(la_x1)
                    .addComponent(la_x2)
                    .addComponent(la_x3)
                    .addComponent(la_x4)
                    .addComponent(la_x5)
                    .addComponent(la_x6)
                    .addComponent(la_x7)
                    .addComponent(la_x8)
                    .addComponent(la_x9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(la_y0)
                    .addComponent(la_y1)
                    .addComponent(la_y2)
                    .addComponent(la_y3)
                    .addComponent(la_y4)
                    .addComponent(la_y5)
                    .addComponent(la_y6)
                    .addComponent(la_y7)
                    .addComponent(la_y8)
                    .addComponent(la_y9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(la_z0)
                    .addComponent(la_z1)
                    .addComponent(la_z2)
                    .addComponent(la_z3)
                    .addComponent(la_z4)
                    .addComponent(la_z5)
                    .addComponent(la_z6)
                    .addComponent(la_z7)
                    .addComponent(la_z8)
                    .addComponent(la_z9))
                .addContainerGap())
        );

        la_x0.getAccessibleContext().setAccessibleDescription("");

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(35, 35, 35)
                                .addComponent(jButton3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("F:/Escritorio"));
        chooser.setDialogTitle("Titulo");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            //Lambda lambda = new Lambda(chooser.getSelectedFile());
            try {
                archivo = chooser.getSelectedFile();
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    //instrucciones.add(new Instruccion(linea.substring(0, 1), linea.substring(2, 4), linea.length() > 4 ? Integer.parseInt(linea.substring(5)) : 0));
                    instrucciones.addElement(new Instruccion(linea.substring(0, 1), linea.substring(2, 4), linea.length() > 4 ? Integer.parseInt(linea.substring(5)) : 0));
                }
            } catch (IOException | NumberFormatException e) {
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                }
            }
        } else {
            System.out.println("No seleccion ");
        }
        instrucciones.get(0).setSelec(true);
        this.jList1.setModel(instrucciones);
        this.jButton3.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        X.put("x0", Integer.parseInt(this.jTextField1.getText()));
        X.put("x1", Integer.parseInt(this.jTextField2.getText()));
        X.put("x2", Integer.parseInt(this.jTextField3.getText()));
        X.put("x3", Integer.parseInt(this.jTextField4.getText()));
        X.put("x4", Integer.parseInt(this.jTextField5.getText()));
        X.put("x5", Integer.parseInt(this.jTextField6.getText()));
        X.put("x6", Integer.parseInt(this.jTextField7.getText()));
        X.put("x7", Integer.parseInt(this.jTextField8.getText()));
        X.put("x8", Integer.parseInt(this.jTextField9.getText()));
        X.put("x9", Integer.parseInt(this.jTextField10.getText()));
        this.jPanel1.setVisible(false);
        this.jButton2.setVisible(true);
        actualizaX();
        actualizaY();
        actualizaZ();
    }//GEN-LAST:event_jButton4ActionPerformed
    private void actualizaX(){
        this.la_x0.setText(X.get("x0").toString());this.la_x1.setText(X.get("x1").toString());
        this.la_x2.setText(X.get("x2").toString());this.la_x3.setText(X.get("x3").toString());
        this.la_x4.setText(X.get("x4").toString());this.la_x5.setText(X.get("x5").toString());
        this.la_x6.setText(X.get("x6").toString());this.la_x7.setText(X.get("x7").toString());
        this.la_x8.setText(X.get("x8").toString());this.la_x9.setText(X.get("x9").toString());
    }
    private void actualizaY(){
        this.la_y0.setText(Y.get("y0").toString());this.la_y1.setText(Y.get("y1").toString());
        this.la_y2.setText(Y.get("y2").toString());this.la_y3.setText(Y.get("y3").toString());
        this.la_y4.setText(Y.get("y4").toString());this.la_y5.setText(Y.get("y5").toString());
        this.la_y6.setText(Y.get("y6").toString());this.la_y7.setText(Y.get("y7").toString());
        this.la_y8.setText(Y.get("y8").toString());this.la_y9.setText(Y.get("y9").toString());
    }
    private void actualizaZ(){
        this.la_z0.setText(Z.get("z0").toString());this.la_z1.setText(Z.get("z1").toString());
        this.la_z2.setText(Z.get("z2").toString());this.la_z3.setText(Z.get("z3").toString());
        this.la_z4.setText(Z.get("z4").toString());this.la_z5.setText(Z.get("z5").toString());
        this.la_z6.setText(Z.get("z6").toString());this.la_z7.setText(Z.get("z7").toString());
        this.la_z8.setText(Z.get("z8").toString());this.la_z9.setText(Z.get("z9").toString());
    }
    private void termina(int i){
        if ((i + 1) < instrucciones.size()) {
            instrucciones.get(i + 1).setSelec(true);
        } else {
            this.jButton2.setVisible(false);
            this.jButton5.setVisible(true);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.jButton3.setVisible(false);
        this.jPanel1.setVisible(false);
        Integer valor = 0;
        for(int i=0; i<instrucciones.size();i++){
            if(instrucciones.get(i).isSelec()){
                instrucciones.get(i).setSelec(false);
                switch(instrucciones.get(i).getAccion()){
                    case "g":
                        if(Objects.equals(X.get(instrucciones.get(i).getVariable()), 0)){
                            if(instrucciones.get(i).getRenglon()<instrucciones.size())
                                instrucciones.get(instrucciones.get(i).getRenglon()-1).setSelec(true);
                            else{
                                JOptionPane.showMessageDialog(new JFrame(),
                                        "Destino no encontrado.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                this.jButton5.setVisible(true);
                            }
                        }else
                            termina(i);
                        break;
                    case "i":
                        valor = X.get(instrucciones.get(i).getVariable());
                        valor++;
                        X.put(instrucciones.get(i).getVariable(), valor);
                        termina(i);
                        break;
                    case "d":
                        valor = X.get(instrucciones.get(i).getVariable());
                        valor--;
                        X.put(instrucciones.get(i).getVariable(), valor);
                        termina(i);
                        break;
                    default:
                        Z.put("z0", Z.get("z0")+1);
                }
                actualizaX();actualizaY();actualizaZ();
                this.jList1.updateUI();
                break;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel la_x0;
    private javax.swing.JLabel la_x1;
    private javax.swing.JLabel la_x2;
    private javax.swing.JLabel la_x3;
    private javax.swing.JLabel la_x4;
    private javax.swing.JLabel la_x5;
    private javax.swing.JLabel la_x6;
    private javax.swing.JLabel la_x7;
    private javax.swing.JLabel la_x8;
    private javax.swing.JLabel la_x9;
    private javax.swing.JLabel la_y0;
    private javax.swing.JLabel la_y1;
    private javax.swing.JLabel la_y2;
    private javax.swing.JLabel la_y3;
    private javax.swing.JLabel la_y4;
    private javax.swing.JLabel la_y5;
    private javax.swing.JLabel la_y6;
    private javax.swing.JLabel la_y7;
    private javax.swing.JLabel la_y8;
    private javax.swing.JLabel la_y9;
    private javax.swing.JLabel la_z0;
    private javax.swing.JLabel la_z1;
    private javax.swing.JLabel la_z2;
    private javax.swing.JLabel la_z3;
    private javax.swing.JLabel la_z4;
    private javax.swing.JLabel la_z5;
    private javax.swing.JLabel la_z6;
    private javax.swing.JLabel la_z7;
    private javax.swing.JLabel la_z8;
    private javax.swing.JLabel la_z9;
    // End of variables declaration//GEN-END:variables
}
