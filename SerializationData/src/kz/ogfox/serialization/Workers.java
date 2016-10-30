package kz.ogfox.serialization;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Workers {
	private static ArrayList<Profile> list = new ArrayList<Profile>();
	
	@SuppressWarnings("unchecked")
	public static void Workers()
	{
		long startTime = System.currentTimeMillis();
		list = (ArrayList<Profile>) deserData.deserData("data//data");
		System.out.println("List size before serialization: " + list.size());
		long endTime = System.currentTimeMillis();
		System.out.println("Average time deserData: " + (endTime - startTime) + "ms" + "\n");
		
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
		/**/
		long startTime1 = System.currentTimeMillis();
		serData.serData("data//data", list);
		long endTime1 = System.currentTimeMillis();
		System.out.println("Average time serData: " + (endTime1 - startTime1) + "ms" + "\n");
		System.out.println("List size : " + list.size());
	}
	
	
}
