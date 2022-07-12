package Generic;
import java.io.*;
import java.util.*;

class GenericClass<T>
{
	GenericClass()
	{
		System.out.println("This is generic class");
	}
	public void methodgeneric(T obj)
	{
		System.out.println("The type of the object is"+obj.getClass().getSimpleName());
		
	}
}



public class GenericType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GenericClass<Integer>A=new GenericClass<>();
Integer B=6;
A.methodgeneric(B);

	}

}
