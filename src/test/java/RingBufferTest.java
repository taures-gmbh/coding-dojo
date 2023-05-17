import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.RingBuffer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class RingBufferTest {

  @Test
  void testInitRingBuffer() {
    // given:
    int givenSize = 3;
    RingBuffer<Integer> ringBuffer = new RingBuffer<>(givenSize);

    // when:
    int resultSize = ringBuffer.size();

    // then:
    assertEquals(resultSize, givenSize);
  }

  @Test
  void testAddSingleEntry() {
    // given:
    RingBuffer<Integer> ringBuffer = new RingBuffer<>(3);

    // when:
    int addedNumber = 3;
    ringBuffer.add(addedNumber);

    // then: number is added to Ringbuffer
    assertEquals(1, ringBuffer.count());
    assertEquals(addedNumber, ringBuffer.take());
  }

  @Test
  void testAddRingBufferSizePlus1(){
    // given:
    int bufferSize = 3;
    RingBuffer<Integer> ringBuffer = new RingBuffer<>(bufferSize);

    // when:
    ringBuffer.add(1);
    ringBuffer.add(2);
    ringBuffer.add(3);
    ringBuffer.add(4);

    // then:
    assertEquals(bufferSize, ringBuffer.size());
    assertEquals(bufferSize, ringBuffer.count());
    assertEquals(2, ringBuffer.take());
    assertEquals(3, ringBuffer.take());
    assertEquals(4, ringBuffer.take());
    assertEquals(0, ringBuffer.count());
  }
}
