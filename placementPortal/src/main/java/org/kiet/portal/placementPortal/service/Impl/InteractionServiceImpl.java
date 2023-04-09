package org.kiet.portal.placementPortal.service.Impl;

import org.kiet.portal.placementPortal.entity.Interaction;
import org.kiet.portal.placementPortal.repository.InteractionRepository;
import org.kiet.portal.placementPortal.service.InteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {
    @Autowired
            InteractionRepository interactionRepository;
    public  List<Interaction> fetchMsgs(String FromName, String ToName){
        return interactionRepository.fetchMsgs(FromName,ToName);
    }

}
