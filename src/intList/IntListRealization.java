package intList;

import java.util.Arrays;

public class IntListRealization implements IntList {
    private int[] array;
    private int size;
    private int MaxSize = 256;

    public IntListRealization() {
        array = new int[MaxSize];
        size = 0;
    }


    @Override
    public void add(Integer item) {
        array[size] = item;
        size++;
    }

    private void validIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public void add(int index, Integer item) {
        validIndex(index);

        for (int i = size - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        size++;
    }

    @Override
    public void set(int index, Integer item) {
        validIndex(index);
        array[index] = item;
    }

    @Override
    public boolean contains(Integer item) {
        sort();
        return binarySearch(item) != -1;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remove(Integer index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                array[i] = 0;
                for (int j = i + 1; j < size; j++) {
                    array[j] = array[j - 1];
                }
                size--;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Integer get(Integer index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return array[i];
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean equals(IntList otherList) {
        if (otherList.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] != otherList.get(i)) {
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
        return size == 0;
    }

    @Override
    public void clear() {
        array = new int[MaxSize];
        size = 0;
    }

    @Override
    public int[] toArray() {
        return Arrays.copyOf(array, size);
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            array = swap(array, i, min);
        }
    }

    @Override
    public int binarySearch(Integer element) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            }
            if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private static int cutting(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (pivot >= arr[j]) {
                i++;

                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = cutting(arr, start, end);

            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    public void grow() {
        MaxSize += MaxSize / 2;
    }
}
