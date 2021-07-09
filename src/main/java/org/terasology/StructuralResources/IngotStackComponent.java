// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.StructuralResources;

import org.terasology.gestalt.entitysystem.component.Component;

public class IngotStackComponent implements Component<IngotStackComponent> {
    public int ingots;

    @Override
    public void copy(IngotStackComponent other) {
        this.ingots = other.ingots;
    }
}
