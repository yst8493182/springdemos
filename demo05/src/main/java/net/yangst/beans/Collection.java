package net.yangst.beans;

import java.util.*;

/**
 * 集合
 * Created by yangshutao on 2016/8/8.
 */
public class Collection {

    private List<String> list;

    private Set<String> set;

    private Map<String,String> map;

    private Properties properties;


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
