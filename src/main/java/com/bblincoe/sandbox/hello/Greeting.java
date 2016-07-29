package com.bblincoe.sandbox.hello;

/**
 * Created by Brandon on 7/28/2016.
 */
public class Greeting {

    /**
     * A identifier for the greeting.
     */
    protected long id;
    /**
     * A message for the greeting.
     */
    protected String content;

    /**
     * Default constructor
     */
    public Greeting() {
        id = 0;
        content = "";
    }

    /**
     * Constructor
     *
     * @param id an identifier for the greeting
     * @param content a message for the greeting
     */
    public Greeting(final long id, final String content) {
        if (id < 0) {
            throw new IllegalArgumentException("id field cannot be negative");
        }
        this.id = id;
        this.content = content;
    }

    /**
     * @return an identifier for the greeting
     */
    public long getId() { return id; }

    /**
     * @return a message for the greeting
     */
    public String getContent() { return content; }

}
