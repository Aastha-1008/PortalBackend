package org.kiet.portal.placementPortal.repository;

import org.kiet.portal.placementPortal.entity.ApiLogin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface ApiLoginDetailsRepository extends Repository<ApiLogin,Long> {

    @Query(
            value = "select * from log_in_details ld where ld.username = :username and ld.password = :password",
            nativeQuery = true
    )
    public ApiLogin apiLogin(String username, String password);
}
