package broker.twotier.exception;

public class RecordNotFoundException extends Exception{
	public RecordNotFoundException(){
		this("존재하는 데이타가 아닙니다. ");
	}
	public RecordNotFoundException(String message){
		super(message);
	}
}
