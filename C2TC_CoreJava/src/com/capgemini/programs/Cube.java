package com.capgemini.programs;
@FunctionalInterface
interface Cubee
{
	int calculate(int a);
}
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=55;
Cubee C=(int a)-> a*a*a;
int result=C.calculate(x);
System.out.println(result);
	}

}
