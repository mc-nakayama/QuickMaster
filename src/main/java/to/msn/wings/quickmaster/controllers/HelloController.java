package to.msn.wings.quickmaster.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//a.コントローラクラスを定義
@Controller
// ↑コントローラの場合はこちらを設定
public class HelloController{
//b.Handler(処理)クラスを定義
	@GetMapping("//hello")
  // ↑ルーティングの設定
	@ResponseBody
	public String index() {
//c.戻り値はレスポンス本体
		return "こんにちは、世界!";
	}
}