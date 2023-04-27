import java.util.HashMap;
import java.util.Vector;

public class BFS extends FS {

    @Override
    protected void run(int v, int pred) {
        System.out.println("Зашли в вершину " + v + " По ребру: " + v + " " + pred);

        usedPoints.put(v, true);
        usedRibs.put(new pair<Integer, Integer>(v, pred), true);

        Vector<Integer> now = g.get(v);
        for(int i = 0; now != null && i < now.size(); i++) {
            Integer next = now.get(i);
            if (usedPoints.get(next) == null){
                run(next, v);
            }
        }

        System.out.println("Вышли с вершины " + v);
    }

    @Override
    public void run() {
        run(start, -1);
    }
}
