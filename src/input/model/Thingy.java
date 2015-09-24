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
	
	public Thingy()
	{
		name = "";
		age = -99;
		weight -.008;
	}
	
	public Thingy(String name, int age, double weight)
	{
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
}