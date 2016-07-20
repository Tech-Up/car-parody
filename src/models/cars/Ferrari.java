package models.cars;

import abstracts.AbstractSportsCar;
import enums.Colour;
import interfaces.Engine;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public class Ferrari extends AbstractSportsCar {

  public Ferrari(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public Ferrari(Engine engine, Colour colour) {
    super(engine, colour);
  }

  @Override
  public String toString() {
    String car = "Ferrari colour = " + getColour() + " with";
    Engine engine = getEngine();
    if (engine.isTurbo()) {
      car = car + " turbo charge ";
    }
    return car + " and " + getEngine().getSize() + " litters engine.";
  }
}
