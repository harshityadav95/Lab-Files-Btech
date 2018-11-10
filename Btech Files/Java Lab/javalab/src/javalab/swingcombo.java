/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Harshit Yadav
 */
public class swingcombo extends JFrame {
    
    swingcombo(int q)
    {
       f=new JFrame();
        DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color=new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode font=new DefaultMutableTreeNode("Font");
        style.add(color);
        style.add(font);
        DefaultMutableTreeNode red=new DefaultMutableTreeNode("Red");
        DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Blue");
        DefaultMutableTreeNode green=new DefaultMutableTreeNode("Green");
        DefaultMutableTreeNode yellow=new DefaultMutableTreeNode("Yellow");
        color.add(red);
        color.add(blue);
        color.add(green);
        color.add(yellow);
        JTree jt=new JTree(style);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);

    }   
    
    public static void main(String args[])
    {
        swingcombo ob=new swingcombo(1);
    }
    
    
    
    
}
