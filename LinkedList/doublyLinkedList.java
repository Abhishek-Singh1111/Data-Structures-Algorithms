public class doublyLinkedList{
     public class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head=null;
    Node tail=null;
    Node prev;
     public void adddoubly(int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            prev = tail;
            newNode.prev = tail;
            tail = newNode;
        }
     }
        public void display(){
            Node current = head;
            System.out.print("null of prev<-");
            while(current != null){
                System.out.print(current.data+"-> ");
                current = current.next;
            }
            System.out.println("null of next" );
        }
         public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.adddoubly(1);
        list.adddoubly(2);
        list.adddoubly(4);
        list.display();
    }
    
    }
   

