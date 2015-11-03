import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class StreamTest {

	public static void main(String[] args) {
		Map<Integer, Integer> ddd = new LinkedHashMap<Integer, Integer>();
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			ddd.put(i, r.nextInt(100));
		}

		Map<Integer, Integer> eeee = new LinkedHashMap<Integer, Integer>();
		ddd.entrySet().stream().filter(e -> e.getValue() > 50).forEach(e -> {
			eeee.put(e.getKey(), e.getValue());
		});

		eeee.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey() + " : " + e.getValue());
		});
	}

}
