package mypack;

/**
 * Created by MocaDD on 2/22/2016.
 */
public class BinaryTree {

    Node root;

    public void addNode(int key, String name)   {

        Node newNode = new Node(key, name);

        if (root == null)   {

            root = newNode;
        } else {

            Node focusNode = root;

            Node parent;

            while (true)    {

                parent = focusNode;
                if (key < parent.key)   {
                    focusNode = parent.leftChild;

                    if (focusNode == null)  {
                        parent.leftChild = newNode;
                        return;
                    }
                } else  {
                    focusNode = parent.rightChild;

                    if (focusNode == null)  {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void traversTree(Node focusNode) {
        if (focusNode != null)  {

            traversTree(focusNode.leftChild);

            System.out.println(focusNode);

            traversTree(focusNode.rightChild);
        }
    }

    public boolean remove(int key)  {

        Node focusNode = root;
        Node parent = root;

        boolean isItAtLeft = true;

        while (focusNode.key != key)    {

            parent = focusNode;

            if (key < focusNode.key)    {

                isItAtLeft = true;
                focusNode = focusNode.leftChild;
            }   else    {

                isItAtLeft = false;
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null)  {
                return false;
            }
        }

        if (focusNode.leftChild == null && focusNode.rightChild == null)    {   // n-a avut copii
            if (focusNode == root)  {
                root = null;
            } else  if (isItAtLeft) {

                parent.leftChild = null;
            } else  {
                parent.rightChild = null;
            }
        }
        else if (focusNode.rightChild == null)  {   //n-are copil la dreapta
            if (focusNode == root)  // sterg si mut radacina la cel din stanga.
                root = focusNode.leftChild;
            else if (isItAtLeft)
                parent.leftChild = focusNode.leftChild;
            else
                parent.rightChild = focusNode.rightChild;
        }

        else if (focusNode.leftChild == null)    {
            if (focusNode == root)
                root = focusNode.rightChild;
            else if (isItAtLeft)
                parent.leftChild = focusNode.rightChild;
            else
                parent.rightChild = focusNode.leftChild;
        }

        else {
            //      Node replace = getReplaceNode(focusNode);

            //    if (focusNode == root)
            //      root = replace;
            // else if (isItAtLeft)
            //    parent.leftChild = replace;
            //else
            //  parent.rightChild = replace;

            // replace.leftChild = focusNode.leftChild;
        }
        return true;
    }

    /*public Node getReplaceNode(Node oldNode)    {
        Node oldNodeParent = oldNode;
        Node replace = oldNode;

        Node focusNode = replace.rightChild;*/
}
