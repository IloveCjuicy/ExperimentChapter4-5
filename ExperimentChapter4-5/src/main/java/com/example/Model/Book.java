package com.example.Model;

public class Book
{
    private Object pw2;
    private Object pw3;
    private Object pw4;
    private Object pw5;
    private Object pw6;
    private Object day;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "pw2=" + pw2 +
                ", pw3=" + pw3 +
                ", pw4=" + pw4 +
                ", pw5=" + pw5 +
                ", pw6=" + pw6 +
                ", day=" + day +
                '}';
    }

    public Object getPw2() {
        return pw2;
    }

    public void setPw2(Object pw2) {
        this.pw2 = pw2;
    }

    public Object getPw3() {
        return pw3;
    }

    public void setPw3(Object pw3) {
        this.pw3 = pw3;
    }

    public Object getPw4() {
        return pw4;
    }

    public void setPw4(Object pw4) {
        this.pw4 = pw4;
    }

    public Object getPw5() {
        return pw5;
    }

    public void setPw5(Object pw5) {
        this.pw5 = pw5;
    }

    public Object getPw6() {
        return pw6;
    }

    public void setPw6(Object pw6) {
        this.pw6 = pw6;
    }

    public Object getDay() {
        return day;
    }

    public void setDay(Object day) {
        this.day = day;
    }

    public Book(Object pw2, Object pw3, Object pw4, Object pw5, Object pw6, Object day) {
        this.pw2 = pw2;
        this.pw3 = pw3;
        this.pw4 = pw4;
        this.pw5 = pw5;
        this.pw6 = pw6;
        this.day = day;
    }
}
