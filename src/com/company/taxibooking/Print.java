package com.company.taxibooking;

import java.util.List;

public class Print {
   public void printDetails(List<Taxi> taxis) {
          for(Taxi t:taxis){
              List<String> list=t.getTrip();
              System.out.println("Taxi - "+ t.getId() + " Driver Id "+ t.getDriverId()+" Total Earnings - " + t.getTotalEarnings());
              System.out.println("TaxiID   DriverID    BookingID    CustomerID    From    To    PickupTime    DropTime    Amount");

              for(int i=0;i<list.size();i++)
              {
                  System.out.println(t.getId() +"           "+ t.getDriverId()+ "          " + list.get(i));
              }
              System.out.println("--------------------------------------------------------------------------------------");
          }
       for(Taxi t:taxis){
           System.out.println(t.toString());
       }
   }
}
