package org.kiet.portal.placementPortal.service;

import org.kiet.portal.placementPortal.entity.Interaction;

import java.util.List;

public interface InteractionService {
    List<Interaction> fetchMsgs(String FromName, String ToName);
}
