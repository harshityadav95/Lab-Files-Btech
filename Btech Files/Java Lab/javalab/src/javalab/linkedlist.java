package exp3;
import java.util.*;  
public class linkedlist
{  
    public static void main(String args[])
    {  
        LinkedList al=new LinkedList();  
        al.add("Android");  
        al.add("IOS");  
        al.add("Windows");  
        al.add("Linux");  
        Iterator itr=al.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
    }  
}  
