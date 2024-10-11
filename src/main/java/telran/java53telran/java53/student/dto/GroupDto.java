package telran.java53telran.java53.student.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Getter;

@Getter
public class GroupDto {
	String id;
	String whatsAppLink;
	String slackLink;
	String skypeLink;
	LocalDate startDate;
	LocalDate expectedFinishDate;
	Map<String, Boolean> lessonDays;
	Map<String, Boolean> webinarDays;
	Set<String> students;
	List<ReminderDto> reminders;
	Boolean active;
	Boolean autoArvhve;
}
