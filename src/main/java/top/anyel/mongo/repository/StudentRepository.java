package top.anyel.mongo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import top.anyel.mongo.collections.Student;
import org.springframework.data.domain.Pageable;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    public Page<Student> findAll(Pageable pageable);
}