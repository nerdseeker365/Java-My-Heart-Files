abstract class Father
{
	void school()
	{
	
	}
}


class Son extends Father
{
void school()
	{
	super.school();
	System.out.println("I'm go to School");
	}
}

class NullBodyMethod 
{
	public static void main(String[] args) 
	{
		Father ob = new Son();
		ob.school();
	}
}
