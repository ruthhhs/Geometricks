package tubespbo.model;
import java.util.ArrayList;

public class Koleksi<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void tambah(T item){
        data.add(item);
    }

    public T get(int index){
        return data.get(index);
    }

    public int size(){
        return data.size();
    }
}