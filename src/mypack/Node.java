package mypack;

/**
 * Created by MocaDD on 2/22/2016.
 */
public class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString()    {
        return name + " are o cheie " + key;
    }
}
