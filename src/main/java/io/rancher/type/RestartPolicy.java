package io.rancher.type;

import java.util.Map;

import io.rancher.base.AbstractType;

public class RestartPolicy extends AbstractType {

    private Map<String, String> links;

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }
    

    
    private Integer maximumRetryCount;
    
    private String name;
    
    public Integer getMaximumRetryCount() {
        return this.maximumRetryCount;
    }

    public void setMaximumRetryCount(Integer maximumRetryCount) {
      this.maximumRetryCount = maximumRetryCount;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}
