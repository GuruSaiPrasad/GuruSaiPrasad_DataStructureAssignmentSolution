package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.services.PrintingBuildings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building"); 
		int floorCount = scan.nextInt();
		int[] floors = new int[floorCount];
		for(int i = 0; i < floorCount; i++) {  
			System.out.println("Enter the floor size  on day: " + (i+1));
			floors[i] = scan.nextInt(); 
		}  
		PrintingBuildings buildings=new PrintingBuildings();
		buildings.printOrder(floors);
	}

}
