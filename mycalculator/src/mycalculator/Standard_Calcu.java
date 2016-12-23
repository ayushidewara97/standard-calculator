package mycalculator;


import java.awt.Color;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author ayushi
 */
public class Standard_Calcu extends javax.swing.JFrame {

    /**
     * Creates new form Standard_Calcu
     */
    private double total1=0.0;
    private double total2=0.0;
    private char math_operator;
    public Standard_Calcu() {
        initComponents();
    }
    private void getOperator(String btnText)
    {
      math_operator=btnText.charAt(0);
      total1=total1+Double.parseDouble(txtDisplay.getText());
              txtDisplay.setText("");
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        sub = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        negativeb = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        equal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setText("1");
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b2.setText("2");
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b3.setText("3");
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b4.setText("4");
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b5.setText("5");
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b6.setText("6");
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6MouseExited(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b8.setText("8");
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b8MouseExited(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b9.setText("9");
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b9MouseExited(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b0.setText("0");
        b0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b0MouseExited(evt);
            }
        });
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdot.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        bdot.setText(".");
        bdot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdotMouseExited(evt);
            }
        });
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("Cl");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b7.setText("7");
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b7MouseExited(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b7KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bdot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        sub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sub.setText("-");
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subMouseExited(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        plus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        plus.setText("+");
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plusMouseExited(evt);
            }
        });
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        mul.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mul.setText("*");
        mul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mulMouseExited(evt);
            }
        });
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        div.setText("/");
        div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                divMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                divMouseExited(evt);
            }
        });
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        negativeb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        negativeb.setText("+/-");
        negativeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                negativebMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                negativebMouseExited(evt);
            }
        });
        negativeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negativebActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(negativeb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(negativeb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        equal.setText("=");
        equal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        equal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equalMouseExited(evt);
            }
        });
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDisplay)
                    .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
               String b3Text=txtDisplay.getText()+b3.getText();
                txtDisplay.setText(b3Text);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        String b4Text=txtDisplay.getText()+b4.getText();
        txtDisplay.setText(b4Text);
    }//GEN-LAST:event_b4ActionPerformed
    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        String b7Text=txtDisplay.getText()+b7.getText();
        txtDisplay.setText(b7Text);
    }//GEN-LAST:event_b7ActionPerformed
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        String b1Text=txtDisplay.getText()+b1.getText();
        txtDisplay.setText(b1Text);
    }//GEN-LAST:event_b1ActionPerformed
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        String b8Text=txtDisplay.getText()+b8.getText();
        txtDisplay.setText(b8Text);
    }//GEN-LAST:event_b8ActionPerformed
    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        String b5Text=txtDisplay.getText()+b5.getText();
        txtDisplay.setText(b5Text);
    }//GEN-LAST:event_b5ActionPerformed
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        String b2Text=txtDisplay.getText()+b2.getText();
        txtDisplay.setText(b2Text);
    }//GEN-LAST:event_b2ActionPerformed
    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        String b0Text=txtDisplay.getText()+b0.getText();
        txtDisplay.setText(b0Text);
    }//GEN-LAST:event_b0ActionPerformed
    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        String b9Text=txtDisplay.getText()+b9.getText();
        txtDisplay.setText(b9Text);
    }//GEN-LAST:event_b9ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        String b6Text=txtDisplay.getText()+b6.getText();
        txtDisplay.setText(b6Text);
    }//GEN-LAST:event_b6ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
       String button_text=plus.getText();
       getOperator(button_text);
      
    }//GEN-LAST:event_plusActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
       
        switch(math_operator)
        {
            case'+':
             total2 =total1+Double.parseDouble(txtDisplay.getText());
             break;
            case'-':
                total2=total1-Double.parseDouble(txtDisplay.getText());
                break;
            case'*':
                 total2=total1*Double.parseDouble(txtDisplay.getText());
                 break;
            case'/':
                 total2=total1/Double.parseDouble(txtDisplay.getText());
                 break;
        }        
        txtDisplay.setText(Double.toString(total2));
        total1=0;
        
    }//GEN-LAST:event_equalActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        total2=0;
        txtDisplay.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        String bdotText=txtDisplay.getText()+bdot.getText();
        txtDisplay.setText(bdotText);
      
    }//GEN-LAST:event_bdotActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
         String button_text=mul.getText();
         getOperator(button_text);
    }//GEN-LAST:event_mulActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
       String button_text=sub.getText();
       getOperator(button_text);
    }//GEN-LAST:event_subActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
         String button_text=div.getText();
         getOperator(button_text);
    }//GEN-LAST:event_divActionPerformed

    private void b7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseEntered
       b7.setBackground(Color.cyan);
       b7.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_b7MouseEntered

    private void b7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseExited
       b7.setBackground(null);
       b7.setForeground(null);
    }//GEN-LAST:event_b7MouseExited

    private void b8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseEntered
       b8.setBackground(Color.cyan);
       b8.setForeground(Color.BLACK);
    }//GEN-LAST:event_b8MouseEntered

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
       b5.setBackground(Color.cyan);
       b5.setForeground(Color.BLACK);
    }//GEN-LAST:event_b5MouseEntered

    private void b9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseEntered
       b9.setBackground(Color.cyan);
       b9.setForeground(Color.BLACK);
    }//GEN-LAST:event_b9MouseEntered

    private void divMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divMouseEntered
       div.setBackground(Color.cyan);
       div.setForeground(Color.BLACK);
    }//GEN-LAST:event_divMouseEntered

    private void mulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mulMouseEntered
       mul.setBackground(Color.cyan);
       mul.setForeground(Color.BLACK);
    }//GEN-LAST:event_mulMouseEntered

    private void plusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseEntered
       plus.setBackground(Color.cyan);
       plus.setForeground(Color.BLACK);
    }//GEN-LAST:event_plusMouseEntered

    private void subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseEntered
       sub.setBackground(Color.cyan);
       sub.setForeground(Color.BLACK);
    }//GEN-LAST:event_subMouseEntered

    private void equalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseEntered
       equal.setBackground(Color.cyan);
       equal.setForeground(Color.BLACK);
    }//GEN-LAST:event_equalMouseEntered

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
       clear.setBackground(Color.cyan);
       clear.setForeground(Color.BLACK);
    }//GEN-LAST:event_clearMouseEntered

    private void b0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b0MouseEntered
       b0.setBackground(Color.cyan);
       b0.setForeground(Color.BLACK);
    }//GEN-LAST:event_b0MouseEntered

    private void bdotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdotMouseEntered
       bdot.setBackground(Color.cyan);
       bdot.setForeground(Color.BLACK);
    }//GEN-LAST:event_bdotMouseEntered

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
       b1.setBackground(Color.cyan);
       b1.setForeground(Color.BLACK);
    }//GEN-LAST:event_b1MouseEntered

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
       b4.setBackground(Color.cyan);
       b4.setForeground(Color.BLACK);
    }//GEN-LAST:event_b4MouseEntered

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
       b6.setBackground(Color.cyan);
       b6.setForeground(Color.BLACK);
    }//GEN-LAST:event_b6MouseEntered

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
       b2.setBackground(Color.cyan);
       b2.setForeground(Color.BLACK);
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
       b3.setBackground(Color.cyan);
       b3.setForeground(Color.BLACK);
    }//GEN-LAST:event_b3MouseEntered

    private void divMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divMouseExited
       div.setBackground(null);
       div.setForeground(null);
    }//GEN-LAST:event_divMouseExited

    private void mulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mulMouseExited
       mul.setBackground(null);
       mul.setForeground(null);
    }//GEN-LAST:event_mulMouseExited

    private void plusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseExited
      plus.setBackground(null);
      plus.setForeground(null);
    }//GEN-LAST:event_plusMouseExited

    private void subMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseExited
       sub.setBackground(null);
       sub.setForeground(null);
    }//GEN-LAST:event_subMouseExited

    private void equalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalMouseExited
       equal.setBackground(null);
       equal.setForeground(null);
    }//GEN-LAST:event_equalMouseExited

    private void bdotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdotMouseExited
        bdot.setBackground(null);
        bdot.setForeground(null);
    }//GEN-LAST:event_bdotMouseExited

    private void b0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b0MouseExited
       b0.setBackground(null);
       b0.setForeground(null);
    }//GEN-LAST:event_b0MouseExited

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
       clear.setBackground(null);
       clear.setForeground(null);
    }//GEN-LAST:event_clearMouseExited

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
       b1.setBackground(null);
       b1.setForeground(null);
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
       b2.setBackground(null);
       b2.setForeground(null);
    }//GEN-LAST:event_b2MouseExited

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
       b3.setBackground(null);
       b3.setForeground(null);
    }//GEN-LAST:event_b3MouseExited

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
       b4.setBackground(null);
       b4.setForeground(null);
    }//GEN-LAST:event_b4MouseExited

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
       b5.setBackground(null);
       b5.setForeground(null);
    }//GEN-LAST:event_b5MouseExited

    private void b6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseExited
       b6.setBackground(null);
       b6.setForeground(null);
    }//GEN-LAST:event_b6MouseExited

    private void b8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseExited
       b8.setBackground(null);
       b8.setForeground(null);
    }//GEN-LAST:event_b8MouseExited

    private void b9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseExited
       b9.setBackground(null);
       b9.setForeground(null);
    }//GEN-LAST:event_b9MouseExited

    private void b7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b7KeyTyped
        String b7Text=txtDisplay.getText()+b7.getText();
        txtDisplay.setText(b7Text);
        
    }//GEN-LAST:event_b7KeyTyped

    private void negativebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativebActionPerformed
       double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
       ops = ops * (-1);
       txtDisplay.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_negativebActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
      
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void negativebMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negativebMouseEntered
       negativeb.setBackground(Color.cyan);
       negativeb.setForeground(Color.BLACK);   
    }//GEN-LAST:event_negativebMouseEntered

    private void negativebMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negativebMouseExited
       negativeb.setBackground(null);
       negativeb.setForeground(null);  
    }//GEN-LAST:event_negativebMouseExited
     public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Standard_Calcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bdot;
    private javax.swing.JButton clear;
    private javax.swing.JButton div;
    private javax.swing.JButton equal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mul;
    private javax.swing.JButton negativeb;
    private javax.swing.JButton plus;
    private javax.swing.JButton sub;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
