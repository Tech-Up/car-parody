package interfaces;

import enums.Colour;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public interface Car {

  Engine getEngine();

  Colour getColour();

  void paint(Colour colour);

}
