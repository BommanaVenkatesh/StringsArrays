package Comparable;

import java.util.Arrays;

class Circle implements Comparable
{
	int radius;
	public Circle(int r)
	{
		radius=r;
	}
	@Override
	public int compareTo(Object arg)
	{
		return radius-((Circle)arg).radius;
	}
	@Override
	public String toString()
	{
		return "Circle radius="+radius;
	}
}
public class CircleDemo {

	public static void main(String[] args) {
       Circle[] a=new Circle[5];
       a[0]=new Circle(40);
       a[1]=new Circle(60);
       a[2]=new Circle(10);
       a[3]=new Circle(30);
       a[4]=new Circle(50);
       Arrays.sort(a);
       for(Circle c:a)
    	   System.out.println(c);
	}
}
