/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 25.11.2016
 */
package builder.item;

import builder.packing.Packing;
import builder.packing.Wrapper;

/**
 * Created by molterfe on 25.11.2016.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
