/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import java.applet.*;
import java.awt.*;
/**
 *
 * @author Harshit Yadav
 */

public class Helloapplet extends Applet {
    
     public void init()
    {
        Frame f=new Frame();
        List l=new List(1);
        l.setBounds(100,100,75,75);
        l.add("Harshit");
        f.add(l);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
        
        
    }
            
    
}
