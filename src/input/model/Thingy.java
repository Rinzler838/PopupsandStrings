package input.model;

/**
 * 
 * @author dvil4688
 * @version 1.0 9/24/15
 */
public class Thingy
{

	private String name;
	private int age;
	private double weight;
	
	/**
	 * Sets the default values for each value; name, age, and weight. 
	 */
	
	public Thingy()
	{
		name = "";
		age = -99;
		weight = -.008;
	}
	
	/**
	 * 
	 * @param name
	 * @param age
	 * @param weight
	 */
	
	public Thingy(String name, int age, double weight)
	{
		//this. refers to the current instance of this object (A thingy)
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getWeight()
	{
		return weight;
	}

	public void setName()
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

}
