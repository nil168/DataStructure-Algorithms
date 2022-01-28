package datastructure.linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        //  * creating the nodes
        sll.head = new SinglyLinkedList.Listnode(11);
        SinglyLinkedList.Listnode second = new SinglyLinkedList.Listnode(12);
        SinglyLinkedList.Listnode third = new SinglyLinkedList.Listnode(13);
        SinglyLinkedList.Listnode fourth = new SinglyLinkedList.Listnode(14);

        //  * connecting the nodes
        sll.head.next = second; // 11 --> 12
        second.next = third; // 11 --> 12 --> 13
        third.next = fourth; // 11 --> 12 --> 13 --> 14

        // * display method call
        sll.display();

        //  * Length method call
        System.out.println("\nThe Length of the Linked list is : "+sll.length());

        // * adding new nodes
        sll.addFirst(10);
        sll.addFirst(9);
        sll.addFirst(8);
        sll.addLast(15);
        sll.addLast(16);
        sll.addAny(7,1);
        sll.addAny(17,9);

        sll.display();
        System.out.println("\nThe Length of the Linked list is : "+sll.length());

        System.out.println("the deleted first node : "+sll.deleteFirst().data);
        sll.display();

        System.out.println("\nthe deleted last node : "+sll.deleteLast().data);
        sll.display();

        System.out.println("\nThe deleted node is : "+sll.deleteAny(9).data);
        sll.display();

        if(sll.search(17))
            System.out.println("\nYes the value exists in the Linked list");
        else
            System.out.println("\nNo the value does not exist");

        sll.reverse();
        sll.display();

        System.out.println("\nThe Middle node is : "+sll.middle().data);

    }
}
