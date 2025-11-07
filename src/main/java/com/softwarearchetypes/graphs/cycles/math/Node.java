package com.softwarearchetypes.graphs.cycles.math;

public record Node<T>(T property) {
    @Override
    public String toString() {
        return String.valueOf(property);
    }
}
