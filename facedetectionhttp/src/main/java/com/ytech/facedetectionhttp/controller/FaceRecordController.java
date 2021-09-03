package com.ytech.facedetectionhttp.controller;

import com.ytech.facedetectionhttp.model.FaceRecord;
import com.ytech.facedetectionhttp.model.FaceResponse;
import com.ytech.facedetectionhttp.model.User;
import com.ytech.facedetectionhttp.service.IFaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/record")
public class FaceRecordController {

    @RequestMapping("/face2")
    ResponseEntity<FaceResponse> updateFaceRecord2() {
        // userRepo.put(user.getId(), user);



        FaceResponse faceResponse = new FaceResponse();
        faceResponse.setContent(null);
        faceResponse.setMsg("this is the message");
        faceResponse.setResult(200);
        return new ResponseEntity<>(faceResponse, HttpStatus.OK);
    }

    @RequestMapping("/face")
    ResponseEntity<FaceResponse> updateFaceRecord(@RequestBody FaceRecord faceRecord) {
        // userRepo.put(user.getId(), user);

        if (faceRecord.getCount() == 1) {

        }

        FaceResponse faceResponse = new FaceResponse();
        faceResponse.setContent(null);
        faceResponse.setMsg("this is the message");
        faceResponse.setResult(200);
        return new ResponseEntity<>(faceResponse, HttpStatus.OK);
    }


    @RequestMapping("/face1")
    String hello() {
        return "Hello world,I am home";
    }

    /*
   // @Autowired
  //  private IFaceRecordService faceRecordService;

  //  @RequestMapping(value = "/face", method = RequestMethod.POST)
  @RequestMapping("/hello")
    public ResponseEntity<FaceResponse> updateFaceRecord(@RequestBody FaceRecord faceRecord) {
       // userRepo.put(user.getId(), user);

        if(faceRecord.getCount() == 1) {

        }

        FaceResponse faceResponse = new FaceResponse();
        faceResponse.setContent(null);
        faceResponse.setMsg("this is the message");
        faceResponse.setResult(200);
        return new ResponseEntity<>(faceResponse, HttpStatus.OK);
    }*/
}
