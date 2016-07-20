package abstracts;

import enums.Colour;
import interfaces.Engine;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public abstract class AbstractSportsCar extends AbstractCar {

  public AbstractSportsCar(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractSportsCar(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
