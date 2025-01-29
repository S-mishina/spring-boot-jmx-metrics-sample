package springbootjmxmetricssample.util;

import java.util.Random;
import io.opentelemetry.instrumentation.annotations.WithSpan;

public class Util {
  private static Random rand = new Random();

  @WithSpan
  public static int generateRandomValue() {
    return rand.nextInt(100);
  }
}
