package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        if (data == null) {
            this.data = (T[]) new Object[0];
        } else {
            this.data = data;
        }
    }

    public int add(T item) {
        int index = -1;

        if (item != null) {
            boolean isPasted = false;

            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    index = i;
                    isPasted = true;
                    break;
                }
            }

            if (!isPasted) {
                data = Arrays.copyOf(data,data.length + 1);
                data[data.length -1] = item;
                index = data.length - 1;
            }
        }

        return index;
    }

    public T get(int index) {
        if (index < data.length && index >= 0) {
            return data[index];
        }

        return null;
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index < data.length && index >= 0) {
            T[] newData = Arrays.copyOf(data,data.length - 1);

            for (int i = 0; i < index; i++) {
                newData[i] = data[i];
            }

            for (int i = index; i < newData.length; i++) {
                newData[i] = data[i+1];
            }

            data = Arrays.copyOf(newData,newData.length);

            return true;
        }
        return false;
    }

    public boolean delete(T item) {
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
             if (data[i].equals(item)) {
                 return delete(i);
             }
            }
        }

        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[i],data[j]) > 0) {
                    T tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                builder.append(data[i].toString());
                if (i < data.length -1) {
                    builder.append(", ");
                }
            }
        }

        if(data.length != 0 && data[data.length -1] == null) {
            builder = new StringBuilder(builder.substring(0, builder.length() - 2));
        }
        builder.append("]");

        return builder.toString();
    }
}
