package org.hbrs.s1.ws22.uebung1.view;

import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;
import org.hbrs.s1.ws22.uebung1.control.Translator;
import org.hbrs.s1.ws22.uebung1.control.TranslatorFactory;

public class Client implements Translator {

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console (auch bezeichnet als CLI, Terminal)
		 */
		public void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!
			//GermanTranslator translate = new GermanTranslator();
			//String result = translate.translateNumber(1);

			//GermanTranslator translator = TranslatorFactory.createGermantranslator();
			//String result = translator.translateNumber(1);

			Translator translator = TranslatorFactory.createGermantranslator();
			String result = translator.translateNumber(2);

			System.out.println("Das Ergebnis der Berechnung: " +
					"[das Ergebnis an dieser Stelle]"  );



		}
		public String translateNumber(int number ) {
			return null;}
}





