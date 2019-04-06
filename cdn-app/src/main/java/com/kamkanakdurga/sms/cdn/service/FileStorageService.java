package com.kamkanakdurga.sms.cdn.service;

import com.kamkanakdurga.sms.cdn.exception.FileStorageException;
import com.kamkanakdurga.sms.cdn.exception.MyFileNotFoundException;
import com.kamkanakdurga.sms.cdn.property.FileStorageProperties;
import com.kamkanakdurga.sms.cdn.repository.AssignmentAttachmentRepository;
import com.kamkanakdurga.sms.cdn.repository.EventAttachmentRepository;
import com.kamkanakdurga.sms.library.entities.AssignmentAttachment;
import com.kamkanakdurga.sms.library.entities.EventAttachment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileStorageService {

	@Autowired
	private AssignmentAttachmentRepository assignmentAttachmentRepository;
	
	@Autowired
	private EventAttachmentRepository eventAttachmentRepository;
    private final Path fileStorageLocation;

    @Autowired
    public FileStorageService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    public String storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path path = Paths.get("Directory2/Sub2/Sub-Sub2/");
            
            //if directory exists?
            if (!Files.exists(path)) {
                try {
                    Files.createDirectories(path);
                } catch (IOException e) {
                    //fail to create directory
                	throw new FileStorageException("Fails to create directory");
                }
            }
            
            //Path targetLocation = this.fileStorageLocation.resolve(fileName);
            
            //path = this.fileStorageLocation.resolve(fileName);

            Files.copy(file.getInputStream(), Paths.get(path + fileName), StandardCopyOption.REPLACE_EXISTING);
                        
            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public String storeFileAssignment(MultipartFile file, BigInteger assignmentId, String targetPath, String imageCaption) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        
        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path path = Paths.get(targetPath);
            
            //if directory exists?
            if (!Files.exists(path)) {
                try {
                    Files.createDirectories(path);
                } catch (IOException e) {
                    //fail to create directory
                	throw new FileStorageException("Fails to create directory");
                }
            }
            
            //Path targetLocation = this.fileStorageLocation.resolve(fileName);
            
            //path = this.fileStorageLocation.resolve(fileName);

            Files.copy(file.getInputStream(), Paths.get(path +"/"+ fileName), StandardCopyOption.REPLACE_EXISTING);
     
            AssignmentAttachment attachment = new AssignmentAttachment(assignmentId,imageCaption,targetPath,fileName);
            		
            
            assignmentAttachmentRepository.save(attachment);
            return fileName;
            
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }
    
   
    public String storeFileEvent(MultipartFile file, BigInteger eventId, String targetPath, String imageCaption) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        
        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path path = Paths.get(targetPath);
            
            //if directory exists?
            if (!Files.exists(path)) {
                try {
                    Files.createDirectories(path);
                } catch (IOException e) {
                    //fail to create directory
                	throw new FileStorageException("Fails to create directory");
                }
            }
                        
            Files.copy(file.getInputStream(), Paths.get(path +"/"+ fileName), StandardCopyOption.REPLACE_EXISTING);
     
            EventAttachment attachment = new EventAttachment(imageCaption,eventId,fileName,targetPath);
            		
            
            eventAttachmentRepository.save(attachment);
            return fileName;
            
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    
    }
    
    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new MyFileNotFoundException("File not found " + fileName, ex);
        }
    }
}
