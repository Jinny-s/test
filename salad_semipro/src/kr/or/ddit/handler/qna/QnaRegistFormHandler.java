package kr.or.ddit.handler.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.handler.Handler;

public class QnaRegistFormHandler implements Handler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url = "qna/regist";
		return url;
	}
}
