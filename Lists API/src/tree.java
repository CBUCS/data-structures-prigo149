

import java.util.LinkedList;
import java.util.Queue;

public class tree {

	 Node root;
	
	//Method to add nodes in sorted order in tree
	private Node addRecursive(Node current, int value) {
	    if (current == null) {
	        return new Node(value);
	    }
	 
	    if (value < current.value) {
	        current.left = addRecursive(current.left, value);
	    } else if (value > current.value) {
	        current.right = addRecursive(current.right, value);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	//method to add nodes
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	private boolean containsNodeRecursive(Node current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	public boolean find(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	public static boolean DFS(Node rot, int k){    
	    if(rot == null){
	        return false;
	    } else if (rot.value == k){
	        return true;
	    } else {
	        return DFS(rot.left, k) || DFS(rot.right, k);
	    }
	}
	
	public boolean DFS(int k) {
	    return recurseDFS(root, k);
	}

	private boolean recurseDFS(Node node, int k) {

	    if(node == null) {
	        return false;
	    }
	    return node.value == k || recurseDFS(node.left, k) || recurseDFS(node.right, k);

	} 
	
	

	Queue<Node> queue = new LinkedList<Node>() ;
	public boolean bfs(int k) {
	    if (root == null)
	        return false;
	    queue.clear();
	    queue.add(root);
	    while(!queue.isEmpty()){
	        Node node = queue.remove();
	        if(node.value==k)
	        	return true;
	        if(node.left != null) queue.add(node.left);
	        if(node.right != null) queue.add(node.right);
	    }
         return false;
	}
	
	
	
}
