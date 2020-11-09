

public class BellmanFord extends Graph {

	public BellmanFord(final Graph graph) {
		super(graph);
	}

	public int[] execute(int source) { 
		int[] dist = new int[numVertices];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[source] = 0;
		boolean didDistChange = false;
		for(int i = 1; i <= numVertices-1; i++) {
			didDistChange = false;
			for(int j = 0; j < numVertices; j++) {
				for(int k = 0; k < adjList.get(j).size(); k++) {
					//Not Finished
				}
			}
		}
	}
}
