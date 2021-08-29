import java.util.*;
public class AbsoluteDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int res=modifyNumber(n);
		System.out.println(res);
		sc.close();
	}
	static int modifyNumber(int n)
	{
		int r,d=0;
		String s=Integer.toString(n);
		StringBuffer sbf=new StringBuffer();
		String st;
		for(int i=1;i<s.length();i++)
		{
			d=(int)(s.charAt(i))-(int)(s.charAt(i-1));
			if(d<0)
			{
				d=d*(-1);
			}
			sbf.append(d);

			if(i==s.length()-1)
			{
				sbf.append(s.charAt(i));
			}
		}
		st=sbf.toString();
		r=Integer.valueOf(st);
		return r;
	}
}