package com.company;

public class Car implements Printable01{
    String brand, model, configuration;
    int price, year;

    public String getBrand(){
        return brand;
    }

    public String getModel () {
        return model;}

    public String getConfiguration(){
        return configuration;
        }

    public int getPrice() {
        return price;
        }

    public int getYear() {
        return year;
        }

    Car ( String brand, String model, String configuration, int price, int year) {
        this.brand = brand;
        this.model = model;
        this.configuration = configuration;
        this.price = price;
        this.year = year;
    }

    public void println() {
        System.out.println("Автомобильмарки: " + brand +
                " Модель: " + model + " Конфигурация: " +
                configuration + " Цена " + price + " Годвыпуска: " + year);
    }
}
