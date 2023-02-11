package  classes;
import java.lang.*;

public class Passenger
{
	protected String pName, pGender,pEmail,phnNumber; 
	protected int nid, age;
	
	public Passenger()
	{
	}
	public Passenger(String pName,int nid,int age,String pGender,String pEmail,String phnNumber)
	{
		this.pName = pName;
		this.nid = nid;
		this.age = age;
		this.pGender = pGender;
		this.pEmail = pEmail;
		this.phnNumber = phnNumber ;
	}
	public void setPName (String pName)
	{
		this.pName = pName;
	}
	public void setNID(int nid)
	{
		this.nid = nid;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setPGender(String pGender )
	{
		this.pGender = pGender;
	}
	public void setPEmail(String pEmail)
	{
		this.pEmail=pEmail;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber=phnNumber;
	}

	public String getPName()
	{
		return pName;
	}
	public int getNID()
	{
		return nid;
	}
	public int getAge()
	{
		return age;
	}
	public String getPGender()
	{
		return pGender;
	}
	public String getPEmail()
	{
		return pEmail;
	}
	public String getPhnNumber()
	{
		return phnNumber;
	}
	
	public void showPDetails()
	{
		System.out.println("Passenger Name\t\t: "+pName);
		System.out.println("Passenger NID\t\t: "+nid);
 		//System.out.println("Passenger Date of Birth: "+age);
 		System.out.println("Passenger Gender\t: "+pGender);
 		System.out.println("Passenger Email\t\t: "+pEmail);
 		System.out.println("Passenger Phone Number\t: "+phnNumber);
 	
		
	}
}