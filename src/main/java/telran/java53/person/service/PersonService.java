package telran.java53.person.service;

import telran.java53telran.java53.person.dto.ContactDto;
import telran.java53telran.java53.person.dto.LecturerDto;
import telran.java53telran.java53.person.dto.PersonDto;
import telran.java53telran.java53.person.dto.PersonUpdateDto;
import telran.java53telran.java53.person.dto.StudentDto;

public interface PersonService {
	PersonDto addPerson(PersonDto personDto);
	
	PersonDto[] getAllPersons();
	
	ContactDto[] getAllContacts();
	
	StudentDto[] getAllStudents();
	
	LecturerDto[] getAllLecturers();
	
	PersonDto findPersonById(Integer id);
	
	PersonDto[] findPersonsByName(String name);
	
	PersonDto[] findPersonsBySurname(String surname);
	
	PersonDto[] findPersonsByGroup(String group);
	
	PersonDto[] findPersonsByCity(String city);
	
	PersonDto[] findPersonsByStatus(String status);
	
	PersonDto updatePersonById(Integer id, PersonUpdateDto personUpdateDto);
}
