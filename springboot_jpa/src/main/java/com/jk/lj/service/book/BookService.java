package com.jk.lj.service.book;

import com.jk.lj.model.book.BookBean;
import org.springframework.data.domain.Page;

import java.util.HashMap;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:21$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:21$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public interface BookService {


    Page<BookBean> queryBook(Integer pageNumber, Integer pageSize, BookBean bookBean);

    void addBook(BookBean bookBean);

    void deleteById(Integer bookId);

    BookBean queryBookById(Integer bookId);
}
