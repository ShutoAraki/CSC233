import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;
	
	public DFS() {
		stack = new Stack<>();
	}
	
	public void dfs(Vertex root) {
		
		stack.add(root);
		root.setVisited(true);
		
		while ( !stack.isEmpty() ) {
			
			Vertex actualVertex = stack.pop();
			System.out.print(actualVertex + " ");
			
			for (Vertex v : actualVertex.getAdjacenciesList()) {
				if ( !v.isVisited()) {
					v.setVisited(true);
					v.setPredecessor(actualVertex);
					stack.push(v);
				}
			}
			
		}
		
	}
	
}
