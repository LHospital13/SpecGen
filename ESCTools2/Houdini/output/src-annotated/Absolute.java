public class Absolute {
/*@(houdini:defaultconstructor) */public Absolute(){}/* Explicating default constructor here */
	
	/*@(houdini:instance method) */final/* */
	/*@(houdini:parameter:instance method) requires num < 1; */
	/*@(houdini:parameter:instance method) requires num <= 1; */
	/*@(houdini:parameter:instance method) requires num == 1; */
	/*@(houdini:parameter:instance method) requires num != 1; */
	/*@(houdini:parameter:instance method) requires num >= 1; */
	/*@(houdini:parameter:instance method) requires num > 1; */
	/*@(houdini:parameter:instance method) requires num < 0; */
	/*@(houdini:parameter:instance method) requires num <= 0; */
	/*@(houdini:parameter:instance method) requires num == 0; */
	/*@(houdini:parameter:instance method) requires num != 0; */
	/*@(houdini:parameter:instance method) requires num >= 0; */
	/*@(houdini:parameter:instance method) requires num > 0; */
	/*@(houdini:parameter:instance method) requires num < -1; */
	/*@(houdini:parameter:instance method) requires num <= -1; */
	/*@(houdini:parameter:instance method) requires num == -1; */
	/*@(houdini:parameter:instance method) requires num != -1; */
	/*@(houdini:parameter:instance method) requires num >= -1; */
	/*@(houdini:parameter:instance method) requires num > -1; */
	/*@(houdini:instance method) ensures \result < num; */
	/*@(houdini:instance method) ensures \result <= num; */
	/*@(houdini:instance method) ensures \result == num; */
	/*@(houdini:instance method) ensures \result != num; */
	/*@(houdini:instance method) ensures \result >= num; */
	/*@(houdini:instance method) ensures \result > num; */
	/*@(houdini:instance method) ensures \result < 1; */
	/*@(houdini:instance method) ensures \result <= 1; */
	/*@(houdini:instance method) ensures \result == 1; */
	/*@(houdini:instance method) ensures \result != 1; */
	/*@(houdini:instance method) ensures \result >= 1; */
	/*@(houdini:instance method) ensures \result > 1; */
	/*@(houdini:instance method) ensures \result < 0; */
	/*@(houdini:instance method) ensures \result <= 0; */
	/*@(houdini:instance method) ensures \result == 0; */
	/*@(houdini:instance method) ensures \result != 0; */
	/*@(houdini:instance method) ensures \result >= 0; */
	/*@(houdini:instance method) ensures \result > 0; */
	/*@(houdini:instance method) ensures \result < -1; */
	/*@(houdini:instance method) ensures \result <= -1; */
	/*@(houdini:instance method) ensures \result == -1; */
	/*@(houdini:instance method) ensures \result != -1; */
	/*@(houdini:instance method) ensures \result >= -1; */
	/*@(houdini:instance method) ensures \result > -1; */
	/*@(houdini:instance method) requires false; */
	/*@(houdini:instance method) ensures num >= 0 ==> \result >= 0; */
	public  short Absolute(short num) {
		if (0 <= num)
			return num;
		else
			return (short)-num;	
	}

	
	/*@(houdini:instance method) */final/* */
	/*@(houdini:parameter:instance method) requires num < 1; */
	/*@(houdini:parameter:instance method) requires num <= 1; */
	/*@(houdini:parameter:instance method) requires num == 1; */
	/*@(houdini:parameter:instance method) requires num != 1; */
	/*@(houdini:parameter:instance method) requires num >= 1; */
	/*@(houdini:parameter:instance method) requires num > 1; */
	/*@(houdini:parameter:instance method) requires num < 0; */
	/*@(houdini:parameter:instance method) requires num <= 0; */
	/*@(houdini:parameter:instance method) requires num == 0; */
	/*@(houdini:parameter:instance method) requires num != 0; */
	/*@(houdini:parameter:instance method) requires num >= 0; */
	/*@(houdini:parameter:instance method) requires num > 0; */
	/*@(houdini:parameter:instance method) requires num < -1; */
	/*@(houdini:parameter:instance method) requires num <= -1; */
	/*@(houdini:parameter:instance method) requires num == -1; */
	/*@(houdini:parameter:instance method) requires num != -1; */
	/*@(houdini:parameter:instance method) requires num >= -1; */
	/*@(houdini:parameter:instance method) requires num > -1; */
	/*@(houdini:instance method) ensures \result < num; */
	/*@(houdini:instance method) ensures \result <= num; */
	/*@(houdini:instance method) ensures \result == num; */
	/*@(houdini:instance method) ensures \result != num; */
	/*@(houdini:instance method) ensures \result >= num; */
	/*@(houdini:instance method) ensures \result > num; */
	/*@(houdini:instance method) ensures \result < 1; */
	/*@(houdini:instance method) ensures \result <= 1; */
	/*@(houdini:instance method) ensures \result == 1; */
	/*@(houdini:instance method) ensures \result != 1; */
	/*@(houdini:instance method) ensures \result >= 1; */
	/*@(houdini:instance method) ensures \result > 1; */
	/*@(houdini:instance method) ensures \result < 0; */
	/*@(houdini:instance method) ensures \result <= 0; */
	/*@(houdini:instance method) ensures \result == 0; */
	/*@(houdini:instance method) ensures \result != 0; */
	/*@(houdini:instance method) ensures \result >= 0; */
	/*@(houdini:instance method) ensures \result > 0; */
	/*@(houdini:instance method) ensures \result < -1; */
	/*@(houdini:instance method) ensures \result <= -1; */
	/*@(houdini:instance method) ensures \result == -1; */
	/*@(houdini:instance method) ensures \result != -1; */
	/*@(houdini:instance method) ensures \result >= -1; */
	/*@(houdini:instance method) ensures \result > -1; */
	/*@(houdini:instance method) requires false; */
	/*@(houdini:instance method) ensures num >= 0 ==> \result >= 0; */
	public  int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}

	
	/*@(houdini:instance method) */final/* */
	/*@(houdini:parameter:instance method) requires num < 1; */
	/*@(houdini:parameter:instance method) requires num <= 1; */
	/*@(houdini:parameter:instance method) requires num == 1; */
	/*@(houdini:parameter:instance method) requires num != 1; */
	/*@(houdini:parameter:instance method) requires num >= 1; */
	/*@(houdini:parameter:instance method) requires num > 1; */
	/*@(houdini:parameter:instance method) requires num < 0; */
	/*@(houdini:parameter:instance method) requires num <= 0; */
	/*@(houdini:parameter:instance method) requires num == 0; */
	/*@(houdini:parameter:instance method) requires num != 0; */
	/*@(houdini:parameter:instance method) requires num >= 0; */
	/*@(houdini:parameter:instance method) requires num > 0; */
	/*@(houdini:parameter:instance method) requires num < -1; */
	/*@(houdini:parameter:instance method) requires num <= -1; */
	/*@(houdini:parameter:instance method) requires num == -1; */
	/*@(houdini:parameter:instance method) requires num != -1; */
	/*@(houdini:parameter:instance method) requires num >= -1; */
	/*@(houdini:parameter:instance method) requires num > -1; */
	/*@(houdini:instance method) ensures \result < num; */
	/*@(houdini:instance method) ensures \result <= num; */
	/*@(houdini:instance method) ensures \result == num; */
	/*@(houdini:instance method) ensures \result != num; */
	/*@(houdini:instance method) ensures \result >= num; */
	/*@(houdini:instance method) ensures \result > num; */
	/*@(houdini:instance method) ensures \result < 1; */
	/*@(houdini:instance method) ensures \result <= 1; */
	/*@(houdini:instance method) ensures \result == 1; */
	/*@(houdini:instance method) ensures \result != 1; */
	/*@(houdini:instance method) ensures \result >= 1; */
	/*@(houdini:instance method) ensures \result > 1; */
	/*@(houdini:instance method) ensures \result < 0; */
	/*@(houdini:instance method) ensures \result <= 0; */
	/*@(houdini:instance method) ensures \result == 0; */
	/*@(houdini:instance method) ensures \result != 0; */
	/*@(houdini:instance method) ensures \result >= 0; */
	/*@(houdini:instance method) ensures \result > 0; */
	/*@(houdini:instance method) ensures \result < -1; */
	/*@(houdini:instance method) ensures \result <= -1; */
	/*@(houdini:instance method) ensures \result == -1; */
	/*@(houdini:instance method) ensures \result != -1; */
	/*@(houdini:instance method) ensures \result >= -1; */
	/*@(houdini:instance method) ensures \result > -1; */
	/*@(houdini:instance method) requires false; */
	/*@(houdini:instance method) ensures num >= 0 ==> \result >= 0; */
	public  long Absolute(long num) {
		if (0 <= num)
			return num;
		else
			return -num;	
	}
}
