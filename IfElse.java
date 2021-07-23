package JavaBasics;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=7;
if(b>=a) {
	System.out.println("b is grater");
}else {
	System.out.println("b is not grater");
	System.out.println("***********");
}

int c=40;
int d=40;
if(c==d) {
	System.out.println("c and d are equal");
}
else {
	System.out.println("not equal"); 
	System.out.println("**********");
}
int a1=400;
int b1=500;
int c1=600;
if(a1>b1 & a1>c1) {
	System.out.println("a1 is grater");
}
else if(b1>c1) {
	System.out.println("b1 is grater");
}
else {
	System.out.println("c1 is grater");
}
	}

}
