package ru.job4j.inheritance;
//4. Переопределение [#363144]
//5. Аннотация @Override [#363145]
public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
