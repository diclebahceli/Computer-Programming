import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * @author Dicle Bahçeli
 * since 01.06.2021
 */

abstract class BaseEntity {
	
	private int id;
	private Date created;
	public BaseEntity(int id) {
		this.id = id;
		created=new Date();
	}
	public int getId() {
		return id;
	}
	public Date getCreated() {
		return created;
	}
	
	
	
}


class User extends BaseEntity{

	private String username;
	private String email;
	public User(int id,String username,String email) {
		super(id);
		this.username=username;
		this.email=email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "User [email=" + email + ", username=" + username + "]";
	}
	
	
	
}



class Role extends BaseEntity{
	
	private String name;
	
	public Role(int id,String name) {
		super(id);
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return "Role [name=" + name + "]";
	}
	
}


interface IGenericRepository<T extends BaseEntity>{
	 void add(T element);
	 T get(int id);
	 void remove(int id);
	 void update(T element);
	 int count();
}




abstract class GenericRepository<T extends BaseEntity> implements
IGenericRepository<T>{
	Map<Integer,T> dataSource =new HashMap<Integer,T>();
	

	
}





interface IUserRepository  extends IGenericRepository<User>{
	public User getByEmail(String email);
	
}



class UserRepository extends GenericRepository<User> 
implements IUserRepository{

	
	public void add(User element) {
		
		if(super.dataSource.containsKey(element.getId()))
			throw new RuntimeException();

		super.dataSource.put(element.getId(), element);
		
		
	}

	
	public User get(int id) {
		
		return (User) super.dataSource.get(id);
	}

	
	public void remove(int id) {
		super.dataSource.remove(id);
		
	}

	
	public void update(User element) {
		if(!super.dataSource.containsKey(element.getId()))
			throw new RuntimeException();
		super.dataSource.replace(element.getId(), element);
	}

	
	public int count() {
		
		return super.dataSource.size();
	}

	
	
	public User getByEmail(String email) {
		User us=null;
		for(Map.Entry<Integer, User> pairEntry:super.dataSource.entrySet()) {
			if(pairEntry.getValue().getEmail()== email)
				us=pairEntry.getValue();
		}
		
		return us;
	}


	
	
}



interface IRoleRepository extends IGenericRepository<Role>{
	
	 Role getByRoleName(String name);
	
}





class RoleRepository extends GenericRepository<Role> implements 
IRoleRepository{

	
	public void add(Role element) {
		if(super.dataSource.containsKey(element.getId()))
			throw new RuntimeException();

		super.dataSource.put(element.getId(), element);
	}

	
	public Role get(int id) {
		return (Role) super.dataSource.get(id);
	}

	
	public void remove(int id) {
		super.dataSource.remove(id);
		
	}

	
	public void update(Role element) {
		if(!super.dataSource.containsKey(element.getId()))
			throw new RuntimeException();
		super.dataSource.replace(element.getId(), element);
		
	}

	
	public int count() {
		return super.dataSource.size();
	}

	
	
	public Role getByRoleName(String name) {
		Role us=null;
		for(Map.Entry<Integer, Role> pairEntry:super.dataSource.entrySet()) {
			if(pairEntry.getValue().getName()== name)
				us=pairEntry.getValue();
		}
		if(us==null)
			throw new RuntimeException();
		return us;
	}
	
}




public class Lab11_20190808024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
