package com.PayPay.jo;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = ImmutableQueue.getEmptyQueue();
        try{
            q = q.enQueue(3);
            print(q);
            q = q.enQueue(3);
            print(q);
            q = q.enQueue(17);
            print(q);
            q = q.enQueue(null);
            print(q);
            q = q.enQueue(9);
            print(q);
            q = q.deQueue();
            print(q);
            q = q.deQueue();
            print(q);
            q = q.deQueue();
            print(q);
            q = q.deQueue();
            print(q);
            System.out.println("Is queue empty ? " + q.isEmpty());
            q = q.deQueue();
            System.out.println("Is queue empty ? " + q.isEmpty());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void print(Queue<Integer> q) throws Exception{
        while(q != null && !q.isEmpty()){
            System.out.print(q.head() + " -> ");
            q = q.deQueue();
        }
        System.out.println();
    }
}
