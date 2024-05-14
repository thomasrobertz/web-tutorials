package de.robertz.wt.harvard.cs50_ai_intro.search;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

@Getter
@Setter
public class Node {
	String name;
	Map<String, Node> nodes = new HashMap<>();
	public Node(String name) {
		this.name = name;
	}
	public Node put(String name) {
		Node node = new Node(name);
		nodes.put(name, node);
		return node;
	}
	public Set<String> connectsTo() {
		return nodes.keySet();
	}
	public Node putWithBackReference(String name) {
		Node node = new Node(name);
		node.nodes.put(this.name, this);
		nodes.put(name, node);
		return node;
	}
	public static ProblemSet randomGraph(int minSize, int maxSize /*, int minDepth, int maxDepth, int minBreadth, int maxBreadth, int cyclicChance*/ ) {

		Node graph = new Node("A");

		// TODO Finish implementation
		int size = new Random().nextInt(minSize, maxSize);
//		int reachMaxDepthAtNode = new Random().nextInt(minSize, maxSize);
//		int reachMaxBreadthAtNode = new Random().nextInt(minSize, maxSize);
//		int depth = new Random().nextInt(minDepth, maxDepth);
//		int breadth = new Random().nextInt(minBreadth, maxBreadth);

		for (int s = 0; s < size; s++) {
			int numNodes = new Random().nextInt(1, 4);
			List<Node> putNodes = new ArrayList<>();
			for (int n = 0; n < numNodes; n++) {
				String name = String.valueOf((char) 65 + s + n);
				putNodes.add(graph.put(name));
			}
			graph = putNodes.get(new Random().nextInt(numNodes));
		}

		return new ProblemSet(graph, "B");
	}
	record ProblemSet (Node graph, String goal) { }
}
