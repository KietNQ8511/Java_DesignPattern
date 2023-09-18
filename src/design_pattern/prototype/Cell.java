package design_pattern.prototype;

import java.util.concurrent.TimeUnit;

public class Cell {
	private String color;
	private String coordinate;

	public Cell(String color) {
		this.color = color;
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Cell [color=" + color + "]";
	}
}
