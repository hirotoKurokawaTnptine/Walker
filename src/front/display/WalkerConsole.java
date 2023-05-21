package front.display;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WalkerConsole {
	private final List<String> elements;
	
	public WalkerConsole(int[][] field) {
		elements = createStringListOfField(field);
		
	}
	
	public void display() {
		final List<String> lines = new ArrayList<>();
		
		final int cursorCount = 5;
		lines.addAll(cursorUp(cursorCount));
		lines.addAll(elements);
		
		// 表示
		lines.forEach(System.out::println);
	}
	
	
	private List<String> createStringListOfField(int[][] field){
		List<String> elements = new ArrayList<>();
		
		final String rowSplit = "-";
		final String columnSplit = "|";
		// field.length*4+1 -> 行を合わせるため
		final int numOfRowString = field[0].length*4+1;
		
		final String topAndBottom = StringUtils.repeat(rowSplit, numOfRowString);
		
		elements.add(topAndBottom);
		Arrays.stream(field).forEach(y -> {
			
			StringBuilder lineSb = new StringBuilder(columnSplit);
			Arrays.stream(y).forEach(x -> {
				final String space = " ";
				lineSb.append(space);
				lineSb.append(x);
				lineSb.append(space);
				lineSb.append(columnSplit);
			});
			elements.add(lineSb.toString());
			elements.add(topAndBottom);
		});
		return elements;
	}
	
	
	private List<String> cursorUp(final int count) {
		List<String> line = new ArrayList<>();
		for(int c=0; c<count; c++) {
			line.add("");
		}
		return line;
	}
}
