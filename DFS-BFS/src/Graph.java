import java.util.HashMap;
import java.util.Vector;

public class Graph {
    protected HashMap<Integer, Vector<Integer>> g = new HashMap<>();
    public void push(int a, int b) {
        this.g.computeIfAbsent(a, k -> new Vector<Integer>()).add(b);
    }

    public Vector<Integer> get(int v){
        return g.get(v);
    }
}
