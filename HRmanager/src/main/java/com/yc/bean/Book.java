package com.yc.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer bid;
	private String bname;
	private Integer cid;
	private String isbn;
	private String author;
	private Double price;
	private String pdfs; //数据库中的
	private String discription;
	
	private List<MultipartFile> pdfsUrl;
	
	private Category category;
	private BookRank bookRank;

	
	public List<String> getPdfsStringList(){
		List<String> list=new ArrayList<String>();
		if ( pdfs!=null&& pdfs.length()>0 ) {
			String[] strs=pdfs.split(",");
			for (String str : strs) {
				list.add( str );
			}
		}
		return list;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", cid=" + cid + ", isbn=" + isbn + ", author=" + author
				+ ", price=" + price + ", pdfs=" + pdfs + ", discription=" + discription + ", pdfsUrl=" + pdfsUrl
				+ ", category=" + category + ", bookRank=" + bookRank + "]";
	}
	

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public BookRank getBookRank() {
		return bookRank;
	}

	public void setBookRank(BookRank bookRank) {
		this.bookRank = bookRank;
	}

	public String getPdfs() {
		return pdfs;
	}

	public void setPdfs(String pdfs) {
		this.pdfs = pdfs;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<MultipartFile> getPdfsUrl() {
		return pdfsUrl;
	}

	public void setPdfsUrl(List<MultipartFile> pdfsUrl) {
		this.pdfsUrl = pdfsUrl;
	}
	

	
	
}
