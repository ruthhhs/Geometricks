package tubespbo.model;
import java.util.ArrayList;

public class Koleksi<T> {
    // ====== ATRIBUT ======
    private ArrayList<T> data = new ArrayList<>();

    // ====== METHOD LAINNYA ======
    public void add(T item){
        data.add(item);
    }

    public T get(int index){
        return data.get(index);
    }

    public int size(){
        return data.size();
    }
}