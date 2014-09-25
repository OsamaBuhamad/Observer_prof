
public class CheckStatus {
	
	private boolean ch;
	
	public CheckStatus(boolean ch)
	{
		this.ch=ch;
	}
	
	public void setFalg(char a)
	{
		if (a=='y')
			ch=true;
		else 
			ch=false;
		
	}
	
	public boolean getStatus()
	{
		return ch;
	}

}
