package com.jk.lj.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 16:06$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 16:06$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
    @RequestMapping("toShowBook")
    public String toShowBook(){
        return "showBook";
    }
    @RequestMapping("toUpdateBookPage")
    public String toUpdateBookPage(){
        return "updateBookPage";
    }
    @RequestMapping("toAddBookPage")
    public String toAddBookPage(){
        return "addBookPage";
    }









    @RequestMapping("toBookListPage")
    public String toBookListPage(){
        return "bookList";
    }




}
