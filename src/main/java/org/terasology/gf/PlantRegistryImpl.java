/*
 * Copyright 2014 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.gf;

import org.terasology.entitySystem.systems.BaseComponentSystem;
import org.terasology.entitySystem.systems.RegisterSystem;
import org.terasology.gf.generator.PlantGrowthDefinition;
import org.terasology.registry.Share;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Marcin Sciesinski <marcins78@gmail.com>
 */
@RegisterSystem
@Share(value = PlantRegistry.class)
public class PlantRegistryImpl extends BaseComponentSystem implements PlantRegistry {
    private Map<String, PlantGrowthDefinition> plants = new HashMap<>();

    @Override
    public void addPlantType(String plantId, PlantGrowthDefinition plantGrowthDefinition) {
        plants.put(plantId, plantGrowthDefinition);
    }

    @Override
    public PlantGrowthDefinition getPlantGrowthDefinition(String plantId) {
        return plants.get(plantId);
    }
}
