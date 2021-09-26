package day9Review;

public class ACycle extends AVehicle{
	
	public ACycle(String name, String color){
		super(name,color);
	}
	
	@Override
	public int speedAvg() {
		return (this.getMaxSpeed()+this.getMinSpeed())/2;
	}
	
	

}
