/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Harshit Yadav
 */
public class swings extends JFrame {
    
    JFrame f=new JFrame("Tables");
    swings()
    {
            String a[][]={{"1","A"},{"2","B"}};
            String col[]={"roll","name"};
            JTable t=new JTable(a,col);
            t.setBounds(20,20,100,100);
            f.add(t);
            f.setBounds(100,100,100,100);
            f.setVisible(true);
            f.setLayout(null);
            
                    
    }
    public static void main(String[] args)
    {
        swings obj=new swings();
    }
    
    
}
