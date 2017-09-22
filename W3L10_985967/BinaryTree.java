public class BinaryTree {
    BinaryNode root;
    Integer count=0;

    BinaryTree(){
        root= null;
    }

    public void insert(Integer x){
        if (root== null) root= new BinaryNode(null,x,null);
        else{

            BinaryNode n= root;
            boolean isInserted= false;
            while(!isInserted){
                if(x.compareTo(n.value)==0){
                    isInserted= true;
                }else if(x.compareTo(n.value)<0){
                    //left part
                    if(n.left==null){
                        n.left=new BinaryNode(null,x,null);
                        isInserted= true;
                    }else{
                        n=n.left;
                    }
                }else{
                    if(n.right==null){
                        n.right=new BinaryNode(null,x,null);
                        isInserted=true;
                    }else{
                        n=n.right;
                    }
                }
                if(isInserted==true) ;
            }
        }
    }

    public void printTree(){
        if (root==null) System.out.println("Empty tree..");
        else
            printTree(root);
            //System.out.println(root.left.value+" "+root.value+" "+root.right.value);
    }

    private void printTree(BinaryNode i){

        if(i!=null){
            if(i.left==null && i.right==null) {
                ++count;
            }
            printTree(i.left);
            System.out.print(i.value+",");
            printTree(i.right);
        }
    }

    public void preOrder(){
        if(root== null) System.out.println("Empty tree");
        else
            preOrder(root);
    }

    private void preOrder(BinaryNode i){
        if (i!= null){
            System.out.print(i.value+",");
            printTree(i.left);
            printTree(i.right);
        }
    }

    public void postOrder(){
        if(root== null) System.out.println("Empty tree");
        else
            postOrder(root);
    }

    private void postOrder(BinaryNode i){
        if (i!= null){

            printTree(i.left);
            printTree(i.right);
            System.out.print(i.value+",");
        }
    }

    public boolean contains(Integer key){
        BinaryNode rootNode=root;
        boolean hasKey =false;
            if(key==rootNode.value){
                return true;
            }else {
                while(!hasKey && root!=null){
                if(key<rootNode.value){
                    if(rootNode.left==null) return false;

                    BinaryNode left= rootNode.left;

                    if(left.value==key) {
                        return true;
                    }
                    else{
                        rootNode=rootNode.left;
                    }
                }else{
                    if (rootNode.right==null)return false;

                    BinaryNode right= rootNode.right;

                    if(right.value==key) {
                        return true;
                    }
                    else{
                        rootNode=rootNode.right;
                    }
                }
                }
            }

        return hasKey;
    }

    public int getRoot(){
        return root.value;
    }

    public int size(){
        return size(root);
    }

    private int size(BinaryNode n){
        if (n==null)
            return 0;
        else
            return size(n.left)+1+size(n.right);
    }

    public boolean isEmpty(){
        if (root==null) return true;
        else return false;
    }

    public Integer findMin(){
        return findMin(root);
    }
    private Integer findMin(BinaryNode node){
        if(node== null) return null;
        else if(node.left==null) return node.value;

        return findMin(node.left);
    }

    public Integer findMax(){
        return findMax(root);
    }
    public Integer findMax(BinaryNode node){
        if(node==null) return null;
        else if(node.right==null) return node.value;

        return findMax(node.right);
    }



    private class BinaryNode{
        BinaryNode left;
        Integer value;
        BinaryNode right;

        public BinaryNode(BinaryNode left, Integer value, BinaryNode right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }
    }

    public static void main(String [] args){
        BinaryTree binaryTree= new BinaryTree();
        int [] arr= {30,20,45,34,21,76,90,67,45,80,38,54,67};

        for(int i:arr){
            binaryTree.insert(i);
        }
        binaryTree.printTree();
        System.out.println("count=>"+binaryTree.count);

        System.out.println("\nPre Order");
        binaryTree.preOrder();

        System.out.println("\npost order..");
        binaryTree.postOrder();

        System.out.println("\nContains element=>"+binaryTree.contains(67));
        System.out.println("\n root="+binaryTree.getRoot());

        System.out.println(" size of the tree="+binaryTree.size());
        System.out.println(" isEmpty()= "+binaryTree.isEmpty());
        System.out.println("minimum value= "+binaryTree.findMin());
        System.out.println("Maximum Value="+binaryTree.findMax());
    }
}
