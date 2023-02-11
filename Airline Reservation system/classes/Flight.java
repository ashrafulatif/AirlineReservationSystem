package  classes;
import java.lang.*;
import interfaces.*;

public class Flight implements PassengerIOperations
{
	private String airlineName, fnumber, destination, departure,departure_date,departuretime;
	private int quantity;
	private Passenger passengers[]= new Passenger[234];

	
	
	public void setAirlineName(String airlineName)
	{
		this.airlineName=airlineName;
	}
	public void setFNumber(String fnumber)
	{
		this.fnumber=fnumber;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void setDeparture_date(String departure_date)
	{
		this.departure_date=departure_date;
	}
	public void setDeparture_time(String departuretime)
	{
		this.departuretime=departuretime;
	}
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
	public void setDeparture(String departure)
	{
		this.departure=departure;
	}
	public String getAirlineName()
	{
		return airlineName;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public String getDestination()
	{
		return destination;
	}
	public String getDeparture()
	{
		return departure;
	}
	public String getDeparture_date()
	{
		return departure_date;
	}
	public String getDeparture_time()
	{
		return departuretime;
	}
	public String getFNumber()
	{
		return fnumber;
	}

	public void insertPassenger(Passenger p)
	{
		int flag = 0;
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] == null)
			{
				passengers[i] = p;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Your booking is successful\n");
		}
		else
		{
			System.out.println("Can Not Insert\n");
		}
	}

	public void removePassenger(Passenger p)
	{
		int flag = 0;
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] == p)
			{
				passengers[i] = null;
				flag = 1;
				break;
			}
		}
		System.out.println();
		if(flag == 1){System.out.println("Your booking is canceled\n");}
		else{System.out.println("Can Not cancel\n");}
	}

	public void showAllPassenger()
	{
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] != null)
			{
				System.out.println();
				System.out.println("Airline Name\t\t: "+getAirlineName());
				System.out.println("Flight Number\t\t: "+getFNumber());
				System.out.println("Journey From\t\t: "+getDeparture()+" to "+getDestination());
				System.out.println("Jorney date and time\t: "+getDeparture_date()+", "+getDeparture_time());
    			passengers[i].showPDetails();
    		
    			//System.out.println();
			}
		}
	}

	public Passenger getPassenger(int nid)
	{
		Passenger p = null;
		
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] != null)
			{
				if(passengers[i].getNID() == nid)
				{
					p = passengers[i];
					break;
				}
			}
		}
		if(p != null)
		{
			System.out.println("flight Found");
			//p.showPDetails();

		}
		else
		{
			System.out.println(" Not Found");
		}
		return p;
	}


	public void showPassenger(int nid)
	{
		for(int i=0; i<passengers.length; i++)
		{
			if(passengers[i] != null)
			{
				if(passengers[i].getNID()==nid)
				{
					System.out.println();
					System.out.println("Airline Name\t\t: "+getAirlineName());
					System.out.println("Flight Number\t\t: "+getFNumber());
					System.out.println("Journey From\t\t: "+getDeparture()+" to "+getDestination());
					//System.out.print("Destination: "+getDestination());
					System.out.println("Jorney date and time\t: "+getDeparture_date()+", "+getDeparture_time());
					//System.out.println("\tDeparture Time: "+getDeparture_time());
	    			passengers[i].showPDetails();
    			}
    		
    			System.out.println();
			}
		}
	}


	public void showinfo()

	{	System.out.print("Airline Name: "+getAirlineName());
		System.out.print("\tFlight Number: "+getFNumber());
		System.out.print("\tTotal quantity: "+getQuantity());
		System.out.print("\tDeparture: "+departure);
		System.out.print("\tDestination: "+destination);
		System.out.print("\tDeparture date: "+getDeparture_date());
		System.out.println("\tDeparture Time: "+getDeparture_time());



	
	}

	//public abstract void showinfo();
	
	
}