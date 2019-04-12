package com.jk.lj.service.book;

import com.jk.lj.dao.book.BookDao;
import com.jk.lj.model.book.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:21$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:21$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service
public class BookServiceImpl implements  BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public Page<BookBean> queryBook(Integer pageNumber, Integer pageSize, BookBean bookBean) {

        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.ASC,"bookId");
        Specification<BookBean> specification = new Specification<BookBean>() {
            @Override
            public Predicate toPredicate(Root<BookBean> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();

                if (bookBean.getBookName() != null && !"".equals(bookBean.getBookName())) {
                    list.add(cb.like(root.get("bookName").as(String.class), "%" + bookBean.getBookName() + "%"));
                }
                return cb.and(list.toArray(new Predicate[list.size()]));
            }
        };


        Page<BookBean> books = bookDao.findAll(specification,pageable);

        return books;
    }



    @Override
    public void addBook(BookBean bookBean) {
        bookDao.save(bookBean);
    }

    @Override
    public void deleteById(Integer bookId) {
        bookDao.deleteById(bookId);
    }

    @Override
    public BookBean queryBookById(Integer bookId) {
        Optional<BookBean> byId =bookDao.findById(bookId);
        BookBean bookBean = byId.get();
        return bookBean;
    }










}
