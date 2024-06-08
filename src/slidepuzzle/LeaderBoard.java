/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slidepuzzle;


import com.sun.jdi.connect.Connector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import java.util.Vector;
import java.sql.PreparedStatement;
/**
 *
 * @author chami
 */
public class LeaderBoard extends javax.swing.JFrame {
    
    private static final String username = "root";
    private static final String password = "Dil@2002";
    private static final String dataConn = "jdbc:mysql://localhost:3306/slidepuzzle3";
    
    Connection sqlConn;
    PreparedStatement pst;
    ResultSet rs = null;
    int q, i, id, deleteItem;

    /**
     * Creates new form LeaderBoard
     */
    public LeaderBoard(){
        
        initComponents();
              
    }
    
    public void getBestTiming ()throws SQLException{ 
        
        String url = "jdbc:mysql://localhost:3306/puzzlegame";
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(url);            
        }catch(SQLDataException e){
            System.out.println(e.getMessage());
        }
        
        try{
            
            PreparedStatement psUsernmae = (PreparedStatement) conn.prepareStatement("SELECT name FROM players WHERE timing = (SELECT MIN(timing) FROM players)");
            ResultSet userResult = psUsernmae.executQuery();
            
            String bestUserName = "";
            
            if (userResult.next()){
                
                bestUserName = userResult.getString("Name");
            }
            
            PreparedStatement bestTiming = (PreparedStatement) conn.prepareStatement("SELECT MIN(timing) AS best_Timing FROM players");
            ResultSet bestTimingResult = bestTiming.executQuery();
              
            int best_Timing = 0;
            if (bestTimingResult.next()){
                best_Timing = bestTimingResult.getInt("best timing");
            }
            txtTime.setText(String.valueOf(best_Timing));
            
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        
        conn.close();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnNewGame = new javax.swing.JButton();
        txtMoves = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("LEADERBOARD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 44));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, -1));

        lblScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setText("Moves");
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, -1));

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time");
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, -1));

        txtTime.setBackground(new java.awt.Color(204, 255, 255));
        txtTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTime.setForeground(new java.awt.Color(0, 0, 0));
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 210, -1));

        txtName.setBackground(new java.awt.Color(204, 255, 255));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 210, -1));

        btnNewGame.setBackground(new java.awt.Color(51, 255, 255));
        btnNewGame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewGame.setForeground(new java.awt.Color(0, 0, 0));
        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        txtMoves.setBackground(new java.awt.Color(204, 255, 255));
        txtMoves.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMoves.setForeground(new java.awt.Color(0, 0, 0));
        txtMoves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovesActionPerformed(evt);
            }
        });
        getContentPane().add(txtMoves, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, -1));

        btnExit.setBackground(new java.awt.Color(51, 255, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        btnAdd.setBackground(new java.awt.Color(102, 255, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTable1.setBackground(new java.awt.Color(51, 153, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Moves", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\chami\\OneDrive\\Pictures\\Screenshots\\Screenshot (570).png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        
        
    }//GEN-LAST:event_txtTimeActionPerformed

    
    private void txtMovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovesActionPerformed

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        
        frame = new JFrame("New Game");
        
        if (JOptionPane.showConfirmDialog(frame,"Do you want to move new game", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            
            Puzzle p = new Puzzle();
            p.show();
            dispose();
            
            JOptionPane.showMessageDialog(null, "Select the level"); 
        }
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed
        
    private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Do you want to exit", "Puzzle Game",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if (txtName.getText().equals("")||txtMoves.getText().equals("")||txtTime.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Fill all data");
        }
        else{
            String [] data = {txtName.getText(),txtMoves.getText(),txtTime.getText()};
        
        DefaultTableModel tbModel = (DefaultTableModel) jTable1.getModel();
        tbModel.addRow(data);
        JOptionPane.showMessageDialog(this, "Add Data Successfully");
        txtName.setText("");
        txtMoves.setText("");
        txtTime.setText("");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LeaderBoard().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(LeaderBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
      Connection conn;
        PreparedStatement pst;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/slidepuzzle", "root", "Dil@2002");
            System.out.println("Success");
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
        
       
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTime;
    public javax.swing.JTextField txtMoves;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private ResultSet executQuery() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private void setString(int i, String text) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private String getString(String name) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private int getInt(String best_timing) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        private ResultSetMetaData getMetaData() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}

