package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Gathsara
 * created : 11/5/2023 -- 8:50 PM
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class FileUploaderDTO {
    private MultipartFile myFile;
}
