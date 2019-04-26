/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supershop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class GetCurrentDateTime {

    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
        
          try{
                Connection con = null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=supershop;integratedSecurity=true");
                Statement st = con.createStatement();
           //     int i= st.executeUpdate("INSERT INTO product(p_entry_date) VALUES ('"+ sdf.format(date) +"')");
                int i= st.executeUpdate("UPDATE product SET p_entry_date = ('"+ sdf.format(date) +"') WHERE p_ID = 'p_03'");
                JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
                st.close();
                con.close();

            }
            catch(Exception e){
                System.out.println(e);
            }

    }

}