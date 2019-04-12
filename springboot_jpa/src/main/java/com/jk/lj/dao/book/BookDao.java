package com.jk.lj.dao.book;

import com.jk.lj.model.book.BookBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:22$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:22$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Repository
public interface BookDao extends JpaRepository<BookBean,Integer>, JpaSpecificationExecutor {





}
