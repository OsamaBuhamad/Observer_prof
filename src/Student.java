/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Student implements Observer{
	private String name;
	private Date midterm;
	

	public Student(String aName) {
		this.name = aName;
	}

	public String getName() {
		return this.name;
	}

	public void study(Date date){
		this.midterm = date;
		System.out.println(name + " : Doh! I have to study hard for my midterm on " + this.midterm);
	}
	
	public void party(Date date){
		this.midterm = date;
		System.out.println(name + " : Alright! I get to party since my midterm isn't until " + this.midterm);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		if (this.midterm == null)
		{
			this.study((Date) arg1);
			System.out.println("Study is called");
		}
		
		else if (this.midterm.compareTo((Date) arg1) > 0) 
		{
			this.study((Date) arg1);
			System.out.println("Study is called");
		}
		else if (this.midterm.compareTo((Date) arg1) < 0)
		{
			this.party((Date) arg1);
			System.out.println("party is called");
		}
		
		
	}
}
