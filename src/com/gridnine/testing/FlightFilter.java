package com.gridnine.testing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightFilter implements Filter{

    @Override
    public void Filtered(List<Flight> flightList) {

        LocalDateTime now = LocalDateTime.now();

        for (Flight flight : flightList) {
            for (Segment segment : flight.getSegments()) {
                if (segment.getDepartureDate().compareTo(now) > 0) {
                    System.out.println(segment);
                }
            }
        }

        System.out.println("=====================================");

        for (Flight flight : flightList) {
            for (Segment segment : flight.getSegments()) {
                if (segment.getArrivalDate().compareTo(segment.getDepartureDate()) < 0) {
                    System.out.println(segment);
                }
            }
        }

        System.out.println("=====================================");


        for (Flight flight : flightList) {
            for (int i = 0; i < flight.getSegments().size(); i++) {
                for (int j = i + 1; j < flight.getSegments().size(); j++) {
                    Segment segment = flight.getSegments().get(i);
                    Segment segment1 = flight.getSegments().get(j);
                    List<Segment> list = new ArrayList<>();
                    if (segment.getArrivalDate().getHour() - segment1.getDepartureDate().getHour() == -2) {
                        list.add(segment);
                        list.add(segment1);
                        list.forEach(System.out::println);
                    }
                }
            }
        }
    }
}
