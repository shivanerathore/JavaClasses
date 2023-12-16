package homework;

public class removeDuplicates {
	
	public static void removeDuplicates(Character[] in) {
		if (in == null || in.length < 2) {
			return;
		}
	int array = 0;
	
	for(int s = 0; s < in.length; s++) {
		boolean duplicate = false;
		
		for (int j = 0; j < s; j++) {
			if (in[j] == in[s]) {
				duplicate = true;
				break;
			}
		}
		
		if (duplicate) {
			continue;
		}
		
		in[array] = in[s];
		array++;
	}
	
}
}