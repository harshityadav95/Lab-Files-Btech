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
public class bytestream {
    
    public static void main (String[] args)
    {
        try{
            
        FileInputStream infile=new FileInputStream("H:\\input1.txt");
        FileOutputStream outfile=new FileOutputStream("H:\\output1.txt");
        
        byte byteread=0;
        while(byteread!=-1)
        {
            byteread=(byte)infile.read();
            outfile.write(byteread);
        }
        infile.close();
        outfile.close();
             
                
                
        }
        catch(IOException e)
        {
            System.out.println("Exception found");
        }
    }
    
}
