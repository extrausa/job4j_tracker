package ru.job4j.tracker;

import java.util.Dictionary;

public class Doctor extends Profession {
    private int experence;
    private int operatingHours;

    public int getExperence() {
        return experence;
    }

    public int getOperatingHours() {
        return operatingHours;
    }

    public void setExperence(int experence) {
        this.experence = experence;
    }

    public void setOperatingHours(int operatingHours) {
        this.operatingHours = operatingHours;
    }

    public Diagnosis heal(Pacient pacient) {
        return null;
    };

}
