
public class JavaTest {

	
	public static void main(String args[]) {
		int[]a = new int[10];
		for (int i=0; i<a.length; i++) {
			a[i] = i;
		}
		
	}
	
	public static int[] grow(int[] src, int size){
		int[] target = new int[src.length+size];
		System.arraycopy(src, 0, target, 0, src.length);
		return target;	
	}
}


/*	private boolean typeRight(e) {
	Type genType = getClass().getGenericSuperclass();   
	Type[] params = ((ParameterizedType) genType).getActualTypeArguments();   
	Type entityClass =  (Class)params[0];  
	if (elements[index].getClass().equals(entityClass))
		return true;
	throw new ClassCastException(); 
}*/
