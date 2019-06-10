package com.PayPay.jo;


import java.util.NoSuchElementException;

/**
 * Immutable Queue implementation that uses two lists of opposite order to keep track of the elements.
 * front keeps track of the elements being deQueued
 * back keeps track of the elements being Queued
 * @param <T> generic type for the elements of the queue
 */
public final class ImmutableQueue<T> implements Queue<T> {

    private final ImmutableList<T> front;
    private final ImmutableList<T> back;

    public static <T> ImmutableQueue<T> getEmptyQueue() {
        return new ImmutableQueue<>(ImmutableList.getEmptyList(), ImmutableList.getEmptyList());
    }

    private ImmutableQueue(ImmutableList<T> f, ImmutableList<T> b) {
        this.front = f;
        this.back = b;
    }

    @Override
    public Queue<T> enQueue(T t) {
        if(isEmpty())
            return new ImmutableQueue<>(front.add(t), back);
        else
            return new ImmutableQueue<>(front, back.add(t));
    }

    @Override
    public Queue<T> deQueue() {
        if (!front.tail.isEmpty()){
            return new ImmutableQueue<>(front.tail, back);
        }
        else if (back.isEmpty()) {
            return ImmutableQueue.getEmptyQueue();
        }
        else {
            return new ImmutableQueue<>(back.reverseList(), ImmutableList.getEmptyList());
        }
    }

    @Override
    public T head() {
        if (isEmpty()) throw new NoSuchElementException();
        if(front.isEmpty()) {
            return back.reverseList().head;
        }
        return front.head;
    }

    @Override
    public boolean isEmpty() {
        return front.isEmpty() && back.isEmpty();
    }
}
