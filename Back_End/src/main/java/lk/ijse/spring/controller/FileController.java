package lk.ijse.spring.controller;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : Gathsara
 * created : 10/16/2023 -- 9:05 PM
 **/

@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileController {

    @PostMapping
    public void saveFile(MultipartFile file) {
        System.out.println("req received");
        System.out.println(file);
        //return new ResponseUtil("OK", "File saved successfully", null);
    }
}
