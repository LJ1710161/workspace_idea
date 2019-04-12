package com.jk.lj.dao.tree;

import com.jk.lj.model.tree.TreeBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:13$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:13$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Repository
public interface TreeDao extends JpaRepository<TreeBean,Integer> {

    @Query(value="select t.`id`,t.`text`,t.`pid`,t.`href` from t_tree t where t. `pid`=:pid",nativeQuery = true)
    List<TreeBean> findTreeList(@Param("pid") Integer pid);




}
