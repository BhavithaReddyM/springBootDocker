package SpringBootMYSQLDocker.SpringBootMYSQLDocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootMYSQLDocker.SpringBootMYSQLDocker.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	

}
