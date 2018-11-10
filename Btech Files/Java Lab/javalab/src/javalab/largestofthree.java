/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

/**
 *
 * @author Harshit Yadav
 */
public class largestofthree {
    
    public static void main(String[] args)
    {
        int a=11;
        int b=33;
        int c =22;
        if(a>b && a>c)
        {
                System.out.println("A is the largest number");
                
        }
        else if(b>c && b>a)
        
        {
            System.out.println("B is the largest");
        }
        else if(c>a  && c>b)
        {
            System.out.println("C is the largest number");
        }
             
        
        
               
    }
    
}
