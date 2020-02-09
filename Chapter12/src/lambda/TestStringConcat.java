package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		StringConImpl con = new StringConImpl();
		con.makeString("Hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString("Hello", "World");
	}

}
