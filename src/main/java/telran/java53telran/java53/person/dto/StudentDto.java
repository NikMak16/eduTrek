package telran.java53telran.java53.person.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class StudentDto extends PersonDto{
	String course; // enum?
	String status;
	List<String> groups;
	List<ReminderDto> reminders; //reminderDto?
	List<String> activityLog;
	Integer coursePrice;
	Integer paidSum;
	Boolean documents;
	List<PaymentDto> paymentLog;
	
}
