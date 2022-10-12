import java.util.*;
class sample 
{

    public static void main(string[] args)
    {
        Vector L1=new Vector();
        L1.add(10);
        L1.add('a');
        L1.add('a');
        L1.add("java");
        L1.add(true);
        L1.add(null);
        System.out.println(L1.capacity());
        
        System.out.println(L1);

    }
}