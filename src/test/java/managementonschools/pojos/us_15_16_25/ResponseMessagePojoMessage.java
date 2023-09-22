package managementonschools.pojos.us_15_16_25;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseMessagePojoMessage implements Serializable {
	private ObjectPojoMessage object;
	private String message;
	private String httpStatus;

	public ResponseMessagePojoMessage() {
	}

	public ResponseMessagePojoMessage(ObjectPojoMessage object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojoMessage object){
		this.object = object;
	}

	public ObjectPojoMessage getObject(){
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
			"ResponseMessagePojoMessage{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}