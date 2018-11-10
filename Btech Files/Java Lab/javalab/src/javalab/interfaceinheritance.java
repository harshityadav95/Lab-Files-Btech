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
class a1
{
    public int a;
}
interface b1
{
    public int id=1;
    void display();
}
class c extends a1 implements b1
{
    public void display()
    {
        System.out.println("Interface implemented ");
    }
}
public class interfaceinheritance {
    
    public static void main(String[] args)
    {
        c obj=new c();
        obj.display();
        
    }
    
}
