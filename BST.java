package veriyapilari.Binary_Search_Tree;

public class BST {
    Node root;

    public BST(){
        root = null;
    }

    public int Max(Node current){
        int max = current.data;
        while(current.rc == null){
            max = current.rc.data;
            current = current.rc;
        }
        return max;
    }

    public int Min(Node current){
        int min = current.data;
        while(current.lc == null){
            min = current.lc.data;
            current = current.lc;
        }
        return min;
    }

    //BST Silme
    public void Delete(int a){
        DeleteRecursive(root,a);
    }


    public Node DeleteRecursive(Node current,int a){
        if(current == null){
            return current;
        }else if(current.data > a){
            current.lc = DeleteRecursive(current.lc, a);
        }else if(current.data < a){
            current.rc = DeleteRecursive(current.rc, a);
        }else{
            if(current.lc == null){
                return current.lc;
            }if(current.rc == null){
                return current.lc;
            } 
            int leftMax = Max(current.lc);
            current.data = leftMax;
            current.lc = DeleteRecursive(current.lc, leftMax);
        }
        return current;
    }


    //BST Gezinme
    public void PreOrder(){
        PreOrderRecursive(root);
    }
    public void PreOrderRecursive(Node current){
        if(current != null){
            System.out.println(current.data+ " ");
            PreOrderRecursive(current.lc);
            PreOrderRecursive(current.rc);
        }
    }


    public void InOrder(){
        InOrderRecursive(root);
    }
    public void InOrderRecursive(Node current){
        if(current != null){
            InOrderRecursive(current.lc);
            System.out.println(current.data+ " ");
            InOrderRecursive(current.rc);
        }
    }

    public void PostOrder(){
        PostOrderRecursive(root);
    }
    public void PostOrderRecursive(Node current){
        if(current != null){
            PostOrderRecursive(current.lc);
            PostOrderRecursive(current.rc);
            System.out.println(current.data+ " ");
        }
    }


    //BST Ekleme
    public void add(int a){
        root = AddRecursive(root,a);
    }

    public Node AddRecursive(Node current,int a){
        if(current == null){
            current = new Node(a);
            return current;
        }else if(current.data > a){
            current.lc = AddRecursive(current.lc, a);
        }else if (current.data < a){
            current.rc = AddRecursive(current.rc, a);
        }
        return current;
    }

    //BST Arama
    public Node Search(int s){
        return SearchRecursive(root, s);
    }

    public Node SearchRecursive(Node current,int s){
        if(current== null || current.data == s){
            return current;
        }if(current.data < s){
            return SearchRecursive(current.rc, s);
        }
        return SearchRecursive(current.lc, s);
    }


    //BST Yazdırma
    public void Print(){
        printRecursive(root, "");
    }

    public void printRecursive(Node current,String indent){
        System.out.println(indent + current.data);
        if(current.lc != null){
            printRecursive(current.lc, indent +"    ");

        }if(current.rc != null){
            printRecursive(current.rc, indent +"     ");
        }
    }
}
