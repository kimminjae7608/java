package vo;

public class test {
	public static void main(String[] args) {
		CustomVo vo = new CustomVo();
		CustomVo vo1 = new CustomVo("momo","모모","asdasd",20,null);

		System.out.println(vo.getAge());
		vo.setAge(5);
		System.out.println(vo.getAge());
		
		CustomVo vo2 = new CustomVo("범기");
	}
}
