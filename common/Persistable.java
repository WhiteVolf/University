package university.common;

public abstract class Persistable {
	private static long counter;
	private long id;
	
	{
		id = counter++;
	}
	
	public Persistable(){
		
	}
	
	public static long getTotalNumber(){
		return counter;
	}
	
	public long getId(){
		return this.id;
	}
}
