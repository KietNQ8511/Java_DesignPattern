package enume;

public class HocCuaGai {
	public static void main(String[] args) {
		Level lv = Level.LOW;
		
		System.out.println(lv.equals("LOW"));
	}
}

enum Level {
	LOW, MID, HIGH
}