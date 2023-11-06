package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.FileUploaderDTO;
import lk.ijse.spring.entity.FileUploader;
import lk.ijse.spring.repo.FileRepo;
import lk.ijse.spring.service.FileService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Gathsara
 * created : 11/5/2023 -- 9:04 PM
 **/

@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    FileRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addFile(FileUploaderDTO dto) {
        FileUploader uploader = new FileUploader("1", "");

        try {
            String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
            File file = new File(projectPath + "/File");
            System.out.println(projectPath);
            boolean isDirectoryExists = file.mkdir();
            if (isDirectoryExists) {
                System.out.println("file eka tiyenava");
            }

            dto.getMyFile().transferTo(new File(file.getAbsolutePath() + "/" + dto.getMyFile().getOriginalFilename()));
            uploader.setMyFile("File/" + dto.getMyFile().getOriginalFilename());

        } catch (IOException | URISyntaxException e) {
            throw new RuntimeException(e);
        }

        System.out.println(uploader);
        repo.save(uploader);

    }

    @Override
    public ArrayList<FileUploaderDTO> getAllFiles() {
        List<FileUploader> all = repo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<FileUploaderDTO>>() {
        }.getType());
    }
}
