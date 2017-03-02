package com.yc.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.yc.bean.Book;
import com.yc.bean.Category;
import com.yc.biz.BookBiz;
import com.yc.biz.CategoryBiz;
import com.yc.web.utils.UploadFileUtil;
import com.yc.web.utils.UploadFileUtil.UploadFile;


@Controller
public class BookController {
	private List<Category> clist=new ArrayList<Category>();
	private CategoryBiz cb;
	private BookBiz bb;

	@Resource(name="bookBizImpl")
	public void setBookBiz(BookBiz bb){
		this.bb=bb;
	}

	@Resource(name="categoryBizImpl")
	public void setCategoryBiz(CategoryBiz cb){
		this.cb=cb;
	}

	//进入 前端
	@RequestMapping("/toStudentShowBookInfo")
	public ModelAndView toStudentShowBookInfo() {
		ModelAndView mv=new ModelAndView("studentShowBookInfo");
		Book book=new Book();
		List<Book> list=bb.findAll(book);
		
		if (clist.isEmpty() ) {
			Category c=new Category();
			clist=cb.findAll(c);
		}
		mv.addObject( "clist", clist );
		mv.addObject("list", list);
		return mv;
	}
	//前端筛选
	@RequestMapping("/findBookByCategory")
	public @ResponseBody String findBookByCategory(Book book) {
		List<Book> list =new ArrayList<Book>();
		if (book.getCid()<=0) {
			list=bb.findAll( new Book() );
		}else {
			list=bb.findAll(book);
		}
		Gson gson=new Gson();
		
		return gson.toJson( list );
	}
	//前端  详情
	@RequestMapping("/toDetailForm")
	public ModelAndView toDetailForm( Book book ) {
		ModelAndView mv=new ModelAndView("detailBookForm");
		List<Book> list=bb.findAll( book );
		mv.addObject("book", list.get(0) );
		return mv;
	}
	
	
	//进入 后台
	@RequestMapping("admin/toShowBookInfo")
	public ModelAndView toShowBookInfo() {
		ModelAndView mv=new ModelAndView("showBookInfo");
		Book book=new Book();
		List<Book> list=bb.findAll(book);
		mv.addObject("list", list);
		return mv;
	}

	//去登录
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	//登录
	@RequestMapping("/adminLogin")
	public String adminLogin(@RequestParam String validateCode,@RequestParam String uname,@RequestParam String password,HttpSession session ) {
		String randCode=(String) session.getAttribute("rand");
		if (!validateCode.equals( randCode )) {
			session.setAttribute("errmsg", "验证码有误");
			return "login";
		}
		InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("adminLogin.properties");
		Properties p=new Properties();
		try {
			p.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (p.getProperty("uname").equals(uname) && p.getProperty("password").equals(password)) {
			session.setAttribute("uname", uname);
			return "redirect:/admin/toShowBookInfo";
		}else {
			session.setAttribute("errmsg", "用户名或密码错误");
			return "login";
		}
	}


	//跳转添加
	@RequestMapping("/admin/toAddBook")
	public ModelAndView toAddBook() {
		ModelAndView mv=new ModelAndView("addBook");
		if (clist.isEmpty() ) {
			Category c=new Category();
			clist=cb.findAll(c);
		}
		mv.addObject( "clist", clist );
		mv.addObject( "book", new Book() );
		return mv;
	}

	private String pdfRootName="uploadpdfs";
	//添加书籍
	@RequestMapping("/admin/addBook")
	public String addBook(HttpServletRequest request, Book book ) {
		//上传文件处理
		String pdfs="";
		Map<String, UploadFile> map=UploadFileUtil.uploadFile(request, book.getPdfsUrl(), pdfRootName);
		for(Entry<String, UploadFile> entry:map.entrySet() ){
			UploadFile uploadFile=entry.getValue();
			pdfs+=uploadFile.getNewFileUrl()+",";
		}
		book.setPdfs(pdfs);
		
		if (book.getCid()!=null && !book.getBname().equals("") ) {
			this.bb.add(book);
		}
		return "redirect:/admin/toShowBookInfo"; 
	}

	//修改书籍
	@RequestMapping("/admin/toUpdateBook")
	public ModelAndView toUpdateBook( Book book ) {
		ModelAndView mv=new ModelAndView("updateBook");
		List<Book> list=bb.findAll( book );
		if ( clist.isEmpty() ) {
			Category c=new Category();
			clist=cb.findAll(c);
		}
		mv.addObject("clist", clist);
		mv.addObject("book", list.get(0) );
		return mv;
	}

	//修改书籍
	@RequestMapping("/admin/updateBook")
	public String updateBook(HttpServletRequest request, Book book ) {
		//上传文件处理
		String pdfs="";
		Map<String, UploadFile> map=UploadFileUtil.uploadFile(request, book.getPdfsUrl(), pdfRootName);
		for(Entry<String, UploadFile> entry:map.entrySet() ){
			UploadFile uploadFile=entry.getValue();
			pdfs+=uploadFile.getNewFileUrl()+",";
		}
		book.setPdfs(pdfs);
		System.out.println("修改:"+book );
		
		if ( !"".equals( book.getBid() ) && book.getBid()!=null ) {
			this.bb.update(book);
		}
		return "redirect:/admin/toShowBookInfo"; 
	}


}
