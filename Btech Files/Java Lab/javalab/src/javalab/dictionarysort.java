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
public class dictionarysort {
    
    public static void main (String[] args)
    {
        String arr[]={"Delhi","Mumbai","Bombay","Ahemdabad"};
        String temp;
        for(int i=0;i<arr.length;i++)
        {
            temp=arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(i==j) continue;
                int x=temp.compareTo(arr[j]);
                if(x<0)
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    
                }
            }
        }
        
    }
    
}
