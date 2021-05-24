
class W {
	static String s = "AAA";
	static {
		s = s + "BBB";
	}

	{
		s = "AAABBB";
	}
}

class Z extends W {
	{
		s = s + "BBBAAA";
	}
	{
		System.out.println(s);
	}
}

public class Test2 {
	public static void main(String[] args) {
		new Z();
	}
}