import java.util.*;
class sample 
{

    public static void main(string[] args)
    {
        PriorityQueue L1=new PriorityQueue();
        L1.add(10);
        L1.add(1);
        L1.add(2);
        L1.add(4);
        L1.add(9);
        L1.add(5);
        System.out.println(L1.peek());
        System.out.println(L1);

        System.out.println(L1.poll());
        System.out.println(L1);
    }
}