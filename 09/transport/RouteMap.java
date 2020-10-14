package transport;
import transport.cars.*;
import transport.train.*;

public class RouteMap {
  public String getTaxiName() {
    Taxi t = new Taxi();
    return t.getName();
  }

  public String getLocalLineName() {
    LocalLine l = new LocalLine();
    return l.getName();
  }

  public static void main(String[] args) {
    RouteMap r = new RouteMap();
    System.out.println(r.getTaxiName());
    System.out.println(r.getLocalLineName());
  }
}
