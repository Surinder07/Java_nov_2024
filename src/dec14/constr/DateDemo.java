package dec14.constr;

import dec7.Demo;

public class DateDemo {

    int day;
    int month;
    int year;
    String name;


    public DateDemo(){
        day = 14;
        month = 12;
        year = 2024;
    }

    public DateDemo(int day) {
        this.day = day;
    }

    public DateDemo(String name) {
        this.name = name;
    }

    public DateDemo(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
