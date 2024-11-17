package stringList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StringListRealization implements StringList {

    private String[] array;
    private int size;
    private final int MaxSize = 256;

    public StringListRealization() {
        array = new String[MaxSize];
        size = 0;
    }

    @Override
    public String add(String item) {
        array[size] = item;
        size++;
        return item;
    }

    void validIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String add(int index, String item) {
        validIndex(index);

        for (int i = size + 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validIndex(index);
        array[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                for (int j = i + 1; j < size; j++) {
                    array[j] = array[j - 1];
                }
                size--;
                return item;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public String remove(int index) {
        validIndex(index);
        String item = array[index];

        for (int j = index; j < size; j++) {
            array[j] = array[j + 1];
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validIndex(index);
        return array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if (size() != otherList.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void clear() {
        array = new String[MaxSize];
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(array, size);
    }
}
