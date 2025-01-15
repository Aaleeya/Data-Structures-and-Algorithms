package binarysearchtrees;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);

        System.out.println("Root: " + myBST.getRoot().value);

        System.out.println(myBST.contains(21));
        System.out.println(myBST.contains(17));

    }
}
