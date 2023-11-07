package lk.ijse.spring.service;

import lk.ijse.spring.dto.FileUploaderDTO;
import lk.ijse.spring.entity.FileUploader;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 11/5/2023 -- 9:01 PM
 **/

public interface FileService {

    void addFile(FileUploaderDTO dto);

    ArrayList<FileUploaderDTO> getAllFiles();
}
