import java.util.*;

public class TreeTraversal extends BinaryTree{
    public static void main(String[] args){
    // Create a tree called tree1 
        BinaryTree<Character> tree1 = new BinaryTree('H');
        BinaryTree<Character> rightsubtree1 = new BinaryTree('X'); 
        rightsubtree1.attachRight('Y');

        BinaryTree<Character> leftsubtree1 = new BinaryTree('D'); 
        leftsubtree1.attachLeft('B');

        BinaryTree<Character> leftsubtree2 = new BinaryTree('F'); 
        leftsubtree2.attachRight('G'); 
        leftsubtree2.attachLeft('E');

        leftsubtree1.attachRightSubtree(leftsubtree2); 
        tree1.attachLeftSubtree(leftsubtree1);
        tree1.attachRightSubtree(rightsubtree1);

        BinaryTree<Character> tree2 = new BinaryTree('F');
        BinaryTree<Character> tree2rightsub1 = new BinaryTree('G');
        BinaryTree<Character> tree2rightsub2 = new BinaryTree('I');
        tree2rightsub2.attachLeft('H');

        BinaryTree<Character> tree2leftsub1 = new BinaryTree('B');
        tree2leftsub1.attachLeft('A');

        BinaryTree<Character> tree2leftsub2 = new BinaryTree('D');
        tree2leftsub2.attachLeft('C');
		tree2leftsub2.attachRight('E');
		
		tree2rightsub1.attachRightSubtree(tree2rightsub2);
		tree2leftsub1.attachRightSubtree(tree2leftsub2);
		tree2.attachLeftSubtree(tree2leftsub1);
		tree2.attachRightSubtree(tree2rightsub1);
		
		
		System.out.println(checkSkipped(tree1)); // Should return true
        System.out.println(checkSkipped(tree2)); // Should return false
    }
    
    public static boolean checkSkipped(BinaryTree<Character> tree){ 
        // To Iterate a tree using Inorder Traversal
        Boolean check = true;
		TreeIterator<Character> iter = new TreeIterator<Character>(tree);
		ArrayList<Character> list = new ArrayList<Character>();
        iter.setInorder();

        while (iter.hasNext()){
            char c = iter.next();
			list.add(c);
            System.out.print(c); 
		}
		System.out.print(": ");

        for(int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                if(((int)list.get(i) - (int)list.get(i+1)) == 1){
                    check = false;
                }else{
                    check = true;
                    break;
                }
            }else if(list.get(i+1) > list.get(i)){
                if(((int)list.get(i+1) - (int)list.get(i)) == 1){
                    check = false;
                }else{
                    check = true;
                    break;
                }
            }
        }
        return check; 
    }
}