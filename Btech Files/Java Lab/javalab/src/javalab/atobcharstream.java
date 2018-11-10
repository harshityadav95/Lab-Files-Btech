/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import java.io.*;

/**
 *
 * @author Harshit Yadav
 */
public class atobcharstream {
    public static void main(String[] args)
    {
        File fin=new File("‪H:\\input1.txt");
        File fout=new File("‪H:\\output1.txt");
        
       
        try{
            
             FileReader ins=new FileReader(fin);
             FileWriter ons=new FileWriter(fout);
            int ch;
            while((ch=ins.read())!=-1)
            {
                ons.write(ch);
            }
            ins.close();
            ons.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception found");
        }
               
    }
    
}
