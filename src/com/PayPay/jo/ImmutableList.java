package com.PayPay.jo;

/**
 * Immutable List implementation
 * @param <T> generic type for the elements of the stack
 */
public class ImmutableList<T> {

    private final static ImmutableList emptyList = new ImmutableList(null, null);

    public final T head;
    public final ImmutableList<T> tail;

    public ImmutableList(T h, ImmutableList<T> t) {
        this.head = h;
        this.tail = t;
    }

    public ImmutableList<T> add(T t) {
        return new ImmutableList<>(t, this);
    }

    public boolean isEmpty() {
        return this == emptyList;
    }

    /**
     * Reverses the current list
     * @return
     */
    public ImmutableList<T> reverseList() {
        ImmutableList<T> r = getEmptyList();
        ImmutableList<T> list = this;
        while (!list.isEmpty()) {
            r = r.add(list.head);
            list = list.tail;
        }
        return r;
    }

    public static <T> ImmutableList<T> getEmptyList() {
        return emptyList;
    }
}
