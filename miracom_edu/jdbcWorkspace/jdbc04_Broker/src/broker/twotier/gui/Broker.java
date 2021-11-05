package broker.twotier.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import broker.twotier.dao.Database;
import broker.twotier.exception.DuplicateSSNException;
import broker.twotier.exception.InvalidTransactionException;
import broker.twotier.exception.RecordNotFoundException;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;
import broker.twotier.vo.StockRec;

//인터페이스 implements 한 상태로 클래스 선언하자
public class Broker implements ActionListener,ItemListener{
	private static int mode = 0;
	private static final int ADD_MODE = 1;
	private static final int UPDATE_MODE = 2;

	Database 		db;

	Frame 	frame =new Frame("ABC Stock");

	//*************컴포넌트 선언...생성 ************************
    //*******************************************************
	Panel 	pc =new Panel();
	Panel 	pe =new Panel();
	
	Panel 	   pec	=new Panel();
	Panel 	   pes	=new Panel();	
	
	
	Panel 	   pcn	=new Panel();
	Panel 	   pcc	=new Panel();
	Panel 	   pcw	=new Panel();
	Panel 	   pcs	=new Panel();
	

	Panel 		pcn1	=new Panel();
	Panel 		pcc1	=new Panel();
	Panel 		pcc2	=new Panel();
	
	Panel 		pcwn	=new Panel();
	Panel 		pcws	=new Panel();
	Panel 		pcwa	=new Panel();
	

	TextField nameTf	= new TextField(15);
	TextField ssnTf		= new TextField(15);
	TextField stockTf	= new TextField(15);
	TextField buyTf		= new TextField(15);
	TextField priceTf	= new TextField(15);
	TextField sellTf	= new TextField(15);

	TextArea addrTa	= new TextArea(3,15);

	List 	custList	= new List(15, false);
	List 	stockList	= new List(15, false);
	List 	portList	= new List(15, false);
	
	Button 	addB	= new Button("ADD");
	Button 	deleteB	= new Button("DELETE");
	Button 	updateB	= new Button("UPDATE");
	Button 	applyB	= new Button("apply");
	Button 	cancelB	= new Button("cancel");

	Button 	buyB	= new Button("Buy");
	Button 	sellB	= new Button("Sell");

	Button 	priceB	= new Button("Get Current Stock Price");

	// **************** 생성자 **************************************
	//*****************************************************************
	public Broker() throws Exception{
		
	   try	{	    
	    db =  new Database("127.0.0.1");
		} catch(Exception cnfe) {
			System.out.println("Broker Constructor : " + cnfe);
	
		}
		createGUI();
		addListener();

		showCustList(db.getAllCustomers(),custList);
		showStockList(db.getAllStocks(),stockList);
	
		initButton(true);
		emptyText();
		textEditable(false);

	}//생성자 닫고...

	// **********배경색, 전경색 지정 **********************
	//**************************************************
	public void createGUI() {	
	
		pc.setBackground(new Color(196 ,196  ,255  ));
		pe.setBackground(new Color(196 ,196  ,255  ));
		pec.setBackground(new Color(196 ,196  ,255  ));
		pes.setBackground(new Color(196 ,196  ,255  ));
		pcn.setBackground(new Color(196 ,196  ,255  ));
		pcc.setBackground(new Color(196 ,196  ,255  ));
		pcw.setBackground(new Color(196 ,196  ,255  ));
		pcs.setBackground(new Color(196 ,196  ,255  ));
		pcn1.setBackground(new Color(196 ,196  ,255  ));
		pcc1.setBackground(new Color(196 ,196  ,255  ));
		pcc2.setBackground(new Color(196 ,196  ,255  ));
		pcwn.setBackground(new Color(196 ,196  ,255  ));
		pcws.setBackground(new Color(196 ,196  ,255  ));
		pcwa.setBackground(new Color(196 ,196  ,255  ));
		custList.setBackground(new Color(142 ,142  ,255));
		stockList.setBackground(new Color(48 ,0  ,96));
		portList.setBackground(new Color(142 ,142  ,255));
		sellTf.setBackground(new Color(196 ,196  ,255));
	
	    frame.add(pc,"Center");
		frame.add(pe,"East");
		// *******************  컴포넌트 부착  ************************************
		// **********************************************************************
		pe.setLayout(new BorderLayout());
			pe.add(new Label("Stock Information", Label.CENTER), "North");
			pe.add(pec, "Center");
			pe.add(pes, "South");

			pec.setLayout(new BorderLayout());
			pec.add(new Label("Available Stocks"), "North");
			pec.add(stockList, "Center");
			pec.add(priceB, "South");
			pes.setLayout(new GridLayout(2, 2));
			pes.add(new Label("  Stock"));	
			pes.add(stockTf);
			pes.add(new Label("  Current Price"));	
			pes.add(priceTf);

		pc.setLayout(new BorderLayout());
			pc.add(pcn, "North");
			pc.add(pcc, "Center");
			pc.add(pcw, "West");
			pc.add(pcs, "South");

			GridLayout grid = new GridLayout(2, 1);
			pcn.setLayout(grid);
			grid.setHgap(20);
			pcn.add(new Label("Customer Information", Label.CENTER));
			pcn.add(pcn1);
			pcn1.add(addB);
			pcn1.add(deleteB);
			pcn1.add(updateB);
			pcn1.add(applyB);
			pcn1.add(cancelB);

			pcc.setLayout(new GridLayout(1, 2));
			pcc.add(pcc1);
			pcc1.setLayout(new BorderLayout());
			pcc1.add(new Label("Stock Portfolio"), "North");
			pcc1.add(portList);

			pcc.add(pcc2);
			pcc2.setLayout(new BorderLayout());
			pcc2.add(new Label("All Customers"), "North");
			pcc2.add(custList);

			pcw.setLayout(new GridLayout(3, 1));
			pcw.add(pcwn);
			pcwn.add(new Label("Name"));
			pcwn.add(nameTf);
			pcw.add(pcws);
			pcws.add(new Label("SSN"));
			pcws.add(ssnTf);
			pcw.add(pcwa);
			pcwa.add(new Label("Address"));
			pcwa.add(addrTa);

			pcs.add(buyB);
			pcs.add(buyTf);
			pcs.add(sellTf);
			pcs.add(sellB);

	// ************* 버튼 초기화 *****************************************
	// ****************************************************************
		buyB.setEnabled(true);
		sellB.setEnabled(true);

		stockTf.setEditable	(false);
		priceTf.setEditable	(false);
		buyTf.setEditable  	(false);

	
		frame.setSize(700, 350);
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}//createGUI() 닫고


