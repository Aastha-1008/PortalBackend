package org.kiet.portal.placementPortal.service.Impl;

import jakarta.persistence.criteria.From;
import org.kiet.portal.placementPortal.entity.ApiLogin;
import org.kiet.portal.placementPortal.entity.Interaction;
import org.kiet.portal.placementPortal.repository.ApiLoginDetailsRepository;
import org.kiet.portal.placementPortal.repository.InteractionRepository;
import org.kiet.portal.placementPortal.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {
    @Autowired
            InteractionRepository interactionRepository;

    @Autowired
    ApiLoginDetailsRepository apiLoginDetailsRepository;
    public  List<Interaction> fetchMsgs(String FromName, String ToName){
        return interactionRepository.fetchMsgs(FromName,ToName);
    }

    public List<String> fetchStd(String ToName){
        return interactionRepository.fetchStd(ToName);
    }

    public ApiLogin apiLogin(String username, String password){
        return apiLoginDetailsRepository.apiLogin(username,password);
    }

}
