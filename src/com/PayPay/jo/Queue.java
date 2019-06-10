package com.PayPay.jo;

/**
 * Interface for an immutable queue
 * @param <T> generic type for the elements of the queue
 */
public interface Queue<T> {
    /**
     *
     * @param t generic type for the elements of the queue
     * @return the new queue after adding the element at the beginning of the queue
     */
    public Queue<T> enQueue(T t);

    /**
     *
     * @return the new queue after removing the element at the beginning of the queue
     */
    public Queue<T> deQueue();

    /**
     *
     * @return the first element in the queue
     */
    public T head();

    /**
     *
     * @return true or false depending on whether the Queue is empty or not
     */
    public boolean isEmpty();
}
