package telran.java53telran.java53.person.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class ContactDto extends PersonDto {
	String course;
	String source;
	String status;
	List<ReminderDto> reminders;
}
