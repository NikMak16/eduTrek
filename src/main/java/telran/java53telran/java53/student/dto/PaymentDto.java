package telran.java53telran.java53.student.dto;

import java.time.LocalDate;

import lombok.Getter;

@Getter
public class PaymentDto {
	String id;
	String studentId;
	LocalDate date;
	String type; //enum
	Integer amount;
	Integer installments;
	Integer each;
	String authorId;
}
