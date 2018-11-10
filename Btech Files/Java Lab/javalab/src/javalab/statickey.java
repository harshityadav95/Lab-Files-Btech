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
class stat
{
    public int a,b,c,d;
    static int r=2;
    stat(int u,int x,int y,int z)
    {
        a=u;
        b=x;
        y=c;
        z=d;
       
    }
    void display()
    {   
        System.out.println("Nesting");
    }
    int area(int u,int v)
    {
        display();
        return(u*v*r);
    }
    int area(int u, int v, int w)
    {
        return(u*v*w*r);
    }
}
public class statickey {
    
    public static void main(String[]  args)
    {
         stat obj=new stat(1,2,3,4);
        System.out.println(""+obj.area(1,2));
        System.out.println(""+obj.area(1,2,3));
    
    }
    
}
