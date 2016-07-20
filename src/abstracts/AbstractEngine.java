package abstracts;

import interfaces.Engine;

/**
 * Created by ceosilvajr on 20/07/2016.
 */
public abstract class AbstractEngine implements Engine {

  private int size;

  private boolean turbo;

  public AbstractEngine(int size, boolean turbo) {
    this.size = size;
    this.turbo = turbo;
  }

  @Override
  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo(boolean turbo) {
    this.turbo = turbo;
  }

  @Override
  public String toString() {
    return "AbstractEngine{" +
        "size=" + size +
        ", turbo=" + turbo +
        '}';
  }
}
