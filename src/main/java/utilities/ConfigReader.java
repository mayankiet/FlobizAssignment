package utilities;

import java.io.*;
import java.util.Properties;


public class ConfigReader {

    private Properties properties = new Properties();
    private InputStream inputStream = null;

    public ConfigReader(){

        String propertiesFilePath = System.getProperty("user.dir") + "/src/main/resources/config.properties";
        try {
            inputStream = new FileInputStream(propertiesFilePath);
            properties.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getEndpointURL(String Endpoint){

        return properties.getProperty("BaseURl") + properties.getProperty(Endpoint);
    }

    public String getEndpoint(){

        return properties.getProperty("BaseURl");
    }

    public String getIssueByIDUrl(){
        return properties.getProperty("GetIssueByID");
    }

    public String getIssueByQueryUrl(){
        return properties.getProperty("GetIssueByQuery");
    }

    public String getModifyIssueUrl(){
        return properties.getProperty("ModifyIssue");
    }
}
