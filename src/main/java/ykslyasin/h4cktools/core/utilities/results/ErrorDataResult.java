package ykslyasin.h4cktools.core.utilities.results;


public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, String message) {
		super(data, false, message);
		// TODO Auto-generated constructor stub
	}

	public ErrorDataResult(T data) {
		super(data, false);
	}
	
	public ErrorDataResult() {
		super(null, false);
	}
	
}
