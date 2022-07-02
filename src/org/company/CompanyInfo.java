package org.company;

public class CompanyInfo {
private void companyShortname(String name) {
	System.out.println("short form is "+  name);
	}
private void companyFullname(String name) {
System.out.println("full form is " +  name);

}
	public static void main(String[] args) {
		CompanyInfo c=new CompanyInfo();
		c.companyShortname("tcs");
		c.companyFullname("tata consultancy");
		
		
	}


}
