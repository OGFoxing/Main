package kz.ogfox.serialization;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Workers {
	
	/*Workers*/
	public static ArrayList<Profile> list;
	/*end*/
	
	@SuppressWarnings("unchecked")
	public static void Workers()
	{
		list = new ArrayList<Profile>();
		long startTime = System.currentTimeMillis();
		
		list = (ArrayList<Profile>) deserData.deserData("data//data");
		System.out.println("List size before serialization: " + list.size());
		long endTime = System.currentTimeMillis();
		System.out.println("Average time deserData: " + (endTime - startTime) + "ms");
		System.out.println("====================");
		
		/*the addition of new data to data.ser*/
		
		Profile pf = new Profile();		
		pf.setId(JOptionPane.showInputDialog(null,"Input Id"));
		pf.setName(JOptionPane.showInputDialog(null,"Input Name"));
		pf.setAddress(JOptionPane.showInputDialog(null,"Input Addres"));
		pf.setExt_id(JOptionPane.showInputDialog(null,"INput ext_Id"));
		pf.setExt_name(JOptionPane.showInputDialog(null,"Input ext_Name"));
		pf.setExt_address(JOptionPane.showInputDialog(null,"Input ext_Address"));
		list.add(pf);
		
		
		/*print all deser data to console, not recomented with big data*/		
		
		for(Profile p: list) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getAddress() + " "
								+ p.getExt_id() + " " + p.getExt_name() + " " + p.getExt_address());
		}
		System.out.println("====================");
		
		/**/
		long startTime1 = System.currentTimeMillis();
		serData.serData("data//data", list);
		long endTime1 = System.currentTimeMillis();
		System.out.println("Average time serData: " + (endTime1 - startTime1) + "ms");
		System.out.println("List size : " + list.size());
		System.out.println("====================");
	}
	
	
}
