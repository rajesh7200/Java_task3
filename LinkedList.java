import java.util.*;
class sample 
{

    public static void main(string[] args)
    {
        LinkedList L1=new LinkedList();
        L1.add(10);
        L1.add('a');
        L1.add('a');
        L1.add("java");
        L1.add(true);
        L1.add(null);
        System.out.println(L1.peek());
        System.out.println(L1);

        System.out.println(L1.poll());
        System.out.println(L1);

    }
}