	// ************** 리스너 부착 ****************************************
	//*****************************************************************

    public void addListener()
	{
		addB.addActionListener(this);
		deleteB.addActionListener(this);
        updateB.addActionListener(this);
        applyB.addActionListener(this);
		cancelB.addActionListener(this);
		buyB.addActionListener(this);
        sellB.addActionListener(this);
        priceB.addActionListener(this);

		custList.addItemListener(this);
		stockList.addItemListener(this);
        portList.addItemListener(this);               

            
		//***********프레임 창 닫는 로직. ***********************************
		//****************************************************************
   		frame.addWindowListener(
			new WindowAdapter()	{	
				public void windowClosing(WindowEvent we){	
					System.exit(0);
				}
			}
		);
	} //addListener() 닫고....

	/*
	버튼을 Group(add, delete, update vs apply, cancel)하여
	Enable되게 하는 메소드
	*/
    public void initButton(boolean b){
		addB.setEnabled(b);
        deleteB.setEnabled(b);
        updateB.setEnabled(b);
		applyB.setEnabled(!b);
		cancelB.setEnabled(!b);
	}
	// name, ssn, address  TextField의 편집상태를 바꾼다
	public void textEditable(boolean b)	{
		nameTf.setEditable	(b);
		ssnTf.setEditable	(b);
		addrTa.setEditable	(b);
	}

	//ssn, name, address의 TextFiled 값을 clear 시킨다.
	public void emptyText(){
    	nameTf.setText("");
    	ssnTf.setText("");
    	addrTa.setText("");                              
    }
	//==================================================================
	// Database의 method를 호출
	//==================================================================

		// showList(db.getAllCustomer() , custList )
		/**
		 * 1)customer List area에 있는 모든걸 지운다<BR>
		 * 2)CustomerRec[]에 있는 모든 CustomerRec 객체 내용을 List에 뿌려준다<BR>
		 */
		public void showCustList(ArrayList<CustomerRec> cust, List list){
			list.removeAll();
			for(CustomerRec c : cust) {
				String ssn = c.getSsn();
				String name = c.getName();
				String addr = c.getAddress();
				
				list.add(ssn+"  "+name+"  "+addr);				
			}			
	    }	
		
		/**
		*argument로 받은 CustomerRec[]을 stockList에 하나씩 뿌려준다.<BR>
		 * 1)stock List area에 있는 모든걸 지운다.<BR>
		 * 2)StockRec[]에 있는 모든 StockRec 객체 내용을 List에 뿌려준다.<BR>
		 */
		public void showStockList(ArrayList<StockRec> sr, List list){
			list.removeAll();
			list.setForeground(Color.YELLOW);
			for(StockRec s : sr) {
				String symbol = s.getSymbol();
				float price = s.getPrice();
				list.add(symbol+" "+price);
			}			
		}

		
		 /**
		<PRE>
		 * 1)인자값으로 입력된 Vector타입의 portfolio 정보를 폼 리스트중 Stock Portfolio에 뿌려준다.
		 </PRE>
		 */    
		public void showList(Vector<SharesRec> portfolio, List list){
			list.removeAll();
			
			for(SharesRec s : portfolio) {
				String symbol = s.getSymbol();
				int quantity = s.getQuantity();
				list.add(symbol +" "+quantity);
			}			
		}
		
