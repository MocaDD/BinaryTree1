package mypack;

/**
 * Created by MocaDD on 2/22/2016.
 */
public class Main {
    public static void main(String[] args)  {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "First");
        theTree.addNode(25, "Vice pres");
        theTree.addNode(15, "Office Manager");

        theTree.traversTree(theTree.root);
    }
}
