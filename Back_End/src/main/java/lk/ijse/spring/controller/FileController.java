package lk.ijse.spring.controller;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author : Gathsara
 * created : 10/16/2023 -- 9:05 PM
 **/

@RestController
@RequestMapping("/file")
@CrossOrigin
public class FileController {

    @PostMapping
    public ResponseUtil saveFile(CommonsMultipartFile file) {
        System.out.println("req received");

        return new ResponseUtil("OK", "File saved successfully", null);
    }
}
