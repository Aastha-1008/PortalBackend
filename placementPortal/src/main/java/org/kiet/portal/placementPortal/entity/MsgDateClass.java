package org.kiet.portal.placementPortal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MsgDateClass {
    String msg;
    Date msg_date;
    String from_to_msg;
}
