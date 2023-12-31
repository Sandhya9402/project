
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.util.Calendar;
import java.util.Date;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class SellMedicine extends javax.swing.JFrame {

    public String numberPattern = "^[0-9]*$";
private int finalTotalPrice=0;
private String billId="";
private String Username="";
    /**
     * Creates new form SellMedicine
     */
    public SellMedicine() {
        initComponents();
    }

    public SellMedicine(String tempUsername) {
        initComponents();
        Username=tempUsername;
        setLocationRelativeTo(null);
    }
    
    private void medicineName(String NameOruniqueId){
     DefaultTableModel model = (DefaultTableModel) medicinesTable.getModel();
     model.setRowCount(0);
     try{
     Connection con=Myconnection.getConnection();
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select *from medicine where Name like '"+NameOruniqueId+"%' or uniqueId like '"+NameOruniqueId+"%'");
     while(rs.next()){
         model.addRow(new Object[]{rs.getString("uniqueId")+"- "+rs.getString("Name")});
     }
     }
     catch(Exception e){ 
         JOptionPane.showMessageDialog(null,e);
     }
    }

    private void clearMedicineFields(){
        textUniqueId.setText("");
        textName.setText("");
        textCompanyName.setText("");
        textPriceperunit.setText("");
        textNoOfUnits.setText("");
        textTotalPrice.setText("");
    }
    
    public String getUniqueId(String prefix){
        return prefix + System.nanoTime();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinesTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        textUniqueId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textCompanyName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textPriceperunit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textNoOfUnits = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textTotalPrice = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblFinalTotalPrice = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sell Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 15, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 1366, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 102, 53, -1));

        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });
        getContentPane().add(textSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 132, 300, 30));

        medicinesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicines"
            }
        ));
        medicinesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinesTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 180, 300, 570));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Medicine ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 117, -1, -1));

        textUniqueId.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        getContentPane().add(textUniqueId, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 142, 300, 31));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 191, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Company Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 267, -1, -1));

        textCompanyName.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        getContentPane().add(textCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 308, 300, 30));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price per unit");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 117, -1, -1));

        textPriceperunit.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        getContentPane().add(textPriceperunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 142, 300, 30));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No.Of Units");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 190, -1, -1));

        textNoOfUnits.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        textNoOfUnits.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textNoOfUnitsKeyReleased(evt);
            }
        });
        getContentPane().add(textNoOfUnits, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 217, 300, 31));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 266, -1, -1));

        textTotalPrice.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        getContentPane().add(textTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 307, 300, 31));

        textName.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        getContentPane().add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 218, 300, 31));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Name", "Company Name", "Price per unit", "No Of Units", "Total Price"
            }
        ));
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cartTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 419, 748, 278));

        btnAddToCart.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 356, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 717, -1, -1));

        lblFinalTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFinalTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblFinalTotalPrice.setText("00");
        getContentPane().add(lblFinalTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(845, 717, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill & print.png"))); // NOI18N
        jButton2.setText("Purchase and Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1056, 724, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminDashboardBackground - Copy.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        medicineName(""); 
        textUniqueId.setEditable(false);
        textName.setEditable(false);
        textCompanyName.setEditable(false);
        textPriceperunit.setEditable(false);
        
        textTotalPrice.setEditable(false);
    }//GEN-LAST:event_formComponentShown

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        // TODO add your handling code here:
        String Search=textSearch.getText();
        medicineName(Search);
    }//GEN-LAST:event_textSearchKeyReleased

    private void medicinesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinesTableMouseClicked
        // TODO add your handling code here:
        int index=medicinesTable.getSelectedRow();
        TableModel model=medicinesTable.getModel();
        String NameOrUniqueId=model.getValueAt(index,0).toString();
        
        String uniqueId[]=NameOrUniqueId.split("-",0); 
        try{
        Connection con=Myconnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from medicine where uniqueId="+uniqueId[0]+"");
        while(rs.next()){
            textUniqueId.setText(uniqueId[0]);
            textName.setText(rs.getString("Name"));
            textCompanyName.setText(rs.getString("CompanyName"));
            textPriceperunit.setText(rs.getString("Priceperunit"));
            textNoOfUnits.setText("");
            textTotalPrice.setText("");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }//GEN-LAST:event_medicinesTableMouseClicked

    private void textNoOfUnitsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNoOfUnitsKeyReleased
        // TODO add your handling code here:
        String NoOfUnits=textNoOfUnits.getText();
        if(!NoOfUnits.equals("")){
            String Priceperunit=textPriceperunit.getText();
            if(!NoOfUnits.matches(numberPattern)){
                JOptionPane.showMessageDialog(null,"Number of Units field is invalid");
                
            }
            int TotalPrice=Integer.parseInt(NoOfUnits) * Integer.parseInt(Priceperunit);
            textTotalPrice.setText(String.valueOf(TotalPrice));
        }
        else{
            textTotalPrice.setText("");
        }
    }//GEN-LAST:event_textNoOfUnitsKeyReleased

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        String NoOfUnits=textNoOfUnits.getText();
        String uniqueId=textUniqueId.getText();
        
        if(!NoOfUnits.equals("") && !uniqueId.equals("")){
            String Name =textName.getText();
            String CompanyName =textCompanyName.getText();
            String Priceperunit =textPriceperunit.getText();
            String TotalPrice=textTotalPrice.getText();
            int checkStock=0;
            int checkMedicineAlreadyExistInCart=0;
            
            try{
            Connection con=Myconnection.getConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select *from medicine where uniqueId="+uniqueId+"");
             while(rs.next()){
                 if(rs.getInt("Quantity") >= Integer.parseInt(NoOfUnits)){
                     checkStock=1;
                 }else{
                     JOptionPane.showMessageDialog(null, "Medicine is our of stock. Only "+rs.getInt("Quantity")+" Left");
                 }
                 
             }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            if(checkStock==1){
                DefaultTableModel dtm = (DefaultTableModel)cartTable.getModel();
                if(cartTable.getRowCount() !=0){
                    for(int i=0;i<cartTable.getRowCount();i++){
                         if(Integer.parseInt(dtm.getValueAt(i,0).toString()) == Integer.parseInt(uniqueId)){
                              checkMedicineAlreadyExistInCart = 1;
                              JOptionPane.showMessageDialog(null,"Medicine already exists in cart");
                         }
                    }
                }
                if(checkMedicineAlreadyExistInCart == 0){
                    dtm.addRow(new Object[]{uniqueId,Name,CompanyName,Priceperunit,NoOfUnits,TotalPrice});
                    finalTotalPrice=finalTotalPrice+Integer.parseInt(TotalPrice);
                    lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null, "Added Successfully");
                }
                clearMedicineFields();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No Of Units and Medicine ID Field is required");
        }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        // TODO add your handling code here:
        int index = cartTable.getSelectedRow();
        int a=JOptionPane.showConfirmDialog(null,"Do you want to remove this Medicine","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            TableModel model=cartTable.getModel();
            String total=model.getValueAt(index,5).toString();
            finalTotalPrice=finalTotalPrice - Integer.parseInt(total);
            lblFinalTotalPrice.setText(String.valueOf(finalTotalPrice));
            ((DefaultTableModel) cartTable.getModel()).removeRow(index);
        }
    }//GEN-LAST:event_cartTableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(finalTotalPrice!=0){
            billId=getUniqueId("Bill-");
            
            DefaultTableModel dtm = (DefaultTableModel) cartTable.getModel();
            if(cartTable.getRowCount() !=0){
                for(int i=0;i<cartTable.getRowCount();i++){
                    try{
                        Connection con=Myconnection.getConnection();
                        Statement st=con.createStatement();
                        st.executeUpdate("update medicine set Quantity=Quantity-"+Integer.parseInt(dtm.getValueAt(i,4).toString()) + " where uniqueId="+Integer.parseInt(dtm.getValueAt(i,0).toString()));
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try{
                SimpleDateFormat myFormat=new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal=Calendar.getInstance();
                Connection con=Myconnection.getConnection();
                PreparedStatement ps=con.prepareStatement("insert into bill(billId,billDate,totalPaid,generatedBy) values(?,?,?,?)");
                ps.setString(1,billId);
                ps.setString(2,myFormat.format(cal.getTime()));
                ps.setInt(3,finalTotalPrice);
                ps.setString(4,Username);
                ps.executeUpdate(); 
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
         //create bill
         com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
         try{
         PdfWriter.getInstance(doc,new FileOutputStream(PharmacyUtils.billPath+""+billId+".pdf"));
         doc.open(); 
         Paragraph pharmacyName=new Paragraph("                                              Pharmacy Management System\n");
         doc.add(pharmacyName);
         Paragraph starLine=new Paragraph("**************************************************************************");
         doc.add(starLine);
          Paragraph details=new Paragraph("\tBill ID: "+billId+"\nDate: "+new Date()+"\nTotal Paid: "+finalTotalPrice);
         doc.add(details);
         doc.add(starLine);
         PdfPTable tb1 = new PdfPTable(6);
             tb1.addCell("Medicine ID");
             tb1.addCell("Name");
             tb1.addCell("Company Name");
             tb1.addCell("Price per Unit");
             tb1.addCell("No Of Units");
             tb1.addCell("Sub Total Price");
             for(int i=0;i<cartTable.getRowCount();i++)
             {
                 String a=cartTable.getValueAt(i,0).toString();
                 String b=cartTable.getValueAt(i,1).toString();
                 String c=cartTable.getValueAt(i,2).toString();
                 String d=cartTable.getValueAt(i,3).toString();
                 String e=cartTable.getValueAt(i,4).toString();
                 String f=cartTable.getValueAt(i,5).toString();
                 tb1.addCell(a);
                 tb1.addCell(b);
                 tb1.addCell(c);
                 tb1.addCell(d);
                 tb1.addCell(e);
                 tb1.addCell(f);
               
             }
             doc.add(tb1);
             doc.add(starLine);
             Paragraph thanksMsg = new Paragraph("Thank You! Please visit again");
             doc.add(thanksMsg);
             OpenPdf.openById(String.valueOf(billId));
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }
         doc.close();
         setVisible(false);
         new SellMedicine(Username).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please add some Medicine to cart");
    }//GEN-LAST:event_jButton2ActionPerformed
    }
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
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFinalTotalPrice;
    private javax.swing.JTable medicinesTable;
    private javax.swing.JTextField textCompanyName;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textNoOfUnits;
    private javax.swing.JTextField textPriceperunit;
    private javax.swing.JTextField textSearch;
    private javax.swing.JTextField textTotalPrice;
    private javax.swing.JTextField textUniqueId;
    // End of variables declaration//GEN-END:variables
}
