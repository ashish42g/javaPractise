package Sorting;

class InsSortDemo {

    static class Employee {
        int empno;
        String name;
        Employee next;
        Employee prev;
    }

    public static void main(String[] args) {

        int[] empnos = { 687, 325, 567, 100, 987, 654, 234};
        String[] names = { "April", "Joan", "Jack", "George", "Brian", "Sam", "Alice" };

        Employee topForward = null;
        Employee topBackward = null;

        // Prime the doubly linked list by creating the first node.
        topForward = new Employee();
        topForward.empno = empnos[0];
        topForward.name = names[0];
        topForward.next = null;
        topForward.prev = null;
        topBackward = topForward;

        // Insert remaining Employee nodes (in ascending order -- via empno)
        // into the doubly linked list.
        for (int i = 1; i < empnos.length; i++) {
            // Create and initialize a new Employee node.

            Employee e = new Employee();
            e.empno = empnos[i];
            e.name = names[i];
            e.next = null;
            e.prev = null;

            // Locate the first Employee node whose empno is greater than
            // the empno of the Employee node to be inserted.
            Employee temp = topForward;
            while (temp != null && temp.empno <= e.empno)
                temp = temp.next;

            // temp is either null (meaning that the Employee node must be
            // appended) or not null (meaning that the Employee node must
            // be inserted prior to the temp-referenced Employee node).
            if (temp == null) {
                topBackward.next = e; // Append new Employee node to
                // forward singly linked list.

                e.prev = topBackward; // Update backward singly linked
                topBackward = e;      // list as well.
            } else {
                if (temp.prev == null) {
                    e.next = topForward; // Insert new Employee node at
                    topForward = e;      // head of forward singly linked
                    // list.
                    temp.prev = e;       // Update backward singly linked
                    // list as well.
                } else {
                    e.next = temp.prev.next; // Insert new Employee node
                    temp.prev.next = e;      // after last Employee node
                    // whose empno is smaller in
                    // forward singly linked list.
                    e.prev = temp.prev;      // Update backward
                    temp.prev = e;           // singly linked list as well.
                }
            }
        }
        // Dump forward singly linked list (ascending order).
        System.out.println("Ascending order:\n");
        Employee temp = topForward;
        while (temp != null) {
            System.out.println("[" + temp.empno + ", " + temp.name + "] ");
            temp = temp.next;
        }
        System.out.println();
        // Dump backward singly linked list (descending order).
        System.out.println("Descending order:\n");
        temp = topBackward;
        while (temp != null) {
            System.out.println("[" + temp.empno + ", " + temp.name + "] ");
            temp = temp.prev;
        }
        System.out.println();
    }
}