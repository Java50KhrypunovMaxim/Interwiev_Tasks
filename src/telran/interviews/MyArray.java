package telran.interviews;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyArray<T> {

	private Map<Integer, T> MyArray;

	private int size;
	int current = 0;

	public MyArray(int size) {
		MyArray = new HashMap<>();
		this.size = size;
	}

	public void setAll(T value) {
		for (int i = 0; i < size; i++) {
			set(i, value);
		}

	}

	public T get(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Wrong Index");
		}
		T obj = MyArray.get(index);
		return obj;
	}

	public void set(int index, T value) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException("Wrong Index");
		}
		MyArray.put(index, value);

	}

	public void addElement(T obj) {
		MyArray.put(current, obj);
		current++;
	}

}