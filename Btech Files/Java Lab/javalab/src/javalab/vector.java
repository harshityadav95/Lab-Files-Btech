package exp3;
import java.util.*;      
class vector
{      
    public static void main(String args[])
    {      
        Vector v=new Vector();  
        v.add("Delhi");  
        v.addElement("Mumbai"); 
        v.addElement("Kolkata");
        v.addElement("Banglore");
        Enumeration e=v.elements();  
        while(e.hasMoreElements())
        {  
            System.out.println(e.nextElement());  
        }  
    }      
}      
