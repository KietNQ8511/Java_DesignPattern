package adapter;

public class TranslatorAdapter implements VietnameseTarget {
	private Adaptee adaptee;
	
	public TranslatorAdapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public void send(String words) {
		// TODO Auto-generated method stub
		System.out.print("Reading words ... \t");
		System.out.println(words);
		
		String vietnameseWords = this.translator(words);
		System.out.println("Sending words ..." + words);
		adaptee.receive(vietnameseWords);
	}
	
	public String translator(String words) {
		System.out.println("TranslatorAdapter \ttranslator\tmethod");
		if (this.adaptee instanceof KoreanAdaptee) {
			return koreaTranslate(words);
		} else {
			return japanTranslateslator(words);
		}
	}
	
	/* ============= */
	
	public String koreaTranslate(String words) {
		System.out.println("TranslatorAdapter\tkoreaTranslate\tmethod");
		return "Chữ Hàn";
	}
	
	public String japanTranslateslator(String words) {
		System.out.println("TranslatorAdapter \ttranslator\tmethod");
		return "こんにちは";
	}
	
	/* ============= */
	public static void main(String[] args) {
		VietnameseTarget vnClient = new TranslatorAdapter(new JapaneseAdaptee());
		vnClient.send("Hello");
		System.out.println("---------------------------------------");
		VietnameseTarget koreanClient = new TranslatorAdapter(new KoreanAdaptee());
		koreanClient.send("Hello");
	}
}
