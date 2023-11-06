package lk.ijse.spring.repo;

import lk.ijse.spring.entity.FileUploader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Gathsara
 * created : 11/5/2023 -- 9:00 PM
 **/
public interface FileRepo extends JpaRepository<FileUploader, Integer> {
}
