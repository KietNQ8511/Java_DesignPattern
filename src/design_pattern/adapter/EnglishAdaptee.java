package design_pattern.adapter;

public class EnglishAdaptee implements Adaptee {
	@Override
	public void receive(String words) {
		System.out.println("Retrieving words from Adapter... [EnglishAdaptee]");
		System.out.println(words);
	}
}
