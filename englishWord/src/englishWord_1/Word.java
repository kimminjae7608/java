package englishWord_1;

public class Word {
	private String english;
	private String koreans;
	
	public Word(String english, String koreans) {
		this.english=english;
		this.koreans=koreans;
		
	}
	
	public String getEnglish() {
		return english;
	}
	
	public String getKoreans() {
		return koreans;
	}
	
	@Override
	public String toString() {
		return "단어 : "+this.getEnglish()+" 뜻 : "+this.getKoreans();
	}

}
