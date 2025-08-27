class LinkedList{
   public class Node{
      int data;
      Node next;
    public  Node(int data){
          this.data=data;
          this.next=null;
    }
  }
    public Node head;
    public  Node tail;
    public static int size;
    public void addFirst(int data){
      Node newNode = new Node(data);
      size++;
      if(head==null){
        head = tail=newNode;
      }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
        head = tail=newNode;
      }
        tail.next = newNode;
        tail = newNode;
    }
    public void add(int idx,int data){
       Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i <idx-1) {
           temp = temp.next;
           i++;
        }
         newNode.next=temp.next;
         temp.next=newNode;
         size++;
    }
    public int itrSearch(int key){
          Node temp = head;
          int i =0;
          while(temp !=null){
               if(temp.data==key){
                 return i;
               }
               temp = temp.next;
               i++;
          }
          return -1;
    }
    public void reverse(){
      Node pev = null;
      Node  curr = tail= head;
      Node next;
      while(curr !=null){
        next = curr.next;
        curr.next = pev;
        pev = curr;
        curr = next;

      }
         head = pev;
    }
    public void Print(){
      Node temp = head;
      if(head==null){
        System.out.println("No next node created");
        return;
      }
      while (temp !=null) {
        System.out.print(temp.data+"-> ");
        temp = temp.next;
      }
      System.out.println("Size of linkedlist is "+size);
    }
   
   public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(0);
     ll.addLast(1);
      ll.addLast(9);
       ll.addLast(10);
       ll.add(2, 8);
      ll.reverse();
      ll.Print();
   }
}