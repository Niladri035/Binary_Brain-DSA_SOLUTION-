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




    public static void main(String...k){
        LinkedList list=new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        
        list.PrintList();
    }
}
