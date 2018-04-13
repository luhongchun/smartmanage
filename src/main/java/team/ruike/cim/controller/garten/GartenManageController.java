package team.ruike.cim.controller.garten;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/garten/manage/garten")
public class GartenManageController {

    private static final Logger logger = LoggerFactory.getLogger(GartenManageController.class);
    private static final String REDIRECT_LOCAL = "redirect:/garten/manage/garten/";
    private final static String MANAGE_INDEX = "index";

    @Value("${text.tip.success}")
    String tipSuccess;
    @Value("${text.tip.failed}")
    String tipFailed;

    @RequestMapping(value = "index/{managerId}")
    public String gartenManageIndex(HttpServletRequest request,
                                    @PathVariable String managerId) {
        logger.info("gartenManageIndex, mId:" + managerId);
        return REDIRECT_LOCAL + "listSome/" + managerId;
    }

    @RequestMapping(value = "add")
    public String addGarten() {
        return "manage/garten/add";
    }

    @RequestMapping(value = "add_commit")
    public String addGartenCommit(HttpServletRequest request) {
        try {
            request.setAttribute("tip", tipSuccess);
        } catch (Exception e) {
            logger.error("addGartenCommit exception", e);
            request.setAttribute("tip", tipSuccess);
        }
        return "redirect:add";
    }

    @RequestMapping(value = "listSome/{managerId}")
    public String listGartenWithManagerId(HttpServletRequest request,
                                          @PathVariable String managerId, RedirectAttributes ra) {
        logger.info("listGartenWithManagerId, mId:" + managerId);
        ra.addFlashAttribute("managerId", managerId);//for hide
        return REDIRECT_LOCAL + "list";
    }

}
