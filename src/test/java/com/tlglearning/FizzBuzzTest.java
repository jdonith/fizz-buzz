package com.tlglearning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  @Test
  void valueOf_fizz() {
    //assertEquals (Set.of(FizzBuzz.FIZZ, FizzBuzz.valueOf(6));
    assert Set.of(FizzBuzz.FIZZ).equals(FizzBuzz.valueOf(9));

  }

  @Test
  void valueOf_buzz() {

  assertEquals(Set.of(FizzBuzz.BUZZ), FizzBuzz.valueOf(10));

}

@Test
  void valueOf_fizzBuzz() {
    assertEquals(Set.of(FizzBuzz.FIZZ, FizzBuzz.BUZZ), FizzBuzz.valueOf(15));
}
@Test
  void valueOf_none() {
    assertEquals(Set.of(), FizzBuzz.valueOf(11));
}

}