package telran.java53telran.java53.student.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class LecturerDto {
	String name;
	String surname;
	String phoneNumber;
	String emailId;
	String place;
	List<CommentDto> comments;
}
