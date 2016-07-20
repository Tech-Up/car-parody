package models.cars;

import abstracts.AbstractCoupeCar;
import enums.Colour;
import interfaces.Engine;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public class Jeepney extends AbstractCoupeCar {

  public Jeepney(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Jeepney(Engine engine, Colour colour) {
    super(engine, colour);
  }

  @Override
  public String toString() {
    String car = "Jeepney colour " + getColour();
    return car + " and " + getEngine().getSize() + " litters engine.";
  }

}
