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
class overload
{
    public int a,b,c,d;
    overload(int u,int x,int y,int z)
    {
        a=u;
        b=x;
        y=c;
        z=d;
       
    }
    int area(int u,int v)
    {
        return(u*v);
    }
    int area(int u, int v, int w)
    {
        return(u*v*w);
    }
}
public class overloading {
    
    public static void main(String[] args)
    {
        overload obj=new overload(1,2,3,4);
        System.out.println(""+obj.area(1,2));
        System.out.println(""+obj.area(1,2,3));
        
        
    }
    
}
