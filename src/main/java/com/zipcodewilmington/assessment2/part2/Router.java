package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {
    private Map<String, String> routerMap;
    public Router() {
        this.routerMap = new LinkedHashMap<String, String>();
    }
    public void add(String path, String controller) {
        routerMap.put(path, controller);
    }

    public Integer size() {
        return routerMap.size();
    }

    public String getController(String path) {
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.getOrDefault(path, studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }
}
