/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class TeachingAssistant implements Observer {
	private String name;
	private Date midterm;

	public TeachingAssistant(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void proctor(Date date){
		this.midterm = date;
		System.out.println(name + " : I have to proctor a midterm on " + this.midterm);
	}
	
	public void postpone(Date date){
		this.midterm = date;
		System.out.println(name + " : Now the midterm is on " + this.midterm);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("TA update");
		
		if (this.midterm == null)
		{
			this.proctor((Date) arg);
			System.out.println("proctor is called");
		}
		
		else if (this.midterm.compareTo((Date) arg)<0) 
		{
			this.proctor((Date) arg);
			System.out.println("proctor is called");
		}
		else if (this.midterm.compareTo((Date) arg) > 0)
		{
			this.postpone((Date) arg);
			System.out.println("postpone is called");
		}
	}
}
