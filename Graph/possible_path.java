import java.util.*;

class possible_path{
	public static void main(String[] args) {
		
	}
	public int MinimumWalk(int[][] graph, int u, int v, int k)
    {
        int V = graph.length;
        int mod = 1000000007;
        // Table to be filled up using DP. The value count[i][j][e]
        // will/ store count of possible walks from i to j with
        // exactly k edges
        int count[][][] = new int[V][V][k + 1];
 
        // Loop for number of edges from 0 to k
        for (int e = 0; e <= k; e++) {
            for (int i = 0; i < V; i++) // for source
            {
                for (int j = 0; j < V; j++) // for destination
                {
                    // initialize value
                    count[i][j][e] = 0;
 
                    // from base cases
                    if (e == 0 && i == j)
                        count[i][j][e] = 1;
                    if (e == 1 && graph[i][j] != 0)
                        count[i][j][e] = 1;
 
                    // go to adjacent only when number of edges
                    // is more than 1
                    if (e > 1) {
                        for (int a = 0; a < V; a++) // adjacent of i
                            if (graph[i][a] != 0)
                                count[i][j][e] = (count[i][j][e] % mod + count[a][j][e-1] % mod) % mod;
                    }
                }
            }
        }
        return count[u][v][k];
    }
}