
public class BinaryReversalApp {

	public static void main(String[] args) {
		System.out.println(reverseBinary(47));
	}
	
	private static Integer reverseBinary(Integer input) {
		String paddedInput = String.format("%8s", Integer.toBinaryString(input)).replace(" ", "0");
		return Integer.parseInt(reverse(paddedInput), 2);
	}

	private static String reverse(String input) {
		byte[] strAsByteArray = input.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		return new String(result);
	}

}
