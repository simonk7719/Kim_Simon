import java.util.*;
public class Toyota extends Car{
	public Toyota (String pos){
		String[] posV = pos.split(", ");
		this.move(Double.parseDouble(posV[0]),Double.parseDouble(posV[1]));
	}
}