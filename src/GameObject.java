import java.util.*;

public class GameObject {
	
	List<Component> components;
	
	public void GameObject(){
		components = new ArrayList<Component>();
	}
	
	public void tick(){
	
		for (Component c : components) {
            c.tick();
        }
	}
	
	public void addComponent(Component c){
		components.add(c);
	}

}
