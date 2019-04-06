package com.kamkanakdurga.sms.cdn.controller;

import com.kamkanakdurga.sms.cdn.payload.UploadFileResponse;
import com.kamkanakdurga.sms.cdn.service.FileStorageService;

import lombok.var;

import org.hibernate.engine.jdbc.StreamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CDNController {

    private static final Logger logger = LoggerFactory.getLogger(CDNController.class);

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
    	
        String fileName = fileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/uploads")
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }
    
    @PostMapping("/upload/assignment")
    public UploadFileResponse uploadFileAssignment(
    		@RequestParam("file") MultipartFile file,
    		@RequestParam("district_code") BigInteger districtCode,
    		@RequestParam("block_code") BigInteger blockCode,
    		@RequestParam("school_code") BigInteger schoolCode,
    		@RequestParam("id") BigInteger assignmentId,
    		@RequestParam("caption") String imageCaption
    		) {
    	String moduleName = "Assignment";
    	String targetPath = moduleName + "/" + districtCode + "/" + blockCode + "/" + schoolCode + "/" + assignmentId +"/";
        String fileName = fileStorageService.storeFileAssignment(file, assignmentId, targetPath, imageCaption);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path(targetPath)
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }
    
 
    @PostMapping("/upload/event")
    public UploadFileResponse uploadFileEvent(
    		@RequestParam("file") MultipartFile file,
    		@RequestParam("district_code") BigInteger districtCode,
    		@RequestParam("block_code") BigInteger blockCode,
    		@RequestParam("school_code") BigInteger schoolCode,
    		@RequestParam("id") BigInteger eventId,
    		@RequestParam("caption") String imageCaption
    		) {
    	String moduleName = "Event";
    	String targetPath = moduleName + "/" + districtCode + "/" + blockCode + "/" + schoolCode + "/" + eventId +"/";
        String fileName = fileStorageService.storeFileEvent(file, eventId, targetPath, imageCaption);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path(targetPath)
                .path(fileName)
                .toUriString();

        return new UploadFileResponse(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }
    
    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        // Load file as Resource
        Resource resource = fileStorageService.loadFileAsResource(fileName);

        // Try to determine file's content type
        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        // Fallback to the default content type if type could not be determined
        if(contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
    
    @RequestMapping(value = "/Event", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)

    public ResponseEntity<InputStreamResource>getImage(@PathVariable String fileName, HttpServletResponse response) throws IOException {

        var imgFile = new ClassPathResource(fileName);

        response.setContentType(MediaType.IMAGE_JPEG_VALUE);

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

}
