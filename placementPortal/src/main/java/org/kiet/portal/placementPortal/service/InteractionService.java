package org.kiet.portal.placementPortal.service;

import org.kiet.portal.placementPortal.entity.ApiLogin;
import org.kiet.portal.placementPortal.entity.Interaction;

import java.util.List;

public interface InteractionService {
    List<Interaction> fetchMsgs(String FromName, String ToName);
    List<String> fetchStd(String ToName);
    ApiLogin apiLogin(String username, String password);
}
