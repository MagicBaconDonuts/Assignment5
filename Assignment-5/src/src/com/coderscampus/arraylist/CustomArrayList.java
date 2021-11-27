package src.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int index = 0;

	@Override
	public boolean add(T item) {
		if(index == items.length) {
			updateArrayOfObject();
		}
		items[index] = item;
		index++;
		
		return true;
	}

	private void updateArrayOfObject() {
		items = Arrays.copyOf(items, index * 2);
	}

	@Override
	public int getSize() {
		return index;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}
	
}
