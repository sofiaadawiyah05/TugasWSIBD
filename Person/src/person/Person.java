/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Sofia Adawiyah
 */
public class Person {

    String fName;     
    int stuId;        
    String stuStatus;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student studentku = new student();
        
        //memanggil atribut dan memberi nilai
        studentku.fName    ="Lisa Palombo";
        studentku.stuId    ="123456789";
        studentku.stuStatus="Active";
        
        
        System.out.println ("Student Name   :" + studentku.fName);
        System.out.println ("Student ID     :" + studentku.stuId);
        System.out.println ("Student Status :" + studentku.stuStatus);
        
        
        
    }
    
    
         }
        
        
        
        
        
        
        
            

        
