package jogo_da_velha;

import java.awt.Color;
import javax.swing.JOptionPane;

//@author Rai Mota

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();        
    }
    private String jogador1 = "X";//Será usado para jogar no setText dos botões    
    private int cX = 0, cO = 0;//Contador de X e O
    
    private void vezDo(){//Trocar jogadores         
        if(jogador1.equalsIgnoreCase("X")){ 
            jogador1 = "O";
            tituloVez.setText("É a Vez do " + jogador1); 
        }
        else{
            jogador1 = "X";
            tituloVez.setText("É a Vez do " + jogador1); 
        }            
    }
    private void pintarBtn(int c){
        switch(c){            
            case 0:
                btn1.setBackground(new Color(255, 140, 0));
                btn2.setBackground(new Color(255, 140, 0));
                btn3.setBackground(new Color(255, 140, 0));
                break;
            case 1:
                btn4.setBackground(new Color(255, 140, 0));
                btn5.setBackground(new Color(255, 140, 0));
                btn6.setBackground(new Color(255, 140, 0));
                break;
            case 2:
                btn7.setBackground(new Color(255, 140, 0));
                btn8.setBackground(new Color(255, 140, 0));
                btn9.setBackground(new Color(255, 140, 0));
                break;
            case 3:
                btn1.setBackground(new Color(255, 140, 0));
                btn4.setBackground(new Color(255, 140, 0));
                btn7.setBackground(new Color(255, 140, 0));
                break;
            case 4:
                btn2.setBackground(new Color(255, 140, 0));
                btn5.setBackground(new Color(255, 140, 0));
                btn8.setBackground(new Color(255, 140, 0));
                break;
            case 5:
                btn3.setBackground(new Color(255, 140, 0));
                btn6.setBackground(new Color(255, 140, 0));
                btn9.setBackground(new Color(255, 140, 0));
                break;
            case 6:
                btn1.setBackground(new Color(255, 140, 0));
                btn5.setBackground(new Color(255, 140, 0));
                btn9.setBackground(new Color(255, 140, 0));
                break;
            case 7:
                btn3.setBackground(new Color(255, 140, 0));
                btn5.setBackground(new Color(255, 140, 0));
                btn7.setBackground(new Color(255, 140, 0));
                break;             
        }
    }  
    private void vencedor(){//Ver quem é o Vencedor         
        int c = -1;        
        String combinacoes[] = {this.btn1.getText(), this.btn2.getText(), this.btn3.getText(), this.btn4.getText(), this.btn5.getText(), this.btn6.getText(), this.btn7.getText(), this.btn8.getText(), this.btn9.getText()};
        
        boolean checkX[] = {"X".equals(combinacoes[0]) && "X".equals(combinacoes[1]) && "X".equals(combinacoes[2]),
        "X".equals(combinacoes[3]) && "X".equals(combinacoes[4]) && "X".equals(combinacoes[5]),
        "X".equals(combinacoes[6]) && "X".equals(combinacoes[7]) && "X".equals(combinacoes[8]),
        "X".equals(combinacoes[0]) && "X".equals(combinacoes[3]) && "X".equals(combinacoes[6]),
        "X".equals(combinacoes[1]) && "X".equals(combinacoes[4]) && "X".equals(combinacoes[7]),
        "X".equals(combinacoes[2]) && "X".equals(combinacoes[5]) && "X".equals(combinacoes[8]),
        "X".equals(combinacoes[0]) && "X".equals(combinacoes[4]) && "X".equals(combinacoes[8]),
        "X".equals(combinacoes[2]) && "X".equals(combinacoes[4]) && "X".equals(combinacoes[6])};
        
        boolean checkO[] = {"O".equals(combinacoes[0]) && "O".equals(combinacoes[1]) && "O".equals(combinacoes[2]),
        "O".equals(combinacoes[3]) && "O".equals(combinacoes[4]) && "O".equals(combinacoes[5]),
        "O".equals(combinacoes[6]) && "O".equals(combinacoes[7]) && "O".equals(combinacoes[8]),
        "O".equals(combinacoes[0]) && "O".equals(combinacoes[3]) && "O".equals(combinacoes[6]),
        "O".equals(combinacoes[1]) && "O".equals(combinacoes[4]) && "O".equals(combinacoes[7]),
        "O".equals(combinacoes[2]) && "O".equals(combinacoes[5]) && "O".equals(combinacoes[8]),
        "O".equals(combinacoes[0]) && "O".equals(combinacoes[4]) && "O".equals(combinacoes[8]),
        "O".equals(combinacoes[2]) && "O".equals(combinacoes[4]) && "O".equals(combinacoes[6])};
        
        if(checkX[0] == true || checkX[1] == true || checkX[2] == true || checkX[3] == true || checkX[4] == true || checkX[5] == true
                || checkX[6] == true || checkX[7] == true){
            for(int i = 0; i < checkX.length; i++){                
                if(checkX[i] == true)
                    c = i;                
            }
            cX++;
            placar();                
            JOptionPane.showMessageDialog(null, "X venceu !!!");
            pintarBtn(c);            
        }        
        if(checkO[0] == true || checkO[1] == true || checkO[2] == true || checkO[3] == true || checkO[4] == true || checkO[5] == true
            || checkO[6] == true || checkO[7] == true){
            for(int i = 0; i < checkO.length; i++){                
                if(checkO[i] == true)
                    c = i;                
            }
            cO++;
            placar();                
            JOptionPane.showMessageDialog(null, "O venceu !!!");
            pintarBtn(c);
        }
        if(!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("") && !btn4.getText().equals("") &&
                !btn5.getText().equals("") && !btn6.getText().equals("") && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals(""))
            
            JOptionPane.showMessageDialog(null, "Empate !!!");
    }
    private void novoJogo(){//auto-explicativo
        btn1.setText("");        
        btn1.setBackground(new Color(187,187,187));
        
        btn2.setText("");        
        btn2.setBackground(new Color(187,187,187));       
        
        btn3.setText("");        
        btn3.setBackground(new Color(187,187,187));
        
        btn4.setText("");        
        btn4.setBackground(new Color(187,187,187));
        
        btn5.setText("");       
        btn5.setBackground(new Color(187,187,187));
        
        btn6.setText("");        
        btn6.setBackground(new Color(187,187,187));
        
        btn7.setText("");      
        btn7.setBackground(new Color(187,187,187));
        
        btn8.setText("");       
        btn8.setBackground(new Color(187,187,187));
        
        btn9.setText("");       
        btn9.setBackground(new Color(187,187,187));
    }    
    private void placar(){
        jlPlacarX.setText(String.valueOf(cX));//converter int para String
        jlPlacarO.setText(String.valueOf(cO));//converter int para String
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tituloVez = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlPlacarX = new javax.swing.JLabel();
        jlPlacarO = new javax.swing.JLabel();
        novoJogo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resetar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(50, 50, 50));

        jPanel2.setBackground(new java.awt.Color(113, 126, 195));

        tituloVez.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloVez.setForeground(new java.awt.Color(204, 204, 204));
        tituloVez.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tituloVez.setText("É a vez do X");

        jLabel1.setBackground(new java.awt.Color(193, 154, 183));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Placar de X:");

        jlPlacarX.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPlacarX.setForeground(new java.awt.Color(204, 204, 204));
        jlPlacarX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPlacarX.setText("0");

        jlPlacarO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPlacarO.setForeground(new java.awt.Color(204, 204, 204));
        jlPlacarO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlPlacarO.setText("0");

        novoJogo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        novoJogo.setText("Novo Jogo");
        novoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoJogoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Placar de O:");

        resetar.setText("Resetar");
        resetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(novoJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tituloVez)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(resetar)
                        .addGap(72, 72, 72)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlPlacarO))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlPlacarX)))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(novoJogo)
                    .addComponent(jlPlacarX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloVez)
                    .addComponent(jlPlacarO)
                    .addComponent(jLabel2)
                    .addComponent(resetar))
                .addGap(21, 21, 21))
        );

        btn1.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn1.setBorder(null);
        btn1.setFocusable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn2.setBorder(null);
        btn2.setFocusable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn3.setBorder(null);
        btn3.setFocusable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn4.setBorder(null);
        btn4.setFocusable(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        btn5.setBorder(null);
        btn5.setFocusable(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn6.setBorder(null);
        btn6.setFocusable(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn7.setBorder(null);
        btn7.setFocusable(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn8.setBorder(null);
        btn8.setFocusable(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        btn9.setBorder(null);
        btn9.setFocusable(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(btn9.getText().equals("")){            
            btn9.setText(jogador1);        
            if(jogador1.equalsIgnoreCase("X"))
                btn9.setForeground(Color.red);                  
            else
                btn9.setForeground(Color.blue);                  
            vezDo();
            vencedor();
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(btn1.getText().equals("")){
            btn1.setText(jogador1);        
            if(jogador1.equalsIgnoreCase("X"))
                btn1.setForeground(Color.red);                  
            else
                btn1.setForeground(Color.blue);                   
            vezDo();
            vencedor();        
            }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(btn2.getText().equals("")){
            btn2.setText(jogador1);        
            if(jogador1.equalsIgnoreCase("X"))
            btn2.setForeground(Color.red);                   
            else
                btn2.setForeground(Color.blue);                     
            vezDo();
            vencedor(); 
        }               
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(btn3.getText().equals("")){
            btn3.setText(jogador1);
            if(jogador1.equalsIgnoreCase("X"))
                btn3.setForeground(Color.red);                  
            else
                btn3.setForeground(Color.blue);                    
            vezDo();
            vencedor();
        }                               
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(btn4.getText().equals("")){
            btn4.setText(jogador1);        
            if(jogador1.equalsIgnoreCase("X"))
                btn4.setForeground(Color.red);                   
            else
                btn4.setForeground(Color.blue);
            vezDo();
            vencedor();
        }   
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(btn5.getText().equals("")){
            btn5.setText(jogador1);
            if(jogador1.equalsIgnoreCase("X"))
                btn5.setForeground(Color.red);                   
            else
                btn5.setForeground(Color.blue);                     
            vezDo();
            vencedor();
        } 
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(btn6.getText().equals("")){
            btn6.setText(jogador1);       
            if(jogador1.equalsIgnoreCase("X"))
                btn6.setForeground(Color.red);                  
            else
                btn6.setForeground(Color.blue);                          
            vezDo();
            vencedor();
        }               
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(btn7.getText().equals("")){
            btn7.setText(jogador1);
            if(jogador1.equalsIgnoreCase("X"))
                btn7.setForeground(Color.red);                   
            else
                btn7.setForeground(Color.blue);                          
            vezDo();
            vencedor();  
        }                      
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(btn8.getText().equals("")){
            btn8.setText(jogador1);        
            if(jogador1.equalsIgnoreCase("X"))
                btn8.setForeground(Color.red);                  
            else
                btn8.setForeground(Color.blue);          
            vezDo();
            vencedor();
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void novoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoJogoActionPerformed
        // TODO add your handling code here:
        novoJogo();
    }//GEN-LAST:event_novoJogoActionPerformed

    private void resetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarActionPerformed
        // TODO add your handling code here:
        if(cX !=0 || cO != 0){
            cX = 0;
            cO = 0;
            placar();
        }else
            JOptionPane.showMessageDialog(null, "Placar já está zerado !");        
    }//GEN-LAST:event_resetarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlPlacarO;
    private javax.swing.JLabel jlPlacarX;
    private javax.swing.JButton novoJogo;
    private javax.swing.JButton resetar;
    private javax.swing.JLabel tituloVez;
    // End of variables declaration//GEN-END:variables
}
