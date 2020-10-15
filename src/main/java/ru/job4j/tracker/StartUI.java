package ru.job4j.tracker;
//6. Date. Отображение даты. [#363140]
public class StartUI {

    public static void main(String[] args) {
        Item one = new Item();
        String dataTime = one.getCurrentDateTimeFormat();
        System.out.println(dataTime);
    }



}
