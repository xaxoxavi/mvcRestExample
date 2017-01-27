package com.esliceu.dwes.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Xavi Torrens
 */
@XmlRootElement(name="Echo")
public class Echo {

    private String text;

    public Echo(){

    }

    public Echo(String hola) {
        text = hola;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
