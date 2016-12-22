package spring_cloud_uic.Login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
/**
 * Created by pc on 2016/12/22.
 */
@Controller
public class PortalController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!!!";
    }
}
