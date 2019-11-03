package com.dev.demo;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class MyArrayList<E>  implements List<E>, Serializable{

	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	private static final int DEFAULT_CAPACITY = 20;
	private int initialCapacity = 20;
	private int size;
	public Object[] element1;
	public  MyArrayList<E> myarray;

	protected transient int count = 0;
	
	@Override
	public boolean add(E e) {
		if (element1.length == size) {
			resize();
		}
		element1[size++] = e;
		return true;
	}

	
	private void resize() {
		Arrays.copyOf(element1, element1.length + 10);
	}
	
	public MyArrayList() {
		element1 = new Object[initialCapacity];
		myarray = this;
	}

	public MyArrayList(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		element1 = new Object[initialCapacity];
		myarray = this;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("MyArrayList [");
		for (int i = 0; i < size-1; i++) {
			sb.append(element1[i] + ", ");
		}
		sb.append(element1[size-1]);
		sb.append("]");
		return sb.toString();
	}


	@Override
	public boolean addAll(Collection<? extends E> c) {
		for (E e : c) {
			if (element1.length == size) {
				resize();
			}
			element1[size++] = e;
		}
		return true;
	}



	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		if (size < index) {
			throw new ArrayIndexOutOfBoundException(index);
		}
		Object[] temp = new Object[size + c.size()];
		int tempIndex = 0;
		for (int i = 0; i < index; i++) {
			temp[tempIndex++] = element1[i];
		}
		for (E e : c) {
			temp[tempIndex++] = e;
		}
		for (int i = index; i < size; i++) {
			temp[tempIndex++] = element1[i];
		}
		element1 = temp;
		return true;
	}

	private void rangeCheckForAdd(int index) {
		if (index > size || index < 0)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}

	private String outOfBoundsMsg(int index) {
		return "Index: "+index+", Size: "+size;
	}
	@Override
	public void clear() {
		count++;
		for (int i = 0; i < size; i++)
			element1[i] = null;

		size = 0;

	}

	@Override
	public boolean contains(Object o) {
		return indexOf(o) >= 0;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {

		return false;
	}

	@Override
	public E get(int index) {
		rangeCheck(index);

		return elementData(index);
	}

	private void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
	}

	E elementData(int index) {
		return (E) element1[index];
	}

	@Override
	public int indexOf(Object o) {

		if (o == null) {
			for (int i = 0; i < size; i++)
				if (element1[i]==null)
					return i;
		} else {
			for (int i = 0; i < size; i++)
				if (o.equals(element1[i]))
					return i;
		}
		return -1;

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<E> iterator() {
		return new Itr();
	}

	@Override
	public int lastIndexOf(Object o) {
		for (int i = element1.length; i > 0; i--) {
			if (o.equals(element1[i]))
				return i;
		}
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		return new ListItr(0);
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		if(index>size){

		}
		return new ListItr(index);
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < element1.length; i++) {
			if (o.equals(element1[i]))
				return true;
		}
		return false;
		
	}

	@Override
	public E remove(int index) {
        rangeCheck(index);

        count++;
        E oldValue = elementData(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(element1, index+1, element1, index,
                             numMoved);
        element1[--size] = null; // clear to let GC do its work

        return oldValue;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		for (Object obj : c) {
			if (contains(obj)) {
				remove(obj);
			}
		}
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {

		return false;
	}

	@Override
	public E set(int index, E element2) {
        rangeCheck(index);

        E oldValue = elementData(index);
        element1[index] = element2;
        return oldValue;
	}

	@Override
	public int size() {

		return size;
	}

	@Override
	public List<E> subList(int arg0, int arg1) {

		return (List<E>) new ListItr();
	}

	@Override
	public Object[] toArray() {
		 return Arrays.copyOf(element1, size);
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return null;
	}
	private class Itr implements Iterator<E> {

		int index;
		@Override
		public boolean hasNext() {
			return index<size;
		}

		@Override
		public E next() {
			return (E)element1[index++];
		}
	}

	private class ListItr extends Itr implements ListIterator<E>{

		public ListItr() {
		}
		public ListItr(int index){
			this.index = index;
		}
		@Override
		public boolean hasPrevious() {
			return index>0;
		}

		@Override
		public E previous() {
			return (E)element1[index--];
		}

		@Override
		public int nextIndex() {
			return index+1;
		}

		@Override
		public int previousIndex() {
			return index-1;
		}

		@Override
		public void remove() {
			myarray.remove(index);
		}

		@Override
		public void set(E e) {
			myarray.set(index, e);
		}

		@Override
		public void add(E e) {
			myarray.add(e);
		}
		@Override
		public boolean hasNext() {
			
			return false;
		}
		@Override
		public E next() {
		
			return null;
		}

	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

}
