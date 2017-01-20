/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 24.11.2016
 */
package abstractclass;

/**
 * Created by molterfe on 24.11.2016.
 */
public class AbstractClassDemo {

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void publicMethod() {
                super.publicMethod();
            }

            @Override
            protected void protectedMethod() {
                super.protectedMethod();
            }

            @Override
            public void callPrivateMEthod() {
                super.callPrivateMEthod();
            }

            @Override
            public void publicAbstractedMethod() {
                System.out.println("AnonymousClass::publicAbstractedMethod");
            }
        };
        abstractClass.publicAbstractedMethod();
//        abstractClass.publicMethod();
//        abstractClass.protectedMethod();
//        abstractClass.callPrivateMEthod();

        AbstractClassImpl abstractClassImpl = new AbstractClassImpl();
        abstractClassImpl.publicAbstractedMethod();
//        abstractClassImpl.publicMethod();
//        abstractClassImpl.protectedMethod();
//        abstractClassImpl.callPrivateMEthod();
    }
}
