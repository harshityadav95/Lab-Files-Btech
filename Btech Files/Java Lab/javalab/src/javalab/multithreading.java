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
class run extends Thread
{
    public void display()
    {
        try
        {
            System.out.println("A");
            Thread.sleep(1000);
        }
        catch(Exception e)
        {
            Thread.currentThread().yield();
            
        }
    }
    
}
public class multithreading {
    public static void main (String[] args)
    {
        run obj=new run();
        obj.start();
        obj.display();
        obj.stop();
        
        
        
        
    }
    
}
