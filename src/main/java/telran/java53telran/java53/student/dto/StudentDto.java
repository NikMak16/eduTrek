package telran.java53telran.java53.student.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class StudentDto {
	Integer id;
	String name;
	String surname;
	String phone;
	String email;
	String location; //place; enum?
	String course; // enum?
	String status;
	List<CommentDto> comments;
	List<String> groups;
	List<ReminderDto> reminders; //reminderDto?
	List<String> activityLog;
	Integer coursePrice;
	Integer paidSum;
	Boolean documents;
	List<PaymentDto> paymentLog;
	
}
