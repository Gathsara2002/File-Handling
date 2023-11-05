package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.FileDTO;
import lk.ijse.spring.repo.FileRepo;
import lk.ijse.spring.service.FileService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

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
repo.save();
    }

    @Override
    public ArrayList<FileDTO> getAllFiles() {
        return null;
    }
}
