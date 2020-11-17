import java.util.Arrays;

public class Dijkstra extends Graph {

	public Dijkstra(Graph graph) {
		super(graph);
	}

	public int[] execute(int source) { 
		int[] distance = new int[numVertices];
		boolean[] closed = new boolean[numVertices];
		Arrays.fill(distance, Integer.MAX_VALUE);
		Arrays.fill(closed, false);

		PriorityQueue<Integer> open = new PriorityQueue<>();
		open.setPriority(source, 0);

		distance[source] = 0;

		while (open.getSize() > 0) {
			int minVertex = open.getMinimumItem();
			open.deleteMinimum();

			closed[minVertex] = true;

			for (Edge edge : super.adjList.get(minVertex)) {
				int adjVertex = edge.dest;
				if (!closed[adjVertex]) {
					int newDist = distance[minVertex] + edge.weight;
					if (newDist < distance[adjVertex]) {
						distance[adjVertex] = newDist;
						open.setPriority(adjVertex, newDist);
					}
				}
			}

		}
		return distance;
	}
}
