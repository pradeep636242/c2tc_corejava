package linkedlist;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ll=new LinkedList<Integer>();
		for(int i=1;i<=5;i++)
		{
			ll.add(i);
		}
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
			System.out.println(ll.get(i)+"");
	}

}
