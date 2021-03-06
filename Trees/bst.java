import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class bst
{
    public static class Node
    {
        int data;
        Node left = null;
        Node right = null;

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data , Node left , Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }


        @Override
        public String toString()
        {
            String str = "";

            str += (left != null ? left.data : ".");
            str += " -> " + data + " -> ";
            str += (right != null ? right.data : ".");
            str += "\n";

            if(left != null)
            {
                str += left.toString();
            }
            if(right != null)
            {
                str += right.toString();
            }
            return str;
        }
    }


    public static void main(String[] args)
    {
        // CREATE BST ______________________________________________________________________
        int[] arr = new int[10];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = (i + 1) * 10;
        }
        Node root = createBST(arr , 0 , arr.length - 1);
        // display(root);
        // System.out.println(root);


        // FINDING DATA IN BST  _____________________________________________________________________
        // System.out.println(findRec(root , 80));         // RECURSION
        // System.out.println(findItr(root , 80));         // ITERATION


        // ADDING THE DATA TO BST _______________________________________________________
        root = addData(root , 25);
        root = addData(root , 85);
        // System.out.println(root);



        // SUCCESSOR AND PREDECCESSOR IN BST ____________________________________________
        // predSuccInBST(root , 80);



        // REMOVE NODE IN BST ________________________________________________________________
        // root = removeNode(root , 80);
        // System.out.println(root);


        // MORRIS TRAVERSAL OF TREE __________________________________________________________________
        // morrisTraversalInorder(root);
        // morrisTraversalPreorder(root);



        // TRAVERSING THE TREE USING STACK _____________________________________________________________
        // preorderStack(root);
        // inorderStack(root);
        postorderStack(root);
    }


    // CREATE BST ___________________________________________________________________________
    public static Node createBST(int[] arr, int si, int ei)
    {
        if(si > ei)
        {
            return null;
        }

        int mid = si + (ei - si) / 2;
        Node node = new Node(arr[mid]);

        node.left = createBST(arr , si , mid - 1);
        node.right = createBST(arr , mid + 1 , ei);

        return node;
    }

    public static void display(Node node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print((node.left != null) ? node.left.data + "" : ".");
        System.out.print(" -> " + node.data + " <- ");
        System.out.println((node.right != null) ? node.right.data + "" : ".");

        display(node.left);
        display(node.right);
    }



    // FINDING DATA IN BST________________________________________________________________
    // RECURSIVELY
    public static boolean findRec(Node node , int data)
    {
        if(node == null)
        {
            return false;
        }

        if(node.data == data)
        {
            return true;
        }

        if(node.data > data)
        {
            return findRec(node.left, data);
        }
        else
        {
            return findRec(node.right, data);
        }
    }


    // ITERATION
    public static boolean findItr(Node node , int data)
    {
        while(node != null)
        {
            if(node.data == data)
            {
                return true;
            }
            else if(node.data > data)
            {
                node = node.left;
            }
            else
            {
                node = node.right;
            }
        }

        return false;
    }



    // ADDING DATA TO THE BST ______________________________________________________________
    public static Node addData(Node node, int data)
    {
        if(node == null)
        {
            return new Node(data);
        }

        if(node.data > data)
        {
            node.left = addData(node.left, data);
        }
        else
        {
            node.right = addData(node.right, data);
        }

        return node;
    }



    // SUCCESOR AND PREDECCESOR IN BST ___________________________________________________
    public static void predSuccInBST(Node node , int data)
    {
        Node pred = null;
        Node succ = null;
        while(node != null)
        {
            if(node.data == data)
            {
                if(node.left != null)
                {
                    pred = node.left;
                    while(pred.right != null)
                    {
                        pred = pred.right;
                    }
                }
                if(node.right != null)
                {
                    succ = node.right;
                    while(succ.left != null)
                    {
                        succ = succ.left;
                    }
                }

                System.out.println("Predecessor of data - " + pred.data);
                System.out.println("Successor of data - " + succ.data);

                return;
            }

            else if(node.data > data)
            {
                node = node.left;
            }
            else
            {
                node = node.right;
            }
        }
    }


    // REMOVE NODE IN BST ________________________________________________________________
    public static Node removeNode(Node node , int data)
    {
        if(node == null)
        {
            return null;
        }

        if(data == node.data)
        {
            if(node.left == null || node.right == null)     // for 0 and 1 child
            {
                return node.left == null ? node.right : node.left;
            }

            int maxData = maxInTree(node.left);
            node.data = maxData;

            node.left = removeNode(node.left , maxData);        // to remove the node which we used to replace 
                                                                // the node.
        }
        else if(data < node.data)
        {
            node.left = removeNode(node.left, data);
        }
        else
        {
            node.right = removeNode(node.right, data);
        }

        return node;
    }

    public static int maxInTree(Node node)
    {
        if(node == null)
        {
            return Integer.MIN_VALUE;
        }

        Node rnode = node;
        while(rnode.right != null)
        {
            rnode = rnode.right;
        }

        return rnode.data;
    }

    public static int minInTree(Node node)
    {
        if(node == null)
        {
            return Integer.MAX_VALUE;
        }

        Node rnode = node;
        while(rnode.left != null)
        {
            rnode = rnode.left;
        }

        return rnode.data;
    }



    // MORRIS TRAVERSAL ____________________________________________________________________

    public static Node rightMostOfNextLeft(Node nextLeft , Node curr)
    {
        while(nextLeft.right != null  && nextLeft.right != curr)
        {
            nextLeft = nextLeft.right;
        }
        return nextLeft;
    }

    // INORDER
    public static void morrisTraversalInorder(Node node)
    {
        Node curr = node;
        while(curr != null)
        {
            Node nextLeft = curr.left;

            if(nextLeft == null)
            {
                System.out.print(curr.data + " ");                  // print
                curr = curr.right;
            }
            else
            {
                Node rightMost = rightMostOfNextLeft(nextLeft, curr);
                if(rightMost.right == null)             // thread creation
                {
                    rightMost.right = curr;
                    curr = curr.left;
                }
                else
                {
                    System.out.print(curr.data + " ");
                    rightMost.right = null;                       // break thread and print
                    curr = curr.right;
                }
            }
        }
    }


    // PREORDER
    public static void morrisTraversalPreorder(Node node)
    {
        Node curr = node;
        while(curr != null)
        {
            Node nextLeft = curr.left;
            if(nextLeft == null)
            {
                System.out.print(curr.data + " ");             // print
                curr = curr.right;
            }
            else
            {
                Node rightMost = rightMostOfNextLeft(nextLeft, curr);
                if(rightMost.right == null)
                {
                    System.out.print(curr.data + " ");              // thread creation and print
                    rightMost.right = curr;
                    curr = curr.left;
                }
                else
                {
                    rightMost.right = null;                     // thread break
                    curr = curr.right;
                }
            }
        }
    }


    //  TRAVERSING THE TREE USING STACK_______________________________________________________________
    public static class tpair
    {
        Node node = null;
        boolean sd = false;
        boolean ld = false;
        boolean rd = false;

        tpair(Node node)
        {
            this.node = node;
        }
    }


    // PREORDER  (SD , LD , RD) ________________
    public static void preorderStack(Node node)
    {
        Stack<tpair> st = new Stack<>();
        st.push(new tpair(node));

        while(st.size() != 0)
        {
            tpair tnode = st.peek();
            if(!tnode.sd)
            {
                tnode.sd = true;
                System.out.print(tnode.node.data + " ");
            }
            else if(!tnode.ld)
            {
                tnode.ld = true;
                if(tnode.node.left != null)
                {
                    st.push(new tpair(tnode.node.left));
                }
            }
            else if(!tnode.rd)
            {
                tnode.rd = true;
                if(tnode.node.right != null)
                {
                    st.push(new tpair(tnode.node.right));
                }
            }
            else
            {
                st.pop();
            }
        }
    }


    // INORDER (LD , SD , RD) ___________________________
    public static void inorderStack(Node node)
    {
        Stack<tpair> st = new Stack<>();
        st.push(new tpair(node));

        while(st.size() != 0)
        {
            tpair tnode = st.peek();
            if(!tnode.ld)
            {
                tnode.ld = true;
                if(tnode.node.left != null)
                {
                    st.push(new tpair(tnode.node.left));
                }
            }
            else if(!tnode.sd)
            {
                tnode.sd = true;
                System.out.print(tnode.node.data + " ");
            }
            else if(!tnode.rd)
            {
                tnode.rd = true;
                if(tnode.node.right != null)
                {
                    st.push(new tpair(tnode.node.right));
                }
            }
            else
            {
                st.pop();
            }
        }
    }


    // POSTORDER (LD , RD , SD) ____________________________
    public static void postorderStack(Node node)
    {
        Stack<tpair> st = new Stack<>();
        st.push(new tpair(node));

        while(st.size() != 0)
        {
            tpair tnode = st.peek();
            if(!tnode.ld)
            {
                tnode.ld = true;
                if(tnode.node.left != null)
                {
                    st.push(new tpair(tnode.node.left));
                }
            }
            else if(!tnode.rd)
            {
                tnode.rd = true;
                if(tnode.node.right != null)
                {
                    st.push(new tpair(tnode.node.right));
                }
            }
            else if(!tnode.sd)
            {
                tnode.sd = true;
                System.out.print(tnode.node.data + " ");
            }
            else
            {
                st.pop();
            }
        }
    }
}