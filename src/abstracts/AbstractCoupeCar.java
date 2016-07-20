package abstracts;

import enums.Colour;
import interfaces.Engine;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public abstract class AbstractCoupeCar extends AbstractCar {
  public AbstractCoupeCar(Engine engine) {
    this(engine, Colour.UNPAINTED);
  }

  public AbstractCoupeCar(Engine engine, Colour colour) {
    super(engine, colour);
  }
}
