package lk.ijse.spring.service;

import lk.ijse.spring.dto.FileDTO;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 11/5/2023 -- 9:01 PM
 **/

public interface FileService {

    void addFile(FileDTO dto);

    ArrayList<FileDTO> getAllFiles();
}
