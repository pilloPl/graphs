package com.softwarearchetypes.graphs.cycles.math;

import java.util.List;
import java.util.stream.Collectors;

public record Path<T, P>(List<Edge<T, P>> edges) {
    @Override
    public String toString() {
        if (edges.isEmpty()) {
            return "-";
        }
        return edges.stream()
                .map(edge -> edge.to().toString())
                .collect(Collectors.joining(" -> ", edges.get(0).from() + " -> ", ""));
    }
}
