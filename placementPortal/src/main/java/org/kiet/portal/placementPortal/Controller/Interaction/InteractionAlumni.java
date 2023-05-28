package org.kiet.portal.placementPortal.Controller.Interaction;

import org.kiet.portal.placementPortal.UserDetails;
import org.kiet.portal.placementPortal.entity.ApiLogin;
import org.kiet.portal.placementPortal.entity.Interaction;
import org.kiet.portal.placementPortal.entity.MsgDateClass;
import org.kiet.portal.placementPortal.repository.InteractionRepository;
import org.kiet.portal.placementPortal.response.GenericResponse;
import org.kiet.portal.placementPortal.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.Date;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@RestController
@CrossOrigin(origins = {"https://645d761de3289519a8da8457--stellular-sprite-672d15.netlify.app/","http://localhost:3000"})
public class InteractionAlumni {
    @Autowired
    InteractionService interactionService;
    @Autowired
    InteractionRepository interactionRepository;
    @PostMapping("/interactions")
    public GenericResponse interactions(@RequestParam String FromName,@RequestParam String ToName, @RequestParam String MsgValue ,@RequestParam int FromToMsg, @RequestParam int SoftDelete){
        Date date = new Date();
        Interaction interaction = new Interaction();
        interaction.setFromName(FromName);
        interaction.setMessage(MsgValue);
        interaction.setMsgDate(date);
        interaction.setToName(ToName);
        interaction.setFromToMsg(FromToMsg);
        interaction.setSoft_delete(SoftDelete);
        interactionRepository.save(interaction);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("fetched data").body(interaction).build();
    }
    @GetMapping("/fetchMsg")
    public GenericResponse fetchMsg(@RequestParam String FromName, @RequestParam String ToName){
        List<Interaction> msgDateList = interactionService.fetchMsgs(FromName,ToName);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully Fetched... ").body(msgDateList).build();
    }

    @GetMapping("/fetchStd")
    public GenericResponse fetchStd(@RequestParam String ToName){
        System.out.println(ToName);
        List<String> names = interactionService.fetchStd(ToName);
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("Successfully Fetched...").body(names).build();
    }

    @PostMapping("api/login/")
    public GenericResponse apiLogin(@RequestBody UserDetails userDetails){
        String username = userDetails.getUsername();
        String password = userDetails.getPassword();

       ApiLogin apiLogin = interactionService.apiLogin(username,password);

        if(apiLogin != null) return GenericResponse.builder().statusCode(HttpStatus.OK).msg("successfully fetched...").body(apiLogin).build();
        return GenericResponse.builder().statusCode(HttpStatus.OK).msg("problem faced").build();
    }
}
