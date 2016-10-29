package kz.ogfox.serialization;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
	
	private static ArrayList<Profile> list = new ArrayList<Profile>();
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		list = (ArrayList<Profile>) deserData.deserData("data//data");
		System.out.println(list.size());
		long startTime = System.currentTimeMillis();
		/**/
		Profile pf = new Profile();
		pf.setId(JOptionPane.showInputDialog(null,"Input Id"));
		pf.setName(JOptionPane.showInputDialog(null,"Input Name"));
		pf.setAddress(JOptionPane.showInputDialog(null,"Input Addres"));
		pf.setExt_id(JOptionPane.showInputDialog(null,"INput ext_Id"));
		pf.setExt_name(JOptionPane.showInputDialog(null,"Input ext_Name"));
		pf.setExt_address(JOptionPane.showInputDialog(null,"Input ext_Address"));
		list.add(pf);
		for(Profile p: list)
		{
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAddress() + " "
								+ p.getExt_id() + " " + p.getExt_name() + " " + p.getExt_address());
		}
		serData.serData("data//data", list);
		/**/
		long endTime = System.currentTimeMillis();	
		System.out.println("Average time : " + (endTime - startTime) + "\n");
		System.out.println(list.size());
	}

}
 