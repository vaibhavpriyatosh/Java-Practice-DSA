class ppbv {
    int countPathsUtil(ArrayList<ArrayList<Integer>> adj, int u, int d,
                       int pathCount) {
        // if current node is equal to destination node, we increase the count.
        if (u == d) {
            pathCount++;
        } else {
            Iterator<Integer> i = adj.get(u).listIterator();
            // traversing over the adjacent vertices.
            while (i.hasNext()) {
                int n = i.next();
                // calling the function recursively for adjacent node.
                pathCount = countPathsUtil(adj, n, d, pathCount);
            }
        }
        return pathCount;
    }

    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        int pathCount = 0;

        // calling the function to count paths.
        pathCount = countPathsUtil(adj, source, destination, pathCount);
        return pathCount;
    }
}