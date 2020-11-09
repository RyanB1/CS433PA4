

public class Dijkstra extends Graph {

	public Dijkstra(Graph graph) {
		super(graph);
	}

	public int[] execute(int source) { 
		int[] distance = new int[numVertices];
		Arrays.fill(distance, Integer.MAX_VALUE);
		boolean[] closed = new boolean[numVertices];
		Arrays.fill(closed, false);
		PriorityQueue<Integer> open = new PriorityQueue<Integer>();
		open.setPriority(source, 0);
		distance[source] = 0;
		while(open.getSize() != 0) {
			int minVertex = open.getMinimumItem();
			open.deleteMinimum();
			closed[minVertex] = true;
			//Not Finished
		}
	}
}
