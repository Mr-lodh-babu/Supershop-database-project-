/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shawon
 */
public class Table_database {
    
      public static ArrayList<product_list> newlyaddContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT TOP 5 P_name, vat, price, supplier_company,seller_name FROM product ORDER BY p_entry_date DESC ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }
      public static ArrayList<product_list> offeredContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT TOP 5 P_name, vat, price, supplier_company,seller_name FROM product ORDER BY p_entry_date DESC ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }
      
        public static ArrayList<product_list> groceriesContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'groceries' ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   } 
        
 public static ArrayList<product_list> fru_vegContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'fruits' OR catagory = 'vegetables' ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }       
 
 public static ArrayList<product_list> fi_meContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'fish' OR catagory = 'meat' ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   }  
 
  public static ArrayList<product_list> ToiletriesContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'toiletries'");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   } 
  
  public static ArrayList<product_list> KidsContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'kidsitem'");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   } 
 
  public static ArrayList<product_list> cosmeticsContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'cosmetics' ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   } 
  
    
  public static ArrayList<product_list> othersContent(){
        ArrayList<product_list> list = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");

       //     Statement statement = connection.createStatement();
       //     Connection con = DriverManager.getConnection("jdbc:sqlite:DBs/electronicsDB.db");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT P_name, vat, price, supplier_company,seller_name FROM product WHERE catagory = 'others' ");
            
            product_list pl;
            
            while(rs.next()){
                //byte[] imgData = rs.getBytes("p_image");
                pl = new product_list(rs.getString("P_name"),rs.getDouble("vat"),rs.getDouble("price"),rs.getString("supplier_company"),rs.getString("seller_name"));
                
                list.add(pl);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
   } 
}
