package org.openstack4j.model.cloudkitty;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.cloudkitty.builder.ResourceBuilder;

import java.util.Map;

public interface Resource extends ModelEntity, Buildable<ResourceBuilder> {

    /**
     * @return Description of the resources parameters
     */
    Map<String, String> getDescription();

    /**
     * @return name of the service
     */
    String getService();

    /**
     * @return volume of resources
     */
    float getVolume();
}