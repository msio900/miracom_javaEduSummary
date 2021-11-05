package broker.twotier.exception;

public class InvalidTransactionException extends Exception{
	public InvalidTransactionException(){
		this("가지고 있는 주식보다 더 많은 양을 팔수 없습니다. ");
	}
	public InvalidTransactionException(String message){
		super(message);
	}
}
