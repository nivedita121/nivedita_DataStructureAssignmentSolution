package com.greatlearning.ds.q1.service;

import java.util.PriorityQueue;


public class Service {
	public void printConTable(int floor[]) {
		PriorityQueue<Integer> queue= new PriorityQueue<>(java.util.Collections.reverseOrder());
		
		int max= floor.length;
		
		System.out.println("The order of construction is as follows \n");
		
		for(int i=0; i< floor.length; i++) {
			System.out.println("Day "+(i+1));
			// filling queue with floor information arranging  highest floor on top
			queue.add(floor[i]);
			
			// printing floor info when queue top matches the max
			while(!queue.isEmpty() && queue.peek()==max) {
				System.out.print(queue.poll()+" ");
				max=max-1;
			}
			System.out.println();
		}
		
	}

}
