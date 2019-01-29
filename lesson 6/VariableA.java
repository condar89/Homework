public class VariableA{
	//Raspunsul, a=5, b=52 l-am calculat singur, am scris ca un antrenament.
	public static void main(String[] args){
		int a=5;
		int b = ++a * 2 - a-- + a++ + --a + ++a * a--;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
		