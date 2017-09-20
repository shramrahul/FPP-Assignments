package day2prob2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
		    	header.previous = n;
		    	header = n;
		}
	}

// Implement the code

	public void addLast(Node n,String item) {
		if (n!=null) {
			Node newNode = new Node(n, item, null);
			n.next = newNode;
		}
	}

	public void addLast(String item) {
		if (header==null) {
			Node newNode = new Node(null, item, null);
		}
		Node i= findLast();
		Node newNode= new Node(i,item,null);
		i.next=newNode;
		newNode.previous=i;
	}



	// implement the code
	public void postAddNode(Node n, String value){
			Node temp;
			if(n==null){
				temp=new Node(null,value,null);
			}else if(n.next==null){
				addLast(n,value);
			}else {
				temp=new Node(n,value,n.next);
				n.next.previous=temp;
				n.next = temp;

			}
	}
// implement the code

       public int Size(){
		int j=0;
			for (Node i= header; i!=null;i=i.next){
				j++;
			}
		return j;
       }

// implement code
    public boolean isEmpty() {
       	if(header==null)
       		return true;
       	return false;
}  

 

       
	
	public void preAddNode(Node n, String value){
		Node newNode;
		if (n == null){
			//List is empty
			newNode = new Node(null, value, null);
		}
		else if (n.previous == null) {
			//n is the first node
			addFront(value);
		}
		else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}	
					
	}
	
	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}
	
	public void deleteList(){
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	public void printReverse() {
		String str =""; 
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	public Node getFirst(){
		return header;
	}

	public Node getLast(){
		for (Node i=header; i!=null;i=i.next){
			if(i.next==null) return i;
		}
		return null;
	}

	public void removeFirst(){
		if(header!=null){
			header=header.next;
		}
	}

	public void removeLast(){
		Node i=findLast();
		i.previous.next=null;
	}

	public void print(Node n) {
		System.out.println("Recursively displaying\n"+print(n,"-->["));
	}

	public String print(Node n, String str) {
		if(n==null) return str+"NULL]";
		str+=n.toString()+"]-->[";
		return print(n.next,str);
	}
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
//		mySL.printReverse();

//		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
//		mySL.printReverse();
 		mySL.addLast("Orange Juice");
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Apple Pie"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Peach Sauce"));
//		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteNode(mySL.findItem("Carrot Cake"));
//		System.out.println(mySL);
//		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie" );
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight" );
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie" );
		System.out.println(mySL);
//		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Peach Sauce" );
		System.out.println(mySL);
//		mySL.printReverse();
//		mySL.deleteList();
//		System.out.println(mySL);
//		mySL.printReverse();

		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.postAddNode(mySL.findItem("Carrot Cake"),"Pizza");
		System.out.println(mySL);
		mySL.postAddNode(mySL.findItem("Pizza"),"Chocolate");
		System.out.println(mySL);
		mySL.postAddNode(mySL.findItem("Carrot Cake"),"Orange Juice");
		System.out.println(mySL);

		System.out.println("length= "+mySL.Size());

		System.out.println("isEmpty= "+mySL.isEmpty());

		System.out.println("first node= "+mySL.getFirst());

		System.out.println("Last Node= "+mySL.getLast());

		mySL.removeFirst();
		System.out.println(mySL);

		mySL.removeLast();
		System.out.println(mySL);

		//recursive print
		mySL.print(mySL.header);
	}

}
/*
output

		-->[NULL]
		-->[Blueberry Muffin]-->[NULL]
		-->[Apple Pie]-->[Blueberry Muffin]-->[NULL]
		-->[Apple Pie]-->[Blueberry Muffin]-->[Orange Juice]-->[NULL]
		-->[Apple Pie]-->[Blueberry Muffin]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Carrot Cake]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Carrot Cake]-->[Pizza]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Carrot Cake]-->[Pizza]-->[Chocolate]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Carrot Cake]-->[Orange Juice]-->[Pizza]-->[Chocolate]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		length= 13
		isEmpty= false
		first node= Carrot Cake
		Last Node= Peach Sauce
		-->[Orange Juice]-->[Pizza]-->[Chocolate]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
		-->[Orange Juice]-->[Pizza]-->[Chocolate]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]
		Recursively displaying
		-->[Orange Juice]-->[Pizza]-->[Chocolate]-->[Apple Pie]-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Peach Sauce]-->[Danish Delight]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]


*/