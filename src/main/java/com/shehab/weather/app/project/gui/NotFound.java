/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.shehab.weather.app.project.gui;

import com.shehab.weather.app.project.WeatherAppProject;
import com.shehab.weather.app.project.tools.TextFormating;

import javax.swing.*;

/**
 *
 * @author sheha
 */
public class NotFound extends javax.swing.JFrame {

    /**
     * Creates new form NotFound
     */
    public NotFound() {
        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inpSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        // Set the icon for the JFrame
        try{
            ImageIcon icon = new ImageIcon(WeatherAppProject.class.getResource("/images/icon.png"));
            setIconImage(icon.getImage());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading icon: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        assert jPanel1 != null;
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        assert jLabel1 != null;
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Weather Data Not Found!");

        assert jLabel2 != null;
        jLabel2.setText("Please, check spelling or enter a valid name");

        assert inpSearch != null;
        inpSearch.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        inpSearch.setText("");
        inpSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        inpSearch.setMargin(new java.awt.Insets(4, 12, 4, 12));
        inpSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpSearchActionPerformed(evt);
            }
        });

        assert btnSearch != null;
        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(153, 255, 204));
        btnSearch.setText("Search");
        btnSearch.setBorder(null);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setVisible(false);
                WeatherAppProject weatherAppProject = new WeatherAppProject();
                String cityName = inpSearch.getText().trim().toLowerCase();
                if (!cityName.isEmpty()) {
                    weatherAppProject.start(TextFormating.removeSpaces(cityName));
                } 
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inpSearch, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inpSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpSearchActionPerformed
        // TODO add your handling code here:
    }




    // Variables declaration
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField inpSearch;
    // End of variables declaration//GEN-END:variables
}