		 /**
		<PRE>
		 * 1)customer List에서 선택된 항목중에서 ssn을 Token한다
		 * 2)잘라진 ssn으로 DB의 getCustomer()를 이용. table에서 ssn에 해당하는 나머지 정보를 가져온다
		 * 3)가져온 정보를 ssn,name,address TextField와 port LIst에 뿌린다. 
		 </PRE>
		 */    
		public void showCustomer(){
			String customer=custList.getSelectedItem();
			StringTokenizer st = new StringTokenizer(customer);
			String ssn = st.nextToken();
			System.out.println(ssn);
			try{
				CustomerRec cr=db.getCustomer(ssn);
				nameTf.setText(cr.getName());
				ssnTf.setText(cr.getSsn());
				addrTa.setText(cr.getAddress());
				Vector<SharesRec> v=cr.getPortfolio();
				if(v !=null){ //주식을 보유한 고객이라면...
					showList(v, portList);
				}else{ //주식을 보유하지 않은 고객이라면...
					portList.removeAll();
				}
			}catch(SQLException e){
				System.out.println("찾는 고객의 정보가 없어여...showCustomer()...");
			}
			
			
		} 
		
		 /**
		<PRE>
		 * 1)ssn, symbol, quantity 정보를 알아온다 --> ssnTf, buyTf, sellTf의 텍스트박스에 입력된 값
		 * 2)각각의 값들을 인자로 DB의 buyShares()를 이용. 
		 * 3)폼의 Stock Portfolio에 주식의 정보와 수량이 뿌려지게 한다.
		 </PRE>
		 */   
		public void buyStock(){
			String ssn = ssnTf.getText().trim();
			System.out.println(ssn+"...buyStock()...");
			String symbol = buyTf.getText().trim();
			int quantity = Integer.parseInt(sellTf.getText());
			try{
				db.buyShares(ssn, symbol, quantity);
				showCustomer();//이거 안해주면 어떻게 되는 지 확인...
			}catch(SQLException e){
				e.printStackTrace();
			}				
			
		 } 
	  

		 /**
		<PRE>
		 * 1)ssn, symbol, quantity 정보를 알아온다 --> ssnTf, buyTf, sellTf의 텍스트박스에 입력된 값
		 * 2)각각의 값들을 인자로 DB의 sellShares()를 이용. 
		 * 3)폼의 Stock Portfolio에 주식의 정보와 수량이 뿌려지게 한다.
		 </PRE>
		 */   
		public void sellStock(){
			String ssn = ssnTf.getText().trim();
			System.out.println(ssn+"...sellStock()...");
			String symbol = buyTf.getText().trim();
			int quantity = Integer.parseInt(sellTf.getText());
			try{
				db.sellShares(ssn, symbol, quantity);
				
			}catch(SQLException e){
				e.printStackTrace();
			}catch(Exception e2){
				System.out.println("팔려는 주식이 넘 많아여...sellStock()");
			}
			showCustomer();//이거 안해주면 어떻게 되는 지 확인...
		}
		 
		 /**
		<PRE>
		 * 1)apply button에 의해 호출되는 메소드(Add button과 관련있다.)
		 * 2)nameTf,ssnTf,addrTa 에 입력된 값을 받아와 CustomerRec 객체를 생성
		 * 3)DB의 addCustomer()를 호출하고
		 * 4)최종적으로 List에 추가된 고객을 포함한 모든 고객의 리스트를 뿌린다.
		 </PRE>
		 */
		public void addCustomer(){
			
			String name = nameTf.getText().trim();
			String ssn = ssnTf.getText().trim();
			String address = addrTa.getText().trim();
			CustomerRec cr = new CustomerRec(ssn, name, address);
			
			try{
				db.addCustomer(cr);
				showCustList(db.getAllCustomers(), custList);
			}catch(DuplicateSSNException e){
				System.out.println("중복되는 고객 있어여...addCustomer()");
			}catch(SQLException e){
				e.printStackTrace();
			}
			
	    } 
		 /**
		<PRE>
		 * 1)apply button에 의해 호출되는 메소드(Add button과 관련있다.)
		 * 2)nameTf,ssnTf,addrTa 에 입력된 값을 받아와 CustomerRec 객체를 생성
		 * 3)DB의 updateCustomer()를 호출하고
		 * 4)최종적으로 List에 수정된 고객을 포함한 모든 고객의 리스트를 뿌린다.
		 </PRE>
		 */ 		  
		public void updateCustomer(){
			
			String name = nameTf.getText().trim();
			String ssn = ssnTf.getText().trim();
			String address = addrTa.getText().trim();
			CustomerRec cr = new CustomerRec(ssn, name, address);
			
			try{
				db.updateCustomer(cr);
				showCustList(db.getAllCustomers(), custList);
			}catch(RecordNotFoundException e){
				System.out.println("수정할 대상의 고객이 없어요...updateCustomer()");
			}catch(SQLException e){
				e.printStackTrace();
			}
			
			
	    } 
		
