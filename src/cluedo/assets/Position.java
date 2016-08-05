package cluedo.assets;

public class Position {
	
	private int x;
	private int y;
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Position){
			if(this.x == ((Position) obj).getX() && this.y == ((Position) obj).getY()){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		return this.x + " " + this.y;
	}
	
}
