/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 24.11.2016
 */
package abstractfactory.factory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

/**
 * Created by molterfe on 24.11.2016.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
