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
public class largestinarray 
{
    
    public static void main(String[] args)
    {
        int a[]={1,2,3,45};
        int even=0,odd=0;
        for(int i=0;i<a.length;i++)
        {
                            if(a[i]%2==0)
                    even++;
                else
                    odd++; 
                

        }
        System.out.println("The no.of even :"+even+"  odd : "+odd);
        System.out.println("Even Numbers :");

        
    }
    
}
