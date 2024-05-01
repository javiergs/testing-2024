package javiergs;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @org.junit.jupiter.api.Test
  void hypothenuse() {
    assertEquals(22.360679774997898, Main.hypothenuse(10, 20));
  }
}