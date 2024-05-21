class Circle{
	int num,num2,num3;
	Circle(int a, int b, int c){
		num =a;
		num2 = b;
		num3 = c;
	}
	public String toString() {
		return "Circle("+ num+","+num2+")반지름"+num3;
		
	}
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		if(num ==c.num && num2==c.num2) return true;
		else return false;
		
	}
}
public class Problem13 {
	static public void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : "+a);
		System.out.println("원 b : "+b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}