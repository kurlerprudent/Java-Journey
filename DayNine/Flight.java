package DayNine;

public class Flight {
    private String flightName;
    private int flightNumber;
    private String flightOrigin;
    private String flightDestination;

    public Flight(String flightName, String flightDestination, int flightNumber, String flightOrigin) {
        this.flightDestination = flightDestination;
        this.flightName = flightName;
        this.flightNumber = flightNumber;
        this.flightOrigin = flightOrigin;

    }

    public String getFlightName() {
        return flightName;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightOrigin() {
        return flightOrigin;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightName(String name) {
        flightName = name;
    }

    public void setFlightNumber(int number) {
        flightNumber = number;
    }

    public void setFlightDestination(String destination) {
        flightName = destination;
    }

    public void setFlightOrigin(String origin) {
        flightName = origin;
    }

    public void flightInfo() {
        System.out.println("Flight number: " + flightNumber + "\t Airline: " + flightName + "\t Flight Origin: "
                + flightOrigin + "\t Flight Destination: " + flightDestination);
    }

}
