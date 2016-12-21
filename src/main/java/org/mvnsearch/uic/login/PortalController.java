package org.mvnsearch.uic.login;

import org.mvnsearch.uic.domain.application.AccountManager;
import org.mvnsearch.uic.domain.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
public class PortalController {
//    @Autowired
//    private AccountManager accountManager;
//    @GetMapping("/")
//    @ResponseBody
//    public String index(){
//        return accountManager.findByEmail("123@qishon.com");
//    }
    //不能引用Domain内部的组件，如repository, service, infrastructure等计划规划

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!!!";
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("nick", "雷卷");
        return "welcome";
    }
}
