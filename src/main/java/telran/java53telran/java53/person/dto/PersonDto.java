package telran.java53telran.java53.person.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
	@Type(name="student", value = StudentDto.class),
	@Type(name="contact", value = ContactDto.class),
	@Type(name="lecturer", value = LecturerDto.class)
})
@Setter
public class PersonDto {
	Integer id;
	String name;
	String surname;
	String phoneNumber;
	String email;
	String place;
	List<CommentDto> comments;
	
}
