// important Libraries for GUI
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;
//important Libraries for GUI

public class BEW  extends JFrame
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JLabel THETITLE, SUBTITLE1,SUBTITLE2,SUBTITLE3,SUBTITLE4,SUBTITLE5,SUBTITLE6,SUBTITLE7,SUBTITLE8,SUBTITLE9,SUBTITLE10,SUBTITLE11, SUBTITLE12;
	
	private JComboBox<String> box;
	public String [] aircraftsname = {"HP1522","HP1523","HP1526","HP1527","HP1528","HP1529","HP1530",
			                          "HP1531","HP1532","HP1533","HP1534","HP1535","HP1536","HP1537","HP1538","HP1539",
			                          "HP1711","HP1712","HP1713","HP1714","HP1715","HP1716","HP1717","HP1718","HP1719",
			                          "HP1720","HP1721","HP1722","HP1723","HP1724","HP1725","HP1726","HP1727","HP1728",
			                          "HP1729","HP1730","HP1821","HP1822","HP1823","HP1824","HP1825","HP1826","HP1827",
			                          "HP1827","HP1829","HP1830","HP1831","HP1832","HP1833","HP1834","HP1835","HP1836",
			                          "HP1837","HP1838","HP1839","HP1840","HP1841","HP1842","HP1843","HP1844","HP1845",
			                          "HP1846","HP1847","HP1848","HP1849","HP1850","HP1851","HP1852","HP1853","HP1854",
			                          "HP1855","HP1856","HP1857",
			                          
			                          "HP1371","HP1372","HP1373","HP1374","HP1375","HP1376","HP1377","HP1378","HP1379",
			                          "HP1389","HP1520","HP1521","HP1524","HP1525","HP1527",
			                          "HP1528","HP1528","HP1530","HP1531",
			                          
			                          "HP1540","HP1556","HP1557","HP1558","HP1559","HP1560","HP1561","HP1562","HP1563","HP1564","HP1565","HP1566","HP1567",
			                          "HP1568","HP1569",
			                          
			                          "HP9901","HP9902","HP9903","HP9904","HP9905"
	                                  };
	private int selectedAircraftarm = 0;
	private double arm = 706.17; 
	private double  arm2 = 0.1304;
	private double Nosearm =93;

	private  double NosearmE =0; 
	
	
	private double MLW = 146300, DBA = 627.1, MACL = 155.8 ;
	
			
	public JCheckBox jackpoint;
	public JCheckBox PlatformScales;
    
	public int X = 150, Y = 212, XX = 279 , YY = 309, xx =346, XXX= 400, YYY=430, yyy=471, V=-5;
	
	public JTextField item1LEFTin,  item1LEFTout,  TARE1LEFTin,    TARE1LEFTout,     InstCorr1LEFTin,   InstCorr1LEFTout,    CellDrift1LEFTin,   CellDrift1LEFTout,   OLEO1LEFTinout;   
	public JTextField item2RIGHTin, item2RIGHTout, TARE2RIGHTin,   TARE2RIGHTout,    InstCorr2RIGHTin,  InstCorr2RIGHTout,   CellDrift2RIGHTin,  CellDrift2RIGHTout,  OLEO2RIGHTinout;  
	public JTextField item3NOSEleft,item3NOSEright,TARE3NOSEleft,  TARE3NOSEright,   InstCorr3NOSEleft, InstCorr3NOSEright,  CellDrift3NOSEleft, CellDrift3NOSEright,  OLEO3NOSEleftright;
	
	public JTextField item4LEFTin,  item4LEFTout,  TARE4LEFTin,    TARE4LEFTout,     InstCorr4LEFTin,   InstCorr4LEFTout,    CellDrift4LEFTin,   CellDrift4LEFTout,   OLEO4LEFTinout;
	public JTextField item5RIGHTin, item5RIGHTout, TARE5RIGHTin,   TARE5RIGHTout,    InstCorr5RIGHTin,  InstCorr5RIGHTout,   CellDrift5RIGHTin,  CellDrift5RIGHTout,  OLEO5RIGHTinout;
	public JTextField item6NOSEleft,item6NOSEright,TARE6NOSEleft,  TARE6NOSEright,   InstCorr6NOSEleft, InstCorr6NOSEright,  CellDrift6NOSEleft, CellDrift6NOSEright, OLEO6NOSEleftright;
	
	public JTextField item7LEFTin,  item7LEFTout,  TARE7LEFTin,    TARE7LEFTout,     InstCorr7LEFTin,   InstCorr7LEFTout,    CellDrift7LEFTin,   CellDrift7LEFTout,   OLEO7LEFTinout;
	public JTextField item8RIGHTin, item8RIGHTout, TARE8RIGHTin,   TARE8RIGHTout,    InstCorr8RIGHTin,  InstCorr8RIGHTout,   CellDrift8RIGHTin,  CellDrift8RIGHTout,  OLEO8RIGHTinout;
	public JTextField item9NOSEleft,item9NOSEright,TARE9NOSEleft,  TARE9NOSEright,   InstCorr9NOSEleft, InstCorr9NOSEright,  CellDrift9NOSEleft, CellDrift9NOSEright, OLEO9NOSEleftright;
	
	
	public JLabel fstWeightLEFTin;
	public JLabel fstWeightRIGHTin;
	public JLabel fstWeightNOSEleft;
	
	public JLabel sndWeightLEFTin;
	public JLabel sndWeightRIGHTin;
	public JLabel sndWeightNOSEleft;
	
	public JLabel trdWeightLEFTin;
	public JLabel trdWeightRIGHTin;
	public JLabel trdWeightNOSEleft;

	
	private double getvalue1,  getvalue2,  getvalue3,  getvalue4,  getvalue5,  getvalue6,  getvalue7,  getvalue8,  getvalue9;
	private double getvalue10, getvalue11, getvalue12, getvalue13, getvalue14, getvalue15, getvalue16, getvalue17, getvalue18;
	private double getvalue19, getvalue20, getvalue21, getvalue22, getvalue23, getvalue24, getvalue25, getvalue26, getvalue27;
	private double getvalue28, getvalue29, getvalue30, getvalue31, getvalue32, getvalue33, getvalue34, getvalue35, getvalue36;
	private double getvalue37, getvalue38, getvalue39, getvalue40, getvalue41, getvalue42, getvalue43, getvalue44, getvalue45;
	private double getvalue46, getvalue47, getvalue48, getvalue49, getvalue50, getvalue51, getvalue52, getvalue53, getvalue54;
	
	private double getvalue55, getvalue56, getvalue57, getvalue58, getvalue59, getvalue60, getvalue61, getvalue62, getvalue63;
	private double getvalue64, getvalue65, getvalue66, getvalue67, getvalue68, getvalue69, getvalue70, getvalue71, getvalue72;
	
	private double MWD1,MWD2,MWD3,W1,W2,W3,W12,W13,W23,SelectedW, TEST1, TEST2, TEST3;
	
	private double Weightdifferencecheck;
	
	private double M12,M34,M56;
	private double M78,M910,M1112;
	private double M1314,M1516,M1718;
	
	private double  SelectedM,SelectedArm, MAClimit,Wlimit, MAC; 
	
	
	private String previousWW, previousMACMAC;
	public JButton calculate;
	
	
	public int SelectedMethod = 2;
	
	
	
	public JTextArea finalresultW, finalresultA, finalresultM, finalresultMAC, previousresultW,previousresultMAC, currentresultW,currentresultMAC, finalMAC, finalWeight;
	public JTextArea MainsWgtDiffer1, MainsWgtDiffer2, MainsWgtDiffer3;
	
	private Scanner f;
	
	public  BEW ()
	{    

		super("Basic Empty Weight (CM)");
		setLayout(null);
		
		
		try {
			setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fav.png")));
			
			
			}catch(Exception e){
			   System.out.println("Application icon not found");
			}

		    
		
		   box = new JComboBox<>(aircraftsname);
		   ((JLabel)box.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		   box.setBounds(17, 5, 100, 18);
		   box.setFont(new Font("Sherif", Font.BOLD, 11));
		   box.setForeground(Color.BLUE);
		   add(box);
		   box.addActionListener(new ActionListener() 
		   { 
			    public void actionPerformed(ActionEvent event) 
			    {
			    	 String Aircraft = (String) box.getSelectedItem();
			    	 if (Aircraft.equals("HP1522")||Aircraft.equals("HP1523")||Aircraft.equals("HP1526")||Aircraft.equals("HP1527")||Aircraft.equals("HP1528")||Aircraft.equals("HP1529")||Aircraft.equals("HP1530")||
                         Aircraft.equals("HP1531")||Aircraft.equals("HP1532")||Aircraft.equals("HP1533")||Aircraft.equals("HP1534")||Aircraft.equals("HP1535")||Aircraft.equals("HP1536")||Aircraft.equals("HP1537")||Aircraft.equals("HP1538")||Aircraft.equals("HP1539")||
                         Aircraft.equals("HP1711")||Aircraft.equals("HP1712")||Aircraft.equals("HP1713")||Aircraft.equals("HP1714")||Aircraft.equals("HP1715")||Aircraft.equals("HP1716")||Aircraft.equals("HP1717")||Aircraft.equals("HP1718")||Aircraft.equals("HP1719")||
                         Aircraft.equals("HP1720")||Aircraft.equals("HP1721")||Aircraft.equals("HP1722")||Aircraft.equals("HP1723")||Aircraft.equals("HP1724")||Aircraft.equals("HP1725")||Aircraft.equals("HP1726")||Aircraft.equals("HP1727")||Aircraft.equals("HP1728")||
                         Aircraft.equals("HP1729")||Aircraft.equals("HP1730")||Aircraft.equals("HP1821")||Aircraft.equals("HP1822")||Aircraft.equals("HP1823")||Aircraft.equals("HP1824")||Aircraft.equals("HP1825")||Aircraft.equals("HP1826")||Aircraft.equals("HP1827")||
                         Aircraft.equals("HP1827")||Aircraft.equals("HP1829")||Aircraft.equals("HP1830")||Aircraft.equals("HP1831")||Aircraft.equals("HP1832")||Aircraft.equals("HP1833")||Aircraft.equals("HP1834")||Aircraft.equals("HP1835")||Aircraft.equals("HP1836")||
                         Aircraft.equals("HP1837")||Aircraft.equals("HP1838")||Aircraft.equals("HP1839")||Aircraft.equals("HP1840")||Aircraft.equals("HP1841")||Aircraft.equals("HP1842")||Aircraft.equals("HP1843")||Aircraft.equals("HP1844")||Aircraft.equals("HP1845")||
                         Aircraft.equals("HP1846")||Aircraft.equals("HP1847")||Aircraft.equals("HP1848")||Aircraft.equals("HP1849")||Aircraft.equals("HP1850")||Aircraft.equals("HP1851")||Aircraft.equals("HP1852")||Aircraft.equals("HP1853")||Aircraft.equals("HP1854")||
                         Aircraft.equals("HP1855")||Aircraft.equals("HP1856")||Aircraft.equals("HP1857"))
			    	 {
			    		 
			    		 if(SelectedMethod==2) 
			    		 {
			    			 arm = 706.17;
			    		 }
			    		 if(SelectedMethod==1) 
			    		 {
			    			 arm = 705.28;
			    		 }
			    		 
			    		 
			    		  arm2 =0.1304; 
			    		
			              Nosearm =93;
			              
			              
			              NosearmE = 0;
			              selectedAircraftarm=0;
			              
			              MLW = 146300;
			              DBA = 627.1; 
			              MACL = 155.8 ;
			              
			         //     OLEO1LEFTinout.setText(" ");
			         //     OLEO2RIGHTinout.setText(" ");
			         //     OLEO3NOSEleftright.setText(" ");
			         //     OLEO2RIGHTinout.setText(OLEO1LEFTinout.getText());
			         //     OLEO2RIGHTinout.setEditable(false);
			         //     OLEO2RIGHTinout.setForeground(Color.BLACK);
			              
			              
			            item1LEFTin.setText("");
			            item1LEFTout.setText("");    
			          	item2RIGHTin.setText(""); 
			          	item2RIGHTout.setText("");  
			          	item3NOSEleft.setText("");
			          	item3NOSEright.setText("");
			          	
			          	item4LEFTin.setText("");  
			          	item4LEFTout.setText("");  
			          	item5RIGHTin.setText(""); 
			          	item5RIGHTout.setText("");
			          	item6NOSEleft.setText("");
			          	item6NOSEright.setText("");
			          	
			          	item7LEFTin.setText("");  
			          	item7LEFTout.setText("");  
			          	item8RIGHTin.setText(""); 
			          	item8RIGHTout.setText("");    
			          	item9NOSEleft.setText("");
			          	item9NOSEright.setText("");
			              
			              
			              
				          OLEO1LEFTinout.setText("");
				          OLEO3NOSEleftright.setText("");
				          OLEO2RIGHTinout.setEditable(true);
				          OLEO2RIGHTinout.setText("");
				          OLEO2RIGHTinout.setForeground(Color.BLUE);
			              
			              

	 		    		  MainsWgtDiffer1.setBackground(Color.WHITE);
	 		    		  MainsWgtDiffer2.setBackground(Color.WHITE);
	 		    	      MainsWgtDiffer3.setBackground(Color.WHITE);
	 		    	      
	 		    		  finalresultA.setBackground(Color.WHITE);
                          finalresultW.setBackground(Color.WHITE);
	 		    		  finalresultM.setBackground(Color.WHITE);
	 		    		  finalresultMAC.setBackground(Color.WHITE);

	 		    	      
			              previousresultW.setText(" ");
			              previousresultW.setBackground(Color.WHITE);

			              previousresultMAC.setText(" ");
			              previousresultMAC.setBackground(Color.WHITE);
			              
			              currentresultW.setText(" ");
			              currentresultW.setBackground(Color.WHITE);

			              currentresultMAC.setText(" ");
			              currentresultMAC.setBackground(Color.WHITE);
			              
			              finalWeight.setText(" ");
			              finalWeight.setBackground(Color.WHITE);
			              
			              finalMAC.setText(" ");
			              finalMAC.setBackground(Color.WHITE);
	 		    		
			          	 previousWW = " ";
			          	 previousMACMAC = " ";
			          	 
			          	 Wlimit = Double.NaN;
			          	 MAClimit = Double.NaN;
			          	
			        	 
	 		    			
	 		    			
			              
			         }   
			    	 if (     Aircraft.equals("HP1371")||Aircraft.equals("HP1372")||Aircraft.equals("HP1373")||Aircraft.equals("HP1374")||Aircraft.equals("HP1375")||Aircraft.equals("HP1376")||Aircraft.equals("HP1377")||Aircraft.equals("HP1378")||Aircraft.equals("HP1379")||
			    			  Aircraft.equals("HP1389")||Aircraft.equals("HP1520")||Aircraft.equals("HP1521")||Aircraft.equals("HP1524")||Aircraft.equals("HP1525")||Aircraft.equals("HP1527")||
			    			  Aircraft.equals("HP1528")||Aircraft.equals("HP1528")||Aircraft.equals("HP1530")||Aircraft.equals("HP1531")) 
			         {
			    		 
			    		 if(SelectedMethod==2) 
			    		 {
			    			 arm = 706.17;
			    		 }
			    		 if(SelectedMethod==1) 
			    		 {
			    			 arm = 705.28; 
			    		 }
			    		 
			    		 arm2 = 0.1304;
			    		
			        	 Nosearm = 211;
			        	
			        	 NosearmE = 0;
			        	 selectedAircraftarm=0;
			        	 
			        	 MLW = 129200;
			             DBA = 627.1; 
			             MACL = 155.8 ;
			      //  	 OLEO1LEFTinout.setText(" ");
			      //     OLEO3NOSEleftright.setText(" ");
			      //  	 OLEO2RIGHTinout.setText(OLEO1LEFTinout.getText());
			      //  	 OLEO2RIGHTinout.setEditable(false);
			      //  	 OLEO2RIGHTinout.setForeground(Color.BLACK);
			        	 
			             
				            item1LEFTin.setText("");
				            item1LEFTout.setText("");    
				          	item2RIGHTin.setText(""); 
				          	item2RIGHTout.setText("");  
				          	item3NOSEleft.setText("");
				          	item3NOSEright.setText("");
				          	
				          	item4LEFTin.setText("");  
				          	item4LEFTout.setText("");  
				          	item5RIGHTin.setText(""); 
				          	item5RIGHTout.setText("");
				          	item6NOSEleft.setText("");
				          	item6NOSEright.setText("");
				          	
				          	item7LEFTin.setText("");  
				          	item7LEFTout.setText("");  
				          	item8RIGHTin.setText(""); 
				          	item8RIGHTout.setText("");    
				          	item9NOSEleft.setText("");
				          	item9NOSEright.setText("");
			        	 
			        	 OLEO1LEFTinout.setText("");
			             OLEO3NOSEleftright.setText("");
			        	 OLEO2RIGHTinout.setEditable(true);
			        	 OLEO2RIGHTinout.setText("");
			        	 OLEO2RIGHTinout.setForeground(Color.BLUE);
			        	 
	 		    		  MainsWgtDiffer1.setBackground(Color.WHITE);
	 		    		  MainsWgtDiffer2.setBackground(Color.WHITE);
	 		    	      MainsWgtDiffer3.setBackground(Color.WHITE);
	 		    		  finalresultA.setBackground(Color.WHITE);
                         finalresultW.setBackground(Color.WHITE);
	 		    		  finalresultM.setBackground(Color.WHITE);
	 		    		 finalresultMAC.setBackground(Color.WHITE);
			        	 
			              previousresultW.setText(" ");
			              previousresultW.setText(" ");
			              previousresultW.setBackground(Color.WHITE);
			              previousresultW.setBackground(Color.WHITE);

			              previousresultMAC.setText(" ");
			              previousresultMAC.setText(" ");
			              previousresultMAC.setBackground(Color.WHITE);
			              previousresultMAC.setBackground(Color.WHITE);
			              
			              currentresultW.setText(" ");
			              currentresultW.setBackground(Color.WHITE);

			              currentresultMAC.setText(" ");
			              currentresultMAC.setBackground(Color.WHITE);
			              
			              finalWeight.setText(" ");
			              finalWeight.setText(" ");
			              finalWeight.setBackground(Color.WHITE);
			              finalWeight.setBackground(Color.WHITE);
			              
			              finalMAC.setText(" ");
			              finalMAC.setText(" ");
			              finalMAC.setBackground(Color.WHITE);
			              finalMAC.setBackground(Color.WHITE);
	 		    		
			          	 previousWW = " ";
			          	 previousMACMAC = " ";
			          	 
			          	 Wlimit = 0;
			          	 MAClimit = 0;
			         }
			         if ( Aircraft.equals("HP1540")||Aircraft.equals("HP1556")||Aircraft.equals("HP1557")||Aircraft.equals("HP1558")||Aircraft.equals("HP1559")||Aircraft.equals("HP1560")||
			        	  Aircraft.equals("HP1561")||Aircraft.equals("HP1562")||Aircraft.equals("HP1563")||Aircraft.equals("HP1564")||Aircraft.equals("HP1565")||Aircraft.equals("HP1566")||Aircraft.equals("HP1567")||Aircraft.equals("HP1568")||Aircraft.equals("HP1569") )
			         {
			        	 
			        	 
			    		 if(SelectedMethod==2) 
			    		 {
			    			 arm = 706.8897864;
			    		 }
			    		 if(SelectedMethod==1) 
			    		 {
			    			 arm = 706.8897864;
			    		 }
			    		 
			    		 arm2 =-0.0512426338713779;
			        
			        	 Nosearm = 161.0236272; 
			        	
			        	 NosearmE =0.140999999999999;
			        	 selectedAircraftarm=2;
			        	 
			        	 MLW = 97003;
			             DBA = 625.83; 
			             MACL = 144.96 ;
			             
				            item1LEFTin.setText("");
				            item1LEFTout.setText("");    
				          	item2RIGHTin.setText(""); 
				          	item2RIGHTout.setText("");  
				          	item3NOSEleft.setText("");
				          	item3NOSEright.setText("");
				          	
				          	item4LEFTin.setText("");  
				          	item4LEFTout.setText("");  
				          	item5RIGHTin.setText(""); 
				          	item5RIGHTout.setText("");
				          	item6NOSEleft.setText("");
				          	item6NOSEright.setText("");
				          	
				          	item7LEFTin.setText("");  
				          	item7LEFTout.setText("");  
				          	item8RIGHTin.setText(""); 
				          	item8RIGHTout.setText("");    
				          	item9NOSEleft.setText("");
				          	item9NOSEright.setText("");
			              
			        	 OLEO1LEFTinout.setText("");
			             OLEO3NOSEleftright.setText("");
			        	 OLEO2RIGHTinout.setEditable(true);
			        	 OLEO2RIGHTinout.setText("");
			        	 OLEO2RIGHTinout.setForeground(Color.BLUE);
			        	 
			        	 
	 		    		  MainsWgtDiffer1.setBackground(Color.WHITE);
	 		    		  MainsWgtDiffer2.setBackground(Color.WHITE);
	 		    	      MainsWgtDiffer3.setBackground(Color.WHITE);
	 		    		  finalresultA.setBackground(Color.WHITE);
                          finalresultW.setBackground(Color.WHITE);
	 		    		  finalresultM.setBackground(Color.WHITE);
	 		    		  finalresultMAC.setBackground(Color.WHITE);
			        	 
			              previousresultW.setText(" ");
			              previousresultW.setText(" ");
			              previousresultW.setBackground(Color.WHITE);
			              previousresultW.setBackground(Color.WHITE);

			              previousresultMAC.setText(" ");
			              previousresultMAC.setText(" ");
			              previousresultMAC.setBackground(Color.WHITE);
			              previousresultMAC.setBackground(Color.WHITE);
			              
			              currentresultW.setText(" ");
			              currentresultW.setBackground(Color.WHITE);

			              currentresultMAC.setText(" ");
			              currentresultMAC.setBackground(Color.WHITE);
			              
			              finalWeight.setText(" ");
			              finalWeight.setText(" ");
			              finalWeight.setBackground(Color.WHITE);
			              finalWeight.setBackground(Color.WHITE);
			              
			              finalMAC.setText(" ");
			              finalMAC.setText(" ");
			              finalMAC.setBackground(Color.WHITE);
			              finalMAC.setBackground(Color.WHITE);
	 		    		
			          	 previousWW = " ";
			          	 previousMACMAC = " ";
			          	 
			          	 Wlimit = 0;
			          	 MAClimit = 0;
			    
			         }
			         
			         
			    	 if (Aircraft.equals("HP9901")|| Aircraft.equals("HP9902")|| Aircraft.equals("HP9903")|| Aircraft.equals("HP9904")|| Aircraft.equals("HP9905"))
				    	 {
				    		 
				    		 if(SelectedMethod==2) 
				    		 {
				    			 arm = 706.17;
				    		 }
				    		 if(SelectedMethod==1) 
				    		 {
				    			 arm = 705.28;
				    		 }
				    		 
				    		 
				    		  arm2 =0.1304; 
				    		
				              Nosearm =31;
				              
				              
				              NosearmE = 0;
				              selectedAircraftarm=0;
				              
				              MLW = 163900;
				              DBA = 627.1; 
				              MACL = 155.8 ;
				              
				         //     OLEO1LEFTinout.setText(" ");
				         //     OLEO2RIGHTinout.setText(" ");
				         //     OLEO3NOSEleftright.setText(" ");
				         //     OLEO2RIGHTinout.setText(OLEO1LEFTinout.getText());
				         //     OLEO2RIGHTinout.setEditable(false);
				         //     OLEO2RIGHTinout.setForeground(Color.BLACK);
				              
				              
				            item1LEFTin.setText("");
				            item1LEFTout.setText("");    
				          	item2RIGHTin.setText(""); 
				          	item2RIGHTout.setText("");  
				          	item3NOSEleft.setText("");
				          	item3NOSEright.setText("");
				          	
				          	item4LEFTin.setText("");  
				          	item4LEFTout.setText("");  
				          	item5RIGHTin.setText(""); 
				          	item5RIGHTout.setText("");
				          	item6NOSEleft.setText("");
				          	item6NOSEright.setText("");
				          	
				          	item7LEFTin.setText("");  
				          	item7LEFTout.setText("");  
				          	item8RIGHTin.setText(""); 
				          	item8RIGHTout.setText("");    
				          	item9NOSEleft.setText("");
				          	item9NOSEright.setText("");
				              
				              
				              
					          OLEO1LEFTinout.setText("");
					          OLEO3NOSEleftright.setText("");
					          OLEO2RIGHTinout.setEditable(true);
					          OLEO2RIGHTinout.setText("");
					          OLEO2RIGHTinout.setForeground(Color.BLUE);
				              
				              

		 		    		  MainsWgtDiffer1.setBackground(Color.WHITE);
		 		    		  MainsWgtDiffer2.setBackground(Color.WHITE);
		 		    	      MainsWgtDiffer3.setBackground(Color.WHITE);
		 		    	      
		 		    		  finalresultA.setBackground(Color.WHITE);
	                          finalresultW.setBackground(Color.WHITE);
		 		    		  finalresultM.setBackground(Color.WHITE);
		 		    		  finalresultMAC.setBackground(Color.WHITE);

		 		    	      
				              previousresultW.setText(" ");
				              previousresultW.setBackground(Color.WHITE);

				              previousresultMAC.setText(" ");
				              previousresultMAC.setBackground(Color.WHITE);
				              
				              currentresultW.setText(" ");
				              currentresultW.setBackground(Color.WHITE);

				              currentresultMAC.setText(" ");
				              currentresultMAC.setBackground(Color.WHITE);
				              
				              finalWeight.setText(" ");
				              finalWeight.setBackground(Color.WHITE);
				              
				              finalMAC.setText(" ");
				              finalMAC.setBackground(Color.WHITE);
		 		    		
				          	 previousWW = " ";
				          	 previousMACMAC = " ";
				          	 
				          	 Wlimit = Double.NaN;
				          	 MAClimit = Double.NaN;
				          	
				        	 
		 		    			
		 		    			
				              
				         }   
			         
			         System.out.println(Aircraft);

			    	 
				 }
				 
		   }	   
				               );
		   
		   THETITLE = new JLabel("Basic Empty Weight Calculator");
		   THETITLE.setFont(new Font("Dialog", Font.BOLD, 16));
		   THETITLE.setBounds(X, 7, 295, 24);
	       add(THETITLE);
	       
	       SUBTITLE11 = new JLabel("    Mains");
	       SUBTITLE11.setFont(new Font("Dialog", Font.PLAIN, 9));
	       SUBTITLE11.setBounds(XXX, -5, 295, 24);
	       add(SUBTITLE11);       
	       	
	       SUBTITLE12 = new JLabel("Wgt Differ");
	       SUBTITLE12.setFont(new Font("Dialog", Font.PLAIN, 9));
	       SUBTITLE12.setBounds(XXX, 8, 295, 24);
	       add(SUBTITLE12);  
	       
	       
	       MainsWgtDiffer1 = new JTextArea();
	       MainsWgtDiffer1.setText("");
	       MainsWgtDiffer1.setBounds(XXX,30, 55, 14);
	       MainsWgtDiffer1.setEditable(false);
		   add(MainsWgtDiffer1);		 
		   MainsWgtDiffer1.setMargin( new Insets(3,5,10,10) );
		   Border borderMWD1 = BorderFactory.createLineBorder(Color.BLACK);
		   MainsWgtDiffer1.setBorder(BorderFactory.createCompoundBorder(borderMWD1, 
				              BorderFactory.createEmptyBorder(-2, 3, 10, 10))); 
	       
		   
	       MainsWgtDiffer2 = new JTextArea();
	       MainsWgtDiffer2.setText("");
	       MainsWgtDiffer2.setBounds(yyy-10,10, 55, 14);
	       MainsWgtDiffer2.setEditable(false);
		   add(MainsWgtDiffer2);		 
		   MainsWgtDiffer2.setMargin( new Insets(3,5,10,10) );
		   Border borderMWD2 = BorderFactory.createLineBorder(Color.BLACK);
		   MainsWgtDiffer2.setBorder(BorderFactory.createCompoundBorder(borderMWD2, 
				              BorderFactory.createEmptyBorder(-2, 3, 10, 10))); 
		   
	       MainsWgtDiffer3 = new JTextArea();
	       MainsWgtDiffer3.setText("");
	       MainsWgtDiffer3.setBounds(yyy-10,30, 55, 14);
	       MainsWgtDiffer3.setEditable(false);
		   add(MainsWgtDiffer3);		 
		   MainsWgtDiffer3.setMargin( new Insets(3,5,10,10) );
		   Border borderMWD3 = BorderFactory.createLineBorder(Color.BLACK);
		   MainsWgtDiffer3.setBorder(BorderFactory.createCompoundBorder(borderMWD3, 
				              BorderFactory.createEmptyBorder(-2, 3, 10, 10))); 
		   
		   
		   
		   
	       
	       SUBTITLE1 = new JLabel("  Scale    Reading");
	       SUBTITLE1.setFont(new Font("Sherif", Font.BOLD, 12));
	       SUBTITLE1.setBounds(X, 45, 150, 20);
	       add(SUBTITLE1);
	       
	       SUBTITLE2 = new JLabel("    (in)             (out)");
	       SUBTITLE2.setFont(new Font("Sherif", Font.PLAIN, 11));
	       SUBTITLE2.setBounds(X, 60, 150, 20);
	       add(SUBTITLE2);
	       
	       SUBTITLE3 = new JLabel("     TARE");
	       SUBTITLE3.setFont(new Font("Sherif", Font.BOLD, 12));
	       SUBTITLE3.setBounds(XX, 45, 100, 20);
	       add(SUBTITLE3);
	       
	       SUBTITLE4 = new JLabel(" (in)    (out)");
	       SUBTITLE4.setFont(new Font("Sherif", Font.PLAIN, 11));
	       SUBTITLE4.setBounds(XX, 60, 100, 20);
	       add(SUBTITLE4);
	       
	       SUBTITLE5 = new JLabel("InstCorr");
	       SUBTITLE5.setFont(new Font("Sherif", Font.BOLD, 12));
	       SUBTITLE5.setBounds(xx-1, 60, 100, 20);
	       add(SUBTITLE5);
	       
	       
	       SUBTITLE6 = new JLabel(" Cell Drift");
	       SUBTITLE6.setFont(new Font("Sherif", Font.BOLD, 12));
	       SUBTITLE6.setBounds(XXX, 45, 100, 20);
	       add(SUBTITLE6);
	       
	       SUBTITLE7 = new JLabel(" (in)    (out)");
	       SUBTITLE7.setFont(new Font("Sherif", Font.PLAIN, 11));
	       SUBTITLE7.setBounds(XXX, 60, 100, 20);
	       add(SUBTITLE7);
	       
	       SUBTITLE8 = new JLabel(" OLEO");
	       SUBTITLE8.setFont(new Font("Sherif", Font.BOLD, 12));
	       SUBTITLE8.setBounds(yyy, 60, 100, 20);
	       add(SUBTITLE8);	       
	       
		
	    // These lines of codes create and add the CheckBoxs in the GUI	       
	    jackpoint = new JCheckBox("Jacking Points");
	    PlatformScales = new JCheckBox("Platform Scale");
	    PlatformScales.setSelected(true);
	    jackpoint.setBounds(15, 55, 115, 15);
	    PlatformScales.setBounds(15, 30, 115, 15);
	    add(jackpoint);
	    add(PlatformScales);
	    // These lines of codes create and add the CheckBoxs in the GUI	 
	    
	    
	    
	   // These lines of codes make possible to select only one JCheckBox	
	    ButtonGroup topGroup = new ButtonGroup();
	    topGroup.add(jackpoint);
	    topGroup.add(PlatformScales);
	    // These lines of codes make possible to select only one JCheckBox

	    
	    
	    
	    // These lines of codes allow to disable the TextBoxs that are not required for jacking point method	    
	    jackpoint.addActionListener
	    (
	 		      new ActionListener() 
	 		      {
	 		    	public void actionPerformed(ActionEvent e) 
	 		    	{
	 		    		    SelectedMethod=1;
	 		    		    
	 		    		   
	 					    	 String Aircraft = (String) box.getSelectedItem();
	 					     if (        Aircraft.equals("HP1522")||Aircraft.equals("HP1523")||Aircraft.equals("HP1526")||Aircraft.equals("HP1527")||Aircraft.equals("HP1528")||Aircraft.equals("HP1529")||Aircraft.equals("HP1530")||
	 			                         Aircraft.equals("HP1531")||Aircraft.equals("HP1532")||Aircraft.equals("HP1533")||Aircraft.equals("HP1534")||Aircraft.equals("HP1535")||Aircraft.equals("HP1536")||Aircraft.equals("HP1537")||Aircraft.equals("HP1538")||Aircraft.equals("HP1539")||
	 			                         Aircraft.equals("HP1711")||Aircraft.equals("HP1712")||Aircraft.equals("HP1713")||Aircraft.equals("HP1714")||Aircraft.equals("HP1715")||Aircraft.equals("HP1716")||Aircraft.equals("HP1717")||Aircraft.equals("HP1718")||Aircraft.equals("HP1719")||
	 			                         Aircraft.equals("HP1720")||Aircraft.equals("HP1721")||Aircraft.equals("HP1722")||Aircraft.equals("HP1723")||Aircraft.equals("HP1724")||Aircraft.equals("HP1725")||Aircraft.equals("HP1726")||Aircraft.equals("HP1727")||Aircraft.equals("HP1728")||
	 			                         Aircraft.equals("HP1729")||Aircraft.equals("HP1730")||Aircraft.equals("HP1821")||Aircraft.equals("HP1822")||Aircraft.equals("HP1823")||Aircraft.equals("HP1824")||Aircraft.equals("HP1825")||Aircraft.equals("HP1826")||Aircraft.equals("HP1827")||
	 			                         Aircraft.equals("HP1827")||Aircraft.equals("HP1829")||Aircraft.equals("HP1830")||Aircraft.equals("HP1831")||Aircraft.equals("HP1832")||Aircraft.equals("HP1833")||Aircraft.equals("HP1834")||Aircraft.equals("HP1835")||Aircraft.equals("HP1836")||
	 			                         Aircraft.equals("HP1837")||Aircraft.equals("HP1838")||Aircraft.equals("HP1839")||Aircraft.equals("HP1840")||Aircraft.equals("HP1841")||Aircraft.equals("HP1842")||Aircraft.equals("HP1843")||Aircraft.equals("HP1844")||Aircraft.equals("HP1845")||
	 			                         Aircraft.equals("HP1846")||Aircraft.equals("HP1847")||Aircraft.equals("HP1848")||Aircraft.equals("HP1849")||Aircraft.equals("HP1850")||Aircraft.equals("HP1851")||Aircraft.equals("HP1852")||Aircraft.equals("HP1853")||Aircraft.equals("HP1854")||
	 			                         Aircraft.equals("HP1855")||Aircraft.equals("HP1856")||Aircraft.equals("HP1857")) 
	 						     {
	 					              
	 				    		
	 				    		 if(SelectedMethod==1) 
	 				    		 {
	 				    			 arm = 705.28;
	 				    		 }
	 					    	 
	 					    	 selectedAircraftarm=1;
	 						     }        
	 					             if (     Aircraft.equals("HP1371")||Aircraft.equals("HP1372")||Aircraft.equals("HP1373")||Aircraft.equals("HP1374")||Aircraft.equals("HP1375")||Aircraft.equals("HP1376")||Aircraft.equals("HP1377")||Aircraft.equals("HP1378")||Aircraft.equals("HP1379")||
	 						    			  Aircraft.equals("HP1389")||Aircraft.equals("HP1520")||Aircraft.equals("HP1521")||Aircraft.equals("HP1524")||Aircraft.equals("HP1525")||Aircraft.equals("HP1527")||
	 						    			  Aircraft.equals("HP1528")||Aircraft.equals("HP1528")||Aircraft.equals("HP1530")||Aircraft.equals("HP1531")) 
	 						         {
	 					            	 
	 						    		
	 						    		 if(SelectedMethod==1) 
	 						    		 {
	 						    			 arm = 705.28; 
	 						    		 }
	 						    		 
	 					        	 selectedAircraftarm=1;
	 					         }
	 					            if ( Aircraft.equals("HP1540")||Aircraft.equals("HP1556")||Aircraft.equals("HP1557")||Aircraft.equals("HP1558")||Aircraft.equals("HP1559")||Aircraft.equals("HP1560")||
	 							        	  Aircraft.equals("HP1561")||Aircraft.equals("HP1562")||Aircraft.equals("HP1563")||Aircraft.equals("HP1564")||Aircraft.equals("HP1565")||Aircraft.equals("HP1566")||Aircraft.equals("HP1567")||Aircraft.equals("HP1568")||Aircraft.equals("HP1569") )
	 							         {
	 						    	
	 						    		 if(SelectedMethod==1) 
	 						    		 {
	 						    			 arm = 706.8897864;
	 						    		 }
	 						    		 
	 					        	      selectedAircraftarm=2;
	 					        	 
	 					                 }
	 					            
	 					          
	 					            
	 		 					     if ( Aircraft.equals("HP9901")|| Aircraft.equals("HP9902")|| Aircraft.equals("HP9903")|| Aircraft.equals("HP9904")|| Aircraft.equals("HP9905")) 
		 						     {
		 					              
		 				    		
		 				    		 if(SelectedMethod==1) 
		 				    		 {
		 				    			 arm = 705.28;
		 				    		 }
		 					    	 
		 					    	 selectedAircraftarm=1;
		 						     }	 					            
	 					            
	 		    			System.out.println(SelectedMethod);
	 		    			SwingUtilities.invokeLater(
	 		    					new Runnable() 
	 		    					{
	 		    						public void run() 
	 		    						{
	 		    							item1LEFTin.setText("");
	 		    							item1LEFTin.setEditable(false);
	 		    							item2RIGHTin.setText("");
	 		    							item2RIGHTin.setEditable(false);
	 		    							item3NOSEleft.setText("");
	 		    							item3NOSEleft.setEditable(false);
	 		    							item4LEFTin.setText("");
	 		    							item4LEFTin.setEditable(false);
	 		    							item5RIGHTin.setText("");
	 		    							item5RIGHTin.setEditable(false);
	 		    							item6NOSEleft.setText("");
	 		    							item6NOSEleft.setEditable(false);
	 		    							item7LEFTin.setText("");
	 		    							item7LEFTin.setEditable(false);
	 		    							item8RIGHTin.setText("");
	 		    							item8RIGHTin.setEditable(false);
	 		    							item9NOSEleft.setText("");
	 		    							item9NOSEleft.setEditable(false);
	 		    							
	 		    							TARE1LEFTin.setText("");
	 		    							TARE1LEFTin.setEditable(false);
	 		    							TARE2RIGHTin.setText("");
	 		    							TARE2RIGHTin.setEditable(false);
	 		    							TARE3NOSEleft.setText("");
	 		    							TARE3NOSEleft.setEditable(false);
	 		    							TARE4LEFTin.setText("");
	 		    							TARE4LEFTin.setEditable(false);
	 		    							TARE5RIGHTin.setText("");
	 		    							TARE5RIGHTin.setEditable(false);
	 		    							TARE6NOSEleft.setText("");
	 		    							TARE6NOSEleft.setEditable(false);
	 		    							TARE7LEFTin.setText("");
	 		    							TARE7LEFTin.setEditable(false);
	 		    							TARE8RIGHTin.setText("");
	 		    							TARE8RIGHTin.setEditable(false);
	 		    							TARE9NOSEleft.setText("");
	 		    							TARE9NOSEleft.setEditable(false);
	 		    							
	 		    							CellDrift1LEFTin.setText("");
	 		    							CellDrift1LEFTin.setEditable(false);
	 		    							CellDrift2RIGHTin.setText("");
	 		    							CellDrift2RIGHTin.setEditable(false);
	 		    							CellDrift3NOSEleft.setText("");
	 		    							CellDrift3NOSEleft.setEditable(false);
	 		    							CellDrift4LEFTin.setText("");
	 		    							CellDrift4LEFTin.setEditable(false);
	 		    							CellDrift5RIGHTin.setText("");
	 		    							CellDrift5RIGHTin.setEditable(false);
	 		    							CellDrift6NOSEleft.setText("");
	 		    							CellDrift6NOSEleft.setEditable(false);
	 		    							CellDrift7LEFTin.setText("");
	 		    							CellDrift7LEFTin.setEditable(false);
	 		    							CellDrift8RIGHTin.setText("");
	 		    							CellDrift8RIGHTin.setEditable(false);
	 		    							CellDrift9NOSEleft.setText("");
	 		    							CellDrift9NOSEleft.setEditable(false);
	 		    						}
	 		    					}
	 		    		                               );
	 		    	 }
	 		      }	   
	 	);
	    // These lines of codes allow to disable the TextBoxs that are not required for jacking point method		    
	    
	
	    
	    // These lines of codes allow to enable the TextBoxs that are required for PaltformScale  method		    
	    PlatformScales.addActionListener
	    (
	 		      new ActionListener() 
	 		      {
	 		    	public void actionPerformed(ActionEvent e) 
	 		    	{
	 		    		    SelectedMethod=2;
					    	 String Aircraft = (String) box.getSelectedItem();
					    	 if (    Aircraft.equals("HP1522")||Aircraft.equals("HP1523")||Aircraft.equals("HP1526")||Aircraft.equals("HP1527")||Aircraft.equals("HP1528")||Aircraft.equals("HP1529")||Aircraft.equals("HP1530")||
			                         Aircraft.equals("HP1531")||Aircraft.equals("HP1532")||Aircraft.equals("HP1533")||Aircraft.equals("HP1534")||Aircraft.equals("HP1535")||Aircraft.equals("HP1536")||Aircraft.equals("HP1537")||Aircraft.equals("HP1538")||Aircraft.equals("HP1539")||
			                         Aircraft.equals("HP1711")||Aircraft.equals("HP1712")||Aircraft.equals("HP1713")||Aircraft.equals("HP1714")||Aircraft.equals("HP1715")||Aircraft.equals("HP1716")||Aircraft.equals("HP1717")||Aircraft.equals("HP1718")||Aircraft.equals("HP1719")||
			                         Aircraft.equals("HP1720")||Aircraft.equals("HP1721")||Aircraft.equals("HP1722")||Aircraft.equals("HP1723")||Aircraft.equals("HP1724")||Aircraft.equals("HP1725")||Aircraft.equals("HP1726")||Aircraft.equals("HP1727")||Aircraft.equals("HP1728")||
			                         Aircraft.equals("HP1729")||Aircraft.equals("HP1730")||Aircraft.equals("HP1821")||Aircraft.equals("HP1822")||Aircraft.equals("HP1823")||Aircraft.equals("HP1824")||Aircraft.equals("HP1825")||Aircraft.equals("HP1826")||Aircraft.equals("HP1827")||
			                         Aircraft.equals("HP1827")||Aircraft.equals("HP1829")||Aircraft.equals("HP1830")||Aircraft.equals("HP1831")||Aircraft.equals("HP1832")||Aircraft.equals("HP1833")||Aircraft.equals("HP1834")||Aircraft.equals("HP1835")||Aircraft.equals("HP1836")||
			                         Aircraft.equals("HP1837")||Aircraft.equals("HP1838")||Aircraft.equals("HP1839")||Aircraft.equals("HP1840")||Aircraft.equals("HP1841")||Aircraft.equals("HP1842")||Aircraft.equals("HP1843")||Aircraft.equals("HP1844")||Aircraft.equals("HP1845")||
			                         Aircraft.equals("HP1846")||Aircraft.equals("HP1847")||Aircraft.equals("HP1848")||Aircraft.equals("HP1849")||Aircraft.equals("HP1850")||Aircraft.equals("HP1851")||Aircraft.equals("HP1852")||Aircraft.equals("HP1853")||Aircraft.equals("HP1854")||
			                         Aircraft.equals("HP1855")||Aircraft.equals("HP1856")||Aircraft.equals("HP1857"))
						    	 {
					    		 
					    		 if(SelectedMethod==2) 
					    		 {
					    			 arm = 706.17;
					    		 }
					    		 
					              selectedAircraftarm=0;
					             } 
					    	 if (     Aircraft.equals("HP1371")||Aircraft.equals("HP1372")||Aircraft.equals("HP1373")||Aircraft.equals("HP1374")||Aircraft.equals("HP1375")||Aircraft.equals("HP1376")||Aircraft.equals("HP1377")||Aircraft.equals("HP1378")||Aircraft.equals("HP1379")||
					    			  Aircraft.equals("HP1389")||Aircraft.equals("HP1520")||Aircraft.equals("HP1521")||Aircraft.equals("HP1524")||Aircraft.equals("HP1525")||Aircraft.equals("HP1527")||
					    			  Aircraft.equals("HP1528")||Aircraft.equals("HP1528")||Aircraft.equals("HP1530")||Aircraft.equals("HP1531")) 
					         {
					    		 
					    		 if(SelectedMethod==2) 
					    		 {
					    			 arm = 706.17;
					    		 }
					    		 
					    		 
					        	 selectedAircraftarm=0;
					         }
					    	 if ( Aircraft.equals("HP1540")||Aircraft.equals("HP1556")||Aircraft.equals("HP1557")||Aircraft.equals("HP1558")||Aircraft.equals("HP1559")||Aircraft.equals("HP1560")||
						        	  Aircraft.equals("HP1561")||Aircraft.equals("HP1562")||Aircraft.equals("HP1563")||Aircraft.equals("HP1564")||Aircraft.equals("HP1565")||Aircraft.equals("HP1566")||Aircraft.equals("HP1567")||Aircraft.equals("HP1568")||Aircraft.equals("HP1569") )
						         {
					    		 
					    		 if(SelectedMethod==2) 
					    		 {
					    			 arm = 706.8897864;
					    		 }
					    		
					        	 selectedAircraftarm=2;
					             }
					    	 
					    	 
					    	 
					    	 if (Aircraft.equals("HP9901")|| Aircraft.equals("HP9902")|| Aircraft.equals("HP9903")|| Aircraft.equals("HP9904")|| Aircraft.equals("HP9905"))
						    	 {
					    		 
					    		 if(SelectedMethod==2) 
					    		 {
					    			 arm = 706.17;
					    		 }
					    		 
					              selectedAircraftarm=0;
					             } 
					    	 
	 		    			System.out.println(SelectedMethod);
	 		    			SwingUtilities.invokeLater(
	 		    					new Runnable() 
	 		    					{
	 		    						public void run() 
	 		    						{
	 		    							item1LEFTin.setEditable(true);
	 		    							item2RIGHTin.setEditable(true);
	 		    							item3NOSEleft.setEditable(true);
	 		    							item4LEFTin.setEditable(true);
	 		    							item5RIGHTin.setEditable(true);
	 		    							item6NOSEleft.setEditable(true);
	 		    							item7LEFTin.setEditable(true);
	 		    							item8RIGHTin.setEditable(true);
	 		    							item9NOSEleft.setEditable(true);
	 		    							
	 		    							TARE1LEFTin.setEditable(true);
	 		    							TARE1LEFTin.setText("  0");
	 		    							TARE2RIGHTin.setEditable(true);
	 		    							TARE2RIGHTin.setText("  0");
	 		    							TARE3NOSEleft.setEditable(true);
	 		    							TARE3NOSEleft.setText("  0");
	 		    							TARE4LEFTin.setEditable(true);
	 		    							TARE4LEFTin.setText("  0");
	 		    							TARE5RIGHTin.setEditable(true);
	 		    							TARE5RIGHTin.setText("  0");
	 		    							TARE6NOSEleft.setEditable(true);
	 		    							TARE6NOSEleft.setText("  0");
	 		    							TARE7LEFTin.setEditable(true);
	 		    							TARE7LEFTin.setText("  0");
	 		    							TARE8RIGHTin.setEditable(true);
	 		    							TARE8RIGHTin.setText("  0");
	 		    							TARE9NOSEleft.setEditable(true);
	 		    							TARE9NOSEleft.setText("  0");
	 		    							
	 		    							CellDrift1LEFTin.setEditable(true);
	 		    							CellDrift1LEFTin.setText("  0");
	 		    							CellDrift2RIGHTin.setEditable(true);
	 		    							CellDrift2RIGHTin.setText("  0");
	 		    							CellDrift3NOSEleft.setEditable(true);
	 		    							CellDrift3NOSEleft.setText("  0");
	 		    							CellDrift4LEFTin.setEditable(true);
	 		    							CellDrift4LEFTin.setText("  0");
	 		    							CellDrift5RIGHTin.setEditable(true);
	 		    							CellDrift5RIGHTin.setText("  0");
	 		    							CellDrift6NOSEleft.setEditable(true);
	 		    							CellDrift6NOSEleft.setText("  0");
	 		    							CellDrift7LEFTin.setEditable(true);
	 		    							CellDrift7LEFTin.setText("  0");
	 		    							CellDrift8RIGHTin.setEditable(true);
	 		    							CellDrift8RIGHTin.setText("  0");
	 		    							CellDrift9NOSEleft.setEditable(true);
	 		    							CellDrift9NOSEleft.setText("  0");
	 		    							
	 		    						}
	 		    					}
	 		    					                   );
	 		    	}
	 		     }	   
	 	);
	    // These lines of codes allow to enable the TextBoxs that are required for PaltformScale  method	    
	 
	    KeyboardFocusManager.getCurrentKeyboardFocusManager()
        .addPropertyChangeListener("permanentFocusOwner", (PropertyChangeListener) new PropertyChangeListener()
    {
        @Override
        public void propertyChange(final PropertyChangeEvent e)
        {

            if (e.getOldValue() instanceof JTextField)
            {
                    SwingUtilities.invokeLater(new Runnable()
                    {
                            @Override
                            public void run()
                            {
                                    JTextField oldTextField = (JTextField)e.getOldValue();
                                    oldTextField.setSelectionStart(0);
                                    oldTextField.setSelectionEnd(0);
                            }
                    });

            }

            if (e.getNewValue() instanceof JTextField)
            {
                    SwingUtilities.invokeLater(new Runnable()
                    {
                            @Override
                            public void run()
                            {
                                    JTextField textField = (JTextField)e.getNewValue();
                                    textField.selectAll();
                            }
                    });

            }
        }


    });
	    
	    
	    
	    // These lines of codes make possible to enter all values required and store them.	    
	   fstWeightLEFTin = new JLabel("• 1st Weighing LEFT :");
	   fstWeightLEFTin.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
       fstWeightLEFTin.setBounds(4, 80, 280, 17);
       add(fstWeightLEFTin);
	   item1LEFTin = new JTextField();
	   item1LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   item1LEFTin.setForeground(Color.BLUE);
	   item1LEFTin.setBounds(X, 80, 50, 17);
	   add(item1LEFTin);
	   item1LEFTin.addKeyListener(new KeyAdapter() 
	   {   
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
       }                         );

	   item1LEFTout = new JTextField();
	   item1LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   item1LEFTout.setForeground(Color.BLUE);
       item1LEFTout.setBounds(Y, 80, 50, 17);
	   add(item1LEFTout);
	   item1LEFTout.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                         );
	   
	   TARE1LEFTin = new JTextField("0");
	   TARE1LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   TARE1LEFTin.setForeground(Color.BLUE);
	   TARE1LEFTin.setBounds(XX, 80,25, 17);
	   add(TARE1LEFTin);
	   TARE1LEFTin.addKeyListener(new KeyAdapter() 
	   {   
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-' ) 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
       }                         );

	   TARE1LEFTout = new JTextField("0");
	   TARE1LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   TARE1LEFTout.setForeground(Color.BLUE);
	   TARE1LEFTout.setBounds(YY, 80, 25, 17);
	   add(TARE1LEFTout);
	   TARE1LEFTout.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                         );
	   

	   
	   InstCorr1LEFTin = new JTextField("1.0025");
	   InstCorr1LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr1LEFTin.setForeground(Color.BLUE);
	   InstCorr1LEFTin.setBounds(xx, 80,44, 17);
	   add(InstCorr1LEFTin);
	   InstCorr1LEFTin.addKeyListener(new KeyAdapter() 
	   {   
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '.') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
       }                         );
	   
	   InstCorr1LEFTin.getDocument().addDocumentListener(new DocumentListener() 
	   {
		   public void changedUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }
		   public void removeUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }
		   public void insertUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }

		   public void doSomethingInAnotherTextfield() 
		   {
			   InstCorr2RIGHTin.setText(InstCorr1LEFTin.getText());
			   InstCorr3NOSEleft.setText(InstCorr1LEFTin.getText());
			   InstCorr4LEFTin.setText(InstCorr1LEFTin.getText());
			   InstCorr5RIGHTin.setText(InstCorr1LEFTin.getText());
			   InstCorr6NOSEleft.setText(InstCorr1LEFTin.getText());
			   InstCorr7LEFTin.setText(InstCorr1LEFTin.getText());
			   InstCorr9NOSEleft.setText(InstCorr1LEFTin.getText());
			   InstCorr8RIGHTin.setText(InstCorr1LEFTin.getText());
		   }
		}                                                  );
	   
	   
	   CellDrift1LEFTin = new JTextField("0");
	   CellDrift1LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift1LEFTin.setForeground(Color.BLUE);
	   CellDrift1LEFTin.setBounds(XXX, 80,25, 17);
	   add(CellDrift1LEFTin);
	   CellDrift1LEFTin.addKeyListener(new KeyAdapter() 
	   {   
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-' ) 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
       }                         );

	   CellDrift1LEFTout = new JTextField("0");
	   CellDrift1LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift1LEFTout.setForeground(Color.BLUE);
	   CellDrift1LEFTout.setBounds(YYY, 80, 25, 17);
	   add(CellDrift1LEFTout);
	   CellDrift1LEFTout.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                         );
	   

	   
	   OLEO1LEFTinout = new JTextField(" ");
	   OLEO1LEFTinout.setHorizontalAlignment(JTextField.CENTER);
	   OLEO1LEFTinout.setForeground(Color.BLUE);
	   OLEO1LEFTinout.setBounds(yyy, 80,42, 17);
	   add(OLEO1LEFTinout);
	   OLEO1LEFTinout.addKeyListener(new KeyAdapter() 
	   {   
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '.') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
       }                         );
	   OLEO1LEFTinout.getDocument().addDocumentListener(new DocumentListener() 
	   {
		   public void changedUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }
		   public void removeUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }
		   public void insertUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }

		   public void doSomethingInAnotherTextfield() 
		   {
			   String Airplane = (String) box.getSelectedItem();
		        	 if (Airplane.equals("HP1522")||Airplane.equals("HP1523")||Airplane.equals("HP1526")||Airplane.equals("HP1527")||Airplane.equals("HP1528")||Airplane.equals("HP1529")||Airplane.equals("HP1530")||
		    			 Airplane.equals("HP1531")||Airplane.equals("HP1532")||Airplane.equals("HP1533")||Airplane.equals("HP1534")||Airplane.equals("HP1535")||Airplane.equals("HP1536")||Airplane.equals("HP1537")||Airplane.equals("HP1538")||Airplane.equals("HP1539")||
		    			 Airplane.equals("HP1711")||Airplane.equals("HP1712")||Airplane.equals("HP1713")||Airplane.equals("HP1714")||Airplane.equals("HP1715")||Airplane.equals("HP1716")||Airplane.equals("HP1717")||Airplane.equals("HP1718")||Airplane.equals("HP1719")||
		    			 Airplane.equals("HP1720")||Airplane.equals("HP1721")||Airplane.equals("HP1722")||Airplane.equals("HP1723")||Airplane.equals("HP1724")||Airplane.equals("HP1725")||Airplane.equals("HP1726")||Airplane.equals("HP1727")||Airplane.equals("HP1728")||
		    			 Airplane.equals("HP1729")||Airplane.equals("HP1730")||Airplane.equals("HP1821")||Airplane.equals("HP1822")||Airplane.equals("HP1823")||Airplane.equals("HP1824")||Airplane.equals("HP1825")||Airplane.equals("HP1826")||Airplane.equals("HP1827")||
		    			 Airplane.equals("HP1827")||Airplane.equals("HP1829")||Airplane.equals("HP1830")||Airplane.equals("HP1831")||Airplane.equals("HP1832")||Airplane.equals("HP1833")||Airplane.equals("HP1834")||Airplane.equals("HP1835")||Airplane.equals("HP1836")||
		    			 Airplane.equals("HP1837")||Airplane.equals("HP1838")||Airplane.equals("HP1839")||Airplane.equals("HP1840")||Airplane.equals("HP1841")||Airplane.equals("HP1842")||Airplane.equals("HP1843")||Airplane.equals("HP1844")||Airplane.equals("HP1845")||
		    			 Airplane.equals("HP1846")||Airplane.equals("HP1847")||Airplane.equals("HP1848")||Airplane.equals("HP1849")||Airplane.equals("HP1850")||Airplane.equals("HP1851")||Airplane.equals("HP1852")||Airplane.equals("HP1853")||Airplane.equals("HP1854")||
		    			 Airplane.equals("HP1855")||Airplane.equals("HP1856")||Airplane.equals("HP1857")||
                         
		    			 Airplane.equals("HP1371")||Airplane.equals("HP1372")||Airplane.equals("HP1373")||Airplane.equals("HP1374")||Airplane.equals("HP1375")||Airplane.equals("HP1376")||Airplane.equals("HP1377")||Airplane.equals("HP1378")||Airplane.equals("HP1379")||
		    			 Airplane.equals("HP1389")||Airplane.equals("HP1520")||Airplane.equals("HP1521")||Airplane.equals("HP1524")||Airplane.equals("HP1525")||Airplane.equals("HP1527")||
		    			 Airplane.equals("HP1528")||Airplane.equals("HP1528")||Airplane.equals("HP1530")||Airplane.equals("HP1531")||
		        		 
		    			 Airplane.equals("HP9901")||Airplane.equals("HP9902")||Airplane.equals("HP9903")||Airplane.equals("HP9904")||Airplane.equals("HP9905"))
		    		 
		    		 
		    		 
		        {
					   //OLEO2RIGHTinout.setText(OLEO1LEFTinout.getText());
					   OLEO4LEFTinout.setText(OLEO1LEFTinout.getText());
					   //OLEO5RIGHTinout.setText(OLEO1LEFTinout.getText());
					   OLEO7LEFTinout.setText(OLEO1LEFTinout.getText());
					   //OLEO8RIGHTinout.setText(OLEO1LEFTinout.getText());
		    	 }
		    	 if (Airplane.equals("HP1540")||Airplane.equals("HP1556")||Airplane.equals("HP1557")||Airplane.equals("HP1558")||Airplane.equals("HP1559")||Airplane.equals("HP1560")||
		    		 Airplane.equals("HP1561")||Airplane.equals("HP1562")||Airplane.equals("HP1563")||Airplane.equals("HP1564")||Airplane.equals("HP1565")||Airplane.equals("HP1566")||Airplane.equals("HP1567")||Airplane.equals("HP1568")||Airplane.equals("HP1569"))
			     { 
			           
			           OLEO4LEFTinout.setText(OLEO1LEFTinout.getText());
			           OLEO7LEFTinout.setText(OLEO1LEFTinout.getText());
			         
			     }
			   
		   }
		}                                                  );	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   fstWeightRIGHTin = new JLabel("• 1st Weighing RIGHT:");
	   fstWeightRIGHTin.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   fstWeightRIGHTin.setBounds(4, 100, 280, 17);
	   add(fstWeightRIGHTin);
	   item2RIGHTin = new JTextField();
	   item2RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   item2RIGHTin.setForeground(Color.BLUE);
	   item2RIGHTin.setBounds(X, 100, 50, 17);
	   add(item2RIGHTin);
	   item2RIGHTin.addKeyListener(new KeyAdapter() {
		   
		   public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   });

	   item2RIGHTout = new JTextField();
	   item2RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   item2RIGHTout.setForeground(Color.BLUE);
	   item2RIGHTout.setBounds(Y, 100, 50, 17);
	   add(item2RIGHTout);
	   item2RIGHTout.addKeyListener(new KeyAdapter() {
		   
		   public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   });
	   
	   TARE2RIGHTin = new JTextField("0");
	   TARE2RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   TARE2RIGHTin.setForeground(Color.BLUE);
	   TARE2RIGHTin.setBounds(XX, 100, 25, 17);
	   add(TARE2RIGHTin);
	   TARE2RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		 {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		 }
			   
	   }                          );

	   TARE2RIGHTout = new JTextField("0");
	   TARE2RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   TARE2RIGHTout.setForeground(Color.BLUE);
	   TARE2RIGHTout.setBounds(YY, 100, 25, 17);
	   add(TARE2RIGHTout);
	   TARE2RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                           );
	   	   
		InstCorr2RIGHTin = new JTextField(InstCorr1LEFTin.getText());
		InstCorr2RIGHTin.setHorizontalAlignment(JTextField.CENTER);
		InstCorr2RIGHTin.setBounds(xx, 100, 44, 17);
		add(InstCorr2RIGHTin);
		InstCorr2RIGHTin.setEditable(false);
	          
		
		CellDrift2RIGHTin = new JTextField("0");
		CellDrift2RIGHTin.setHorizontalAlignment(JTextField.CENTER);
		CellDrift2RIGHTin.setForeground(Color.BLUE);
		CellDrift2RIGHTin.setBounds(XXX, 100, 25, 17);
		add(CellDrift2RIGHTin);
		CellDrift2RIGHTin.addKeyListener(new KeyAdapter() 
		   {
			 public void keyTyped(KeyEvent e) 
			 {
				   char i = e.getKeyChar();
				   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
				   {
					   e.consume(); 
					   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
				   }
			 }
				   
		   }                          );

		   CellDrift2RIGHTout = new JTextField("0");
		   CellDrift2RIGHTout.setHorizontalAlignment(JTextField.CENTER);
		   CellDrift2RIGHTout.setForeground(Color.BLUE);
		   CellDrift2RIGHTout.setBounds(YYY, 100, 25, 17);
		   add(CellDrift2RIGHTout);
		   CellDrift2RIGHTout.addKeyListener(new KeyAdapter() 
		   {
			 public void keyTyped(KeyEvent e) 
			   {
				   char i = e.getKeyChar();
				   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
				   {
					   e.consume(); 
					   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
				   }
			   }
				   
		   }                           );
		   	   
			OLEO2RIGHTinout = new JTextField(OLEO1LEFTinout.getText());
			OLEO2RIGHTinout.setHorizontalAlignment(JTextField.CENTER);
			OLEO2RIGHTinout.setBounds(yyy, 100, 42, 17);
			add(OLEO2RIGHTinout);
			OLEO2RIGHTinout.setEditable(true);
            OLEO2RIGHTinout.getDocument().addDocumentListener(new DocumentListener() 
			   {
				   public void changedUpdate(DocumentEvent e) 
				   {
				     doSomethingInAnotherTextfield();
				   }
				   public void removeUpdate(DocumentEvent e) 
				   {
				     doSomethingInAnotherTextfield();
				   }
				   public void insertUpdate(DocumentEvent e) 
				   {
				     doSomethingInAnotherTextfield();
				   }

				   public void doSomethingInAnotherTextfield() 
				   {
					   String Airplane = (String) box.getSelectedItem();

				    	 if (Airplane.equals("HP1540")||Airplane.equals("HP1556")||Airplane.equals("HP1557")||Airplane.equals("HP1558")||Airplane.equals("HP1559")||Airplane.equals("HP1560")||
					         Airplane.equals("HP1561")||Airplane.equals("HP1562")||Airplane.equals("HP1563")||Airplane.equals("HP1564")||Airplane.equals("HP1565")||Airplane.equals("HP1566")||Airplane.equals("HP1567")||Airplane.equals("HP1568")||Airplane.equals("HP1569"))
					     { 
					           
					           OLEO5RIGHTinout.setText(OLEO2RIGHTinout.getText());
					           OLEO8RIGHTinout.setText(OLEO2RIGHTinout.getText());
					         
					     }
				    	 
				    	 if (    Airplane.equals("HP1522")||Airplane.equals("HP1523")||Airplane.equals("HP1526")||Airplane.equals("HP1527")||Airplane.equals("HP1528")||Airplane.equals("HP1529")||Airplane.equals("HP1530")||
				    			 Airplane.equals("HP1531")||Airplane.equals("HP1532")||Airplane.equals("HP1533")||Airplane.equals("HP1534")||Airplane.equals("HP1535")||Airplane.equals("HP1536")||Airplane.equals("HP1537")||Airplane.equals("HP1538")||Airplane.equals("HP1539")||
				    			 Airplane.equals("HP1711")||Airplane.equals("HP1712")||Airplane.equals("HP1713")||Airplane.equals("HP1714")||Airplane.equals("HP1715")||Airplane.equals("HP1716")||Airplane.equals("HP1717")||Airplane.equals("HP1718")||Airplane.equals("HP1719")||
				    			 Airplane.equals("HP1720")||Airplane.equals("HP1721")||Airplane.equals("HP1722")||Airplane.equals("HP1723")||Airplane.equals("HP1724")||Airplane.equals("HP1725")||Airplane.equals("HP1726")||Airplane.equals("HP1727")||Airplane.equals("HP1728")||
				    			 Airplane.equals("HP1729")||Airplane.equals("HP1730")||Airplane.equals("HP1821")||Airplane.equals("HP1822")||Airplane.equals("HP1823")||Airplane.equals("HP1824")||Airplane.equals("HP1825")||Airplane.equals("HP1826")||Airplane.equals("HP1827")||
				    			 Airplane.equals("HP1827")||Airplane.equals("HP1829")||Airplane.equals("HP1830")||Airplane.equals("HP1831")||Airplane.equals("HP1832")||Airplane.equals("HP1833")||Airplane.equals("HP1834")||Airplane.equals("HP1835")||Airplane.equals("HP1836")||
				    			 Airplane.equals("HP1837")||Airplane.equals("HP1838")||Airplane.equals("HP1839")||Airplane.equals("HP1840")||Airplane.equals("HP1841")||Airplane.equals("HP1842")||Airplane.equals("HP1843")||Airplane.equals("HP1844")||Airplane.equals("HP1845")||
				    			 Airplane.equals("HP1846")||Airplane.equals("HP1847")||Airplane.equals("HP1848")||Airplane.equals("HP1849")||Airplane.equals("HP1850")||Airplane.equals("HP1851")||Airplane.equals("HP1852")||Airplane.equals("HP1853")||Airplane.equals("HP1854")||
				    			 Airplane.equals("HP1855")||Airplane.equals("HP1856")||Airplane.equals("HP1857")||Airplane.equals("HP1838")||
		                         
				    			 Airplane.equals("HP1371")||Airplane.equals("HP1372")||Airplane.equals("HP1373")||Airplane.equals("HP1374")||Airplane.equals("HP1375")||Airplane.equals("HP1376")||Airplane.equals("HP1377")||Airplane.equals("HP1378")||Airplane.equals("HP1379")||
				    			 Airplane.equals("HP1389")||Airplane.equals("HP1520")||Airplane.equals("HP1521")||Airplane.equals("HP1524")||Airplane.equals("HP1525")||Airplane.equals("HP1527")||
				    			 Airplane.equals("HP1528")||Airplane.equals("HP1528")||Airplane.equals("HP1530")||Airplane.equals("HP1531")||
				    			 
				    			 Airplane.equals("HP9901")||Airplane.equals("HP9902")||Airplane.equals("HP9903")||Airplane.equals("HP9904")||Airplane.equals("HP9905"))
					        {
				    	//	 OLEO5RIGHTinout.setText(OLEO1LEFTinout.getText());
				    	//	 OLEO8RIGHTinout.setText(OLEO1LEFTinout.getText());
				    		 
					           OLEO5RIGHTinout.setText(OLEO2RIGHTinout.getText());
					           OLEO8RIGHTinout.setText(OLEO2RIGHTinout.getText());
				    		 
					         }
					   
				   }
				}                                                  );	
            OLEO2RIGHTinout.addKeyListener(new KeyAdapter() {
    		   
    		   public void keyTyped(KeyEvent e) {
    			   char i = e.getKeyChar();
    			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '.') {
    				   e.consume(); 
    				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
    			   }
    		   }
    			   
    		   });
	   
	   
	   
	   fstWeightNOSEleft = new JLabel("• 1st Weighing NOSE :");
	   fstWeightNOSEleft.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   fstWeightNOSEleft.setBounds(4, 120, 280, 17);
	   add(fstWeightNOSEleft);
	   item3NOSEleft = new JTextField();
	   item3NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   item3NOSEleft.setForeground(Color.BLUE);
	   item3NOSEleft.setBounds(X, 120, 50, 17);
	   add(item3NOSEleft);
	   item3NOSEleft.addKeyListener(new KeyAdapter() {
		   
		   public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   });
	   
	   item3NOSEright = new JTextField();
	   item3NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   item3NOSEright.setForeground(Color.BLUE);
	   item3NOSEright.setBounds(Y, 120, 50, 17);
	   add(item3NOSEright);
	   item3NOSEright.addKeyListener(new KeyAdapter() {
		   
		   public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   });

	   
	   
	   TARE3NOSEleft = new JTextField("0");
	   TARE3NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   TARE3NOSEleft.setForeground(Color.BLUE);
	   TARE3NOSEleft.setBounds(XX, 120, 25, 17);
	   add(TARE3NOSEleft);
	   TARE3NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		 {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		 }
			   
	   }                          );

	   TARE3NOSEright = new JTextField("0");
	   TARE3NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   TARE3NOSEright.setForeground(Color.BLUE);
	   TARE3NOSEright.setBounds(YY, 120, 25, 17);
	   add(TARE3NOSEright);
	   TARE3NOSEright.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                           );
	   	   
	   InstCorr3NOSEleft = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr3NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr3NOSEleft.setBounds(xx, 120, 44, 17);
	   add(InstCorr3NOSEleft);
	   InstCorr3NOSEleft.setEditable(false);	   
	   
	   CellDrift3NOSEleft = new JTextField("0");
	   CellDrift3NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift3NOSEleft.setForeground(Color.BLUE);
	   CellDrift3NOSEleft.setBounds(XXX, 120, 25, 17);
	   add(CellDrift3NOSEleft);
	   CellDrift3NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		 {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		 }
			   
	   }                          );

	   CellDrift3NOSEright = new JTextField("0");
	   CellDrift3NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift3NOSEright.setForeground(Color.BLUE);
	   CellDrift3NOSEright.setBounds(YYY, 120, 25, 17);
	   add(CellDrift3NOSEright);
	   CellDrift3NOSEright.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                           );	   
	   
	   OLEO3NOSEleftright = new JTextField(" ");
	   OLEO3NOSEleftright.setHorizontalAlignment(JTextField.CENTER);
	   OLEO3NOSEleftright.setForeground(Color.BLUE);
	   OLEO3NOSEleftright.setBounds(yyy, 120, 42, 17);
	   add(OLEO3NOSEleftright);
	   OLEO3NOSEleftright.setEditable(true);
	   OLEO3NOSEleftright.addKeyListener(new KeyAdapter() 
	   {   
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '.') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
       }                         );
	   OLEO3NOSEleftright.getDocument().addDocumentListener(new DocumentListener() 
	   {
		   public void changedUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }
		   public void removeUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }
		   public void insertUpdate(DocumentEvent e) 
		   {
		     doSomethingInAnotherTextfield();
		   }

		   public void doSomethingInAnotherTextfield() 
		   {
			   
			   OLEO9NOSEleftright.setText(OLEO3NOSEleftright.getText());
			   OLEO6NOSEleftright.setText(OLEO3NOSEleftright.getText());
		   }
		}                                                  );
	   
	   
	   
	   
	   sndWeightLEFTin = new JLabel("• 2nd Weighing LEFT :");
	   sndWeightLEFTin.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   sndWeightLEFTin.setBounds(4, 150, 280, 17);
	   add(sndWeightLEFTin);
	   item4LEFTin = new JTextField();
	   item4LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   item4LEFTin.setForeground(Color.BLUE);
	   item4LEFTin.setBounds(X, 150, 50, 17);
	   add(item4LEFTin);
	   item4LEFTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  ) 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		}                       );


	   item4LEFTout = new JTextField();
	   item4LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   item4LEFTout.setForeground(Color.BLUE);
	   item4LEFTout.setBounds(Y, 150, 50, 17);
	   add(item4LEFTout);
	   item4LEFTout.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                          );

	   TARE4LEFTin = new JTextField("0");
	   TARE4LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   TARE4LEFTin.setForeground(Color.BLUE);
	   TARE4LEFTin.setBounds(XX, 150, 25, 17);
	   add(TARE4LEFTin);
	   TARE4LEFTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		}                       );


	   TARE4LEFTout = new JTextField("0");
	   TARE4LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   TARE4LEFTout.setForeground(Color.BLUE);
	   TARE4LEFTout.setBounds(YY, 150, 25, 17);
	   add(TARE4LEFTout);
	   TARE4LEFTout.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                          );

	   InstCorr4LEFTin = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr4LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr4LEFTin.setBounds(xx, 150, 44, 17);
	   add(InstCorr4LEFTin);
	   InstCorr4LEFTin.setEditable(false);		   
	   
	   
	   CellDrift4LEFTin = new JTextField("0");
	   CellDrift4LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift4LEFTin.setForeground(Color.BLUE);
	   CellDrift4LEFTin.setBounds(XXX, 150, 25, 17);
	   add(CellDrift4LEFTin);
	   CellDrift4LEFTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		}                       );


	   CellDrift4LEFTout = new JTextField("0");
	   CellDrift4LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift4LEFTout.setForeground(Color.BLUE);
	   CellDrift4LEFTout.setBounds(YYY, 150, 25, 17);
	   add(CellDrift4LEFTout);
	   CellDrift4LEFTout.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	   }                          );

	   OLEO4LEFTinout = new JTextField(OLEO1LEFTinout.getText());
	   OLEO4LEFTinout.setHorizontalAlignment(JTextField.CENTER);
	   OLEO4LEFTinout.setBounds(yyy, 150, 42, 17);
	   add(OLEO4LEFTinout);
	   OLEO4LEFTinout.setEditable(true);			   
	   
	   
	   
	   
	   
	   
	   sndWeightRIGHTin = new JLabel("• 2nd Weighing RIGHT:");
	   sndWeightRIGHTin.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   sndWeightRIGHTin.setBounds(4, 170, 280, 17);
	   add(sndWeightRIGHTin);
	   item5RIGHTin = new JTextField();
	   item5RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   item5RIGHTin.setForeground(Color.BLUE);
	   item5RIGHTin.setBounds(X, 170, 50, 17);
	   add(item5RIGHTin);
	   item5RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   }                       );


	   item5RIGHTout = new JTextField();
	   item5RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   item5RIGHTout.setForeground(Color.BLUE);
	   item5RIGHTout.setBounds(Y, 170, 50, 17);
	   add(item5RIGHTout);
	   item5RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) 
		{
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		}
			   
	   }                           );

	   TARE5RIGHTin = new JTextField("0");
	   TARE5RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   TARE5RIGHTin.setForeground(Color.BLUE);
	   TARE5RIGHTin.setBounds(XX, 170, 25, 17);
	   add(TARE5RIGHTin);
	   TARE5RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   }                       );


	   TARE5RIGHTout = new JTextField("0");
	   TARE5RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   TARE5RIGHTout.setForeground(Color.BLUE);
	   TARE5RIGHTout.setBounds(YY, 170, 25, 17);
	   add(TARE5RIGHTout);
	   TARE5RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) 
		{
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		}
			   
	   }                           );
	   
	   InstCorr5RIGHTin = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr5RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr5RIGHTin.setBounds(xx, 170, 44, 17);
	   add(InstCorr5RIGHTin);
	   InstCorr5RIGHTin.setEditable(false);	   
	   
	   CellDrift5RIGHTin = new JTextField("0");
	   CellDrift5RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift5RIGHTin.setForeground(Color.BLUE);
	   CellDrift5RIGHTin.setBounds(XXX, 170, 25, 17);
	   add(CellDrift5RIGHTin);
	   CellDrift5RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		 public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		   }                       );


	   CellDrift5RIGHTout = new JTextField("0");
	   CellDrift5RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift5RIGHTout.setForeground(Color.BLUE);
	   CellDrift5RIGHTout.setBounds(YYY, 170, 25, 17);
	   add(CellDrift5RIGHTout);
	   CellDrift5RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) 
		{
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		}
			   
	   }                           );
	   
	   OLEO5RIGHTinout = new JTextField(OLEO1LEFTinout.getText());
	   OLEO5RIGHTinout.setHorizontalAlignment(JTextField.CENTER);
	   OLEO5RIGHTinout.setBounds(yyy, 170, 42, 17);
	   add(OLEO5RIGHTinout);
	   OLEO5RIGHTinout.setEditable(true);
	   
	   
	   
	   
	   sndWeightNOSEleft = new JLabel("• 2nd Weighing NOSE :");
	   sndWeightNOSEleft.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   sndWeightNOSEleft.setBounds(4, 190, 280, 17);
	   add(sndWeightNOSEleft);
	   item6NOSEleft = new JTextField();
	   item6NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   item6NOSEleft.setForeground(Color.BLUE);
	   item6NOSEleft.setBounds(X, 190, 50, 17);
	   add(item6NOSEleft);
	   item6NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
		}                         );
	   


	   item6NOSEright = new JTextField();
	   item6NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   item6NOSEright.setForeground(Color.BLUE);
	   item6NOSEright.setBounds(Y, 190, 50, 17);
	   add(item6NOSEright);
	   item6NOSEright.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
	   }                           );

	   
	   TARE6NOSEleft = new JTextField("0");
	   TARE6NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   TARE6NOSEleft.setForeground(Color.BLUE);
	   TARE6NOSEleft.setBounds(XX, 190, 25, 17);
	   add(TARE6NOSEleft);
	   TARE6NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
		}                         );
	   


	   TARE6NOSEright = new JTextField("0");
	   TARE6NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   TARE6NOSEright.setForeground(Color.BLUE);
	   TARE6NOSEright.setBounds(YY, 190, 25, 17);
	   add(TARE6NOSEright);
	   TARE6NOSEright.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
	   }                           );	   
	   
	   InstCorr6NOSEleft = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr6NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr6NOSEleft.setBounds(xx, 190, 44, 17);
	   add(InstCorr6NOSEleft);
	   InstCorr6NOSEleft.setEditable(false);		   
	   
	   CellDrift6NOSEleft = new JTextField("0");
	   CellDrift6NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift6NOSEleft.setForeground(Color.BLUE);
	   CellDrift6NOSEleft.setBounds(XXX, 190, 25, 17);
	   add(CellDrift6NOSEleft);
	   CellDrift6NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
		}                         );
	   


	   CellDrift6NOSEright = new JTextField("0");
	   CellDrift6NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift6NOSEright.setForeground(Color.BLUE);
	   CellDrift6NOSEright.setBounds(YYY, 190, 25, 17);
	   add(CellDrift6NOSEright);
	   CellDrift6NOSEright.addKeyListener(new KeyAdapter() 
	   {
		public void keyTyped(KeyEvent e) {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
	   }                           );	   
	   
	   OLEO6NOSEleftright = new JTextField(OLEO3NOSEleftright.getText());
	   OLEO6NOSEleftright.setHorizontalAlignment(JTextField.CENTER);
	   OLEO6NOSEleftright.setBounds(yyy, 190, 42, 17);
	   add(OLEO6NOSEleftright);
	   OLEO6NOSEleftright.setEditable(true);
	   
	   
	   
	   
	   
	   
	   
	   
	   trdWeightLEFTin = new JLabel("• 3rd Weighing LEFT :");
	   trdWeightLEFTin.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   trdWeightLEFTin.setBounds(4, 220, 280, 17);
	   add(trdWeightLEFTin);
	   item7LEFTin = new JTextField();
	   item7LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   item7LEFTin.setForeground(Color.BLUE);
	   item7LEFTin.setBounds(X, 220, 50, 17);
	   add(item7LEFTin);
	   item7LEFTin.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                          );


	   item7LEFTout = new JTextField();
	   item7LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   item7LEFTout.setForeground(Color.BLUE);
	   item7LEFTout.setBounds(Y, 220, 50, 17);
	   add(item7LEFTout);
	   item7LEFTout.addKeyListener(new KeyAdapter() 
	   {
		  public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
		}                          );

	   TARE7LEFTin = new JTextField("0");
	   TARE7LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   TARE7LEFTin.setForeground(Color.BLUE);
	   TARE7LEFTin.setBounds(XX, 220, 25, 17);
	   add(TARE7LEFTin);
	   TARE7LEFTin.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                          );


	   TARE7LEFTout = new JTextField("0");
	   TARE7LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   TARE7LEFTout.setForeground(Color.BLUE);
	   TARE7LEFTout.setBounds(YY, 220, 25, 17);
	   add(TARE7LEFTout);
	   TARE7LEFTout.addKeyListener(new KeyAdapter() 
	   {
		  public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
		}                          );
	   
	   InstCorr7LEFTin = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr7LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr7LEFTin.setBounds(xx, 220, 44, 17);
	   add(InstCorr7LEFTin);
	   InstCorr7LEFTin.setEditable(false);		   
	   
	   
	   CellDrift7LEFTin = new JTextField("0");
	   CellDrift7LEFTin.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift7LEFTin.setForeground(Color.BLUE);
	   CellDrift7LEFTin.setBounds(XXX, 220, 25, 17);
	   add(CellDrift7LEFTin);
	   CellDrift7LEFTin.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b'  && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                          );


	   CellDrift7LEFTout = new JTextField("0");
	   CellDrift7LEFTout.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift7LEFTout.setForeground(Color.BLUE);
	   CellDrift7LEFTout.setBounds(YYY, 220, 25, 17);
	   add(CellDrift7LEFTout);
	   CellDrift7LEFTout.addKeyListener(new KeyAdapter() 
	   {
		  public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
		}                          );
	   
	   OLEO7LEFTinout = new JTextField(OLEO1LEFTinout.getText());
	   OLEO7LEFTinout.setHorizontalAlignment(JTextField.CENTER);
	   OLEO7LEFTinout.setBounds(yyy, 220, 42, 17);
	   add(OLEO7LEFTinout);
	   OLEO7LEFTinout.setEditable(true);		   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	   trdWeightRIGHTin = new JLabel("• 3rd Weighing RIGHT:");
	   trdWeightRIGHTin.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   trdWeightRIGHTin.setBounds(4, 240, 280, 17);
	   add(trdWeightRIGHTin);
	   item8RIGHTin = new JTextField();
	   item8RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   item8RIGHTin.setForeground(Color.BLUE);
	   item8RIGHTin.setBounds(X, 240, 50, 17);
	   add(item8RIGHTin);
	   item8RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		}                           );


	   item8RIGHTout = new JTextField();
	   item8RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   item8RIGHTout.setForeground(Color.BLUE);
	   item8RIGHTout.setBounds(Y, 240, 50, 17);
	   add(item8RIGHTout);
	   item8RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	    }                           );

	   TARE8RIGHTin = new JTextField("0");
	   TARE8RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   TARE8RIGHTin.setForeground(Color.BLUE);
	   TARE8RIGHTin.setBounds(XX, 240, 25, 17);
	   add(TARE8RIGHTin);
	   TARE8RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		}                           );


	   TARE8RIGHTout = new JTextField("0");
	   TARE8RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   TARE8RIGHTout.setForeground(Color.BLUE);
	   TARE8RIGHTout.setBounds(YY, 240, 25, 17);
	   add(TARE8RIGHTout);
	   TARE8RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	    }                           );
	   
	   InstCorr8RIGHTin = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr8RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr8RIGHTin.setBounds(xx, 240, 44, 17);
	   add(InstCorr8RIGHTin);
	   InstCorr8RIGHTin.setEditable(false);		   
	    
	   
	   CellDrift8RIGHTin = new JTextField("0");
	   CellDrift8RIGHTin.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift8RIGHTin.setForeground(Color.BLUE);
	   CellDrift8RIGHTin.setBounds(XXX, 240, 25, 17);
	   add(CellDrift8RIGHTin);
	   CellDrift8RIGHTin.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
		}                           );


	   CellDrift8RIGHTout = new JTextField("0");
	   CellDrift8RIGHTout.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift8RIGHTout.setForeground(Color.BLUE);
	   CellDrift8RIGHTout.setBounds(YYY, 240, 25, 17);
	   add(CellDrift8RIGHTout);
	   CellDrift8RIGHTout.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
			   
	    }                           );
	   
	   OLEO8RIGHTinout = new JTextField(OLEO1LEFTinout.getText());
	   OLEO8RIGHTinout.setHorizontalAlignment(JTextField.CENTER);
	   OLEO8RIGHTinout.setBounds(yyy, 240, 42, 17);
	   add(OLEO8RIGHTinout);
	   OLEO8RIGHTinout.setEditable(true);		   	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   trdWeightNOSEleft = new JLabel("• 3rd Weighing NOSE :");
	   trdWeightNOSEleft.setFont(new Font("DialogInput", Font.PLAIN, 12 ));
	   trdWeightNOSEleft.setBounds(4, 260, 280, 17);
	   add(trdWeightNOSEleft);
	   item9NOSEleft= new JTextField();
	   item9NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   item9NOSEleft.setForeground(Color.BLUE);
	   item9NOSEleft.setBounds(X, 260, 50, 17);
	   add(item9NOSEleft);
	   item9NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                           );


	   item9NOSEright = new JTextField();
	   item9NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   item9NOSEright.setForeground(Color.BLUE);
	   item9NOSEright.setBounds(Y, 260, 50, 17);
	   add(item9NOSEright);
	   item9NOSEright.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
	   }                            );

	   TARE9NOSEleft= new JTextField("0");
	   TARE9NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   TARE9NOSEleft.setForeground(Color.BLUE);
	   TARE9NOSEleft.setBounds(XX, 260, 25, 17);
	   add(TARE9NOSEleft);
	   TARE9NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                           );


	   TARE9NOSEright = new JTextField("0");
	   TARE9NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   TARE9NOSEright.setForeground(Color.BLUE);
	   TARE9NOSEright.setBounds(YY, 260, 25, 17);
	   add(TARE9NOSEright);
	   TARE9NOSEright.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
	   }                            );
	   
	   InstCorr9NOSEleft = new JTextField(InstCorr1LEFTin.getText());
	   InstCorr9NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   InstCorr9NOSEleft.setBounds(xx, 260, 44, 17);
	   add(InstCorr9NOSEleft);
	   InstCorr9NOSEleft.setEditable(false);		   	   
	   
	   CellDrift9NOSEleft= new JTextField("0");
	   CellDrift9NOSEleft.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift9NOSEleft.setForeground(Color.BLUE);
	   CellDrift9NOSEleft.setBounds(XXX, 260, 25, 17);
	   add(CellDrift9NOSEleft);
	   CellDrift9NOSEleft.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                           );


	   CellDrift9NOSEright = new JTextField("0");
	   CellDrift9NOSEright.setHorizontalAlignment(JTextField.CENTER);
	   CellDrift9NOSEright.setForeground(Color.BLUE);
	   CellDrift9NOSEright.setBounds(YYY, 260, 25, 17);
	   add(CellDrift9NOSEright);
	   CellDrift9NOSEright.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != '-') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }
	   }                            );
	   
	   OLEO9NOSEleftright= new JTextField(OLEO3NOSEleftright.getText());
	   OLEO9NOSEleftright.setHorizontalAlignment(JTextField.CENTER);
	   OLEO9NOSEleftright.setBounds(yyy, 260, 42, 17);
	   add(OLEO9NOSEleftright);
	   OLEO9NOSEleftright.setEditable(true);	
	   OLEO9NOSEleftright.addKeyListener(new KeyAdapter() 
	   {
		   public void keyTyped(KeyEvent e) 
		   {
			   char i = e.getKeyChar();
			   if ((i < '0'||  i > '9')  && i != '\b' && i != ',') 
			   {
				   e.consume(); 
				   //JOptionPane.showMessageDialog(null, "INVALID INPUT");
			   }
		   }   
		}                           );	   
	   
	   
	   
	   
	    // These lines of codes make possible to enter all values required and store them.		   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    // These lines of codes create the text area in which the result will be printed in the GUI	   
	   
	          SUBTITLE9 = new JLabel(" WEIGHT(LB)           ARM(IN)           MOMENT(LB-IN)               %MAC");
	          SUBTITLE9.setFont(new Font("Dialog", Font.BOLD, 12));
	          SUBTITLE9.setBounds(120, 285, 375, 13);
              add(SUBTITLE9);
		      finalresultW = new JTextArea();
			  finalresultW.setText("");
			  finalresultW.setBounds(120, 300, 75, 22);
			  finalresultW.setEditable(false);
			  add(finalresultW);
			  Border borderW = BorderFactory.createLineBorder(Color.BLACK);
			  finalresultW.setBorder(BorderFactory.createCompoundBorder(borderW,
              BorderFactory.createEmptyBorder(1, 3, 10, 10)));
		
			  finalresultA = new JTextArea();
			  finalresultA.setText("");
			  finalresultA.setBounds(217, 300, 60, 22);
			  finalresultA.setEditable(false);
			  add(finalresultA);
			  Border borderA = BorderFactory.createLineBorder(Color.BLACK);
			  finalresultA.setBorder(BorderFactory.createCompoundBorder(borderA,
              BorderFactory.createEmptyBorder(1, 3, 10, 10)));
			  
			   
		      finalresultM = new JTextArea();
			  finalresultM.setText("");
			  finalresultM.setBounds(300, 300, 95, 22);
			  finalresultM.setEditable(false);
			  add(finalresultM);		 
			  finalresultM.setMargin( new Insets(3,5,10,10) );
			  Border borderM = BorderFactory.createLineBorder(Color.BLACK);
			  finalresultM.setBorder(BorderFactory.createCompoundBorder(borderM, 
			              BorderFactory.createEmptyBorder(1, 3, 10, 10)));
			  
		      finalresultMAC = new JTextArea();
			  finalresultMAC.setText("");
			  finalresultMAC.setBounds(XXX+25, 300, 60, 22);
			  finalresultMAC.setEditable(false);
			  add(finalresultMAC);		 
			  finalresultM.setMargin( new Insets(3,5,10,10) );
			  Border borderMAC = BorderFactory.createLineBorder(Color.BLACK);
			  finalresultMAC.setBorder(BorderFactory.createCompoundBorder(borderMAC, 
			              BorderFactory.createEmptyBorder(1, 3, 10, 10)));
			  
			  
			  
	          SUBTITLE10 = new JLabel("Prior %MAC      Prior WEIGHT             Current %MAC     Current WEIGHT         VAR%MAC     VAR%WEIGHT");
	          SUBTITLE10.setFont(new Font("Dialog", Font.ITALIC, 10));
	          SUBTITLE10.setBounds(10, 330, 550, 13);
	          add(SUBTITLE10);
			  
			  previousresultMAC = new JTextArea();
			  previousresultMAC.setText("");
			  previousresultMAC.setBounds(10, 350, 50, 22);
			  previousresultMAC.setEditable(false);
			  add( previousresultMAC);		 
			  previousresultMAC.setMargin( new Insets(3,5,10,10) );
			  Border borderprMAC = BorderFactory.createLineBorder(Color.BLACK);
			  previousresultMAC.setBorder(BorderFactory.createCompoundBorder(borderprMAC, 
				              BorderFactory.createEmptyBorder(1, 7, 10, 10)));  
				  
				  previousresultW = new JTextArea();
				  previousresultW.setText("");
				  previousresultW.setBounds(80, 350, 75, 22);
				  previousresultW.setEditable(false);
					  add( previousresultW);		 
					  previousresultW.setMargin( new Insets(3,5,10,10) );
					  Border borderPW = BorderFactory.createLineBorder(Color.BLACK);
					  previousresultW.setBorder(BorderFactory.createCompoundBorder(borderPW, 
					              BorderFactory.createEmptyBorder(1, 20, 10, 10))); 	
					  
					  
					 		  
					
					  currentresultMAC = new JTextArea();
					  currentresultMAC.setText("");
					  currentresultMAC.setBounds(197, 350, 50, 22);
					  currentresultMAC.setEditable(false);
					  add( currentresultMAC);		 
					  currentresultMAC.setMargin( new Insets(3,5,10,10) );
					  Border bordercrMAC = BorderFactory.createLineBorder(Color.BLACK);
					  currentresultMAC.setBorder(BorderFactory.createCompoundBorder(bordercrMAC, 
						              BorderFactory.createEmptyBorder(1, 7, 10, 10)));    
					  
					  
					  currentresultW = new JTextArea();
					  currentresultW.setText("");
					  currentresultW.setBounds(274, 350, 75, 22);
					  currentresultW.setEditable(false);
					  add(currentresultW);		 
					  currentresultW.setMargin( new Insets(3,5,10,10) );
					  Border bordercrW = BorderFactory.createLineBorder(Color.BLACK);
					  currentresultW.setBorder(BorderFactory.createCompoundBorder(bordercrW, 
						              BorderFactory.createEmptyBorder(1, 20, 10, 10))); 
					  
					  
					  
					  
					  
					  finalMAC = new JTextArea();
					  finalMAC.setText("");
					  finalMAC.setBounds(XXX-19, 350, 40, 22);
					  finalMAC.setEditable(false);
						  add(finalMAC);		 
						  finalMAC.setMargin( new Insets(3,5,10,10) );
						  Border borderPMAC = BorderFactory.createLineBorder(Color.BLACK);
						  finalMAC.setBorder(BorderFactory.createCompoundBorder(borderPMAC, 
						              BorderFactory.createEmptyBorder(1, 6, 10, 10))); 		  
					  
					  
					  
					  finalWeight = new JTextArea();
					  finalWeight.setText("");
					  finalWeight.setBounds(yyy-16, 350, 40, 22);
					  finalWeight.setEditable(false);
						  add(finalWeight);		 
						  finalWeight.setMargin( new Insets(3,5,10,10) );
						  Border borderFW = BorderFactory.createLineBorder(Color.BLACK);
						  finalWeight.setBorder(BorderFactory.createCompoundBorder(borderFW, 
						              BorderFactory.createEmptyBorder(1, 6, 10, 10))); 		  
					  
					  
					  
					  
					  
			  
			  
			   
	    // These lines of codes create the text area in which the result will be printed in the GUI	  	   
	   
	   calculate = new JButton("Calculate");
	    calculate.setBounds(10, 300, 90, 22);
		   add(calculate);
		   calculate.addActionListener
		    (
		 		      new ActionListener() 
		 		      {
		 		    	 public void actionPerformed(ActionEvent e) 
			 		    	
		 		    	{
		 		    		
		 		    		if ( SelectedMethod ==2 ) {
		 		    			JOptionPane.showMessageDialog(null, "Weighing Method = Platform Scale");
		 		    		} else{
		 		    			JOptionPane.showMessageDialog(null, "Weighing Method = Jacking Point");
		 		    		}
		 		    			
		 		    		     

		 		    
		 		    		 if(item1LEFTout.getText().trim().isEmpty() || item2RIGHTout.getText().trim().isEmpty() || item3NOSEright.getText().trim().isEmpty() || 
		 		    		    item4LEFTout.getText().trim().isEmpty() || item5RIGHTout.getText().trim().isEmpty() || item6NOSEright.getText().trim().isEmpty() ||
		 		    		    item7LEFTout.getText().trim().isEmpty() || item8RIGHTout.getText().trim().isEmpty() || item9NOSEright.getText().trim().isEmpty() ||
		 		    		    
		 		    		    TARE1LEFTout.getText().trim().isEmpty() || TARE2RIGHTout.getText().trim().isEmpty() || TARE3NOSEright.getText().trim().isEmpty() || 
		 		    		    TARE4LEFTout.getText().trim().isEmpty() || TARE5RIGHTout.getText().trim().isEmpty() || TARE6NOSEright.getText().trim().isEmpty() ||
		 		    		    TARE7LEFTout.getText().trim().isEmpty() || TARE8RIGHTout.getText().trim().isEmpty() || TARE9NOSEright.getText().trim().isEmpty() ||
		 		    		    
		 		    		    CellDrift1LEFTout.getText().trim().isEmpty() || CellDrift2RIGHTout.getText().trim().isEmpty() || CellDrift3NOSEright.getText().trim().isEmpty() || 
		 		    		    CellDrift4LEFTout.getText().trim().isEmpty() || CellDrift5RIGHTout.getText().trim().isEmpty() || CellDrift6NOSEright.getText().trim().isEmpty() ||
		 		    		    CellDrift7LEFTout.getText().trim().isEmpty() || CellDrift8RIGHTout.getText().trim().isEmpty() || CellDrift9NOSEright.getText().trim().isEmpty() ||
		 		    		    
		 		    		    InstCorr1LEFTin.getText().trim().isEmpty() || InstCorr2RIGHTin.getText().trim().isEmpty() || InstCorr3NOSEleft.getText().trim().isEmpty() || 
		 		    		    InstCorr4LEFTin.getText().trim().isEmpty() || InstCorr5RIGHTin.getText().trim().isEmpty() || InstCorr6NOSEleft.getText().trim().isEmpty() ||
		 		    		    InstCorr7LEFTin.getText().trim().isEmpty() || InstCorr8RIGHTin.getText().trim().isEmpty() || InstCorr9NOSEleft.getText().trim().isEmpty() ||
		 		    		    
		 		    		    OLEO1LEFTinout.getText().trim().isEmpty() || OLEO2RIGHTinout.getText().trim().isEmpty() || OLEO3NOSEleftright.getText().trim().isEmpty() || 
		 		         		OLEO4LEFTinout.getText().trim().isEmpty() || OLEO5RIGHTinout.getText().trim().isEmpty() || OLEO6NOSEleftright.getText().trim().isEmpty() ||
		 		    		    OLEO7LEFTinout.getText().trim().isEmpty() || OLEO8RIGHTinout.getText().trim().isEmpty() || OLEO9NOSEleftright.getText().trim().isEmpty() 
		 		    		    
		 		    		    
		 		    		    
		 		    				){
		 		    		 //   JOptionPane.showMessageDialog(null,
		 		    		 //       "You left spaces in black", 
		 		    		  //     "Error", JOptionPane.ERROR_MESSAGE);
		 		    		    
		 		    			MainsWgtDiffer1.setText(" ");
		 		    			MainsWgtDiffer1.setText(" ");
		 		    			MainsWgtDiffer1.setBackground(Color.lightGray);
		 		    			
		 		    			MainsWgtDiffer2.setText(" ");
		 		    			MainsWgtDiffer2.setText(" ");
		 		    			MainsWgtDiffer2.setBackground(Color.lightGray);
		 		    			
		 		    			MainsWgtDiffer3.setText(" ");
		 		    			MainsWgtDiffer3.setText(" ");
		 		    			MainsWgtDiffer3.setBackground(Color.lightGray);
		 		    		    
		 		    		    finalresultW.setText(" ");
		 		    			finalresultM.setText(" ");
		 		    			
		 		    			finalresultA.setText(" ");
		 		    			finalresultA.setBackground(Color.lightGray);
		 		    			finalresultA.setForeground(Color.darkGray);
		 		    			
		 		    			finalresultW.setBackground(Color.lightGray);
		 		    			finalresultM.setBackground(Color.lightGray);
		 		    			finalresultW.setForeground(Color.darkGray);
		 		    			finalresultM.setForeground(Color.darkGray);
		 		    			
		 		    			finalresultMAC.setText(" ");
		 		    			finalresultMAC.setBackground(Color.lightGray);
		 		    			finalresultMAC.setForeground(Color.darkGray);
		 		    			
		 		    			previousresultW.setText(" ");
		 		    			previousresultW.setBackground(Color.lightGray);
		 		    			previousresultW.setForeground(Color.darkGray);
		 		    			
		 		    			
		 		    			previousresultMAC.setText(" ");
		 		    			previousresultMAC.setBackground(Color.lightGray);
		 		    			previousresultMAC.setForeground(Color.darkGray);
		 		    			
		 		    			currentresultMAC.setText(" ");
		 		    			currentresultMAC.setBackground(Color.lightGray);
		 		    			currentresultMAC.setForeground(Color.darkGray);
		 		    			
		 		    			currentresultW.setText(" ");
		 		    			currentresultW.setBackground(Color.lightGray);
		 		    			currentresultW.setForeground(Color.darkGray);
		 		    			
		 		    			
		 		    			 finalWeight.setText(" ");
		 		    		  	 finalWeight.setBackground(Color.lightGray);
		 		    		   	 finalWeight.setForeground(Color.darkGray);
		 		    		   	 
		 		    		   	 finalMAC.setText(" ");
		 		    		  	 finalMAC.setBackground(Color.lightGray);
		 		    		   	 finalMAC.setForeground(Color.darkGray);
		 		    		   	 
		 		    		  }
		 		    		  else{
			 		    	        getvalue2 = Double.parseDouble(item1LEFTout.getText().trim());		 		    		
			 		    		    getvalue4 = Double.parseDouble(item2RIGHTout.getText().trim());
			 		    		    getvalue6 = Double.parseDouble(item3NOSEright.getText().trim());
	                                getvalue8 = Double.parseDouble(item4LEFTout.getText().trim());
			 		    		    getvalue10 = Double.parseDouble(item5RIGHTout.getText().trim());
			 		    		    getvalue12 = Double.parseDouble(item6NOSEright.getText().trim());
			 		    		    getvalue14 = Double.parseDouble(item7LEFTout.getText().trim());
			 		    		    getvalue16 = Double.parseDouble(item8RIGHTout.getText().trim());
			 		    	        getvalue18 = Double.parseDouble(item9NOSEright.getText().trim());
			 		    	        
			 		    	        getvalue20 = Integer.parseInt(TARE1LEFTout.getText().trim().replaceAll(" ",""));		 		    		
			 		    		    getvalue22 = Integer.parseInt(TARE2RIGHTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue24 = Integer.parseInt(TARE3NOSEright.getText().trim().replaceAll(" ",""));
	                                getvalue26 = Integer.parseInt(TARE4LEFTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue28 = Integer.parseInt(TARE5RIGHTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue30 = Integer.parseInt(TARE6NOSEright.getText().trim().replaceAll(" ",""));
			 		    		    getvalue32 = Integer.parseInt(TARE7LEFTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue34 = Integer.parseInt(TARE8RIGHTout.getText().trim().replaceAll(" ",""));
			 		    	        getvalue36 = Integer.parseInt(TARE9NOSEright.getText().trim().replaceAll(" ",""));
			 		    	        
			 		    	        getvalue38 = Integer.parseInt(CellDrift1LEFTout.getText().trim().replaceAll(" ",""));		 		    		
			 		    		    getvalue40 = Integer.parseInt(CellDrift2RIGHTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue42 = Integer.parseInt(CellDrift3NOSEright.getText().trim().replaceAll(" ",""));
	                                getvalue44 = Integer.parseInt(CellDrift4LEFTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue46 = Integer.parseInt(CellDrift5RIGHTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue48 = Integer.parseInt(CellDrift6NOSEright.getText().trim().replaceAll(" ",""));
			 		    		    getvalue50 = Integer.parseInt(CellDrift7LEFTout.getText().trim().replaceAll(" ",""));
			 		    		    getvalue52 = Integer.parseInt(CellDrift8RIGHTout.getText().trim().replaceAll(" ",""));
			 		    	        getvalue54 = Integer.parseInt(CellDrift9NOSEright.getText().trim().replaceAll(" ","")); 
		 		    			  
		 		    	    
		 		    	         
		 		    	         getvalue55 = Double.parseDouble(InstCorr1LEFTin.getText().trim());
		 		    	         getvalue56 = Double.parseDouble(InstCorr2RIGHTin.getText().trim());  
		 		    	         getvalue57 = Double.parseDouble(InstCorr3NOSEleft.getText().trim());
		 		    	         getvalue58 = Double.parseDouble(InstCorr4LEFTin.getText().trim());    
		 		    	         getvalue59 = Double.parseDouble(InstCorr5RIGHTin.getText().trim());  
		 		    	         getvalue60 = Double.parseDouble(InstCorr6NOSEleft.getText().trim());
		 		    	         getvalue61 = Double.parseDouble(InstCorr7LEFTin.getText().trim());
		 		    	         getvalue62 = Double.parseDouble(InstCorr8RIGHTin.getText().trim());
		 		    	         getvalue63 = Double.parseDouble(InstCorr9NOSEleft.getText().trim());
		 		    	         
		 		    	         getvalue64 = Double.parseDouble(OLEO1LEFTinout.getText().trim());
		 		    	         getvalue65 = Double.parseDouble(OLEO2RIGHTinout.getText().trim());  
		 		    	         getvalue66 = Double.parseDouble(OLEO3NOSEleftright.getText().trim());
		 		    	         getvalue67 = Double.parseDouble(OLEO4LEFTinout.getText().trim());    
		 		    	         getvalue68 = Double.parseDouble(OLEO5RIGHTinout.getText().trim());  
		 		    	         getvalue69 = Double.parseDouble(OLEO6NOSEleftright.getText().trim());
		 		    	         getvalue70 = Double.parseDouble(OLEO7LEFTinout.getText().trim());
		 		    	         getvalue71 = Double.parseDouble(OLEO8RIGHTinout.getText().trim());
		 		    	         getvalue72 = Double.parseDouble(OLEO9NOSEleftright.getText().trim());
		 		    	         
		 		    		  }
		 		    		 
		 		    		 
		 		    		 
		 		    		 
		 		    		 if(item1LEFTout.getText().trim().isEmpty() || item2RIGHTout.getText().trim().isEmpty() || item3NOSEright.getText().trim().isEmpty() || 
		 		    			item4LEFTout.getText().trim().isEmpty() || item5RIGHTout.getText().trim().isEmpty() || item6NOSEright.getText().trim().isEmpty() ||
		 		    			item7LEFTout.getText().trim().isEmpty() || item8RIGHTout.getText().trim().isEmpty() || item9NOSEright.getText().trim().isEmpty() ||
		 		    			item1LEFTin.getText().trim().isEmpty()  || item2RIGHTin.getText().trim().isEmpty()  || item3NOSEleft.getText().trim().isEmpty()  ||
		 		    			item4LEFTin.getText().trim().isEmpty()  || item5RIGHTin.getText().trim().isEmpty()  || item6NOSEleft.getText().trim().isEmpty()  || 
		 		    			item7LEFTin.getText().trim().isEmpty()  || item8RIGHTin.getText().trim().isEmpty()  || item9NOSEleft.getText().trim().isEmpty()  ||
		 		    			
		 		    			TARE1LEFTout.getText().trim().isEmpty() || TARE2RIGHTout.getText().trim().isEmpty() || TARE3NOSEright.getText().trim().isEmpty() || 
		 		    			TARE4LEFTout.getText().trim().isEmpty() || TARE5RIGHTout.getText().trim().isEmpty() || TARE6NOSEright.getText().trim().isEmpty() ||
		 		    			TARE7LEFTout.getText().trim().isEmpty() || TARE8RIGHTout.getText().trim().isEmpty() || TARE9NOSEright.getText().trim().isEmpty() ||
		 		    			TARE1LEFTin.getText().trim().isEmpty()  || TARE2RIGHTin.getText().trim().isEmpty()  || TARE3NOSEleft.getText().trim().isEmpty()  ||
		 		    			TARE4LEFTin.getText().trim().isEmpty()  || TARE5RIGHTin.getText().trim().isEmpty()  || TARE6NOSEleft.getText().trim().isEmpty()  || 
		 		    			TARE7LEFTin.getText().trim().isEmpty()  || TARE8RIGHTin.getText().trim().isEmpty()  || TARE9NOSEleft.getText().trim().isEmpty()  ||
		 		    			
		 		    			CellDrift1LEFTout.getText().trim().isEmpty() || CellDrift2RIGHTout.getText().trim().isEmpty() || CellDrift3NOSEright.getText().trim().isEmpty() || 
		 		    			CellDrift4LEFTout.getText().trim().isEmpty() || CellDrift5RIGHTout.getText().trim().isEmpty() || CellDrift6NOSEright.getText().trim().isEmpty() ||
		 		    			CellDrift7LEFTout.getText().trim().isEmpty() || CellDrift8RIGHTout.getText().trim().isEmpty() || CellDrift9NOSEright.getText().trim().isEmpty() ||
		 		    			CellDrift1LEFTin.getText().trim().isEmpty()  || CellDrift2RIGHTin.getText().trim().isEmpty()  || CellDrift3NOSEleft.getText().trim().isEmpty()  ||
		 		    			CellDrift4LEFTin.getText().trim().isEmpty()  || CellDrift5RIGHTin.getText().trim().isEmpty()  || CellDrift6NOSEleft.getText().trim().isEmpty()  || 
		 		    			CellDrift7LEFTin.getText().trim().isEmpty()  || CellDrift8RIGHTin.getText().trim().isEmpty()  || CellDrift9NOSEleft.getText().trim().isEmpty()  ||
		 		    			
		 		    			OLEO1LEFTinout.getText().trim().isEmpty()  ||  OLEO2RIGHTinout.getText().trim().isEmpty()       ||  OLEO3NOSEleftright.getText().trim().isEmpty() ||
		 		    			InstCorr1LEFTin.getText().trim().isEmpty()
		 		    				 ){
		 		    			//JOptionPane.showMessageDialog(null,
			 		    		//        "You left spaces in black", 
			 		    		//       "Error", JOptionPane.ERROR_MESSAGE);
		 		    			
		 		    			if(SelectedMethod==2) {
		 		    				
		 		    			MainsWgtDiffer1.setText("");
		 		    			MainsWgtDiffer1.setText("");
		 		    			MainsWgtDiffer1.setBackground(Color.lightGray);
		 		    			
		 		    			MainsWgtDiffer2.setText("");
		 		    			MainsWgtDiffer2.setText("");
		 		    			MainsWgtDiffer2.setBackground(Color.lightGray);
		 		    			
		 		    			MainsWgtDiffer3.setText("");
		 		    			MainsWgtDiffer3.setText("");
		 		    			MainsWgtDiffer3.setBackground(Color.lightGray);
		 		    			
		 		    			finalresultW.setText("");
		 		    			finalresultM.setText("");
		 		    			finalresultW.setBackground(Color.lightGray);
		 		    			
		 		    			finalresultA.setText("");
		 		    			finalresultA.setBackground(Color.lightGray);
		 		    			finalresultA.setForeground(Color.darkGray);
		 		    			
		 		    			finalresultM.setBackground(Color.lightGray);
		 		    			finalresultW.setForeground(Color.darkGray);
		 		    			finalresultW.setFont(new Font(" ", Font.BOLD, 11));
		 		    			finalresultM.setForeground(Color.darkGray);
		 		    			finalresultM.setFont(new Font(" ", Font.BOLD, 11));
		 		    			
		 		    			finalresultMAC.setText(" ");
		 		    			finalresultMAC.setBackground(Color.lightGray);
		 		    			finalresultMAC.setForeground(Color.darkGray);
		 		    			
		 		    			
		 		    			previousresultW.setText(" ");
		 		    			previousresultW.setBackground(Color.lightGray);
		 		    			previousresultW.setForeground(Color.darkGray);
		 		    			
		 		    			
		 		    			previousresultMAC.setText(" ");
		 		    			previousresultMAC.setBackground(Color.lightGray);
		 		    			previousresultMAC.setForeground(Color.darkGray);
		 		    			
		 		    			currentresultMAC.setText(" ");
		 		    			currentresultMAC.setBackground(Color.lightGray);
		 		    			currentresultMAC.setForeground(Color.darkGray);
		 		    			
		 		    			currentresultW.setText(" ");
		 		    			currentresultW.setBackground(Color.lightGray);
		 		    			currentresultW.setForeground(Color.darkGray);
		 		    			
		 		    			
		 		    			 finalWeight.setText(" ");
		 		    		  	 finalWeight.setBackground(Color.lightGray);
		 		    		   	 finalWeight.setForeground(Color.darkGray);
		 		    		   	 
		 		    		   	 finalMAC.setText(" ");
		 		    		  	 finalMAC.setBackground(Color.lightGray);
		 		    		   	 finalMAC.setForeground(Color.darkGray);
		 		    			}
		 		    		 }
		 		    		 else{ 
		 		    	    if(SelectedMethod==2) {
		 		    	    	 getvalue1 = Integer.parseInt(item1LEFTin.getText().trim());
		 		    	         getvalue3 = Integer.parseInt(item2RIGHTin.getText().trim());  
		 		    	         getvalue5 = Integer.parseInt(item3NOSEleft.getText().trim());
		 		    	         getvalue7 = Integer.parseInt(item4LEFTin.getText().trim());    
		 		    	         getvalue9 = Integer.parseInt(item5RIGHTin.getText().trim());  
		 		    	         getvalue11 = Integer.parseInt(item6NOSEleft.getText().trim());
		 		    	         getvalue13 = Integer.parseInt(item7LEFTin.getText().trim());
		 		    	         getvalue15 = Integer.parseInt(item8RIGHTin.getText().trim());
		 		    	         getvalue17 = Integer.parseInt(item9NOSEleft.getText().trim());
		 		    	         
		 		    	         getvalue19 = Integer.parseInt(TARE1LEFTin.getText().trim().replaceAll(" ",""));
		 		    	         getvalue21 = Integer.parseInt(TARE2RIGHTin.getText().trim().replaceAll(" ",""));  
		 		    	         getvalue23 = Integer.parseInt(TARE3NOSEleft.getText().trim().replaceAll(" ",""));
		 		    	         getvalue25 = Integer.parseInt(TARE4LEFTin.getText().trim().replaceAll(" ",""));    
		 		    	         getvalue27 = Integer.parseInt(TARE5RIGHTin.getText().trim().replaceAll(" ",""));  
		 		    	         getvalue29 = Integer.parseInt(TARE6NOSEleft.getText().trim().replaceAll(" ",""));
		 		    	         getvalue31 = Integer.parseInt(TARE7LEFTin.getText().trim().replaceAll(" ",""));
		 		    	         getvalue33 = Integer.parseInt(TARE8RIGHTin.getText().trim().replaceAll(" ",""));
		 		    	         getvalue35 = Integer.parseInt(TARE9NOSEleft.getText().trim().replaceAll(" ",""));
		 		    	         
		 		    	         getvalue37 = Integer.parseInt(CellDrift1LEFTin.getText().trim().replaceAll(" ",""));
		 		    	         getvalue39 = Integer.parseInt(CellDrift2RIGHTin.getText().trim().replaceAll(" ",""));  
		 		    	         getvalue41 = Integer.parseInt(CellDrift3NOSEleft.getText().trim().replaceAll(" ",""));
		 		    	         getvalue43 = Integer.parseInt(CellDrift4LEFTin.getText().trim().replaceAll(" ",""));    
		 		    	         getvalue45 = Integer.parseInt(CellDrift5RIGHTin.getText().trim().replaceAll(" ",""));  
		 		    	         getvalue47 = Integer.parseInt(CellDrift6NOSEleft.getText().trim().replaceAll(" ",""));
		 		    	         getvalue49 = Integer.parseInt(CellDrift7LEFTin.getText().trim().replaceAll(" ",""));
		 		    	         getvalue51 = Integer.parseInt(CellDrift8RIGHTin.getText().trim().replaceAll(" ",""));
		 		    	         getvalue53 = Integer.parseInt(CellDrift9NOSEleft.getText().trim().replaceAll(" ",""));
		 		    		
		 		    	 }
		 		    	 }
		 		    		 BEWredords();
		 		    		 BEWCalculation();
		 		    		 
		 		    		
		 		    		 if(SelectedMethod==2) {
		 		    		          if(item1LEFTout.getText().trim().isEmpty() || item2RIGHTout.getText().trim().isEmpty() || item3NOSEright.getText().trim().isEmpty() || 
				 		    			item4LEFTout.getText().trim().isEmpty() || item5RIGHTout.getText().trim().isEmpty() || item6NOSEright.getText().trim().isEmpty() ||
				 		    			item7LEFTout.getText().trim().isEmpty() || item8RIGHTout.getText().trim().isEmpty() || item9NOSEright.getText().trim().isEmpty() ||
				 		    			item1LEFTin.getText().trim().isEmpty()  || item2RIGHTin.getText().trim().isEmpty()  || item3NOSEleft.getText().trim().isEmpty()  ||
				 		    			item4LEFTin.getText().trim().isEmpty()  || item5RIGHTin.getText().trim().isEmpty()  || item6NOSEleft.getText().trim().isEmpty()  || 
				 		    			item7LEFTin.getText().trim().isEmpty()  || item8RIGHTin.getText().trim().isEmpty()  || item9NOSEleft.getText().trim().isEmpty()  ||
				 		    			
				 		    			TARE1LEFTout.getText().trim().isEmpty() || TARE2RIGHTout.getText().trim().isEmpty() || TARE3NOSEright.getText().trim().isEmpty() || 
				 		    			TARE4LEFTout.getText().trim().isEmpty() || TARE5RIGHTout.getText().trim().isEmpty() || TARE6NOSEright.getText().trim().isEmpty() ||
				 		    			TARE7LEFTout.getText().trim().isEmpty() || TARE8RIGHTout.getText().trim().isEmpty() || TARE9NOSEright.getText().trim().isEmpty() ||
				 		    			TARE1LEFTin.getText().trim().isEmpty()  || TARE2RIGHTin.getText().trim().isEmpty()  || TARE3NOSEleft.getText().trim().isEmpty()  ||
				 		    			TARE4LEFTin.getText().trim().isEmpty()  || TARE5RIGHTin.getText().trim().isEmpty()  || TARE6NOSEleft.getText().trim().isEmpty()  || 
				 		    			TARE7LEFTin.getText().trim().isEmpty()  || TARE8RIGHTin.getText().trim().isEmpty()  || TARE9NOSEleft.getText().trim().isEmpty()  ||
				 		    			
				 		    			CellDrift1LEFTout.getText().trim().isEmpty() || CellDrift2RIGHTout.getText().trim().isEmpty() || CellDrift3NOSEright.getText().trim().isEmpty() || 
				 		    			CellDrift4LEFTout.getText().trim().isEmpty() || CellDrift5RIGHTout.getText().trim().isEmpty() || CellDrift6NOSEright.getText().trim().isEmpty() ||
				 		    			CellDrift7LEFTout.getText().trim().isEmpty() || CellDrift8RIGHTout.getText().trim().isEmpty() || CellDrift9NOSEright.getText().trim().isEmpty() ||
				 		    			CellDrift1LEFTin.getText().trim().isEmpty()  || CellDrift2RIGHTin.getText().trim().isEmpty()  || CellDrift3NOSEleft.getText().trim().isEmpty()  ||
				 		    			CellDrift4LEFTin.getText().trim().isEmpty()  || CellDrift5RIGHTin.getText().trim().isEmpty()  || CellDrift6NOSEleft.getText().trim().isEmpty()  || 
				 		    			CellDrift7LEFTin.getText().trim().isEmpty()  || CellDrift8RIGHTin.getText().trim().isEmpty()  || CellDrift9NOSEleft.getText().trim().isEmpty()  ||
				 		    		    
				 		    		    OLEO1LEFTinout.getText().trim().isEmpty() || OLEO2RIGHTinout.getText().trim().isEmpty() || OLEO3NOSEleftright.getText().trim().isEmpty() || 
				 		         		OLEO4LEFTinout.getText().trim().isEmpty() || OLEO5RIGHTinout.getText().trim().isEmpty() || OLEO6NOSEleftright.getText().trim().isEmpty() ||
				 		    		    OLEO7LEFTinout.getText().trim().isEmpty() || OLEO8RIGHTinout.getText().trim().isEmpty() || OLEO9NOSEleftright.getText().trim().isEmpty() 
			 		    				){

		 		    		 }
		 		    		 else{ 		 		    		
		 		    		     
		 		    			if(Weightdifferencecheck>=200 ) 
		 		    			{
			 		    			JOptionPane.showMessageDialog(null,
				 		    		        "Selected Weight Diference is higher than or igual to 200 lb", 
				 		    		       "Error", JOptionPane.ERROR_MESSAGE);
			 		    			
			 		    			MainsWgtDiffer1.setText("");
			 		    			MainsWgtDiffer1.setText("");
			 		    			MainsWgtDiffer1.setBackground(Color.WHITE);
			 		    			
			 		    			MainsWgtDiffer2.setText("");
			 		    			MainsWgtDiffer2.setText("");
			 		    			MainsWgtDiffer2.setBackground(Color.WHITE);
			 		    			
			 		    			MainsWgtDiffer3.setText("");
			 		    			MainsWgtDiffer3.setText("");
			 		    			MainsWgtDiffer3.setBackground(Color.WHITE);
			 		    			
			 		    			finalresultW.setText("");
			 		    			finalresultW.setBackground(Color.WHITE);
			 		    			
			 		    			finalresultM.setText("");
			 		    			finalresultM.setBackground(Color.WHITE);
			 		    			
			 		    			
			 		    			finalresultA.setText("");
			 		    			finalresultA.setBackground(Color.WHITE);
			 		    		
			 		    			
			 		    			

			 		    			finalresultMAC.setText("");
			 		    			finalresultMAC.setBackground(Color.WHITE);
			 		    			
			 		    			
			 		    			
			 		    			previousresultW.setText("");
			 		    			previousresultW.setBackground(Color.WHITE);
			 		    			
			 		    			
			 		    			
			 		    			previousresultMAC.setText("");
			 		    			previousresultMAC.setBackground(Color.WHITE);
			 		    		
			 		    			
			 		    			currentresultMAC.setText("");
			 		    			currentresultMAC.setBackground(Color.WHITE);
			 		    			
			 		    			
			 		    			currentresultW.setText("");
			 		    			currentresultW.setBackground(Color.WHITE);
			 		    			
			 		    			
			 		    			
			 		    			 finalWeight.setText("");
			 		    		  	 finalWeight.setBackground(Color.WHITE);
			 		    		   	
			 		    		   	 
			 		    		   	 finalMAC.setText("");
			 		    		  	 finalMAC.setBackground(Color.WHITE);
			 		    		   
			 		    			
			 		    			
			 		    			
			 		    			
			 		    			
		 		    			}else {
		 		    				
		 		    			
		 		    			 
		 		    		
		 		    		SwingUtilities.invokeLater(
		 		 					new Runnable() {
		 		 						public void run() {
		 		 							
		 		 							
 
		 		 						 MainsWgtDiffer1.setText(String.format("%.4f",MWD1));
		 		 						 MainsWgtDiffer1.setEditable(false);
			 		 					 add(MainsWgtDiffer1);
			 		 					 MainsWgtDiffer1.setBackground(Color.CYAN);
			 		 					 MainsWgtDiffer1.setFont(new Font("sherif", Font.BOLD, 11));
			 		 					 
			 		 					 
		 		 						 MainsWgtDiffer2.setText(String.format("%.4f",MWD2));
		 		 						 MainsWgtDiffer2.setEditable(false);
			 		 					 add(MainsWgtDiffer2);
			 		 					 MainsWgtDiffer2.setBackground(Color.CYAN);
			 		 					 MainsWgtDiffer2.setFont(new Font("sherif", Font.BOLD, 11));
			 		 					 
		 		 						 MainsWgtDiffer3.setText(String.format("%.4f",MWD3));
		 		 						 MainsWgtDiffer3.setEditable(false);
			 		 					 add(MainsWgtDiffer3);
			 		 					 MainsWgtDiffer3.setBackground(Color.CYAN);
			 		 					 MainsWgtDiffer3.setFont(new Font("sherif", Font.BOLD, 11));
		 		 						   
		 		 					
			 		 						  finalresultW.setText(String.format("%.4f",SelectedW));
			 		 						  finalresultW.setEditable(false);
			 		 						   add(finalresultW);
			 		 						 finalresultW.setBackground(Color.CYAN);
			 		 						finalresultW.setFont(new Font("sherif", Font.BOLD, 13));
			 		 						
			 		 						 finalresultA.setText(String.format("%.4f", SelectedArm));
			 		 						  finalresultA.setEditable(false);
			 		 						   add(finalresultA);
			 		 						 finalresultA.setBackground(Color.CYAN);
			 		 						finalresultA.setFont(new Font("sherif", Font.BOLD, 13));
			 		 						
			 		 						   
			 		 						   
			 		 						 finalresultM.setText(String.format("%.4f", new BigDecimal(SelectedM)));
				 		 					  finalresultM.setEditable(false);
				 		 					   add(finalresultM); 
				 		 					 finalresultM.setBackground(Color.CYAN);
				 		 					 finalresultM.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					 
				 		 					 
			 		 						finalresultMAC.setText(String.format("%.4f", MAC));
			 		 						finalresultMAC.setEditable(false);
				 		 					   add(finalresultMAC); 
				 		 					 finalresultMAC.setBackground(Color.CYAN);
				 		 					 finalresultMAC.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					 
				 		 					
				 		 					previousresultW.setText(String.format("%.0f",Double.parseDouble(previousWW)));
				 		 					previousresultW.setEditable(false);
				 		 					   add(previousresultW); 
				 		 					 previousresultW.setBackground(Color.CYAN);
				 		 					previousresultW.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					
				 		 					previousresultMAC.setText(String.format("%.2f",Double.parseDouble(previousMACMAC)));
				 		 					previousresultMAC.setEditable(false);
				 		 					   add(previousresultMAC); 
				 		 					 previousresultMAC.setBackground(Color.CYAN);
				 		 					previousresultMAC.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					
					 	    		
				 		 					currentresultMAC.setText(String.format("%.2f",MAC));
				 		 					currentresultMAC.setEditable(false);
			 		 						add(currentresultMAC);
			 		 						currentresultMAC.setBackground(Color.CYAN);
			 		 						currentresultMAC.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					
				 		 					currentresultW.setText(String.format("%.0f",SelectedW));
				 		 					currentresultW.setEditable(false);
			 		 						add(currentresultW);
			 		 						currentresultW.setBackground(Color.CYAN);
			 		 						currentresultW.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					
				 		 					
			 		 					
			 		 						
				 		 					
				 		 					if (Wlimit >=1) {
					 		 					finalWeight.setText(String.format("%.2f",Wlimit));
					 		 					finalWeight.setEditable(false);
					 		 					   add(finalWeight); 
					 		 					 finalWeight.setBackground(Color.RED);
					 		 					finalWeight.setFont(new Font("sherif", Font.BOLD, 13));
					 		 					

				 		 						
				 		 					}else 
				 		 					{
					 		 					finalWeight.setText(String.format("%.2f",Wlimit));
					 		 					finalWeight.setEditable(false);
					 		 					   add(finalWeight); 
					 		 					 finalWeight.setBackground(Color.green);
					 		 					finalWeight.setFont(new Font("sherif", Font.BOLD, 13));
					 		 					

				 		 					}
				 		 						
				 		 					
				 		 					if (MAClimit >=1.5 ) {

					 		 					
				 		 						finalMAC.setText(String.format("%.2f",MAClimit));
					 		 					finalMAC.setEditable(false);
					 		 					add(finalMAC); 
					 		 					finalMAC.setBackground(Color.RED);
					 		 					finalMAC.setFont(new Font("sherif", Font.BOLD, 13));
				 		 						
				 		 					}else 
				 		 					{
				 		 						finalMAC.setText(String.format("%.2f",MAClimit));
					 		 					finalMAC.setEditable(false);
					 		 					add(finalMAC); 
					 		 					finalMAC.setBackground(Color.green);
					 		 					finalMAC.setFont(new Font("sherif", Font.BOLD, 13));
				 		 					}
				 		 					
		 		 						}
		 		 			}
		 		 				 		);	 
		 		    		
		 		    			}
		 		    		
		 		    		
		 		    		 
		 		    	}
		 		    		 }
		 		    		 
		 		    		 
		 		    		 if(SelectedMethod==1) {
	 		    		          if(item1LEFTout.getText().trim().isEmpty() || item2RIGHTout.getText().trim().isEmpty() || item3NOSEright.getText().trim().isEmpty() || 
	 				 		         item4LEFTout.getText().trim().isEmpty() || item5RIGHTout.getText().trim().isEmpty() || item6NOSEright.getText().trim().isEmpty() ||
	 				 		         item7LEFTout.getText().trim().isEmpty() || item8RIGHTout.getText().trim().isEmpty() || item9NOSEright.getText().trim().isEmpty() ||
	 				 		    		    
	 				 		         TARE1LEFTout.getText().trim().isEmpty() || TARE2RIGHTout.getText().trim().isEmpty() || TARE3NOSEright.getText().trim().isEmpty() || 
	 				 		    	  TARE4LEFTout.getText().trim().isEmpty() || TARE5RIGHTout.getText().trim().isEmpty() || TARE6NOSEright.getText().trim().isEmpty() ||
	 				 		    	  TARE7LEFTout.getText().trim().isEmpty() || TARE8RIGHTout.getText().trim().isEmpty() || TARE9NOSEright.getText().trim().isEmpty() ||
	 				 		    		    
	 				 		    	  CellDrift1LEFTout.getText().trim().isEmpty() || CellDrift2RIGHTout.getText().trim().isEmpty() || CellDrift3NOSEright.getText().trim().isEmpty() || 
	 				 		    	  CellDrift4LEFTout.getText().trim().isEmpty() || CellDrift5RIGHTout.getText().trim().isEmpty() || CellDrift6NOSEright.getText().trim().isEmpty() ||
	 				 		    	  CellDrift7LEFTout.getText().trim().isEmpty() || CellDrift8RIGHTout.getText().trim().isEmpty() || CellDrift9NOSEright.getText().trim().isEmpty() ||
	 			 		    		    
	 			 		    		    OLEO1LEFTinout.getText().trim().isEmpty() || OLEO2RIGHTinout.getText().trim().isEmpty() || OLEO3NOSEleftright.getText().trim().isEmpty() || 
	 			 		         		OLEO4LEFTinout.getText().trim().isEmpty() || OLEO5RIGHTinout.getText().trim().isEmpty() || OLEO6NOSEleftright.getText().trim().isEmpty() ||
	 			 		    		    OLEO7LEFTinout.getText().trim().isEmpty() || OLEO8RIGHTinout.getText().trim().isEmpty() || OLEO9NOSEleftright.getText().trim().isEmpty() ||
	 			 		    		    InstCorr1LEFTin.getText().trim().isEmpty()
		 		    				){

	 		    		 }
	 		    		 else{ 		 		    		
	 		    		
	 		    			if(Weightdifferencecheck>=200 ) 
	 		    			{
		 		    			JOptionPane.showMessageDialog(null,
			 		    		        "Selected Weight Diference is higher than or igual to 200 lb", 
			 		    		       "Error", JOptionPane.ERROR_MESSAGE);
		 		    			
		 		    			
		 		    			MainsWgtDiffer1.setText("");
		 		    			MainsWgtDiffer1.setText("");
		 		    			MainsWgtDiffer1.setBackground(Color.WHITE);
		 		    			
		 		    			MainsWgtDiffer2.setText("");
		 		    			MainsWgtDiffer2.setText("");
		 		    			MainsWgtDiffer2.setBackground(Color.WHITE);
		 		    			
		 		    			MainsWgtDiffer3.setText("");
		 		    			MainsWgtDiffer3.setText("");
		 		    			MainsWgtDiffer3.setBackground(Color.WHITE);
		 		    			
		 		    			finalresultW.setText("");
		 		    			finalresultW.setBackground(Color.WHITE);
		 		    			finalresultM.setText("");
		 		    			finalresultM.setBackground(Color.WHITE);
		 		    		
		 		    			
		 		    			finalresultA.setText("");
		 		    			finalresultA.setBackground(Color.WHITE);
		 		    			
		 		    			
		 		    			finalresultMAC.setText("");
		 		    			finalresultMAC.setBackground(Color.WHITE);
		 		    		
		 		    			previousresultW.setText(" ");
		 		    			previousresultW.setBackground(Color.WHITE);
		 		    	
		 		    			
		 		    			
		 		    			previousresultMAC.setText(" ");
		 		    			previousresultMAC.setBackground(Color.WHITE);
		 		    	
		 		    			
		 		    			currentresultMAC.setText("");
		 		    			currentresultMAC.setBackground(Color.WHITE);
		 		    		
		 		    			
		 		    			currentresultW.setText("");
		 		    			currentresultW.setBackground(Color.WHITE);
		 		    		
		 		    			
		 		    			
		 		    			 finalWeight.setText("");
		 		    		  	 finalWeight.setBackground(Color.WHITE);
		 		    		  
		 		    		   	 
		 		    		   	 finalMAC.setText("");
		 		    		  	 finalMAC.setBackground(Color.WHITE);
		 		    		 
		 		    			
		 		    			
		 		    			
	 		    			}else {
	 		    		
	 		    		SwingUtilities.invokeLater(
	 		 					new Runnable() {
	 		 						public void run() {
	 		 					
		 		 						 MainsWgtDiffer1.setText(String.format("%.4f",MWD1));
		 		 						 MainsWgtDiffer1.setEditable(false);
			 		 					 add(MainsWgtDiffer1);
			 		 					 MainsWgtDiffer1.setBackground(Color.CYAN);
			 		 					 MainsWgtDiffer1.setFont(new Font("sherif", Font.BOLD, 11));
			 		 					 
		 		 						 MainsWgtDiffer2.setText(String.format("%.4f",MWD2));
		 		 						 MainsWgtDiffer2.setEditable(false);
			 		 					 add(MainsWgtDiffer2);
			 		 					 MainsWgtDiffer2.setBackground(Color.CYAN);
			 		 					 MainsWgtDiffer2.setFont(new Font("sherif", Font.BOLD, 11));
			 		 					 
		 		 						 MainsWgtDiffer3.setText(String.format("%.4f",MWD3));
		 		 						 MainsWgtDiffer3.setEditable(false);
			 		 					 add(MainsWgtDiffer3);
			 		 					 MainsWgtDiffer3.setBackground(Color.CYAN);
			 		 					 MainsWgtDiffer3.setFont(new Font("sherif", Font.BOLD, 11));		
	 		 							
	 		 							
	 		 							
	 		 						  finalresultW.setText(String.format("%.4f",SelectedW));
	 		 						  finalresultW.setEditable(false);
	 		 						   add(finalresultW);
	 		 						 finalresultW.setBackground(Color.CYAN);
	 		 						finalresultW.setFont(new Font("sherif", Font.BOLD, 13));
	 		 						
	 		 						 finalresultA.setText(String.format("%.4f", SelectedArm));
	 		 						  finalresultA.setEditable(false);
	 		 						   add(finalresultA);
	 		 						 finalresultA.setBackground(Color.CYAN);
	 		 						finalresultA.setFont(new Font("sherif", Font.BOLD, 13));
	 		 						
	 		 						   
		 		 					  finalresultM.setText(String.format("%.4f", SelectedM));
		 		 					  finalresultM.setEditable(false);
		 		 					   add(finalresultM); 
		 		 				 finalresultM.setBackground(Color.CYAN);
		 		 					finalresultM.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					
		 		 					
	 		 						finalresultMAC.setText(String.format("%.4f", MAC));
	 		 						finalresultMAC.setEditable(false);
		 		 					   add(finalresultMAC); 
		 		 					 finalresultMAC.setBackground(Color.CYAN);
		 		 					 finalresultMAC.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					 
		 		 					
		 		 					
		 		 					previousresultW.setText(String.format("%.0f",Double.parseDouble(previousWW)));
		 		 					previousresultW.setEditable(false);
		 		 					   add(previousresultW); 
		 		 					 previousresultW.setBackground(Color.CYAN);
		 		 					previousresultW.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					
		 		 					previousresultMAC.setText(String.format("%.2f",Double.parseDouble(previousMACMAC)));
		 		 					previousresultMAC.setEditable(false);
		 		 					   add(previousresultMAC); 
		 		 					 previousresultMAC.setBackground(Color.CYAN);
		 		 					previousresultMAC.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					
		 		 					
		 		 					currentresultMAC.setText(String.format("%.2f",MAC));
		 		 					currentresultMAC.setEditable(false);
	 		 						add(currentresultMAC);
	 		 						currentresultMAC.setBackground(Color.CYAN);
	 		 						currentresultMAC.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					
		 		 					currentresultW.setText(String.format("%.4f",SelectedW));
		 		 					currentresultW.setEditable(false);
	 		 						add(currentresultW);
	 		 						currentresultW.setBackground(Color.CYAN);
	 		 						currentresultW.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					
		 		 					
		 		 					
		 		 					
		 		 					if (Wlimit >=1) {
			 		 					finalWeight.setText(String.format("%.2f",Wlimit));
			 		 					finalWeight.setEditable(false);
			 		 					   add(finalWeight); 
			 		 					 finalWeight.setBackground(Color.RED);
			 		 					finalWeight.setFont(new Font("sherif", Font.BOLD, 13));
			 		 					

		 		 						
		 		 					}else 
		 		 					{
			 		 					finalWeight.setText(String.format("%.2f",Wlimit));
			 		 					finalWeight.setEditable(false);
			 		 					   add(finalWeight); 
			 		 					 finalWeight.setBackground(Color.green);
			 		 					finalWeight.setFont(new Font("sherif", Font.BOLD, 13));
			 		 					

		 		 					}
		 		 						
		 		 					
		 		 					if (MAClimit >=1.5 ) {

			 		 					
		 		 						finalMAC.setText(String.format("%.2f",MAClimit));
			 		 					finalMAC.setEditable(false);
			 		 					add(finalMAC); 
			 		 					finalMAC.setBackground(Color.RED);
			 		 					finalMAC.setFont(new Font("sherif", Font.BOLD, 13));
		 		 						
		 		 					}else 
		 		 					{
			 		 				    finalMAC.setText(String.format("%.2f",MAClimit));
			 		 					finalMAC.setEditable(false);
			 		 					add(finalMAC); 
			 		 					finalMAC.setBackground(Color.green);
			 		 					finalMAC.setFont(new Font("sherif", Font.BOLD, 13));
		 		 					}
		 		 					
		 		 					

	 		 						}
	 		 			}
	 		 				 		);	 
	 		    		
	 		    			}
	 		    		
	 		    		
	 		    		 
	 		    	}
	 		    		 }		 		    		 
		 		    		 
		 		    		 
		 		    		 
		 		    	}
		 		     }
		 	);
	   
		  

	}
	      


	  public void BEWCalculation() {
		  
		  if(SelectedMethod==2) 
		  {	 
			  
		  
		  
	  MWD1 =   (((getvalue1 +getvalue19+getvalue37)*getvalue55) + ((getvalue2 +getvalue20+getvalue38)*getvalue55))
	         - (((getvalue3 +getvalue21+getvalue39)*getvalue56) + ((getvalue4 +getvalue22+getvalue40)*getvalue56));	
	  
	  MWD2 =   (((getvalue7 +getvalue25+getvalue43)*getvalue58) + ((getvalue8 +getvalue26+getvalue44)*getvalue58)) 
			 - (((getvalue9 +getvalue27+getvalue45)*getvalue59) + ((getvalue10+getvalue28+getvalue46)*getvalue59)); 
	  
	  MWD3 =   (((getvalue13+getvalue31+getvalue49)*getvalue61) + ((getvalue14+getvalue32+getvalue50)*getvalue61)) 
			 - (((getvalue15+getvalue33+getvalue51)*getvalue62) + ((getvalue16+getvalue34+getvalue52)*getvalue62)); 
			  
		 
      W1 =  ((getvalue1 +getvalue19+getvalue37)*getvalue55) + ((getvalue2 +getvalue20+getvalue38)*getvalue55)
           +((getvalue3 +getvalue21+getvalue39)*getvalue56) + ((getvalue4 +getvalue22+getvalue40)*getvalue56)
           +((getvalue5 +getvalue23+getvalue41)*getvalue57) + ((getvalue6 +getvalue24+getvalue42)*getvalue57);
		  
		  
	  W2 =	((getvalue7 +getvalue25+getvalue43)*getvalue58) + ((getvalue8 +getvalue26+getvalue44)*getvalue58) 
		   +((getvalue9 +getvalue27+getvalue45)*getvalue59) + ((getvalue10+getvalue28+getvalue46)*getvalue59) 
		   +((getvalue11+getvalue29+getvalue47)*getvalue60) + ((getvalue12+getvalue30+getvalue48)*getvalue60);
		  
	  System.out.println((getvalue7 +getvalue25+getvalue43)*getvalue58);
	  System.out.println((getvalue8 +getvalue26+getvalue44)*getvalue58);
	  System.out.println((getvalue9 +getvalue27+getvalue45)*getvalue59);
	  System.out.println((getvalue10+getvalue28+getvalue46)*getvalue59);
	  System.out.println((getvalue11+getvalue29+getvalue47)*getvalue60);
	  System.out.println((getvalue12+getvalue30+getvalue48)*getvalue60);
	  
	  W3 =  ((getvalue13+getvalue31+getvalue49)*getvalue61) + ((getvalue14+getvalue32+getvalue50)*getvalue61) 
		   +((getvalue15+getvalue33+getvalue51)*getvalue62) + ((getvalue16+getvalue34+getvalue52)*getvalue62) 
		   +((getvalue17+getvalue35+getvalue53)*getvalue63) + ((getvalue18+getvalue36+getvalue54)*getvalue63);
		  
           W12=Math.abs(W1-W2);
		   W13=Math.abs(W1-W3);
		   W23=Math.abs(W2-W3);
		  
		  System.out.println(W1);
		  System.out.println(W2);
		  System.out.println(W3);
		 // && Math.abs(W1-W2)<200
		  if(W12<=W13 && W12<=W23 ) 
		  {
			  Weightdifferencecheck = W12;
			  System.out.println("ESTEESWeightdifferencecheck 12");
			  System.out.println(Weightdifferencecheck);
			  System.out.println("ESTEESWeightdifferencecheck 12");
			  
			  
			  SelectedW=  (( (((getvalue1+getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue7 +getvalue25+getvalue43)*getvalue58)+((getvalue8 +getvalue26+getvalue44)*getvalue58)) )/2)
					     +(( (((getvalue3+getvalue21+getvalue39)*getvalue56)+((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue9 +getvalue27+getvalue45)*getvalue59)+((getvalue10+getvalue28+getvalue46)*getvalue59)) )/2)
					     +(( (((getvalue5+getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue11+getvalue29+getvalue47)*getvalue60)+((getvalue12+getvalue30+getvalue48)*getvalue60)) )/2);
			  
			   TEST1 =  (( (((getvalue1+getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue7 +getvalue25+getvalue43)*getvalue58)+((getvalue8 +getvalue26+getvalue44)*getvalue58)) )/2);
			    TEST2 =(( (((getvalue3+getvalue21+getvalue39)*getvalue56)+((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue9 +getvalue27+getvalue45)*getvalue59)+((getvalue10+getvalue28+getvalue46)*getvalue59)) )/2);
			    TEST3 =(( (((getvalue5+getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue11+getvalue29+getvalue47)*getvalue60)+((getvalue12+getvalue30+getvalue48)*getvalue60)) )/2);
			    System.out.println(TEST1);
			    System.out.println(TEST2);
			    System.out.println(TEST3);
			    System.out.println("this is the selectedW 12");
			    System.out.println(SelectedW);
			    System.out.println("this is the selectedW 12");
			    
			    try 
			    {
			    	Wlimit = (((Math.abs(SelectedW - Double.parseDouble(previousWW)))/MLW)*100);
			    	System.out.println("este es WL");
			    	System.out.println(Wlimit);
			    	System.out.println("este es WL");
			    }
			    catch(Exception e)
			    {
			   
				
			    }
			    System.out.println("shit");
			    System.out.println(previousWW);
			    System.out.println(SelectedW);
			    System.out.println("shit");
			  
			  
		  
			        M12=     (((getvalue1 +getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55))*(arm+((arm2)*(getvalue64)));
			        M34=     (((getvalue3 +getvalue21+getvalue39)*getvalue56)+((getvalue4+getvalue22+getvalue40)*getvalue56))*(arm+((arm2)*(getvalue65)));
			        M56=     (((getvalue5 +getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57))*(Nosearm+(NosearmE*getvalue66));
			  
			       M78=      (((getvalue7 +getvalue25+getvalue43)*getvalue58)+((getvalue8 +getvalue26+getvalue44)*getvalue58))*(arm+((arm2)*(getvalue67)));
			      M910=      (((getvalue9 +getvalue27+getvalue45)*getvalue59)+((getvalue10+getvalue28+getvalue46)*getvalue59))*(arm+((arm2)*(getvalue68)));
			     M1112=      (((getvalue11+getvalue29+getvalue47)*getvalue60)+((getvalue12+getvalue30+getvalue48)*getvalue60))*(Nosearm+(NosearmE*getvalue69));
			     
			      System.out.println(" ");
			      System.out.printf("%.4f",(((getvalue1 +getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55)));
			      System.out.println(" ");
			      System.out.printf("%.4f",getvalue64);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",((arm2)));
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm2)*(getvalue64));
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm));
			      System.out.println(" ");
			      System.out.printf("%.4f",M12);
			      System.out.println();
				  System.out.printf("%.4f",M34);
				  System.out.println();
				  System.out.printf("%.4f",M56);
				  System.out.println();
				  
				  System.out.printf("%.4f",((((getvalue5 +getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57))));
			      System.out.println(" ");
			      System.out.println(" ");
				  System.out.printf("%.4f",((Nosearm+(NosearmE*getvalue69))));
			      System.out.println(" ");
			      System.out.println(" ");
				  System.out.printf("%.4f",((Nosearm)));
			      System.out.println(" ");
			      System.out.println(" ");
				  System.out.printf("%.4f",(((getvalue69))));
			      System.out.println(" ");
			      System.out.println(" ");
				  
				  System.out.printf("%.4f",M78);
				  System.out.println();
				  System.out.printf("%.4f",M910);
				  System.out.println();
				  System.out.printf("%.4f",M1112);
				  
				  
			  
			 SelectedM=      ((M12+M78)/2)+((M34+M910)/2)+((M56+M1112)/2);
			 MAC =(((SelectedM/SelectedW)-DBA)*100)/MACL;
			 try 
			 {
				 MAClimit = Math.abs(MAC - Double.parseDouble(previousMACMAC));
			    	System.out.println("este es ML");
			    	System.out.println(MAClimit);
			    	System.out.println("este es ML");
			 }
			   catch(Exception e) 
			 {
			 
		     }
			 SelectedArm= SelectedM/SelectedW;
			 
		  }
		//  && Math.abs(W1-W3)<200
		  if(W13<=W12 && W13<=W23 ) 
		  {
			  
			  Weightdifferencecheck = W13;
			  System.out.println("ESTEESWeightdifferencecheck 13");
			  System.out.println(Weightdifferencecheck);
			  System.out.println("ESTEESWeightdifferencecheck 13");
			  
			  SelectedW=  (( (((getvalue1+getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue13+getvalue31+getvalue49)*getvalue61)+((getvalue14+getvalue32+getvalue50)*getvalue61)) )/2)
					     +(( (((getvalue3+getvalue21+getvalue39)*getvalue56)+((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue15+getvalue33+getvalue51)*getvalue62)+((getvalue16+getvalue34+getvalue52)*getvalue62)) )/2)
					     +(( (((getvalue5+getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue17+getvalue35+getvalue53)*getvalue63)+((getvalue18+getvalue36+getvalue54)*getvalue63)) )/2);
		      
			    TEST1 =(( (((getvalue1+getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue13+getvalue31+getvalue49)*getvalue61)+((getvalue14+getvalue32+getvalue50)*getvalue61)) )/2);
			    TEST2 =(( (((getvalue3+getvalue21+getvalue39)*getvalue56)+((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue15+getvalue33+getvalue51)*getvalue62)+((getvalue16+getvalue34+getvalue52)*getvalue62)) )/2);
			    TEST3 =(( (((getvalue5+getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue17+getvalue35+getvalue53)*getvalue63)+((getvalue18+getvalue36+getvalue54)*getvalue63)) )/2);
			   
			    System.out.println((((getvalue1+getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55)));
			    System.out.println(((getvalue13+getvalue31+getvalue49)*getvalue61)+((getvalue14+getvalue32+getvalue50)*getvalue61));
			    
			    System.out.println(TEST1);
			    System.out.println(TEST2);
			    System.out.println(TEST3);
			    System.out.println("this is the selectedW");
			    System.out.println(SelectedW);
			    System.out.println("this is the selectedW");
			    
			    try 
			    {
			    	Wlimit = (((Math.abs(SelectedW - Double.parseDouble(previousWW)))/MLW)*100);
			    }
			    catch(Exception e)
			    {
			   
				
			    }
			    		
			       M12=      (((getvalue1 +getvalue19+getvalue37)*getvalue55)+((getvalue2+getvalue20+getvalue38)*getvalue55))*(arm+((arm2)*(getvalue64)));
			       M34=      (((getvalue3 +getvalue21+getvalue39)*getvalue56)+((getvalue4+getvalue22+getvalue40)*getvalue56))*(arm+((arm2)*(getvalue65)));
			       M56=      (((getvalue5 +getvalue23+getvalue41)*getvalue57)+((getvalue6+getvalue24+getvalue42)*getvalue57))*(Nosearm+(NosearmE*getvalue66));		  

			     M1314=      (((getvalue13+getvalue31+getvalue49)*getvalue61)+((getvalue14+getvalue32+getvalue50)*getvalue61))*(arm+((arm2)*(getvalue70)));
			     M1516=      (((getvalue15+getvalue33+getvalue51)*getvalue62)+((getvalue16+getvalue34+getvalue52)*getvalue62))*(arm+((arm2)*(getvalue71)));
			     M1718=      (((getvalue17+getvalue35+getvalue53)*getvalue63)+((getvalue18+getvalue36+getvalue54)*getvalue63))*(Nosearm+(NosearmE*getvalue72));
			     
			      System.out.println(" ");         
			      System.out.println(M12);
				  System.out.println(M34);
				  System.out.println(M56);
				  System.out.println(M1314);
				  System.out.println(M1516);
				  System.out.println(M1718);
			 
			 SelectedM=       ((M12+M1314)/2)+((M34+M1516)/2)+((M56+M1718)/2);
			 MAC =(((SelectedM/SelectedW)-DBA)*100)/MACL;
			 try 
			 {
				 MAClimit = Math.abs(MAC - Double.parseDouble(previousMACMAC));
			 }
			   catch(Exception e) 
			 {
			 
		     }
			 SelectedArm= SelectedM/SelectedW;
		  }
		  //&& Math.abs(W2-W3)<200
		  if(W23<=W12 && W23<=W13 ) 
		  {
			  Weightdifferencecheck = W23;
			  System.out.println("ESTEESWeightdifferencecheck 23");
			  System.out.println(Weightdifferencecheck);
			  System.out.println("ESTEESWeightdifferencecheck 23");
			  
			  SelectedW=  (( (((getvalue7 +getvalue25+getvalue43)*getvalue58)+((getvalue8 +getvalue26+getvalue44)*getvalue58)) + (((getvalue13+getvalue31+getvalue49)*getvalue61)+((getvalue14+getvalue32+getvalue50)*getvalue61)) )/2)
					     +(( (((getvalue9 +getvalue27+getvalue45)*getvalue59)+((getvalue10+getvalue28+getvalue46)*getvalue59)) + (((getvalue15+getvalue33+getvalue51)*getvalue62)+((getvalue16+getvalue34+getvalue52)*getvalue62)) )/2)
					     +(( (((getvalue11+getvalue29+getvalue47)*getvalue60)+((getvalue12+getvalue30+getvalue48)*getvalue60)) + (((getvalue17+getvalue35+getvalue53)*getvalue63)+((getvalue18+getvalue36+getvalue54)*getvalue63)) )/2);
			    System.out.println("this is the selectedW");
			    System.out.println(SelectedW);
			    System.out.println("this is the selectedW");
			  
			    try 
			    {
			    	Wlimit = (((Math.abs(SelectedW - Double.parseDouble(previousWW)))/MLW)*100);
			    }
			    catch(Exception e)
			    {
			   
				
			    }
			  
			  
			        M78=     (((getvalue7 +getvalue25+getvalue43)*getvalue58)+((getvalue8 +getvalue26+getvalue44)*getvalue58))*(arm+((arm2)*(getvalue67)));
		           M910=     (((getvalue9 +getvalue27+getvalue45)*getvalue59)+((getvalue10+getvalue28+getvalue46)*getvalue59))*(arm+((arm2)*(getvalue68)));
	    	      M1112=     (((getvalue11+getvalue29+getvalue47)*getvalue60)+((getvalue12+getvalue30+getvalue48)*getvalue60))*(Nosearm+(NosearmE*getvalue69));			 
			  
			      M1314=     (((getvalue13+getvalue31+getvalue49)*getvalue61)+((getvalue14+getvalue32+getvalue50)*getvalue61))*(arm+((arm2)*(getvalue70)));
			      M1516=     (((getvalue15+getvalue33+getvalue51)*getvalue62)+((getvalue16+getvalue34+getvalue52)*getvalue62))*(arm+((arm2)*(getvalue71)));
			      M1718=     (((getvalue17+getvalue35+getvalue53)*getvalue63)+((getvalue18+getvalue36+getvalue54)*getvalue63))*(Nosearm+(NosearmE*getvalue72));
			      System.out.println(" ");
			      System.out.printf("%.4f",(((getvalue7 +getvalue25+getvalue43)*getvalue58)+((getvalue8 +getvalue26+getvalue44)*getvalue58)));
			      System.out.println(" ");
			      System.out.printf("%.4f",getvalue67);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",((arm2)));
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm+((arm2)*(getvalue67))));
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm));
			      System.out.println(" ");
			      System.out.printf("%.4f",M78);
			      System.out.println();
				  System.out.printf("%.4f",M910);
				  System.out.println();
				  System.out.printf("%.4f",M1112);
				  System.out.println();
				  System.out.printf("%.4f",M1314);
				  System.out.println();
				  System.out.printf("%.4f",M1516);
				  System.out.println();
				  System.out.printf("%.4f",M1718);
			  
			  SelectedM=      ((M78+M1314)/2)+((M910+M1516)/2)+((M1112+M1718)/2);
				 MAC =(((SelectedM/SelectedW)-DBA)*100)/MACL;
				 try 
				 {
					 MAClimit = Math.abs(MAC - Double.parseDouble(previousMACMAC));
				 }
				   catch(Exception e) {
				 
			     }
				 
			SelectedArm= SelectedM/SelectedW;	 
		  }
		  
		  }
		  
		  
		 
		  if(SelectedMethod==1) 
		  {	 
			  
		  
		  
	  MWD1 =   (((getvalue2 +getvalue20+getvalue38)*getvalue55))
	         - (((getvalue4 +getvalue22+getvalue40)*getvalue56));	
	  
	  MWD2 =   (((getvalue8 +getvalue26+getvalue44)*getvalue58)) 
			 - (((getvalue10+getvalue28+getvalue46)*getvalue59)); 
	  
	  MWD3 =   (((getvalue14+getvalue32+getvalue50)*getvalue61)) 
			 - (((getvalue16+getvalue34+getvalue52)*getvalue62)); 
			  
		 
      W1 =  ((getvalue2 +getvalue20+getvalue38)*getvalue55)
           +((getvalue4 +getvalue22+getvalue40)*getvalue56)
           +((getvalue6 +getvalue24+getvalue42)*getvalue57);
		  
		  
	  W2 =	((getvalue8 +getvalue26+getvalue44)*getvalue58) 
		   +((getvalue10+getvalue28+getvalue46)*getvalue59) 
		   +((getvalue12+getvalue30+getvalue48)*getvalue60);
		  
		  
	  W3 =  ((getvalue14+getvalue32+getvalue50)*getvalue61) 
		   +((getvalue16+getvalue34+getvalue52)*getvalue62) 
		   +((getvalue18+getvalue36+getvalue54)*getvalue63);
		  
           W12=Math.abs(W1-W2);
		   W13=Math.abs(W1-W3);
		   W23=Math.abs(W2-W3);
		  
		  System.out.println(W1);
		  System.out.println(W2);
		  System.out.println(W3);
		  
		  if(W12<=W13 && W12<=W23) 
		  {
			  System.out.println("Weightdifferencecheck = W12");
			  Weightdifferencecheck = W12;
			  
			  SelectedW=  (( (((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue8 +getvalue26+getvalue44)*getvalue58)) )/2)
					     +(( (((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue10+getvalue28+getvalue46)*getvalue59)) )/2)
					     +(( (((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue12+getvalue30+getvalue48)*getvalue60)) )/2);
			  
			   TEST1 =  (( (((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue8 +getvalue26+getvalue44)*getvalue58)) )/2);
			    TEST2 = (( (((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue10+getvalue28+getvalue46)*getvalue59)) )/2);
			    TEST3 = (( (((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue12+getvalue30+getvalue48)*getvalue60)) )/2);
			    System.out.println(TEST1);
			    System.out.println(TEST2);
			    System.out.println(TEST3);
			    
			    try 
			    {
			    	Wlimit = (((Math.abs(SelectedW - Double.parseDouble(previousWW)))/MLW)*100);
			    	System.out.println("este es WL");
			    	System.out.println(Wlimit);
			    	System.out.println("este es WL");
			    }
			    catch(Exception e)
			    {
			   
				
			    }
			    System.out.println("shit");
			    System.out.println(previousWW);
			    System.out.println(SelectedW);
			    System.out.println("shit");
			  
			  
		  
			        M12=     (((getvalue2 +getvalue20+getvalue38)*getvalue55))*(arm+((arm2)*(getvalue64)));
			        M34=     (((getvalue4 +getvalue22+getvalue40)*getvalue56))*(arm+((arm2)*(getvalue65)));
			        M56=     (((getvalue6 +getvalue24+getvalue42)*getvalue57))*(Nosearm+(NosearmE*getvalue66));
			  
			       M78=      (((getvalue8 +getvalue26+getvalue44)*getvalue58))*(arm+((arm2)*(getvalue67)));
			      M910=      (((getvalue10+getvalue28+getvalue46)*getvalue59))*(arm+((arm2)*(getvalue68)));
			     M1112=      (((getvalue12+getvalue30+getvalue48)*getvalue60))*(Nosearm+(NosearmE*getvalue69));
			     
			      System.out.println(" ");
			      System.out.printf("%.4f",(((getvalue2+getvalue20+getvalue38)*getvalue55)));
			      System.out.println(" ");
			      System.out.printf("%.4f",getvalue64);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",((arm2)));
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm2)*(getvalue64));
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm));
			      System.out.println(" ");
			      System.out.printf("%.4f",M12);
			      System.out.println();
				  System.out.printf("%.4f",M34);
				  System.out.println();
				  System.out.printf("%.4f",M56);
				  System.out.println();
				  System.out.printf("%.4f",M78);
				  System.out.println();
				  System.out.printf("%.4f",M910);
				  System.out.println();
				  System.out.printf("%.4f",M1112);
			  
			 SelectedM=      ((M12+M78)/2)+((M34+M910)/2)+((M56+M1112)/2);
			 MAC =(((SelectedM/SelectedW)-DBA)*100)/MACL;
			 try 
			 {
				 MAClimit = Math.abs(MAC - Double.parseDouble(previousMACMAC));
			    	System.out.println("este es ML");
			    	System.out.println(MAClimit);
			    	System.out.println("este es ML");
			 }
			   catch(Exception e) 
			 {
			 
		     }
			 SelectedArm= SelectedM/SelectedW;
			 
		  }
		  
		  if(W13<=W12 && W13<=W23) 
		  {
			  System.out.println("Weightdifferencecheck = W13");
			  Weightdifferencecheck = W13;
			  SelectedW=  (( (((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue14+getvalue32+getvalue50)*getvalue61)) )/2)
					     +(( (((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue16+getvalue34+getvalue52)*getvalue62)) )/2)
					     +(( (((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue18+getvalue36+getvalue54)*getvalue63)) )/2);
		      
			    TEST1 =(( (((getvalue2+getvalue20+getvalue38)*getvalue55)) + (((getvalue14+getvalue32+getvalue50)*getvalue61)) )/2);
			    TEST2 =(( (((getvalue4+getvalue22+getvalue40)*getvalue56)) + (((getvalue16+getvalue34+getvalue52)*getvalue62)) )/2);
			    TEST3 =(( (((getvalue6+getvalue24+getvalue42)*getvalue57)) + (((getvalue18+getvalue36+getvalue54)*getvalue63)) )/2);
			    System.out.println(TEST1);
			    System.out.println(TEST2);
			    System.out.println(TEST3);
			    System.out.println("this is the selectedW");
			    System.out.println(SelectedW);
			    System.out.println("this is the selectedW");
			    try 
			    {
			    	Wlimit = (((Math.abs(SelectedW - Double.parseDouble(previousWW)))/MLW)*100);
			    }
			    catch(Exception e)
			    {
			   
				
			    }
			    		
			       M12=      (((getvalue2 +getvalue20+getvalue38)*getvalue55))*(arm+((arm2)*(getvalue64)));
			       M34=      (((getvalue4 +getvalue22+getvalue40)*getvalue56))*(arm+((arm2)*(getvalue65)));
			       M56=      (((getvalue6 +getvalue24+getvalue42)*getvalue57))*(Nosearm+(NosearmE*getvalue66));		  

			     M1314=      (((getvalue14+getvalue32+getvalue50)*getvalue61))*(arm+((arm2)*(getvalue70)));
			     M1516=      (((getvalue16+getvalue34+getvalue52)*getvalue62))*(arm+((arm2)*(getvalue71)));
			     M1718=      (((getvalue18+getvalue36+getvalue54)*getvalue63))*(Nosearm+(NosearmE*getvalue72));
			     
			      System.out.println(" ");         
			      System.out.println(M12);
				  System.out.println(M34);
				  System.out.println(M56);
				  System.out.println(M1314);
				  System.out.println(M1516);
				  System.out.println(M1718);
			 
			 SelectedM=       ((M12+M1314)/2)+((M34+M1516)/2)+((M56+M1718)/2);
			 MAC =(((SelectedM/SelectedW)-DBA)*100)/MACL;
			 try 
			 {
				 MAClimit = Math.abs(MAC - Double.parseDouble(previousMACMAC));
			 }
			   catch(Exception e) 
			 {
			 
		     }
			 SelectedArm= SelectedM/SelectedW;
		  }
		  
		  if(W23<=W12 && W23<=W13) 
		  {
			  System.out.println("Weightdifferencecheck = W23");
			  Weightdifferencecheck = W23;
			  SelectedW=  (( (((getvalue8 +getvalue26+getvalue44)*getvalue58)) + (((getvalue14+getvalue32+getvalue50)*getvalue61)) )/2)
					     +(( (((getvalue10+getvalue28+getvalue46)*getvalue59)) + (((getvalue16+getvalue34+getvalue52)*getvalue62)) )/2)
					     +(( (((getvalue12+getvalue30+getvalue48)*getvalue60)) + (((getvalue18+getvalue36+getvalue54)*getvalue63)) )/2);
		  
			  
			    try 
			    {
			    	Wlimit = (((Math.abs(SelectedW - Double.parseDouble(previousWW)))/MLW)*100);
			    }
			    catch(Exception e)
			    {
			   
				
			    }
			  
			  
			        M78=     (((getvalue8 +getvalue26+getvalue44)*getvalue58))*(arm+((arm2)*(getvalue67)));
		           M910=     (((getvalue10+getvalue28+getvalue46)*getvalue59))*(arm+((arm2)*(getvalue68)));
	    	      M1112=     (((getvalue12+getvalue30+getvalue48)*getvalue60))*(Nosearm+(NosearmE*getvalue69));			 
			  
			      M1314=     (((getvalue14+getvalue32+getvalue50)*getvalue61))*(arm+((arm2)*(getvalue70)));
			      M1516=     (((getvalue16+getvalue34+getvalue52)*getvalue62))*(arm+((arm2)*(getvalue71)));
			      M1718=     (((getvalue18+getvalue36+getvalue54)*getvalue63))*(Nosearm+(NosearmE*getvalue72));
			      System.out.println(" ");
			      System.out.printf("%.4f",(((getvalue8 +getvalue26+getvalue44)*getvalue58)));
			      System.out.println(" ");
			      System.out.printf("%.4f",getvalue67);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",((arm2)));
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm+((arm2)*(getvalue67))));
			      System.out.println(" ");
			      System.out.println(" ");
			      System.out.println(selectedAircraftarm);
			      System.out.println(" ");
			      System.out.printf("%.4f",(arm));
			      System.out.println(" ");
			      System.out.printf("%.4f",M78);
			      System.out.println();
				  System.out.printf("%.4f",M910);
				  System.out.println();
				  System.out.printf("%.4f",M1112);
				  System.out.println();
				  System.out.printf("%.4f",M1314);
				  System.out.println();
				  System.out.printf("%.4f",M1516);
				  System.out.println();
				  System.out.printf("%.4f",M1718);
			  
			  SelectedM=      ((M78+M1314)/2)+((M910+M1516)/2)+((M1112+M1718)/2);
				 MAC =(((SelectedM/SelectedW)-DBA)*100)/MACL;
				 try 
				 {
					 MAClimit = Math.abs(MAC - Double.parseDouble(previousMACMAC));
				 }
				   catch(Exception e) {
				 
			     }
				 
			SelectedArm= SelectedM/SelectedW;	 
		  }
		  
		  }			
		  
		  
		  
		  
		  

	   }

	  
	  
	  public void BEWredords() 
	  {
		  
		try 
		{
			f = new Scanner(new File("AirplanesBasicEmptyWeights.txt"));
		}catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null, "AirplanesBasicEmptyWeights file was not found");
		}
		String AircraftWeightRecord = (String) box.getSelectedItem();  
		while (f.hasNext()) 
		{
			
			String tail= f.next();
			if(AircraftWeightRecord.equals(tail)) 
			{
				  
				  previousWW = f.next();
				  System.out.println(previousWW);
				  previousMACMAC= f.next();
				  System.out.println(previousMACMAC);
				  
			}
		}
		  
		f.close();
		  
		
	  }

}
	
	





