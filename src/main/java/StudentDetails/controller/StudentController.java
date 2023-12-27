package StudentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import StudentDetails.Repository.StudentRepository;
import StudentDetails.entity.Student;


@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/saveDetails")
	public ResponseEntity<?> saveDetails(@RequestBody Student student)
			throws Exception {
		studentRepository.save(student);
		return ResponseEntity.status(HttpStatus.OK).body("Data Saved");
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity<?> saveDetails()
			throws Exception {
		List<Student> s= studentRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(s);
	}
}
