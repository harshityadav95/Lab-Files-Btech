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
class sun1
{

        public void display()
        {
            System.out.println("This is sun1");
            
        }
        
                
}
class sun2 extends sun1
{
    public void display()
    {
       super.display();
        System.out.println("This is sun2");
    }
}
public class overriding {
    public static void main(String[] args)
    {
        sun2 obj=new sun2();
        obj.display();
        
        
    }
    
}
