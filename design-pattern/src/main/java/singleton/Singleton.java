/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 24.11.2016
 */
package singleton;

/**
 * Created by molterfe on 24.11.2016.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){
        System.out.println("constructor");
    };

    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("I am Singleton!");
    }
}
