package Constractors;

public class Constructors03_this_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class class01 {
	int x;
	int y;
	boolean z;
	char c;
	
	class01 (){
		
		this (0,0,false,' ');
	}
	class01 (int x){
		
		this (x,0,false,' ');
	}
	class01 (int x, int y){
		
		this (x,y,false,' ');
	}
	class01 (int x, int y, boolean z){
		
		this (x,y,z,' ');
	}	
	class01(int x, int y, boolean z, char c) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.c = c;
		
	}
	
		
}