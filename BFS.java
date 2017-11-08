import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	public static void bfs(Vertex root) {
		
		Queue<Vertex> queue = new LinkedList<>();
		
		root.setVisited(true);
		queue.add(root);
		
		while ( !queue.isEmpty() ) {
			
			Vertex actualVertex = queue.remove();
			System.out.print(actualVertex + " ");
			
			for (Vertex v : actualVertex.getAdjacenciesList()) {
				if ( !v.isVisited() ) {
					v.setVisited(true);
					queue.add(v);
				}
			}
			
		}
		
	}
	
}
