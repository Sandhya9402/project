/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection; 

/**
 *
 * @author ADMIN
 */
public class Myconnection {
     public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cafesystem","root","123456");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
     }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }

