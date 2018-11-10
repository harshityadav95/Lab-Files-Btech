/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;


class length
{
    int l;
    
}
class breadth extends length
{
    int b;
    int area()
    {
        return(l*b);
        
    }
}

/**
 *
 * @author Harshit Yadav
 */
public class simpleinheritance
{
    public static void main(String[] args)
    {
        breadth x = new breadth();
        x.l=1;
        x.b=2;
        System.out.println("The area is "+x.area());
        
        
    }
}
