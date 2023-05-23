package board.member;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BaseController {
    private HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model){
        SessionUser user = httpSession.getAttribute("user");

        return index;
    }
}
