package org.kiet.portal.placementPortal.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.net.http.HttpResponse;
@Getter
@Setter
@Builder
public class GenericResponse {
    private HttpStatus statusCode;
    private String msg;
    private boolean status;
    private Object body;
}
