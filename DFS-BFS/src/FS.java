import java.security.Key;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public abstract class FS {

    protected Graph g = new Graph();
    protected int start;
    protected int end;
    protected int needToVisitPoints;
    protected pair<Integer, Integer> needToVisitRibs = new pair<Integer, Integer>();
    protected HashMap<Integer, Boolean> usedPoints = new HashMap<>();
    protected HashMap<pair<Integer,Integer>, Boolean> usedRibs = new HashMap<>();

    public void setGraph(Graph a){
        this.g = a;
    }

    public void setStart(int a){
        this.start = a;
    }
    public void setEnd(int a){
        this.end = a;
    }
    public int getStart() {
        return this.start;
    }
    public int getEnd() {
        return this.end;
    }

    public void setNeedToVisitPoints(int a) {
        this.needToVisitPoints = a;
    }

    public void setNeedToVisitRibs(int a, int b) {
        this.needToVisitRibs.first = a;
        this.needToVisitRibs.second = b;
    }

    protected abstract void run(int v, int pred);
    public abstract void run();

    protected class pair<T, U> {
        T first;
        U second;

        public pair(T a, U b) {
            this.first = a;
            this.second = b;
        }

        public pair() {
            this.first = null;
            this.second = null;
        }
    }
}
