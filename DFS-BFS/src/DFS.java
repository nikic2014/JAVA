import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class DFS extends FS {

    private LinkedList<Integer> q = new LinkedList<>();
    @Override
    protected void run(int v, int pred) {

    }

    @Override
    public void run() {
        q.add(start);

        while(!q.isEmpty()) {
            int v = q.getFirst();
            usedPoints.put(v, true);
            System.out.println("Зашли в вершину " + v);

            Vector<Integer> now = g.get(v);
            for(int i = 0; now != null && i < now.size(); i++) {
                Integer next = now.get(i);
                if (usedPoints.get(next) == null){
                    q.add(next);
                    usedRibs.put(new pair<Integer, Integer>(v, next), true);
                    System.out.println("Пройдемся по ребру " + v + " " + next);
                }
            }

            System.out.println("Вышли с вершины " + v);
            q.remove(0);
        }
    }
}
