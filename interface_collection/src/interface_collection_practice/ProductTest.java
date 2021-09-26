package interface_collection_practice;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		
		//상품번호, 상품이름, 가격, 수량, 
		//상품번호, 상품이름, 가격, 수량, tv정보, 인치
		//상품번호, 상품이름, 가격, 수량, 냉장고정보
		
		IProductMgrC1 p = new IProductMgrC1();
		
		p.add(new TV(1, "2", 3, 4,"TV정보",30));
		p.add(new TV(2, "4", 3, 4,"TV정보1",28));
		p.add(new Refrigerator(3, "4", 3, 4, 280));
		p.add(new Refrigerator(4, "4", 3, 4, 508));

		
		System.out.println(p.toString());

		for(Product pro : p.searchRef()) {
			System.out.println(pro);
		}
		
		for(Product pro : p.searchTV()) {
			System.out.println(pro);
		}
		
		for(Product pro : p.searchAll()) {
			System.out.println(pro);
		}
		
		
		System.out.println(p.searchNum(1));
		System.out.println(p.searchName("2"));
		
		System.out.println();
		p.deleteNum(1);
		for(Product pro : p.searchAll()) {
			System.out.println(pro);
		}
		
		
		System.out.printf("모든제품의 총 금액 : %d\n", p.priceAll());
		
	}
}

