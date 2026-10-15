import java.util.ArrayList;

public class Bucket<T> {
    private ArrayList<T> list;

    public Bucket(ArrayList<T> list) {
        this.list = list;
    }

    public void add(T item) {
        list.add(item);
    }

    public ArrayList<T> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "list=" + list +
                '}';
    }
}
