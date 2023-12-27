package StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import StudentDetails.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
