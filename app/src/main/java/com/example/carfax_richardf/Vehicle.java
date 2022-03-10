package com.example.carfax_richardf;

public class Vehicle
{
    int vPhotoAdd;
    String year;
    String make, model, trim;
    float listPrice;
    double mileage;
    String location;
    String phone;

    //--------------------------------------

    public int getvPhotoAdd()
    {
        return vPhotoAdd;
    }

    public void setvPhotoAdd(int vPhotoAdd)
    {
        this.vPhotoAdd = vPhotoAdd;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year)
    {
        year = year;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getTrim()
    {
        return trim;
    }

    public void setTrim(String trim)
    {
        this.trim = trim;
    }

    public float getListPrice()
    {
        return listPrice;
    }

    public void setListPrice(float listPrice)
    {
        this.listPrice = listPrice;
    }

    public double getMileage()
    {
        return mileage;
    }

    public void setMileage(double mileage)
    {
        this.mileage = mileage;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    //--------------------------------------


    public Vehicle()
    {
    }

    public Vehicle(int vPhotoAdd, String year, String make, String model, String trim, float listPrice, double mileage, String location, String phone)
    {
        this.vPhotoAdd = vPhotoAdd;
        this.year = year;
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.listPrice = listPrice;
        this.mileage = mileage;
        this.location = location;
        this.phone = phone;
    }

    //------------------------------------------


    @Override
    public String toString()
    {
        return "Vehicle{" +
                "vPhotoAdd='" + vPhotoAdd + '\'' +
                ", Year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", trim='" + trim + '\'' +
                ", listPrice=" + listPrice +
                ", mileage=" + mileage +
                ", location='" + location + '\'' +
                ", phone=" + phone +
                '}';
    }
}
