package data;

public final class MinMax {
	private int min;
	private int max;
	
	@Override
	public String toString() {
		return min + " - " + max;
	}
	
	@Deprecated
	public MinMax () {
		
	}
	public MinMax(int min, int max) {
		this.min = min;
		this.max = max;
	}
}
