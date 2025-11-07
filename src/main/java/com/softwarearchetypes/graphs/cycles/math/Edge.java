package com.softwarearchetypes.graphs.cycles.math;

public record Edge<T, P>(Node<T> from, Node<T> to, P property) {

    Edge(Node<T> from, Node<T> to) {
        this(from, to, null);
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }
}
