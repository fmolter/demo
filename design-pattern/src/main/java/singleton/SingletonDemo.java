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
public class SingletonDemo {

    public static void main(String[] args) {
//        Singleton object = new Singleton();
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

    }
}
