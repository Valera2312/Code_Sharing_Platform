package platform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.List;

@RestController
public class CodeSharingPlatformController {

    CodeSharingPlatformService service;

    @GetMapping("/api/code")
    public Code getCodeJson(HttpServletResponse response) {
        response.addHeader("Content-Type","application/json");
        return service.getCodeJson();
    }
    @GetMapping("/code")
    public String getCodeHTML(HttpServletResponse response){
        response.addHeader("Content-Type","text/html");
        return service.getCodeHTML();
    }
}
