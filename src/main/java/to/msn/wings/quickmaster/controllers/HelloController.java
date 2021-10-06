package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import to.msn.wings.quickmaster.models.BookRepository;

//a.コントローラクラスを定義
@Controller
// ↑コントローラの場合はこちらを設定
public class HelloController{
  //リポジトリを格納するためのプライベートフィールド
  private BookRepository rep;
  //a.コンストラクターにリポジトリに注入
  @Autowired
  public HelloController(BookRepository rep){
    this.rep = rep;
  }
  //b.Handler(処理)クラスを定義
  @GetMapping("/list")
  public String list(Model model){
    model.addAttribute("books",rep.findAll());
    return "list";
  }
  //書籍一覧を生成するためのHandlerメソッド
	@GetMapping("//hello")
  // ↑ルーティングの設定
	@ResponseBody
	public String index() {
//c.戻り値はレスポンス本体
		return "こんにちは、世界!";
	}
  @GetMapping("/greet")
  //a.Modelオブジェクトの準備
  public String greet(Model model){
    //b.ビュー変数の設定
    model.addAttribute("message","こんにちは、世界！");
    //c.テンプレートの呼び出し
    return "greet";
  }
}

