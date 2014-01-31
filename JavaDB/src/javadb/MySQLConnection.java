/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javadb;

/**
 *
 * @author asipachev
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLConnection {
    
    public void connect(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        pln("Driver loading success");
        
        String url=("jdbc:mysql://195.98.74.37/vrndor");
        //String url=("jdbc:mysql://bora.beget.ru");
        String name = "datauser";
        String password = "!QAX2wsz";
        
        try{
            Connection con = DriverManager.getConnection(url,name,password);
            pln("Connected");
            con.close();;
            pln("disonnected");
                        
        }catch (SQLException e){
            e.printStackTrace();
        }
        
        }catch (ClassNotFoundException e){
            pln(e);
        }
        
    }
    public void pln (Object s){
        System.out.println(s);
    }
}
