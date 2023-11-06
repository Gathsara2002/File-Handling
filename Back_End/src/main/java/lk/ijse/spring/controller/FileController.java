package lk.ijse.spring.controller;

import lk.ijse.spring.dto.FileUploaderDTO;
import lk.ijse.spring.service.FileService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Gathsara
 * created : 10/16/2023 -- 9:05 PM
 **/

@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileController {

    @Autowired
    FileService service;

    @PostMapping
    public ResponseUtil saveFile(FileUploaderDTO fileDTO) {
        System.out.println("req received");
        service.addFile(fileDTO);
        return new ResponseUtil("OK", "File saved successfully", null);
    }

    @GetMapping
    public ResponseUtil getAllFiles() {
        ArrayList<FileUploaderDTO> allFiles = service.getAllFiles();
        return new ResponseUtil("OK", "Successfully Loaded", allFiles);
    }
}
