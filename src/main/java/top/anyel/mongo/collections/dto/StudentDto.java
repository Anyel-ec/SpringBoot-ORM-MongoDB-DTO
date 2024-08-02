package top.anyel.mongo.collections.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
@Data
@RequiredArgsConstructor
public class StudentDto {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    private String contactNumber;
    private String courseName;
    private LocalDateTime created;
    private LocalDateTime modified;
}
