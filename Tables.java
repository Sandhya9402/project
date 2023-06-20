
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = Myconnection.getConnection();
            Statement st = con.createStatement();
            //st.executeUpdate("create table caferegisterpage(caferegisterpage_pk int AUTO_INCREMENT primary key,UserRole varchar(200),Name varchar(200),DateofBirth varchar(200),MobileNumber varchar(200),Email varchar(200),UserName varchar(200),Password varchar(200),Address varchar(200))");
            //st.executeUpdate("insert into caferegisterpage(UserRole,Name,DateofBirth,MobileNumber,Email,Username,Password,Address)values('Admin','Deepak2','2013-05-02','1234567891','deepak1@gmail.com','Admin','deepak','123')");
            //st.executeUpdate("create table medicine(medicine_pk int AUTO_INCREMENT primary key,uniqueId varchar(200),Name varchar(200),CompanyName varchar(200),Quantity bigint,Priceperunit bigint) ");
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
