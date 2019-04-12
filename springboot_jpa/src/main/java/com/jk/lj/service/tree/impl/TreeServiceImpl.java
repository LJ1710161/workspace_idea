package com.jk.lj.service.tree.impl;

import com.jk.lj.dao.tree.TreeDao;
import com.jk.lj.model.tree.TreeBean;
import com.jk.lj.service.tree.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:12$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:12$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeDao treedao;

    @Override
    public List<TreeBean> findTreeList() {
        Integer pid = 0;
        List<TreeBean> treeList = getTreeBeans(pid);
        return treeList;
    }

    private List<TreeBean> getTreeBeans(Integer pid) {
        List<TreeBean> treeList = treedao.findTreeList(pid);
        for (TreeBean treeBean : treeList) {
            Integer id = treeBean.getId();
            List<TreeBean> treeBeans = getTreeBeans(id);
            if(treeBeans.size()<=0){
                treeBean.setChecked(true);
            }else{
                treeBean.setNodes(treeBeans);
                treeBean.setChecked(false);
            }
        }
        return treeList;
    }


}
