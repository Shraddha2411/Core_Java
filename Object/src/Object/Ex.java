package Object;

interface i1 {

	void set(int x, int y);

}
interface i2
{
	void disp();
}
class ImpClass implements i1,i2
{
	int p=10;
	int q=20;
	 
	
	void incr()
	{
		p++;
	}

	@Override
	public void disp() {
	System.out.print(p);
	System.out.println(q);
		
	}

	public void set(int i, int j) {
		
	}

	
}
public class Ex {
public static void main(String [] args) {
	ImpClass obj=new ImpClass();
	obj.set(100,200);
	obj.disp();
	obj.incr();
	obj.disp();
}
}
