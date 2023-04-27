
public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();
        BFS a = new BFS();
        DFS b = new DFS();

        g.push(1, 2);
        g.push(2, 7);
        g.push(2, 4);
        g.push(7, 3);
        g.push(4, 6);
        g.push(6, 5);
        g.push(3, 4);
        g.push(3, 6);
        g.push(3, 5);
        g.push(5,4);

        a.setGraph(g);
        b.setGraph(g);

        a.setStart(1);
        a.setEnd(5);

        a.setNeedToVisitPoints(4);
        a.setNeedToVisitRibs(3, 4);

        b.setStart(1);
        b.setEnd(5);

        b.setNeedToVisitPoints(4);
        b.setNeedToVisitRibs(3, 4);

        System.out.println("BFS");
        a.run();

        System.out.println("DFS");
        b.run();
    }
}