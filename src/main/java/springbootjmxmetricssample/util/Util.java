package springbootjmxmetricssample.util;

import java.util.Random;
import io.opentelemetry.instrumentation.annotations.WithSpan;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

public class Util {
  public static Random rand = new Random();

  @WithSpan
  public static int generateRandomValue() {
    return rand.nextInt(100);
  }

  // http request
  public static void httpRequest(String url) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    System.out.println(response.getBody());
  }
}
