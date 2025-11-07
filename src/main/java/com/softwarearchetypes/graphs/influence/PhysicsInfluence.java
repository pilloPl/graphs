package com.softwarearchetypes.graphs.influence;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;


class PhysicsInfluence {
    private final Graph<PhysicsProcess, DefaultEdge> graph;

    private PhysicsInfluence(Graph<PhysicsProcess, DefaultEdge> graph) {
        this.graph = graph;
    }

    static Builder builder() {
        return new Builder();
    }

    Graph<PhysicsProcess, DefaultEdge> asGraph() {
        return graph;
    }

    static class Builder {
        private final Graph<PhysicsProcess, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);

        Builder addInfluence(PhysicsProcess from, PhysicsProcess to) {
            graph.addVertex(from);
            graph.addVertex(to);
            graph.addEdge(from, to);
            return this;
        }

        PhysicsInfluence build() {
            return new PhysicsInfluence(graph);
        }
    }
}