package org.hbrs.s1.ws22.uebung1.control;

// Verwendung des Factory Method Design Pattern (GoF)
//Problem:
public class TranslatorFactory {
    public static GermanTranslator createGermantranslator(){
        return new GermanTranslator();
    }
}
