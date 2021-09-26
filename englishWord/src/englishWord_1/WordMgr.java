package englishWord_1;

public class WordMgr {
	private Word [] w = new Word[100];
	private int size = 0;

	//단어 추가 및 중복제거
	public void add(Word w) {
		if(size<100) {
			boolean f = true;
			for(int i=0; i<size; i++) {
				if(this.w[i].equals(w)) {
					f =false;
					break;
				}
			}
	
		if(f) 
		this.w[size++]=w;
		else
			System.out.println("중복된 단어입니다.");
		}
	}
	
	//전체 조회
	public Word[] searchAll() {
		Word [] copy = new Word[size];
		System.arraycopy(w, 0, copy, 0, size);
		return copy;
	}
	//단어 조회
	public Word searchE(String english) {
		for(int i=0;i<size;i++)
			if(w[i].getEnglish().equals(english))
				return w[i];
		return null;
	
	}
	
	
	
}
