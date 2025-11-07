package com.softwarearchetypes.graphs.influence;

class Fixtures {
    static final PhysicsProcess THERMAL = new PhysicsProcess("thermal");
    static final PhysicsProcess CONDUCTIVITY = new PhysicsProcess("conductivity");
    static final PhysicsProcess SPECTROSCOPY = new PhysicsProcess("spectroscopy");

    static final Laboratory LAB_A = new Laboratory("Lab A");
    static final Laboratory LAB_B = new Laboratory("Lab B");
    static final Laboratory LAB_C = new Laboratory("Lab C");

    static InfrastructureInfluence emptyInfrastructure() {
        return InfrastructureInfluence.builder().build();
    }
}
