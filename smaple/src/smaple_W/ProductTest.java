package smaple_W;

public class ProductTest {

	public static void main(String[] args) {
		ProductMgr pd = new ProductMgr();
		
		pd.add(new TV("1223", "삼성 TV", 1000000, 50, "50", "OLED"));
		pd.add(new TV("1253", "LG TV", 1100000, 30, "45", "롤러블"));
		pd.add(new Refrigerator("2345", "S냉장고", 1500000, 90, "120L"));
		pd.add(new Refrigerator("2645", "L냉장고", 2000000, 80, "150L"));
		
		System.out.println("********************제품 목록********************");
		for(Product p : pd.getList()) {
			System.out.println(p.toString());
		}
		System.out.println("********************TV 목록********************");
		for(Product p : pd.getTV()) {
			System.out.println(p.toString());
		}
		System.out.println("********************냉장고 목록********************");
		for(Product p : pd.getRef()) {
			System.out.println(p.toString());
		}
		
		System.out.println("********************번호 검색 : 1223********************");
		System.out.println(pd.searchNum("1223"));
		System.out.println("********************제목 검색 : 삼성********************");
		for(Product p : pd.searchTitle("L")) {
			System.out.println(p.toString());
		}
		
		System.out.println("********************제품 삭제 : 1223********************");
		pd.deleteNum("1223");
		System.out.println("********************제품 목록********************");
		for(Product p : pd.getList()) {
			System.out.println(p.toString());
		}
		
		System.out.printf("전체 재고 상품의 가격 총합 : %d\n", pd.getPriceAll());
	}

}
