package Models;

import Service.Smartphones;

public class IPhones implements Smartphones {
    private String name;
    private int year;

    public IPhones(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public void loads() {
        System.out.println("IOS operating system");
    }

    @Override
    public void call() {
        System.out.println("Call from IPhone " + name);
    }

    @Override
    public void sms() {
        System.out.println("Sms from IPhone " + name);
    }

    @Override
    public void internet() {
        System.out.println("Wifi from Iphone " + name);
    }
}
