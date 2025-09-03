public class doublyLinkedList{
     public class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    Node prev;
     public void adddoublyLinkedList(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if(head == null){
            head = newNode;
            tail = newNode;
            prev = null;
        }else{
            tail.next = newNode;
            prev = tail;
            tail = newNode;
        }
     }
        public void display(){
            Node current = head;
            System.out.print("null<-");
            while(current != null){
                System.out.print(current.data+"-> ");
                current = current.next;
            }
            System.out.println("null");
        }
         public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.adddoublyLinkedList(1);
        list.adddoublyLinkedList(2);
        list.adddoublyLinkedList(4);
        list.display();
    }
    
    }
   

