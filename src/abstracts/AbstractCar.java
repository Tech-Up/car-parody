package abstracts;

import enums.Colour;
import interfaces.Car;
import interfaces.Engine;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public abstract class AbstractCar implements Car {

  private Engine engine;

  private Colour colour;

  public AbstractCar(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractCar(Engine engine, Colour colour) {
    this.engine = engine;
    this.colour = colour;
  }

  @Override
  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public Colour getColour() {
    return colour;
  }

  public void setColour(Colour colour) {
    this.colour = colour;
  }

  @Override
  public void paint(Colour colour) {
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "AbstractCar {" +
        "engine=" + engine +
        ", colour=" + colour +
        '}';
  }
}
