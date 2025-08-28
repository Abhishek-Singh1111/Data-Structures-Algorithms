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
    // adding a node in first
    public void addFirst(int data){
      Node newNode = new Node(data);
      size++;
      if(head==null){
        head = tail=newNode;
      }
        newNode.next = head;
        head = newNode;
    }
     // adding a node at last
    public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
        head = tail = newNode;
    } else {
        tail.next = newNode;
        tail = newNode;
    }
}
    // adding a node at middle
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
    // removing node from first
public void removeFirst() {
    if (head == null) {
        System.out.println("LinkedList is empty");
        return;
    }
    head = head.next;
    size--;
    if (head == null) {
        tail = null;
    }
}
    // removing node from last
    public int removeLast(){
    if(size == 0){
        System.out.println("LinkedList is empty");
        return Integer.MIN_VALUE;
    } else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    Node prev = head;
    for(int i = 0; i < size - 2; i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
    
    // iterative search in a linkedList
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
    // reverse a linkedList from last 
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
    // printing the linkedList 
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
         ll.Print();
         ll.removeFirst();
        ll.Print();
      ll.removeLast();
      ll.Print();
      ll.reverse();
      ll.Print();
      System.out.println(ll.itrSearch(8));
   }
}