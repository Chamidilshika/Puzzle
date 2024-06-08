/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slidepuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
/**
 *
 * @author chami
 */
public class Puzzle extends javax.swing.JFrame {

    Timer timer;
    String filepath;   
    /**
     * Creates new form Puzzle
     */
    
    public Puzzle() {
        initComponents();
        
        playMusic(filepath);
        lblMaxMovesCount.setText(String.valueOf(counter));
        
        timer = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            //throw new UnsupportedOperationException("Not Support Yet");
            if (rbEasy.isSelected()==true){
                countEasy();
            }
            if (rbMedium.isSelected()==true){
                countMedium();
            }
            if (rbHard.isSelected()==true){
                countHard();
            }  
        }
        
    });
    timer.start();
    }
    
    int i = 500;
    public void countEasy(){
            
        i--;        
        if(i==0){
            timer.stop();
            JOptionPane.showMessageDialog(this,"Game Over","Puzzle Game",
                    JOptionPane.INFORMATION_MESSAGE);  
            i = 500;
                counter = 0;
                lblNoOfMoves.setText(String .valueOf(counter));
                lblTimeCount.setText(String.valueOf(i));
                
                timer.start();
                
                shuffle();
            if (JOptionPane.showConfirmDialog(frame,"Do you want to exit", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
            }                 
        }  
        else{
            lblTimeCount.setText(String.valueOf(i));
        }
    }
    
    int j = 300;
    public void countMedium(){
        
        j--;        
        if(j==0){
            timer.stop();
            JOptionPane.showMessageDialog(this,"Game Over","Puzzle Game",
                    JOptionPane.INFORMATION_MESSAGE);  
            i = 300;
                counter = 0;
                lblNoOfMoves.setText(String .valueOf(counter));
                lblTimeCount.setText(String.valueOf(j));
                
                timer.start();
                
                shuffle();
            if (JOptionPane.showConfirmDialog(frame,"Do you want to exit", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
            }                 
        }  
        else{
            lblTimeCount.setText(String.valueOf(j));
        }
    }
    
    int k = 150;
    public void countHard(){

        k--;        
        if(k==0){
            timer.stop();
            JOptionPane.showMessageDialog(this,"Game Over","Puzzle Game",
                    JOptionPane.INFORMATION_MESSAGE);  
            k = 10;
                counter = 0;
                lblNoOfMoves.setText(String .valueOf(counter));
                lblTimeCount.setText(String.valueOf(k));
                
                timer.start();
                
                shuffle();
            if (JOptionPane.showConfirmDialog(this,"Do you want to exit", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
            }                 
        }  
        else{
            lblTimeCount.setText(String.valueOf(k));
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lbTitlle = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnShuffle = new javax.swing.JButton();
        btnSolution = new javax.swing.JButton();
        lblNoOfMoves = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblTimeCount = new javax.swing.JLabel();
        lblMoves = new javax.swing.JLabel();
        rbEasy = new javax.swing.JRadioButton();
        rbMedium = new javax.swing.JRadioButton();
        rbHard = new javax.swing.JRadioButton();
        lblMaxMoves = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();
        lblUser1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblMaxMovesCount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton9.setText("2");

        jButton10.setText("3");

        jButton11.setText("4");

        jButton12.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(255, 204, 204));
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitlle.setBackground(new java.awt.Color(255, 153, 255));
        lbTitlle.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        lbTitlle.setForeground(new java.awt.Color(102, 204, 255));
        lbTitlle.setText("     PUZZLE GAME");
        getContentPane().add(lbTitlle, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 35, 481, 55));

        btn2.setBackground(new java.awt.Color(0, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 136, 79, 71));

        btn3.setBackground(new java.awt.Color(0, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 0, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 136, 79, 71));

        btn4.setBackground(new java.awt.Color(0, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 136, 79, 71));

        btn1.setBackground(new java.awt.Color(0, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 136, 79, 71));

        btn7.setBackground(new java.awt.Color(0, 255, 255));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 0, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 213, 79, 71));

        btn6.setBackground(new java.awt.Color(0, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 0, 0));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 213, 79, 71));

        btn5.setBackground(new java.awt.Color(0, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 0, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 213, 79, 71));

        btn8.setBackground(new java.awt.Color(0, 255, 255));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 0, 0));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 213, 79, 71));

        btn10.setBackground(new java.awt.Color(0, 255, 255));
        btn10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn10.setForeground(new java.awt.Color(0, 0, 0));
        btn10.setText("10");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 290, 79, 71));

        btn11.setBackground(new java.awt.Color(0, 255, 255));
        btn11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn11.setForeground(new java.awt.Color(0, 0, 0));
        btn11.setText("11");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 290, 79, 71));

        btn12.setBackground(new java.awt.Color(0, 255, 255));
        btn12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn12.setForeground(new java.awt.Color(0, 0, 0));
        btn12.setText("12");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 290, 79, 71));

        btn9.setBackground(new java.awt.Color(0, 255, 255));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 0, 0));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 290, 79, 71));

        btn15.setBackground(new java.awt.Color(0, 255, 255));
        btn15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn15.setForeground(new java.awt.Color(0, 0, 0));
        btn15.setText("15");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 367, 79, 71));

        btn14.setBackground(new java.awt.Color(0, 255, 255));
        btn14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn14.setForeground(new java.awt.Color(0, 0, 0));
        btn14.setText("14");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 367, 79, 71));

        btn13.setBackground(new java.awt.Color(0, 255, 255));
        btn13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn13.setForeground(new java.awt.Color(0, 0, 0));
        btn13.setText("13");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 367, 79, 71));

        btn0.setBackground(new java.awt.Color(0, 255, 255));
        btn0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(0, 0, 0));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 367, 79, 71));

        btnExit.setBackground(new java.awt.Color(153, 204, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 480, 217, 63));

        btnShuffle.setBackground(new java.awt.Color(153, 204, 255));
        btnShuffle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnShuffle.setForeground(new java.awt.Color(0, 0, 0));
        btnShuffle.setText("Shuffle");
        btnShuffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShuffleActionPerformed(evt);
            }
        });
        getContentPane().add(btnShuffle, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, 217, 63));

        btnSolution.setBackground(new java.awt.Color(153, 204, 255));
        btnSolution.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSolution.setForeground(new java.awt.Color(0, 0, 0));
        btnSolution.setText("Solution");
        btnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolutionActionPerformed(evt);
            }
        });
        getContentPane().add(btnSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 217, 63));

        lblNoOfMoves.setBackground(new java.awt.Color(255, 204, 204));
        lblNoOfMoves.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNoOfMoves.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblNoOfMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 85, 57));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 60, 45));

        lblTimeCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTimeCount.setForeground(new java.awt.Color(255, 255, 255));
        lblTimeCount.setText("0");
        getContentPane().add(lblTimeCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 110, 45));

        lblMoves.setBackground(new java.awt.Color(255, 204, 204));
        lblMoves.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMoves.setForeground(new java.awt.Color(255, 255, 255));
        lblMoves.setText("Moves");
        getContentPane().add(lblMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, 57));

        buttonGroup1.add(rbEasy);
        rbEasy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbEasy.setForeground(new java.awt.Color(255, 255, 255));
        rbEasy.setText("Easy");
        rbEasy.setToolTipText("");
        rbEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEasyActionPerformed(evt);
            }
        });
        getContentPane().add(rbEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 90, -1));

        buttonGroup1.add(rbMedium);
        rbMedium.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbMedium.setForeground(new java.awt.Color(255, 255, 255));
        rbMedium.setText("Medium");
        rbMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMediumActionPerformed(evt);
            }
        });
        getContentPane().add(rbMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        buttonGroup1.add(rbHard);
        rbHard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbHard.setForeground(new java.awt.Color(255, 255, 255));
        rbHard.setText("Hard");
        rbHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHardActionPerformed(evt);
            }
        });
        getContentPane().add(rbHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 90, -1));

        lblMaxMoves.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMaxMoves.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxMoves.setText("Max Moves");
        getContentPane().add(lblMaxMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 40));

        btnNewGame.setBackground(new java.awt.Color(102, 204, 255));
        btnNewGame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(0, 0, 0));
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 150, 50));

        lblUser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblUser1.setText("Username");
        getContentPane().add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 90, 40));

        txtUser.setBackground(new java.awt.Color(102, 255, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 110, -1));

        lblMaxMovesCount.setBackground(new java.awt.Color(102, 255, 255));
        lblMaxMovesCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaxMovesCount.setForeground(new java.awt.Color(0, 0, 0));
        lblMaxMovesCount.setText("0");
        getContentPane().add(lblMaxMovesCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\chami\\OneDrive\\Pictures\\Screenshots\\Screenshot (568).png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 970, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
   
    int counter;   
    
    void emptyChecker(JButton btn1 ,JButton btn2){
        
        String ShuffleNumber = btn2.getText();
        
        if (ShuffleNumber == ""){
            
            btn2.setText(btn1.getText());
            btn1.setText("");
            counter++;
        }
    }
        
    public void shuffle(){
        
        ArrayList <JButton> button = new ArrayList<>();
        
        button.add(btn1);
        button.add(btn2);
        button.add(btn3);
        button.add(btn4);
        button.add(btn5);
        button.add(btn6);
        button.add(btn7);
        button.add(btn8);
        button.add(btn9);
        button.add(btn10);
        button.add(btn11);
        button.add(btn12);
        button.add(btn13);
        button.add(btn14);
        button.add(btn15);
        button.add(btn0);
        
        Collections.shuffle(button);
        
        for (int i = 0; i<button.size(); i++){
            
            JButton btn = button.get(i);
            btn.setText(String.valueOf(i+1));
            
            if (i == button.size()-1){
                btn.setText("");
            }
                   
        }
               
    }
    
    public void solutionChecker(){
        
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        String b10 = btn10.getText();
        String b11 = btn11.getText();
        String b12 = btn12.getText();
        String b13 = btn13.getText();
        String b14 = btn14.getText();
        String b15 = btn15.getText();
        
        if (b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8" && 
                b9 == "9" && b10 == "10" && b11 == "11" && b12 == "12" && b13 == "13" && b14 == "14" && b15 == "15"){
            JOptionPane.showMessageDialog(this,"You win the Game","Puzzle Game",
                    JOptionPane.INFORMATION_MESSAGE);
            timer.stop();
            
            LeaderBoard lb = new LeaderBoard();
            
            lb.txtName.setText(txtUser.getText());
            lb.txtTime.setText(lblTimeCount.getText());
            lb.txtMoves.setText(lblNoOfMoves.getText());
            lb.show();
            
            dispose();
            
         
        }       
        
        lblNoOfMoves.setText(Integer.toString(counter));
        if (counter >=150){
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game over,Maximum moves has exceeded.", "Puzzle Game", JOptionPane.YES_NO_OPTION);
        }
    }
    
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
    
        emptyChecker(btn7, btn2);
        emptyChecker(btn7, btn6);
        emptyChecker(btn7, btn8);
        emptyChecker(btn7, btn10);
        solutionChecker();

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed

        emptyChecker(btn10, btn7);
        emptyChecker(btn10, btn9);
        emptyChecker(btn10, btn11);
        emptyChecker(btn10, btn15);
        solutionChecker();

    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        
        emptyChecker(btn11, btn6);
        emptyChecker(btn11, btn10);
        emptyChecker(btn11, btn12);
        emptyChecker(btn11, btn14);
        solutionChecker();
 
    }//GEN-LAST:event_btn11ActionPerformed
        
    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Do you want to exit", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        else{
            shuffle();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnShuffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShuffleActionPerformed
        shuffle();
        LeaderBoard ld = new LeaderBoard();
        ld.txtName.setText(txtUser.getText());
       
    }//GEN-LAST:event_btnShuffleActionPerformed

    private void btnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolutionActionPerformed
        
        btn1.setText("1");
        btn2.setText("2");
        btn3.setText("3");
        btn4.setText("4");
        btn5.setText("5");
        btn6.setText("6");
        btn7.setText("7");
        btn8.setText("8");
        btn9.setText("9");
        btn10.setText("10");
        btn11.setText("11");
        btn12.setText("12");
        btn13.setText("13");
        btn14.setText("14");
        btn15.setText("15");
        btn0.setText("");
        
        solutionChecker();
        LeaderBoard lb = new LeaderBoard();
        lb.txtName.setText(txtUser.getText());
        lb.txtMoves.setText(lblNoOfMoves.getText());
        
    }//GEN-LAST:event_btnSolutionActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        
        emptyChecker(btn13, btn12);
        emptyChecker(btn13, btn14);
        solutionChecker();

    }//GEN-LAST:event_btn13ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        
        emptyChecker(btn1, btn2);
        emptyChecker(btn1,btn8);
        solutionChecker();
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        
        emptyChecker(btn2, btn3);
        emptyChecker(btn2, btn7);
        emptyChecker(btn2, btn1);
        solutionChecker();

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
             
        emptyChecker(btn3, btn4);
        emptyChecker(btn3, btn6);
        emptyChecker(btn3, btn2);
        solutionChecker();
 
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        emptyChecker(btn4, btn3);
        emptyChecker(btn4, btn5);
        solutionChecker();

    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        emptyChecker(btn5, btn4);
        emptyChecker(btn5, btn6);
        emptyChecker(btn5, btn12);
        solutionChecker();
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
 
        emptyChecker(btn6, btn3);
        emptyChecker(btn6, btn5);
        emptyChecker(btn6, btn7);
        emptyChecker(btn6, btn11);
        solutionChecker();
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        emptyChecker(btn8, btn1);
        emptyChecker(btn8, btn7);
        emptyChecker(btn8, btn9);
        solutionChecker();
 
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
    
        emptyChecker(btn9, btn8);
        emptyChecker(btn9, btn10);
        emptyChecker(btn9, btn0);
        solutionChecker();
 
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed

        emptyChecker(btn12, btn5);
        emptyChecker(btn12, btn11);
        emptyChecker(btn12, btn13);
        solutionChecker();
 
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        
        emptyChecker(btn14, btn11);
        emptyChecker(btn14, btn13);
        emptyChecker(btn14, btn15);
        solutionChecker();

    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
            
        emptyChecker(btn15, btn10);
        emptyChecker(btn15, btn14);
        emptyChecker(btn15, btn0);
        solutionChecker();
 
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        
        emptyChecker(btn0, btn9);
        emptyChecker(btn0, btn15);
        solutionChecker();

    }//GEN-LAST:event_btn0ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        shuffle();
    }//GEN-LAST:event_formWindowActivated

    private void rbEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEasyActionPerformed
             
        timer.start();
        countEasy();
    }//GEN-LAST:event_rbEasyActionPerformed

    private void rbMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMediumActionPerformed
        
        timer.start();
        countMedium();
    }//GEN-LAST:event_rbMediumActionPerformed

    private void rbHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHardActionPerformed
        
        timer.start();
        countHard();
    }//GEN-LAST:event_rbHardActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        
        frame = new JFrame("New Game");
        
        if (JOptionPane.showConfirmDialog(frame,"Do you want to move new game", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        JOptionPane.showMessageDialog(null, "Select the level");     
        }
    }//GEN-LAST:event_btnNewGameActionPerformed

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
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle().setVisible(true);
            }
        });
        
    }
    public void playMusic(String location){
         try{
             filepath = "C:\\Users\\chami\\OneDrive\\Desktop\\Chami\\AddSound";
             File musicpath = new File(location);
             AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicpath);
             Clip clip = AudioSystem.getClip();
             clip.open(audioInput);
             clip.start();        
         } 
         catch(Exception e){
             System.out.println(e);
         }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnSolution;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbTitlle;
    private javax.swing.JLabel lblMaxMoves;
    private javax.swing.JTextField lblMaxMovesCount;
    private javax.swing.JLabel lblMoves;
    private javax.swing.JLabel lblNoOfMoves;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTimeCount;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JRadioButton rbEasy;
    private javax.swing.JRadioButton rbHard;
    private javax.swing.JRadioButton rbMedium;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
