package to.msn.wings.quickmaster.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter

@Setter
//a.エンティティの宣言
@Entity
public class Book {
  //b.テーブルの列を列挙
  //c.主キー
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  //ISBNコード
  @Column(name="isbn",nullable = false)
  private String isbn;
  //書名
  @Column(name="title",nullable = true)
  private String title;
  //価格
  @Column(name="price",nullable = false)
  private int price;
  //出版社
  @Column(name="publisher",nullable = false)
  private String publisher;
  //刊行日
  @Column(name="published",nullable = false)
  private LocalDate published;
  //付属品
  @Column(name="attach",nullable = true)
  private String attach;
}
