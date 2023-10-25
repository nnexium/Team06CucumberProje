package managementonschools.pojos.us_19_20.US20UpdatePojo;

import java.io.Serializable;
import java.util.List;

public class ObjectPojo implements Serializable {
	private int id;
	private String description;
	private String date;
	private String startTime;
	private String stopTime;
	private int advisorTeacherId;
	private String teacherName;
	private String teacherSsn;
	private List<StudentsPojo> students;

	public ObjectPojo() {
	}

	public ObjectPojo(int id, String description, String date, String startTime, String stopTime, int advisorTeacherId, String teacherName, String teacherSsn, List<StudentsPojo> students) {
		this.id = id;
		this.description = description;
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.advisorTeacherId = advisorTeacherId;
		this.teacherName = teacherName;
		this.teacherSsn = teacherSsn;
		this.students = students;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
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

	public void setAdvisorTeacherId(int advisorTeacherId){
		this.advisorTeacherId = advisorTeacherId;
	}

	public int getAdvisorTeacherId(){
		return advisorTeacherId;
	}

	public void setTeacherName(String teacherName){
		this.teacherName = teacherName;
	}

	public String getTeacherName(){
		return teacherName;
	}

	public void setTeacherSsn(String teacherSsn){
		this.teacherSsn = teacherSsn;
	}

	public String getTeacherSsn(){
		return teacherSsn;
	}

	public void setStudents(List<StudentsPojo> students){
		this.students = students;
	}

	public List<StudentsPojo> getStudents(){
		return students;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"id = '" + id + '\'' + 
			",description = '" + description + '\'' + 
			",date = '" + date + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",advisorTeacherId = '" + advisorTeacherId + '\'' + 
			",teacherName = '" + teacherName + '\'' + 
			",teacherSsn = '" + teacherSsn + '\'' + 
			",students = '" + students + '\'' + 
			"}";
		}
}