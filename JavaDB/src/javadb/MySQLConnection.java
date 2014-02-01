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
import java.sql.Statement;


public class MySQLConnection {
    
    private final static String createDatabaseQuery="CREATE DATABASE bookstore CHARACTER SET utf8 COLLATE utf8_general_ci";
    
    
    public void connect(String parturl, String user, String password){
        Connection connection = null;
        Statement statement = null;
        
        
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        pln("Driver loading success");
        
        //String url=("jdbc:mysql://195.98.74.37/vrndor");
        String url=("jdbc:mysql:"+parturl);
        //String url=("jdbc:mysql://bora.beget.ru");
               
        
            try{
                connection = DriverManager.getConnection(url,user,password);
                pln("Connected");
                statement = connection.createStatement();
                
                /*connection.close();;
                pln("disonnected");*/
                statement.executeUpdate(createDatabaseQuery);
                

            }catch (Exception e){
                e.printStackTrace();
            }finally{
                if(statement!=null){
                  try{
                      statement.close();
                  } catch (SQLException e){
                      e.printStackTrace();
                      
                  }
                }
                if (connection != null){
                    try{
                        connection.close();
                    }catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        
        }catch (ClassNotFoundException e){
            pln(e);
        }
        
    }
    public void pln (Object s){
        System.out.println(s);
    }
}
