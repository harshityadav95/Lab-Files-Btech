/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

/**
 *
 * @author Harshit Yadav
 */
class multithreading extends Thread
{
    public void run ()
    {
        System.out.println("Thread Started...");
        try
        {
            for(int i=1;i<5;i++)
            {
            	Thread.sleep(1000);		// 1 second
    		System.out.println("Thread is Running... "+i);
               //    Thread.Stop();
            }
        }  
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        
        

    }
}
public class Applet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Main Method started");
        multithreading m=new multithreading();
        m.start();
        
        
        
        
        // TODO code application logic here
    }
    
}
