package telran.java53telran.java53.person.dto;


import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ReminderDto {
	LocalDateTime dateRemind;
	String text;
	
}
