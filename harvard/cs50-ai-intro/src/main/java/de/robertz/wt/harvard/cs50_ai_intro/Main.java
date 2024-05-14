package de.robertz.wt.harvard.cs50_ai_intro;

public class Main {
	public static void main(String[] args) {
		// Action (Apply), Transition Model (Result), Frontier (unexplored), visited, modality=function traverse (depth first, breadth first...)
		/*
		* Start with frontier with initial state
		* Start with empty expanded (visited) set
		* Repeat:
		*   -if frontier empty, no solution
		*   -Remove (fetch) a node from frontier
		*   -if node = goal, finish (or in advanced model: record goal path)
		*   -add node to expanded set.
		*   -Expand node, add resulting nodes ot frontier if not in expanded.
		* (Advanced) determine shortest solution and sort by cost
		* */
	}
}