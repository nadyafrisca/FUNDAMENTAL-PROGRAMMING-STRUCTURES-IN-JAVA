public class ConvertDataType {
	static short methodOne(long l) {
		int i = (int) l;
		System.out.println("long ke int: " + i);
		return (short) i;
	}

	public static void main(String[] args) {
		double d = 10.25;
		System.out.println("double: " + d);
		float f = (float) d;
		System.out.println("double ke float: " + f);
		byte b = (byte) methodOne((long) f);
		System.out.println("int ke short ke byte: " + b);
		
	}

}
