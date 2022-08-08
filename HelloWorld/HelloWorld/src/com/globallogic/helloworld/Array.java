package com.globallogic.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;
public class Array {
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		List<String>cars = new ArrayList<String>();
		cars.add("Maruti");
		cars.add("Suzuki");
		cars.add("Hero");
		cars.add("Honda");
		Collections.sort(cars);
		Iterator<String> it=cars.iterator();
		
		do
		{
			System.out.println("element is "+it.next());
		}
		while(it.hasNext());
		
		
		
	}

}
