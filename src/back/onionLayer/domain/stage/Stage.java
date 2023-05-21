package back.onionLayer.domain.stage;

import java.util.Arrays;

public class Stage {
	
	private final int fieldSize = 5;
	private StageObject[][] field;
	
	public Stage() {
		this.field = initField(fieldSize);
	}
	
	private StageObject[][] initField(int fieldSize) {
		
		StageObject[][] resultField = new StageObject[fieldSize+2][fieldSize+2];
		Arrays.stream(resultField).forEach(line -> Arrays.fill(line, EstgObjs.EMPTY));
		
		final int wallIndexFirst = 0;
		final int wallIndexEnd = resultField.length-1;
		final StageObject WALL = EstgObjs.WALL;
		
		Arrays.fill(resultField[wallIndexFirst], WALL);
		
		for(int xi=1; xi<wallIndexEnd; xi++) {
			resultField[xi][wallIndexFirst] = WALL;
			resultField[xi][wallIndexEnd] = WALL;
		}
		
		Arrays.fill(resultField[wallIndexEnd], EstgObjs.WALL);
		
		return resultField;
	}
	
	public StageObject[][] getField(){
		return field;
	}
	
	public static enum EstgObjs implements StageObject{
		EMPTY,
		WALL;
	}
}
