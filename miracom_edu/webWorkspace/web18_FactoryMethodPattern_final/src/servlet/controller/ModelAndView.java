package servlet.controller;

//결과페이지 이름(String)과 이동방식에 대한 정보를 담는 클래스...
class ModelAndView {
	private String path;
	private boolean isRedirect;//false --> forward, true --> redirect
	
	public ModelAndView(String path, boolean isRedirect) {
		super();
		this.path = path;
		this.isRedirect = isRedirect;
	}
	public ModelAndView(String path) {
		super();
		this.path = path;		
	}
	public ModelAndView() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
}
