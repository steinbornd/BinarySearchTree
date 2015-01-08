package binaryTree;

public class BinarySearchTree {
	private BinaryTreeNode root;
	
	public BinarySearchTree() {
		this.root = null;
	}	
	
	public BinarySearchTree(BinaryTreeNode root) { 
		this.root = root;
	}

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void insertBST(Integer integer) {
		root = insertBST(root, integer);
	}	
	
	/*
	This private version of insertBST does all the work
	but it is not availabel from outside a BinarySearchTree instance
	For internal use only.
	*/
	private BinaryTreeNode insertBST(BinaryTreeNode node, Integer integer) {
		if (node == null) {
			return new BinaryTreeNode(integer);
		} else if (integer.compareTo((Integer) node.getCargo()) == 0) {
			throw new DuplicateItemException();
		}
		else if (integer.compareTo((Integer) node.getCargo()) < 0) {
			node.setLeftChild(insertBST(node.getLeftChild(),integer));
			return node;
		} else {
			node.setRightChild(insertBST(node.getRightChild(), integer));
			return node;
		}	
	}	
	
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryTreeNode node) {
		if (node != null) {
			System.out.println(node.getCargo());
			preOrder(node.getLeftChild());
			preOrder(node.getRightChild());
		}	
	}

	public void inOrder() {
		inOrder(root);
	}	
	
	private void inOrder(BinaryTreeNode node) {
		if (node != null) {
			inOrder(node.getLeftChild());
			System.out.println(node.getCargo());
			inOrder(node.getRightChild());
		}	
	}	
	
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BinaryTreeNode node) {
		if (node != null) {
			postOrder(node.getLeftChild());
			postOrder(node.getRightChild());
			System.out.println(node.getCargo());
		}	
	}
	
	public void breadthFirst() {
		breadthFirst(root);
	}	
	
	private void breadthFirst(BinaryTreeNode node) {
		Queue queue= new Queue();
		queue.enqueue(node);
		while (!queue.isEmpty()) {
			BinaryTreeNode myNode = (BinaryTreeNode) queue.dequeue();
			System.out.println(myNode.getCargo());
			if (myNode.getLeftChild() != null) {
				queue.enqueue(myNode.getLeftChild());
			}
			if (myNode.getRightChild() != null) {
				queue.enqueue(myNode.getRightChild());
			}	
		}	
	}
	
	public int height(BinaryTreeNode node) {
		if (node == null) {
			return -1;
		} else {
			return 1 + Math.max(height(node.getLeftChild()), height(node.getRightChild()));
		}	
	}

	public int height() {
		if (root == null) {
			return -1;
		} else {
			return 1 +Math.max(height(root.getLeftChild()), height(root.getRightChild()));			
		}
	}	
}	

