package de.robertz.wt.harvard.cs50_ai_intro.search;

import lombok.Getter;

import java.util.Map;
import java.util.Set;

public class CyclicGraph {

	Node node;

	@Getter
	public static class Node {
		String name;
		Map<String, Node> nodes;
		public Node(String name) {
			this.name = name;
		}
		public void put(Node node) {
			nodes.put(node.name, node);
		}
		public Set<String> connectsTo() {
			return nodes.keySet();
		}
		public void putWithBackReference(String name) {
			Node node = new Node(name);
			node.put(this);
			nodes.put(name, node);
		}
	}
}
