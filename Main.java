package veriyapilari.Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.add(30);
        bst.add(40);
        bst.add(20);
        bst.add(15);
        bst.add(18);
        bst.add(12);
        bst.add(40);
        bst.add(38);
        bst.add(50);
        bst.add(45);


        bst.Print();

        System.out.println("------------------");

        System.out.println(bst.Search(35));

        System.out.println("------------------");

        bst.PreOrder();
        System.out.println();
        bst.InOrder();
        System.out.println();
        bst.PostOrder();

        System.out.println("------------------");

        System.out.println(bst.Max(bst.root));

    }
}
