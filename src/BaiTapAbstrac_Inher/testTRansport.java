package BaiTapAbstrac_Inher;

import javax.swing.text.TableView.TableRow;

public class testTRansport {
public static void main(String[] args) {
	HangSX hang1 = new HangSX("hang 1", "the USA");
	HangSX hang2 = new HangSX("hang 2", "Viet Nam");
	HangSX hang3 = new HangSX("hnag 3", "Korea");
	
	Maybay trp1 = new Maybay("May bay", hang2, "xang");
	Transport trp2 = new XeOto("O to", hang1, "xang");
	Transport trp3 = new XeDap("Xe dap", hang3);
	
	System.out.println("ten hang san xuat:");
	System.out.println("may bay: " + trp1.tenHangsanxuat());
	System.out.println("o to: " + trp2.tenHangsanxuat());
	System.out.println("xe dap: " + trp3.tenHangsanxuat());
	
	System.out.println("lay van toc:");
	System.out.println("van toc may bay: " + trp1.layVanToc());
	System.out.println("van toc o to : " + trp2.layVanToc());
	System.out.println("van toc xe may: " + trp3.layVanToc());
	
	System.out.println("Bat dau:");
	trp1.batDau();
	
	System.out.println("tang toc:");
	trp2.tangToc();
	
	System.out.println("Dung lai: ");
	trp3.dungLai();
	
	System.out.println("Cat canh: ");
	trp1.Catcanh();
	
	System.out.println("Ha canh: ");
	trp1.Hacanh();
}
}
