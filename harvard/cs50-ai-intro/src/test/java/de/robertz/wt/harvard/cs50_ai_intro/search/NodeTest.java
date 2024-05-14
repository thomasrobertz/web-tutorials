package de.robertz.wt.harvard.cs50_ai_intro.search;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class NodeTest {
	@Test
	void test() {
		Node n = new Node("A");
		Node b = n.putWithBackReference("B");
		b.put("C");
		Node d = b.put("D");
		Node e = d.put("E");

		Set<String> ctb = b.connectsTo();
		assertThat(n.connectsTo().size()).isEqualTo(1);
		assertThat(ctb.size()).isEqualTo(3);
		assertThat(ctb).contains("A", "C", "D");
		assertThat(e.connectsTo().size()).isEqualTo(0);
	}

	@Test
	void testP() {
		Node g = Node.randomGraph(5 ,22).graph();
		g.toString();
	}
}