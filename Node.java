package veriyapilari.eBinary_Search_Tree;

public class Node {
    int data;
    Node lc;
    Node rc;

    public Node(int a){
        data = a;
        lc = null;
        rc = null;
    }

    public String toString(){
        return "Node{" +
                "data=" + data +
                ", lc=" + lc +
                ", rc=" + rc +
                "}";
    }
}
