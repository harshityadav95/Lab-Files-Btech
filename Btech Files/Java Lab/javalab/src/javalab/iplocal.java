/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import java.net.*;


/**
 *
 * @author Harshit Yadav
 */
public class iplocal {
    
    public static void main(String[] args)
    {
        try{
        InetAddress ad=InetAddress.getLocalHost();
        String hostnam=ad.getHostName();
        System.out.println(ad.getHostAddress()+hostnam);
        
        }
        catch(Exception e)
        {
            
        }
    }
    
}
