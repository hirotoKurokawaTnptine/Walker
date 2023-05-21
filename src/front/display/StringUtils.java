package front.display;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUtils {
	public static String repeat(String str, final int num) {
		return IntStream.range(0, num).mapToObj(i -> str).collect(Collectors.joining());
	}
}
