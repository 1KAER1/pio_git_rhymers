package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node lastNumber;

    public void push(int i) {
        if (lastNumber == null)
            lastNumber = new Node(i);
        else {
            lastNumber.next = new Node(i);
            lastNumber.next.prev = lastNumber;
            lastNumber = lastNumber.next;
        }
    }

    public boolean isEmpty() {
        return lastNumber == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return lastNumber.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = lastNumber.value;
        lastNumber = lastNumber.prev;
        return ret;
    }

}
