package managementonschools.pojos.us_19_20.US20UpdatePojo;

import java.io.Serializable;
import java.util.List;

public class PutPojo implements Serializable {
	static private String date;
	static private String description;
	static private String startTime;
	static private String stopTime;
	static private List<Integer> studentIds;

	public PutPojo() {
	}

	public PutPojo(String date, String description, String startTime, String stopTime, List<Integer> studentIds) {
		this.date = date;
		this.description = description;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.studentIds = studentIds;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	public void setStudentIds(List<Integer> studentIds){
		this.studentIds = studentIds;
	}

	public List<Integer> getStudentIds(){
		return studentIds;
	}

	@Override
 	public String toString(){
		return 
			"PutPojo{" + 
			"date = '" + date + '\'' + 
			",description = '" + description + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",studentIds = '" + studentIds + '\'' + 
			"}";
		}
}