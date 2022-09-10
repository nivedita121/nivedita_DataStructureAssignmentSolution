package com.greatlearning.q2.service;

public class Service {
	Node prevNode= null;
	Node headNode=null;
	
	public Node completeBSTtoRskwd(Node root) {
		if (root==null) {
			return null;
		}
		completeBSTtoRskwd(root.left);
		
		Node rightNode=root.right;
		
		if(headNode==null) {
			headNode=root;
			root.left=null;
			prevNode=root;
		} else {
			prevNode.right=root;
			root.left=null;
			prevNode=root;
		}
		
		completeBSTtoRskwd(rightNode);
		
		return(headNode);
		
	}
	
	public void traverseRskwd(Node root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.val +" ");
		traverseRskwd(root.right);
	}

}
