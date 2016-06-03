package AutomationLibTests;

import AutomationLibrary.Services.RESTRequest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServiceTest {

    @Test
    public void ServiceTest(){

        String loginJSON = "{\"username\":\"wibble@testemail.test\",\"password\": \"111111\"}";
        String loginURL = "https://aws-tnz-api-v2.xstream.dk/family-accounts/login";
        RESTRequest loginPost = new RESTRequest(loginURL,loginJSON, new String[0], "POST");
        String output = loginPost.sendRequest();
        assertEquals(404, loginPost.getResponseCode());
    }
}
