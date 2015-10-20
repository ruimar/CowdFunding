import java.io.Serializable;

public class Pedido implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		int key;
		Object object;
		
		
		Pedido(int key, Object obj){
			
			this.key=key;
			this.object = obj;
			
		}
		
}