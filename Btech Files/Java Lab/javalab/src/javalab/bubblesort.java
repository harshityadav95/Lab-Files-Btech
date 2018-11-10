/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;

import java.util.*;

/**
 *
 * @author Harshit Yadav
 */
public class bubblesort {
    
    public static void main(String[] args)
    {
        int a[]={1,3,53,86,324,52,12};
        int size=a.length;
        for(int i=0;i<=size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                    
                }
            }
                
                
        }
        for(int i=0;i<a.length;i++)
       {
           System.out.println(a[i]);
       }  

        
    }
    
}
