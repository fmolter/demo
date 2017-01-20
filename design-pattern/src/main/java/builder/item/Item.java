/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 25.11.2016
 */
package builder.item;

import builder.packing.Packing;

/**
 * Created by molterfe on 25.11.2016.
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
