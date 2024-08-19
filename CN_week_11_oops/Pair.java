package CN_week_11_oops;

public class Pair<I,S> {
	private I first;
	private S second;
	
//	public Pair(I f,S s) {
//		this.first =f;
//		this.second = s;
//	}
	public void setfirst(I f) {
		this.first=f;
	}
	public void setsecond(S s) {
		this.second = s;
	}
	public I getfirst() {
		return first;
	}
	public S getsecond() {
		return second;
	}
	
	
}
