package fcu.iecs.oop.password;

public class PasswordEncorder {
	public void Passwordencorder(String str){
		str=str.replace('a','4');
		str=str.replace('A','4');
		str=str.replace('e','3');
		str=str.replace('E','3');
		str=str.replace('i','1');
		str=str.replace('I','1');
		str=str.replace('o','0');
		str=str.replace('O','0');
		str=str.replace('t','7');
		str=str.replace('T','7');
		System.out.println(str);
		
	}
}
