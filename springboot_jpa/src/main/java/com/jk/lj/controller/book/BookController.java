package com.jk.lj.controller.book;

import com.jk.lj.model.book.BookBean;
import com.jk.lj.service.book.BookService;
import com.jk.lj.utils.EasyuiPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 16:06$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 16:06$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("queryBook")
    public EasyuiPage queryBook(Integer pageNumber, Integer pageSize, BookBean bookBean){
        EasyuiPage result=new EasyuiPage();
        Page<BookBean> books= bookService.queryBook(pageNumber-1,pageSize,bookBean);
        int totalElements = (int) books.getTotalElements();
        List<BookBean> content = books.getContent();
        result.setTotal(totalElements);
        result.setRows(content);
        //System.out.println(books);
        return result;
    }

    @RequestMapping("addBook")
    public Boolean addBook(BookBean bookBean){
        try {
            bookBean.setCreateTime(new Date());
            bookService.addBook(bookBean);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }

    }

    @RequestMapping("deleteById")
    public Boolean deleteById(Integer bookId){
        try {
            bookService.deleteById(bookId);
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            return Boolean.FALSE;
        }
    }

    @RequestMapping("queryBookById")
    public BookBean queryBookById(Integer bookId){

        return bookService.queryBookById(bookId);
    }



}
