package com.bridgelabz.flightScheduling.src;

import java.util.List;

class FlightUtility{
    public static void displayFlightDetails(List<? extends Flight<?>> flights){
        for(Flight<?> flight : flights){
            flight.displayFlightInfo();
        }
    }
}

//class FlightUtility {
//    public static void displayFlightDetails(List<? extends Flight<?>> flights) {
//        for (Flight<?> flight : flights) {
//            flight.displayFlightInfo();
//        }
//    }
//}
