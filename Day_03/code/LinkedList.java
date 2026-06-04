public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    //Creating a constructor of linked list
    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    //Creating a node of linked list
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }

    //Print the linked list
    public void PrintList(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //Append the Node in Linked List
    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //Remove element from the last of the Linked List
    public Node removeLast(){
        if(length==0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!= null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }


    //Prepend in Linked List
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    // Remove First Node
    public Node removeFirst(){
        if(length==0) return null;
        Node temp =head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }
    //get value from Linked List
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    } 
    //Set value in Linked List
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }
    //Insert a value in Linked List
    public boolean insert(int index,int value){
        if(index<0 || index>length) return false;
        if(index==0) prepend(value);
        else if(index==length) append(value);
        else{
            Node newNode=new Node(value);
            Node temp=get(index-1);
            newNode.next=temp.next;
            temp.next=newNode;
            length++;
        }
        return true;
    }

    //Remove Node at a particular index
    public Node remove(int index){
        if(index<0 || index>=length) return null;
        if(index==0) return removeFirst();
        if(index==length-1) return removeLast();
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    //Reverse a LinkedList
    public void reverse(){
        Node temp = head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    //find middle element of Linked List
    public Node middle(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //find Loop in Linked List
    public boolean hasLoop(){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }




    public static void main(String...k){
        
        // ==================== APPEND OPERATIONS ====================
        System.out.println("=== APPEND TEST ===");
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        System.out.print("List after appending (1-10): ");
        list.PrintList();
        
        // ==================== PREPEND OPERATIONS ====================
        System.out.println("\n=== PREPEND TEST ===");
        LinkedList list2 = new LinkedList(50);
        list2.prepend(40);
        list2.prepend(30);
        list2.prepend(20);
        list2.prepend(10);
        System.out.print("List after prepending (50->40->30->20->10): ");
        list2.PrintList();
        
        // ==================== GET OPERATION ====================
        System.out.println("\n=== GET TEST ===");
        LinkedList list3 = new LinkedList(10);
        list3.append(20);
        list3.append(30);
        list3.append(40);
        list3.append(50);
        System.out.println("Original List: ");
        list3.PrintList();
        System.out.println("Value at index 2: " + list3.get(2).value);
        
        // ==================== SET OPERATION ====================
        System.out.println("\n=== SET TEST ===");
        list3.set(1, 100);
        list3.set(3, 200);
        System.out.print("List after setting index 1->100, index 3->200: ");
        list3.PrintList();
        
        // ==================== INSERT OPERATION ====================
        System.out.println("\n=== INSERT TEST ===");
        LinkedList list4 = new LinkedList(10);
        list4.append(20);
        list4.append(30);
        list4.append(40);
        System.out.println("Original List: ");
        list4.PrintList();
        list4.insert(1, 15);
        list4.insert(3, 25);
        System.out.print("List after inserting 15 at index 1, 25 at index 3: ");
        list4.PrintList();
        
        // ==================== REMOVE OPERATION ====================
        System.out.println("\n=== REMOVE TEST ===");
        LinkedList list5 = new LinkedList(10);
        list5.append(20);
        list5.append(30);
        list5.append(40);
        list5.append(50);
        System.out.println("Original List: ");
        list5.PrintList();
        list5.remove(2);
        System.out.print("List after removing index 2: ");
        list5.PrintList();
        
        // ==================== REMOVE FIRST ====================
        System.out.println("\n=== REMOVE FIRST TEST ===");
        LinkedList list6 = new LinkedList(100);
        list6.append(200);
        list6.append(300);
        list6.append(400);
        System.out.println("Original List: ");
        list6.PrintList();
        list6.removeFirst();
        System.out.print("List after removing first: ");
        list6.PrintList();
        
        // ==================== REMOVE LAST ====================
        System.out.println("\n=== REMOVE LAST TEST ===");
        LinkedList list7 = new LinkedList(1);
        list7.append(2);
        list7.append(3);
        list7.append(4);
        System.out.println("Original List: ");
        list7.PrintList();
        list7.removeLast();
        System.out.print("List after removing last: ");
        list7.PrintList();
        
        // ==================== REVERSE OPERATION ====================
        System.out.println("\n=== REVERSE TEST ===");
        LinkedList list8 = new LinkedList(1);
        list8.append(2);
        list8.append(3);
        list8.append(4);
        list8.append(5);
        System.out.println("Original List: ");
        list8.PrintList();
        list8.reverse();
        System.out.print("List after reversing: ");
        list8.PrintList();
        
        // ==================== MIDDLE ELEMENT ====================
        System.out.println("\n=== MIDDLE ELEMENT TEST ===");
        LinkedList list9 = new LinkedList(10);
        list9.append(20);
        list9.append(30);
        list9.append(40);
        list9.append(50);
        list9.append(60);
        System.out.println("Original List: ");
        list9.PrintList();
        System.out.println("Middle element: " + list9.middle().value);
        
        // ==================== HAS LOOP TEST ====================
        System.out.println("\n=== HAS LOOP TEST ===");
        LinkedList list10 = new LinkedList(1);
        list10.append(2);
        list10.append(3);
        list10.append(4);
        System.out.println("Original List: ");
        list10.PrintList();
        System.out.println("Has loop: " + list10.hasLoop());
        
    }
}
