package uhrzeit;

/**
 * Created by asztrik on 1/12/16.
 *
 * Datenformat-Klasse, in diesem Format wird die RESTful Service liefert
 *
 */
public class Uhrzeit {

    private final String content;
    private final String name;

    public Uhrzeit(String content, String name) {
        this.content = content;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }


}
