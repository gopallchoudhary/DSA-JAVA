import java.util.*;

public class Classroom {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.dest = d;
            this.src = s;
            this.wt = w;
        }
    }

    // , graph-creation
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
    }

    // . hashPath
    public static boolean hashPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }

        vis[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest] && hashPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }

        return false;
    }

    // . BFS
    public static void bfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]) {
                bfsUtill(graph, vis);
            }
        }
    }

    // . BFS-Utill
    public static void bfsUtill(ArrayList<Edge> graph[], boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0); // add source

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // . DFS
    public static void dfs(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            dfsUtill(graph, i, vis);
        }
    }

    // . DFS-Utill
    public static void dfsUtill(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtill(graph, e.dest, vis);
            }

        }
    }



    public static void main(String[] args) {
        int v = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(hashPath(graph, 0, 2, new boolean[v]));

        // // converting the graph array from null to arraylist
        // for (int i = 0; i < v; i++) {
        // graph[i] = new ArrayList<>();
        // }

        // // , consider the graph in notebook

        // // for 0
        // graph[0].add(new Edge(0, 1, 5));
        // // for 1
        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 2, 1));
        // graph[1].add(new Edge(1, 3, 3));
        // // for 2
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 3, 1));
        // graph[2].add(new Edge(2, 4, 2));
        // // for 3
        // graph[3].add(new Edge(3, 2, 1));
        // graph[3].add(new Edge(3, 1, 3));
        // // for 4
        // graph[4].add(new Edge(4, 2, 2));

        // // . 2's neighbours
        // for (int i = 0; i < graph[2].size(); i++) {
        // Edge e = graph[2].get(i);
        // System.out.println(e.dest);
        // }

    }
}