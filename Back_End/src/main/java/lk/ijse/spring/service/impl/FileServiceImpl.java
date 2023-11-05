package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.FileDTO;
import lk.ijse.spring.entity.File;
import lk.ijse.spring.repo.FileRepo;
import lk.ijse.spring.service.FileService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
    public void addFile(FileDTO dto) {
        File file = mapper.map(dto, File.class);
        repo.save(file);
    }

    @Override
    public ArrayList<FileDTO> getAllFiles() {
        List<File> all = repo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<FileDTO>>() {
        }.getType());
    }
}
