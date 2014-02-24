package edu.macalester.comp124.section1.phones;

import java.awt.*;

/**
 * @author Shilad Sen
 */
public class SmartPhone extends Phone {
    private String model;
    private String osVersion;

    public SmartPhone(int[] number, Color color, String model, String osVersion) {
        super(number, color);
        this.model = model;
        this.osVersion = osVersion;
    }

    public String getModel() {
        return model;
    }

    public String getOsVersion() {
        return osVersion;
    }

    @Override
    public void sendText(int number[], String message) {

    }
}
