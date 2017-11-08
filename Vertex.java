import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private boolean visited;
	private List<Vertex> adjacenciesList;
	private Vertex predecessor;
	
	public Vertex(String pName) {
		name = pName;
		adjacenciesList = new ArrayList<Vertex>();
	}
	
	public void addNeighbor(Vertex vertex) {
		adjacenciesList.add(vertex);
	}
	
	public boolean isVisited() {
		return visited;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public List<Vertex> getAdjacenciesList() {
		return adjacenciesList;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public boolean getVisited() { 
		return visited; 
	}
	
	@Override
	public String toString() {
		return name;
	}
}
