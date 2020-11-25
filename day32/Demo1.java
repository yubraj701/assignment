package day32;

public class Demo1 {
	
	public static void main(String[]args) {
		String s1="Good Evening";
		System.out.println(s1);
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(5));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf('d'));
        System.out.println(s1.charAt(6));
        char[]ch=s1.toCharArray();
        System.out.println(ch[5]);
        System.out.println(s1.contains("n"));
        System.out.println(s1.contains("z"));
        System.out.println(s1.replace("Good", "Bad"));
        System.out.println(s1.replace("G", "M"));
        System.out.println(s1.concat("Hello"));
        System.out.println("Hello,".concat(s1));
        String s2=" hello yubraj bhandari ";
        System.out.println(s2.trim());
        byte []bb=s1.getBytes();
        System.out.println(bb);
        
        
} 
} 