/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 24.11.2016
 */
package abstractfactory.factory;

import abstractfactory.color.Color;
import abstractfactory.shape.Circle;
import abstractfactory.shape.Rectangle;
import abstractfactory.shape.Shape;
import abstractfactory.shape.Square;

/**
 * Created by molterfe on 24.11.2016.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }

        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
