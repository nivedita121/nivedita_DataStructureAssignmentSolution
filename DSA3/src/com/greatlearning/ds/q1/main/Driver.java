package com.greatlearning.ds.q1.main;

import java.util.Scanner;

import com.greatlearning.ds.q1.service.Service;

public class Driver {

	public static void main(String[] args) {
		
		int noFloors;
		int[] floors;
		
		Scanner sc = new Scanner(System.in);
		
		// Enter input
		System.out.println("Enter the No. Of Floors");
		noFloors=sc.nextInt();
		
		floors=new int[noFloors];
		
		for(int i=0; i<noFloors; i++)
		{
			System.out.println("Enter the Floor size on a given day "+(i+1));
			floors[i]=sc.nextInt();
			
		}
		
		// Calling service class for solution
		Service serv= new Service();
		serv.printConTable(floors);
	}

}
