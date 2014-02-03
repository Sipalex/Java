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
public class JavaDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MySQLConnection mysql= new MySQLConnection();
        //mysql.connect("//195.98.74.37","root","!QAX2wsz");
        mysql.connect("//195.98.74.37","datauser","!QAX2wsz");
        
        
    }
    
}
