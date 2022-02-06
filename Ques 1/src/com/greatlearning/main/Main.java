package com.greatlearning.main;


import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("Enter the number of floors");
		int floor=scan.nextInt();
		Queue<Integer> queue=new LinkedList<>();
		for(int i=0;i<floor;i++) {
			System.out.println("Enter the floor size given on day "+(i+1));
			Integer building=scan.nextInt();
			queue.add(building);
			
		}
		for(int i=0;i<floor;i++) {
			System.out.println("The Day"+(i+1)+" "+queue.remove());
			
		}
			
		}
	

	}


