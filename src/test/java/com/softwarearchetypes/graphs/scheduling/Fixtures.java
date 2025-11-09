package com.softwarearchetypes.graphs.scheduling;

class Fixtures {

    static final ProcessStep DRYING = new ProcessStep("Drying");
    static final ProcessStep CALIBRATION = new ProcessStep("Calibration");
    static final ProcessStep MEASUREMENT = new ProcessStep("Measurement");
    static final ProcessStep SPECTROSCOPY = new ProcessStep("Spectroscopy");
    static final ProcessStep ANALYSIS = new ProcessStep("Analysis");
    static final ProcessStep VALIDATION = new ProcessStep("Validation");
    static final ProcessStep PREPARATION = new ProcessStep("Preparation");
    static final ProcessStep FINALIZATION = new ProcessStep("Finalization");

    static final ProcessStep STEP_1 = new ProcessStep("Step 1");
    static final ProcessStep STEP_2 = new ProcessStep("Step 2");
    static final ProcessStep STEP_3 = new ProcessStep("Step 3");

    static final ProcessStep PATH_1 = new ProcessStep("Path 1");
    static final ProcessStep PATH_2 = new ProcessStep("Path 2");
}
