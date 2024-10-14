package telran.java53telran.java53.person.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class LecturerDto extends PersonDto{
	Boolean active;
	List<String> courses;
}
