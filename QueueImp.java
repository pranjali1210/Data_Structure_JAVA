import java.util.LinkedList;
import java.util.Queue;
public class QueueImp 
{
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Queue Elements : "+q);
        System.out.println("Queue Size : "+q.size());
        q.remove(10);
        System.out.println("After Removing 10 from Queue : "+q);
        System.out.println("Recent Element in Queue:  "+q.peek());
    }
}
