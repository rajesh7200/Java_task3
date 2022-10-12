import java.util.*;
class sample 
{

    public static void main(string[] args)
    {
        Arraylist L1=new Arraylist();
        L1.add(10);
        L1.add('a');
        L1.add('a');
        L1.add("java");
        L1.add(true);
        L1.add(null);
        System.out.println("Before" +L1);
        L1.add(3,'b');
        System.out.println("After"+L1);

    }
}