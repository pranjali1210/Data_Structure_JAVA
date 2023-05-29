import java.util.Stack;
public class StackImp
{
	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("Is stack empty ? :"+s.empty());
		System.out.println("Top most Element of Stack : "+s.peek());
		s.pop();
		System.out.println("After Removing topmost element from stack : "+s);
		System.out.println("Position of Element 40 in stack : "+s.search(40));
		System.out.println("Position of Element 20 in stack : "+s.search(20));
		
		
	}
}
