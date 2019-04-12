package com.jk.lj.controller.tree;

import com.jk.lj.model.tree.TreeBean;
import com.jk.lj.service.tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:03$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:03$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class TreeController {
    @Autowired
    private TreeService treeService;

    @RequestMapping("findTreeList")
    public List<TreeBean> findTreeList(){
        return treeService.findTreeList();
    }




}
