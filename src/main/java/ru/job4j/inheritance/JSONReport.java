package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
//        return  name + " : name"+"," + System.lineSeparator() + body + " : body";
        return String.format("{%n\t\"name\":%s, %n\t\"body\":%s%n}", name, body);
    }


}
