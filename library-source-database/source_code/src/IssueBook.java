/*
 * IssueBook.java
 *
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author  Administrator
 */
public class IssueBook extends javax.swing.JFrame {
    
    /** Creates new form IssueBook */
    public IssueBook() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TxtMemberID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CmdMemberDetails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtMemberName = new javax.swing.JTextField();
        TxtMemberStatus = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtBookID = new javax.swing.JTextField();
        CmdBookDetails = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxtBookStatus = new javax.swing.JTextField();
        TxtBookTitle = new javax.swing.JTextField();
        CmdReset = new javax.swing.JButton();
        CmdIssueBook = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("P2P Library : Issue Book");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setText("Member ID :");

        TxtMemberID.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Issue Book");

        CmdMemberDetails.setText("Details");
        CmdMemberDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdMemberDetailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Name :");

        TxtMemberName.setEditable(false);
        TxtMemberName.setText("jTextField1");

        TxtMemberStatus.setEditable(false);
        TxtMemberStatus.setText("jTextField1");

        jLabel4.setText("Book ID :");

        TxtBookID.setText("jTextField1");

        CmdBookDetails.setText("Details");
        CmdBookDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdBookDetailsActionPerformed(evt);
            }
        });

        jLabel5.setText("Title :");

        TxtBookStatus.setEditable(false);
        TxtBookStatus.setText("jTextField1");

        TxtBookTitle.setEditable(false);
        TxtBookTitle.setText("jTextField1");

        CmdReset.setText("Reset");
        CmdReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdResetActionPerformed(evt);
            }
        });

        CmdIssueBook.setText("Issue Book");
        CmdIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdIssueBookActionPerformed(evt);
            }
        });

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtBookStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CmdReset)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CmdIssueBook)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CmdClose))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(CmdMemberDetails))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtMemberStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(CmdBookDetails)))))
                .addContainerGap(97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdMemberDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TxtMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtMemberStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdBookDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBookStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdReset)
                    .addComponent(CmdIssueBook)
                    .addComponent(CmdClose))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdResetActionPerformed
        ClearText();
}//GEN-LAST:event_CmdResetActionPerformed

    private void CmdIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdIssueBookActionPerformed
       //issue book
        try
        {
            
        
            if (TxtMemberID.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter member id.");
                return;
            }
            if (TxtBookID.getText().trim().length()==0 ) {
                JOptionPane.showMessageDialog(null,"Enter member id.");
                return;
            }
            MainClass mc=new MainClass();
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);  

            String sql = "insert into lib_transaction (trn_mem_id,trn_book_id,trn_issue_dt) values (" + TxtMemberID.getText() + "," + TxtBookID.getText() + ",sysdate())";
            PreparedStatement pst=connection.prepareStatement(sql);
            pst.executeUpdate(sql);
            
            
            sql = "update  lib_book_master set book_status='Issued' where book_id=" +  TxtBookID.getText();
            pst=connection.prepareStatement(sql);
            pst.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(null,"Book Issued");
            ClearText();
        }
        catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }

}//GEN-LAST:event_CmdIssueBookActionPerformed

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ClearText();
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void CmdMemberDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdMemberDetailsActionPerformed
        //get member deatils
                try
        {
            //get database connection details
            MainClass mc=new MainClass();
            
             //open connection
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            String str="";
            str="select * from lib_member_master where mem_id =? ";
           PreparedStatement pst=connection.prepareStatement(str);
           pst.setString(1, TxtMemberID.getText());

           ResultSet rs;
           rs=pst.executeQuery();
           if (rs.next())
           {
               TxtMemberName.setText(rs.getString("mem_name"));

               //get mem status
                str="select * from lib_transaction where trn_mem_id =? and (trn_receive_dt is null  or trn_receive_dt='')";
                PreparedStatement pst1=connection.prepareStatement(str);
                pst1.setString(1, TxtMemberID.getText());

                ResultSet rs1;
                rs1=pst1.executeQuery();
                if (rs1.next())
                {
                    TxtMemberStatus.setText("Book already issued.");
                    CmdIssueBook.setEnabled(false);
                    CmdBookDetails.setEnabled(false);
                }
                else
                {
                    TxtMemberStatus.setText("No book issued.");
                    CmdIssueBook.setEnabled(true);
                    CmdBookDetails.setEnabled(true);
                }
           }
           else
           {
                JOptionPane.showMessageDialog(null,"Invalid member id.");
                TxtMemberID.setText("");
                TxtMemberName.setText("");
                TxtMemberStatus.setText("");
                CmdIssueBook.setEnabled(false);
                return;
            }
           

        }
        catch (Exception e)
        {
            System.err.println(e);
            System.exit(1);
        }
 
    }//GEN-LAST:event_CmdMemberDetailsActionPerformed

    private void CmdBookDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdBookDetailsActionPerformed
        //get member deatils
                try
        {
            //get database connection details
            MainClass mc=new MainClass();
            
             //open connection
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            String str="";
            str="select * from lib_book_master where book_id =? ";
           PreparedStatement pst=connection.prepareStatement(str);
           pst.setString(1, TxtBookID.getText());

           ResultSet rs;
           rs=pst.executeQuery();
           if (rs.next())
           {
               TxtBookTitle.setText(rs.getString("book_title"));

               //get mem status
                str="select * from lib_transaction where trn_book_id =? and (trn_receive_dt is null  or trn_receive_dt='')";
                PreparedStatement pst1=connection.prepareStatement(str);
                pst1.setString(1, TxtBookID.getText());

                ResultSet rs1;
                rs1=pst1.executeQuery();
                if (rs1.next())
                {
                    TxtBookStatus.setText("Book not available.");
                    CmdIssueBook.setEnabled(false);
                     
                }
                else
                {
                    TxtBookStatus.setText("Book available.");
                    CmdIssueBook.setEnabled(true);
                    
                }
           }
           else
           {
                JOptionPane.showMessageDialog(null,"Invalid book id.");
                TxtBookID.setText("");
                TxtBookTitle.setText("");
                TxtBookStatus.setText("");
                CmdIssueBook.setEnabled(false);
                return;
            }
           

        }
        catch (Exception e)
        {
            System.err.println(e);
            System.exit(1);
        }
    }//GEN-LAST:event_CmdBookDetailsActionPerformed
    
    private void ClearText()
    {
        TxtMemberID.setText("");
        TxtMemberName.setText("");
        TxtMemberStatus.setText("");
        
        TxtBookID.setText("");
        TxtBookTitle.setText("");
        TxtBookStatus.setText("");
        
        CmdIssueBook.setEnabled(false);
        CmdBookDetails.setEnabled(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdBookDetails;
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdIssueBook;
    private javax.swing.JButton CmdMemberDetails;
    private javax.swing.JButton CmdReset;
    private javax.swing.JTextField TxtBookID;
    private javax.swing.JTextField TxtBookStatus;
    private javax.swing.JTextField TxtBookTitle;
    private javax.swing.JTextField TxtMemberID;
    private javax.swing.JTextField TxtMemberName;
    private javax.swing.JTextField TxtMemberStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    
}
