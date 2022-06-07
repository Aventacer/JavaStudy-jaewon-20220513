package j21_익명클래스;

import java.util.List;
import java.util.Collection;

public interface GrantedAuthority {
	public Collection<String> getRoles(List<String> roles);
	
}
