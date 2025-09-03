public class Cycle {
    class Node {
        int data;
        Node next;
    }
    Node head;
    Node tail;
    public void addNodeFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.println("->null");
    }
    // here we are creating a cycle in the linked list for testing purpose
    public void makeCycle() {
    if (head == null || tail == null) return;
    tail.next = head; // Creates a cycle: last node points to head
}
   public boolean detectCycle() {
     Node slow = head;  // slow pointer
     Node fast = head;  // fast pointer
     while(fast !=null && fast.next != null){
         slow=slow.next;    // slow is moving one step
         fast =fast.next.next;  // fast is moving two step 2*slow
         if(fast==slow){
            return true; // cycle detected
         }     
     }
      return false;
    }
    // remove cycle in linked list
   public void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean isCycle = false;

    // Step 1: Detect cycle using Floyd's algorithm
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            isCycle = true;
            break;
        }
    }

    if (!isCycle) return; // No cycle found

    // Step 2: Find the start of the cycle
    slow = head;
    if (slow == fast) {
        // Cycle starts at head
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
        return;
    }
    Node prev = null;
    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = null;
}
    public static void main(String[] args) {
        Cycle list = new Cycle();
        list.addNodeFirst(1);
        list.addNodeFirst(2);
        list.addNodeFirst(3);
        System.out.println(list.detectCycle()); // it will return false because cycle is not present
        list.display();
        list.makeCycle(); // creating cycle 
      System.out.println(list.detectCycle()); // it will return true because cycle is present
      list.removeCycle(); // removing cycle
        System.out.println(list.detectCycle()); // after removing cucle it will return false
    }
}
