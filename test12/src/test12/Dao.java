package test12;

import java.util.List;

public class Dao {

	//Singleton 패턴
	private static Dao dao = new Dao();
	
	private Dao() {
		
	}
	
	public static Dao Instance() {
		return dao;
	}
	
	public List<Vo> getList(){
	
		return null;
	}
}
