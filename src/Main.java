import enums.Colour;
import interfaces.Engine;
import models.cars.Ferrari;
import models.cars.Jeepney;
import models.engines.StandardEngine;
import models.engines.TurboEngine;

public class Main {

  public static void main(String[] args) {
    String carToMake = args[0];
    if (carToMake.equals("ferarri")) {
      createFerarri();
    } else if (carToMake.equals("jeepney")) {
      createJeepney();
    }
  }

  private static void createJeepney() {
    Engine engine = new StandardEngine(1);
    Jeepney jeepney = new Jeepney(engine);
    jeepney.paint(Colour.RED);
    System.out.println(jeepney.toString());
  }

  private static void createFerarri() {
    Engine engine = new TurboEngine(3);
    Ferrari ferrari = new Ferrari(engine, Colour.BLACK);
    System.out.println(ferrari.toString());
  }
}
