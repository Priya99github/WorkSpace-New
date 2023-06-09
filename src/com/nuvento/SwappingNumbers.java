package com.nuvento;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a = 30;
		int b = 20;
		System.out.println("Numbers Before Swapping : a="+a+", b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers After Swapping : a="+a+", b="+b);
	}

}
