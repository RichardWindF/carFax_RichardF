package com.example.carfax_richardf;




import java.util.ArrayList;
import java.util.List;

//give data to outside
public class DataUtil
{
    public static List<Vehicle> generateVehicleList()
    {
        List<Vehicle> vehicleList=new ArrayList<>();

        Vehicle vehicle1=new Vehicle(R.drawable._2015_toyota_camry,"2015","Toyota","camry","v4",15000f,43000d, "New York,NY","9171107461");
        Vehicle vehicle2=new Vehicle(R.drawable._2016_ford_f_150,"2016","Ford","F-150","v8",13000f,143000d, "Orlando,FL","8501107461");
        Vehicle vehicle3=new Vehicle(R.drawable._2016_honda_fit,"2016","Honda","fit","v4",12000f,63000d, "Toronto,NY","75671107461");
        Vehicle vehicle4=new Vehicle(R.drawable._2018_nissan_micro,"2018","Nissan","Micro","v4",19000f,67000d, "New York,NY","9171107461");
        Vehicle vehicle5=new Vehicle(R.drawable._2019_mercedes_benz,"2019","Benz","Benz","v6",25000f,63000d, "Waterloo,ON","5181107461");

        vehicleList.add(vehicle1);
        vehicleList.add(vehicle2);
        vehicleList.add(vehicle3);
        vehicleList.add(vehicle4);
        vehicleList.add(vehicle5);

        return vehicleList;
    }

}
