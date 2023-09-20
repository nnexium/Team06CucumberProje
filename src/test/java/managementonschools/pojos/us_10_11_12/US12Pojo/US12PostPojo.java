package managementonschools.pojos.us_10_11_12.US12Pojo;

import java.io.Serializable;
import java.util.List;

public class US12PostPojo implements Serializable {
	private List<String> lessonProgramId;
	private String teacherId;

	public US12PostPojo() {
	}

	public US12PostPojo(List<String> lessonProgramId, String teacherId) {
		this.lessonProgramId = lessonProgramId;
		this.teacherId = teacherId;
	}

	public void setLessonProgramId(List<String> lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public List<String> getLessonProgramId(){
		return lessonProgramId;
	}

	public void setTeacherId(String teacherId){
		this.teacherId = teacherId;
	}

	public String getTeacherId(){
		return teacherId;
	}

	@Override
 	public String toString(){
		return
			"US12PostPojo{" +
			"lessonProgramId = '" + lessonProgramId + '\'' +
			",teacherId = '" + teacherId + '\'' +
			"}";
		}
}