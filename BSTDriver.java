package binaryTree;

public class BSTDriver {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertBST(new Integer(50));
		bst.insertBST(new Integer(37));
		bst.insertBST(new Integer(64));
		bst.insertBST(new Integer(67));
		bst.insertBST(new Integer(12));
		bst.insertBST(new Integer(84));
		bst.insertBST(new Integer(29));
		bst.insertBST(new Integer(52));
		bst.insertBST(new Integer(280));
		bst.insertBST(new Integer(0));
		bst.insertBST(new Integer(79));
		bst.insertBST(new Integer(1024));
		bst.insertBST(new Integer(13));
		bst.insertBST(new Integer(101));
		bst.insertBST(new Integer(8));
		bst.insertBST(new Integer(42));
		bst.insertBST(new Integer(47));
		bst.insertBST(new Integer(9));
		bst.insertBST(new Integer(24));
		bst.insertBST(new Integer(72));
		
		bst.preOrder();
		System.out.println();
		bst.inOrder();
		System.out.println();
		bst.postOrder();
		System.out.println();
		bst.breadthFirst();
		System.out.println();
		System.out.println(bst.height());
	}	
}	