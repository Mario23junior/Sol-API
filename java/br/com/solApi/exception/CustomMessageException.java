package br.com.solApi.exception;

public class CustomMessageException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public CustomMessageException(String msg) {
		super(String.format(msg));
 	}

}
