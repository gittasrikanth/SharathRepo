package com.dss;

public class Demo1 {
	
	
	public void m1(int x)
	{
		System.out.println(x*x);
	}
	
	public void m2(int y)
	{
		System.out.println(y*y*y);
	}
	
	public void m3(int y)
	{
		System.out.println(y*y*y*y);
	}
	
	
	public void m4(int k)
	{
		System.out.println(k*k*k*k);
	}

	
	public void m5(int u)
	{
		System.out.println(u*u*u*u*u);
	}
	

	public void m7(int m)
	{
		System.out.println(m*m*m*m*m*m*m);
	}
	public static void main(String[] args) {
		Demo1 demo2=new Demo1();
		Demo1 demo1=new Demo1();
		
		demo1.m1(50);
		
		demo1.m2(60);
		demo1.m3(60);
		demo1.m5(5);
		
		demo1.m4(609);
		
		
		
		
	}

}
