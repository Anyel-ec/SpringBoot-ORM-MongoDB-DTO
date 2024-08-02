package top.anyel.mongo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import top.anyel.mongo.collections.dto.StudentDto;
import top.anyel.mongo.collections.dto.StudentExistingDto;
import top.anyel.mongo.collections.dto.StudentNewDto;

public interface StudentService {

    StudentDto addStudent(StudentNewDto studentNewDto);

    StudentDto updateStudent(StudentExistingDto studentExistingDto);

    void deleteStudent(String studentId);

    StudentDto getStudentById(String studentId);

    Page<StudentDto> getAllStudents(Pageable pageable);
}