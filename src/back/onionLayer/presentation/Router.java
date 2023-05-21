package back.onionLayer.presentation;

import back.onionLayer.application.usecase.GenerateFirstFieldUseCase;

public class Router {
	private final GenerateFirstFieldUseCase generateFirstFieldUseCase;
	public Router() {
		this.generateFirstFieldUseCase = new GenerateFirstFieldUseCase();
	}
	
	public boolean startNewGame() {
		return generateFirstFieldUseCase.run();
	}
}