		/**
		//delete button에 의해 호출된다.
		 * 1)database의 deleteCustomer(ssn)call<BR>
		 * 2)showList(CustomerRec[],List) 호출<BR>
		 * 
		 */
		public void deleteCustomer(){
			String ssn = ssnTf.getText().trim();
			try{
				db.deleteCustomer(ssn);
				ArrayList<CustomerRec> list = db.getAllCustomers();
				showCustList(list, custList);
			}catch(Exception e){
				System.out.println("삭제하려는 고객이 없습니다. Broker.deleteCustomer() "+e);
			}
	    } 



		
		/**
		<PRE>
		*stockList에 선택된 내용을
		*buyTf, sockTf, priceTf TextField에 뿌려준다.
		 * 1)stock List 중에서 선택된 항목을 Token한다.
		 * 2)symbol,price를 해당 textfield에 setting 한다.
		 </PRE>
		 */
		public void showStock(){
			String stock = stockList.getSelectedItem();
			StringTokenizer st = new StringTokenizer(stock);
			String symbol = st.nextToken().trim();
			String price = st.nextToken().trim();
			
			buyTf.setText(symbol);
			stockTf.setText(symbol);
			priceTf.setText(price);
		}

		  /**
		*portList에 선택된 내용을 buy, sell TextField에 뿌려준다.
		 * 1)port List에서 선택된 항목을 Token한다.<BR>
		 * 2)symbol,quantity를 해당 textfield에 setting한다<BR>
		 */
		public void showPortfolio(){
			String portfolio = portList.getSelectedItem();
			StringTokenizer st = new StringTokenizer(portfolio);
			String symbol = st.nextToken();
			String quantity = st.nextToken();
			
			buyTf.setText(symbol);
			sellTf.setText(quantity);
	   	}


	//============================================================
	// Event Handling 처리
	//=============================================================

		 /**
		<PRE>
		 * List내에서 다른 아이템을 선택하면 call
		 * 1)이 메소드 호출시 언제나 2개의 textfield(buy,sell)의 상태를 null로 만들것
		 * 2)이 메소드를 호출시킨 event source가
		 *   customer List일 경우 : showCustomer() method call
		 *   portfolio List일 경우 : showPortfolio() method call
		 *   stock List 일 경우 : showStock() method call
		</PRE>
		 */
		public void itemStateChanged(ItemEvent ie) {
			buyTf.setText("");
			sellTf.setText("");
			List list = (List)ie.getSource();
			if(list.equals(custList)){
				showCustomer();
			}else if(list.equals(stockList)){
				showStock();
			}else{
				showPortfolio();
			}		
			
		}
		//Button들이 eventHandling
		public void actionPerformed(ActionEvent ae){
			String buttonLabel = ae.getActionCommand();
			if(buttonLabel.equals("ADD")){
				initButton(false);
				textEditable(true);
				emptyText(); 
				nameTf.requestFocus();
				mode = ADD_MODE;
				System.out.println(mode);
			}else if(buttonLabel.equals("DELETE")){
				deleteCustomer();
				emptyText();
			}else if(buttonLabel.equals("UPDATE")){
				initButton(false);
				textEditable(true);
				nameTf.requestFocus();
				mode = UPDATE_MODE;
				System.out.println(mode);
			}else if (buttonLabel.equals("apply"))	{
			
				switch(mode){
					case ADD_MODE:
						addCustomer();
						emptyText();
						textEditable(false);
						initButton(true);
						break;
					case UPDATE_MODE:
						updateCustomer();
						textEditable(false);
						initButton(true);
						break;
				}
			}else if(buttonLabel.equals("cancel")){
				initButton(true);
				emptyText();
				textEditable(false);
			}else if(buttonLabel.equals("Buy")){
				buyStock();
				sellTf.setText("");
			}else if (buttonLabel.equals("Sell")){
				sellStock();
				sellTf.setText("");
				System.out.println(0);
			}
		}
	public static void main(String args[])throws Exception {
		Broker broker = new Broker();		
	}
}


