package collection.framework;

import java.util.Properties;
import java.util.Set;

public class Properties1 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("aqib", "js");
        properties.setProperty("amit", "native");
        properties.setProperty("pantho", "devops");
        properties.setProperty("faruq", "java");

        Set<?> set = properties.keySet();

        for (Object name : set)
            System.out.println(name + " working in :" + properties.getProperty((String) name));

        System.out.println("Jamil working in :" + properties.getProperty("Jamil", "Not Found"));

    }
}
