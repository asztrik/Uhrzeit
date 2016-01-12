package uhrzeit.service;

/**
 * Created by asztrik on 1/10/16.
 * Microservice, die eine genaue Timestamp liefert, basiert auf System-Zeit
 */
public interface UhrzeitMicroService {

    /**
     * Minimale Funktion, die die Uhrezeit mit Datum liefert
     */
    String uhrzeit();

    /**
     * Minimale Funktion, liefert Servicename
     */
    String name();
}
