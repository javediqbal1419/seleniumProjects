package datatype;

public class MyChar {

	char ch;
	public MyChar(char c) {
		// TODO Auto-generated constructor stub
	}
	public boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  )
			return true;
		
		return false;
	}
	public boolean  isConsonant(char ch) {
		if(ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u'  )
			return true;
		
		return false;
	}
	public boolean isDigit() {
		if(ch<=48 && ch <=57)
			return true;
		return false;
	}
//	public boolean isAlhphabet(char ch) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	

}
