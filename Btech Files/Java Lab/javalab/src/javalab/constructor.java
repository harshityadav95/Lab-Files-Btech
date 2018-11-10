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
class kk
{
    int l,b;
    kk(int x, int y)
    {
        l=x;
        b=y;
    }
    int roomarea()
    {
        return (l*b);
    }
}
public class constructor {
    
    public static void main(String[] args)
    {
        kk a=new kk(1,2);
        System.out.println(""+a.roomarea());
        
    }
    
}
