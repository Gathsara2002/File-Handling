package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Gathsara
 * created : 11/5/2023 -- 8:53 PM
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class FileUploader {

    @Id
    private String myFile;
}
