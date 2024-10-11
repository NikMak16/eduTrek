package telran.java53telran.java53.student.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class ContactDto {
	String name;
	String surname;
	String phoneNumber;
	String email;
	String place;
	String course;
	String source;
	String status;
	List<CommentDto> comments;
	List<ReminderDto> reminders;
}
