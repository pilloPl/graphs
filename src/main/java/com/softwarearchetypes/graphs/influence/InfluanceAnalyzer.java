package com.softwarearchetypes.graphs.influence;

import org.jgrapht.Graph;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.HashSet;
import java.util.Set;

class InfluanceAnalyzer {

    private final InfluenceMap influenceMap;

    InfluanceAnalyzer(InfluenceMap influenceMap) {
        this.influenceMap = influenceMap;
    }

    int countConflicts(Reservation newReservation, Set<Reservation> existingReservations) {
        int conflicts = 0;
        for (Reservation existing : existingReservations) {
            if (influenceMap.influences(newReservation, existing)) {
                conflicts++;
            }
        }
        return conflicts;
    }

    int countInfluenceZones(Set<Reservation> reservations) {
        Graph<Reservation, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
        for (Reservation reservation : reservations) {
            graph.addVertex(reservation);
        }
        for (Reservation r1 : reservations) {
            for (Reservation r2 : reservations) {
                if (!r1.equals(r2) && influenceMap.influences(r1, r2)) {
                    graph.addEdge(r1, r2);
                }
            }
        }
        ConnectivityInspector<Reservation, DefaultEdge> inspector = new ConnectivityInspector<>(graph);
        return inspector.connectedSets().size();
    }

    int countInfluenceZones(Reservation newReservation, Set<Reservation> with) {
        Set<Reservation> allReservations = new HashSet<>(with);
        allReservations.add(newReservation);
        return countInfluenceZones(allReservations);
    }
}
