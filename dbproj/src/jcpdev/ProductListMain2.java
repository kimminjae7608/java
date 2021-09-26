package jcpdev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ProductDao;
import vo.ProductVo;

public class ProductListMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ProductVo> list = new ArrayList<ProductVo>();
		ProductDao dao = ProductDao.getProductDao();
		Scanner sc = new Scanner(System.in);
		list = dao.getList();
		System.out.println(list);
		
		for(ProductVo l : list)
			System.out.println(l);
		String category =sc.nextLine();
		
		list = dao.getCategoryList(category);
		for(ProductVo l : list)
			System.out.println(l);
		
	}

}
