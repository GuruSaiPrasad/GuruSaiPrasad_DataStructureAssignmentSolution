package com.greatlearning.services;

import java.util.Stack;

public class PrintingBuildings {
public void printOrder(int[] floors) {
		
		
		
		Stack<Integer> stack = new Stack<Integer>();

		int maxSizeOfFloor = floors.length;

		for (int i = 0; i < floors.length; i++) {

			System.out.println("Day: " + (i+1));

			stack.add(floors[i]);

			while (!stack.isEmpty() && stack.peek() == maxSizeOfFloor) {
				System.out.print(stack.pop() + " ");
				maxSizeOfFloor--;
			}

			System.out.println();

		}
	}
}
