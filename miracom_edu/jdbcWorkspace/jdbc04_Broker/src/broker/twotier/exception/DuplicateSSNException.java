package broker.twotier.exception;

public class DuplicateSSNException extends Exception{
	public DuplicateSSNException(){
		this("이미 있는 회원이십니다. ");
	}
	public DuplicateSSNException(String message){
		super(message);
	}
}
