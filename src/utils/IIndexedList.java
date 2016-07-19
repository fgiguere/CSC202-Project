package utils;

//Extends IList with methods specific to indexed lists.

import Exceptions.IndexOutOfBoundsException;

public interface IIndexedList <T> extends IList<T> {
    void add (T element, int index) throws IndexOutOfBoundsException;
    //Throws IndexOutOfBoundsException if passed an index argument < 0 or > size().
    //Otherwise adds element to list at position index.
    //All other elements at that position or higher have 1 added to their index.

    T set(T element, int index) throws IndexOutOfBoundsException;
    //Throws IndexOutOfBoundsException if passed an index argument < 0 or >= size().
    //Otherwise replaces element on the list at the position index and returns the replaced element.

    T get(int index) throws IndexOutOfBoundsException;
    //Throws IndexOutOfBoundsException if passed an index argument < 0 or >= size().
    //Otherwise returns the element at this index.

    T remove(int index) throws IndexOutOfBoundsException;
    //Throws IndexOutOfBoundsException if passed an index argument < 0 or >= size().
    //Otherwise removes the element at the position index and returns the element.
    //All other elements at higher positions than the removed element have 1 subtracted from their index.

    int indexOf(T element);
    //If the list contains an element e such that e.equals(element) then returns the index of the first such element.
    //Otherwise returns -1.
}
