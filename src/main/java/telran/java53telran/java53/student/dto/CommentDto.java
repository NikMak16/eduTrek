package telran.java53telran.java53.student.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class CommentDto {
	String author;
	LocalDate creationDate;
	String message;

}
