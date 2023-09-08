import java.util.ArrayList;
import java.util.List;

public class Boite<T> {

    private ArrayList<T> content = new ArrayList<>();

    public void addContent(T obj) {
        content.add(obj);
    }

    public void addContent(T[] objs) {
        content.addAll(List.of(objs));
    }

    public List<T> getAllContent() {
        return content;
    }
}
