package com.greatlearning.q2.main;

import com.greatlearning.q2.service.Node;
import com.greatlearning.q2.service.Service;

public class Driver {

	public static void main(String[] args) {
		
		Service serv= new Service();
		Node node;
		
		node = new Node(50);
		node.left=new Node(30);
		node.right= new Node(60);
		node.left.left= new Node(10);
		node.right.left= new Node(55);
		
		Node Rskewed= serv.completeBSTtoRskwd(node);
		System.out.println("The right Skewed Tree : \n");
		serv.traverseRskwd(Rskewed);
	}

}
