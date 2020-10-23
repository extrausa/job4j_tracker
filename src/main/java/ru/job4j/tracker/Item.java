package ru.job4j.tracker;
//2. Перегрузка конструктора [#363143]
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    private LocalDateTime currentDateTime = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    private String currentDateTimeFormat = currentDateTime.format(formatter);

    public Item() {};

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Item(int id) {
        this.id = id;
    }


    public String getCurrentDateTimeFormat() {
        return currentDateTimeFormat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currentDateTime=" + currentDateTime +
                ", formatter=" + formatter +
                ", currentDateTimeFormat='" + currentDateTimeFormat + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}