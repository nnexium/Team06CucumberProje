package managementonschools.pojos.us_03_04.us04;

import java.io.Serializable;

public class ResponsePojo implements Serializable {
	private ObjectPojoDean object;
	private String message;
	private String httpStatus;

	public ResponsePojo() {
	}

	public ResponsePojo(ObjectPojoDean object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojoDean object){
		this.object = object;
	}

	public ObjectPojoDean getObject(){
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
				"ResponsePojo{" +
						"object = '" + object + '\'' +
						",message = '" + message + '\'' +
						",httpStatus = '" + httpStatus + '\'' +
						"}";
	}
}