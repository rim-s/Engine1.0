import java.util.*;

public class GameObject {
	
	private List<Component> components;
	
	public void GameObject(){
		components = new List<Component>();
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
