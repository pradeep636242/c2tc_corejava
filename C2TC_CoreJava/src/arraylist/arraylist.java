package arraylist;
import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<String>();
		System.out.println("adding ellement to end of list");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println("arraylist instion order"+list);
		
		System.out.println("adding element at a specific index at ==after B element");
		list.add(2,"z");

		System.out.println("arraylist instion order"+list);
		list.remove(2);
		System.out.println("arraylist instion order"+list);
		list.add(5,"f");
		System.out.println("arraylist instion order"+list);
	}

}
