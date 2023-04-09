package org.kiet.portal.placementPortal.repository;

import org.kiet.portal.placementPortal.entity.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface InteractionRepository extends JpaRepository<Interaction,Long> {
    @Query(
            value = "select * from interaction i where (i.from_name = :FromName and i.to_name = :ToName ) or (i.from_name =:ToName and i.to_Name = :FromName) order by i.msg_date ",
            nativeQuery = true
    )
    List<Interaction> fetchMsgs(String FromName, String ToName);
}
