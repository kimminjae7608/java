package smaple_W;

public class ProductMgr {
	private int MAX_SIZE = 100;
	private Product[] pd = new Product[MAX_SIZE];
	private int size = 0;

	public ProductMgr() {
		super();
	}

	// 배열에 객체 추가, 중복된 객체 입력 방지
	public void add(Product p) {
		if (size < MAX_SIZE) {
			boolean flag = true;
			for (int i = 0; i < size; i++) {
				if (pd[i].equals(p)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				pd[size++] = p;
			} else {
				System.out.println("중복된 데이터입니다.");
			}
		}
	}

	// 상품리스트 출력
	public Product[] getList() {
		Product result[] = new Product[size];
		System.arraycopy(pd, 0, result, 0, size);
		return result;
	}

	// 상품번호로 상품을 검색
	public Product searchNum(String pnum) {
		for (int i = 0; i < size; i++) {
			if (pd[i].getPnum().equals(pnum)) {
				return pd[i];
			}
		}
		return null;
	}

	// 상품명으로 상품을 검색(부분 검색 가능)
	public Product[] searchTitle(String title) {
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (pd[i].getTitle().contains(title)) {
				cnt++;
			}
		}
		Product result[] = new Product[cnt];
		int a = 0;
		for (int i = 0; i < size; i++) {
			if (pd[i].getTitle().contains(title)) {
				result[a++] = pd[i];
			}
		}

		return result;
	}

	// TV 정보만 검색
	public Product[] getTV() {
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (pd[i] instanceof TV) {
				cnt++;
			}
		}
		Product result[] = new Product[cnt];
		int a = 0;
		for (int i = 0; i < size; i++) {
			if (pd[i] instanceof TV) {
				result[a++] = pd[i];
			}
		}

		return result;
	}

	// 냉장고만 검색
	public Product[] getRef() {
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (pd[i] instanceof Refrigerator) {
				cnt++;
			}
		}
		Product result[] = new Product[cnt];
		int a = 0;
		for (int i = 0; i < size; i++) {
			if (pd[i] instanceof Refrigerator) {
				result[a++] = pd[i];
			}
		}

		return result;
	}

	// 상품번호로 상품을 삭제
	public void deleteNum(String pnum) {
		for (int i = 0; i < size; i++) {
			if (pd[i].getPnum().equals(pnum)) {
				pd[i] = pd[size - 1];
				size--;
				break;
			}
		}
	}

	// 전체 재고 상품 금액 구하기
	public int getPriceAll() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			int a = pd[i].getPrice();
			int b = pd[i].getCount();
			sum += (a * b);
		}

		return sum;
	}
}
