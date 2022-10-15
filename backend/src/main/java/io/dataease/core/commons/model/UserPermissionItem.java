package io.dataease.core.commons.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserPermissionItem implements Serializable {

    private String type;

    private String resourceId;


}
