package managementonschools.pojos.us_03_04.us_03;

import java.io.Serializable;

public class ContactPojo implements Serializable {
	private ObjectPojo object;
	private String message;
	private String httpStatus;

	public ContactPojo() {
	}

	public ContactPojo(ObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ContactPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}