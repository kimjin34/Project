import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor{
	Scanner scanner = new Scanner(System.in);
	Shape s;
	int count;
	GraphicEditor(){
		s = null;
		count = 0;	
	}
	
	void play() {
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
			int n = scanner.nextInt();
			if(n>0 && n<5) {
				switch(n) {
				case 1:	
					input();
					break;
				case 2:		
					delete();
					break;
				case 3:
					all();
					break;
				case 4:
					end();
					break;
				}
			}
			else {
				System.out.println("1~4를 입력해주세요");
			}
		}	
	}

	void input() {
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		int n = scanner.nextInt();
		if(n==1) {
			if(s==null) {
				s = new Line();
				s.setNext(new Line());
			}		
			else {
				Shape t = s;
				while(true) {
					t = t.getNext();
					if(t.getNext() == null) {
						t.setNext(new Line());
						break;
					}
				}			
			}
		count++;
		}
			else if(n==2) {
			if(s==null) {
				s = new Rect();
				s.setNext(new Rect());
			}
			else {
				Shape t = s;
				while(true) {
					t = t.getNext();
					if(t.getNext() == null) {
						t.setNext(new Rect());
						break;
					}
				}			
			}
			count++;
		}
		else if(n==3) {
			if(s==null) {
				s = new Circle();
				s.setNext(new Circle());
			}
			else {
				Shape t = s;
				while(true) {
					t = t.getNext();
					if(t.getNext() == null) {
						t.setNext(new Circle());
						break;
					}
				}			
			}
			count++;
		}		
	}
	
	void delete() {
		System.out.print("삭제할 도형의 위치>>");
		int n = scanner.nextInt();
		if(n<=count && n>0) {
			Shape first=s, last=s.getNext();
			for(int i=0;i<n-1;i++) {
				first=last;
				last=last.getNext();
			}
			first.setNext(last.getNext());
			last.setNext(null);
			count--;			
		}
		else {
			System.out.println("삭제할 수 없습니다.");
		}
	}
	
	void all() {
		Shape a = s;
		for(int i = 1; i < count+1; i++) {
			a = a.getNext();
			a.draw();
		}
		
	}
	void end() {
		System.out.print("beauty을 종료합니다.");
		System.exit(0);
	}
}
public class Problem11 {
	public static void main(String[] args) {
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		GraphicEditor g = new GraphicEditor();
		g.play();
		
	}
}
