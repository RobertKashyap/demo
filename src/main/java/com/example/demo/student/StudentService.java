package com.example.demo.student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {

    private final StudentRepository studentRespository;

    // @Autowired
    public StudentService(StudentRepository studentRespository) {
        this.studentRespository = studentRespository;
    }

    public List<Student> getStudents() {
        return studentRespository.findAll();
    }

    public void addnewstudent(Student student) {
        Optional<Student> studentOptional = studentRespository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        studentRespository.save(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRespository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with id " + studentId + " does not exist");
        }
        studentRespository.deleteById(studentId);
    }

    // transactional means if there is an error, it will not rollback
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRespository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "student with id " + studentId + " does not exist"));
        if (name != null && name.length() > 0 && !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = studentRespository.findStudentByEmail(email);
            if(studentOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
    }
}