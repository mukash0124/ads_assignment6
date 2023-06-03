import java.util.*;

public class Vertex<V> {
    public V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        adjacentVertices = new HashMap<>();
        this.data = data;
    }

    public Double getWeight(Vertex<V> v) {
        return adjacentVertices.get(v);
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public boolean containsDestination(Vertex<V> v) {
        return adjacentVertices.containsKey(v);
    }

    public int getAdjacentCount() {
        return adjacentVertices.size();
    }

    public Iterable<V> getAdjacentVertices() {
        List<V> vertices = new LinkedList<>();
        for (Vertex<V> vertex : adjacentVertices.keySet()) {
            vertices.add(vertex.data);
        }
        return vertices;
    }
}