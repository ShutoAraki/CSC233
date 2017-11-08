
public class App {

	public static void main(String[] args) {
		
		Vertex vertexA = new Vertex("A");
		Vertex vertexB = new Vertex("B");
		Vertex vertexC = new Vertex("C");
		Vertex vertexD = new Vertex("D");
		Vertex vertexE = new Vertex("E");
		Vertex vertexF = new Vertex("F");
		
		
		// Setting up a graph
		vertexA.addNeighbor(vertexB);
		vertexA.addNeighbor(vertexD);
		
		vertexB.addNeighbor(vertexC);
		vertexB.addNeighbor(vertexD);
		
		vertexC.addNeighbor(vertexB);
		
		vertexD.addNeighbor(vertexC);
		vertexD.addNeighbor(vertexE);
		vertexD.addNeighbor(vertexF);
		
		vertexE.addNeighbor(vertexC);
		
		vertexF.addNeighbor(vertexC);
		
		DFS dfs = new DFS();
		System.out.println("DFS:");
		dfs.dfs(vertexA);
		
		// Resetting the vertices
		vertexA.setVisited(false);
		vertexB.setVisited(false);
		vertexC.setVisited(false);
		vertexD.setVisited(false);
		vertexE.setVisited(false);
		vertexF.setVisited(false);
		
		System.out.println();
		
		System.out.println("BFS:");
		BFS.bfs(vertexA);
		
	}
	
}
