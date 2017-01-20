package abstractclass;/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 24.11.2016
 */

/**
 * Created by molterfe on 24.11.2016.
 */
public abstract class AbstractClass {

    public void publicMethod() {
        System.out.println("AbstractClass::publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("AbstractClass::protectedMethod");
    }

    private void privateMethod() {
        System.out.println("AbstractClass::privateMethod");
    }

    public void callPrivateMEthod(){
        this.privateMethod();
    }

    public abstract void publicAbstractedMethod();
}
