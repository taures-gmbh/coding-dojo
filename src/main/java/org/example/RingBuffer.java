package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class RingBuffer<T> {

  private final int size;
  private LinkedList<T> buffer;

  public RingBuffer(int size) {
    this.size = size;
    buffer = new LinkedList<>();
  }

  public int size() {
    return size;
  }

  public void add(T entry) {
    if (size() == count()) {
      take();
    }
    buffer.addLast(entry);
  }

  public int count() {
    return buffer.size();
  }

  public T take() {
    return buffer.removeFirst();
  }
}
