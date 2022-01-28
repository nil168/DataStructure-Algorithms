package datastructure.linkedlist;

public class SinglyLinkedList {
    Listnode head;

    static class Listnode {
        int data; // * can be a generic data type
        Listnode next; // * reference to the next node of singly linked list

        public Listnode(int data){
            this.data = data;
            this.next = null;
        }
    }
    // * method for inserting new nodes at the beginning of a linked list
    public void addFirst(int value){
        Listnode newnode = new Listnode(value);
        newnode.next = head;
        head = newnode;
    }
    // * method to delete the first node of the linked list
    public Listnode deleteFirst(){
        if(head == null){
            return null;
        } else {
            Listnode temp = head;
            head  = head.next;
            temp.next = null;
            return temp;
        }
    }

    // * method for inserting new nodes at the beginning of a linked list
    public void addLast(int value){
        Listnode newnode = new Listnode(value);
        if(head == null){
            head = newnode;
            return;
        }
        Listnode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
    }
    // * method for deleting the last node
    public Listnode deleteLast(){
        if(head == null || head.next == null){
            return head;
        } else{
            Listnode previous = null;
            Listnode current = head;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
    }

    // * method for inserting a node at any position
    public void addAny(int value, int position){
        Listnode newnode = new Listnode(value);
        if(position == 1){
            newnode.next = head;
            head = newnode;
        } else {
            Listnode previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            Listnode current = previous.next;
            previous.next = newnode;
            newnode.next = current;
        }
    }
    // * method for deleting a node at any position
    public Listnode deleteAny(int position){
        if(position == 1){
            deleteFirst();
            // head = head.next;
        } else{
            Listnode current = head;
            Listnode previous = null;
            int count = 1;
            while(count<position-1){
                previous = current;
                current = current.next;
                count++;
            }
            previous.next = current.next;
            current.next = null;
            return current;
        }
        return null;
    }

    // * Linkedlist display method
    public void display(){
        Listnode current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    //  * Length Method
    public int length(){
        if(head == null){
            return 0;
        }
        int count = 0;
        Listnode current = head;
        while(current != null){
            count++;
            current =current.next;
        }
        return count;
    }

    // * search method
    public boolean search(int key){
        Listnode current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // * Reverse method
    public void reverse(){
        Listnode current = head;
        Listnode previous = null;
        Listnode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // * middle finding method
    public Listnode middle(){
        Listnode slowPtr = head;
        Listnode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }
}
