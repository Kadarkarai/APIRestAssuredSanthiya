package com.epam.apiautomation.app;

import java.util.HashMap;
import java.util.Map;

public class ContextScenario {

	private static Map<String, Object> objects;
	
	public ContextScenario() {
		objects= new HashMap<String,Object>();;
	}
	
	public void setObject(String key, Object value) {
		objects.put(key, value);
    }

    public Object getObject(String key){
        return objects.get(key.toString());
    }

}
