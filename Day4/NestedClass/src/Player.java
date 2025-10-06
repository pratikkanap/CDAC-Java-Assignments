
public class Player {
	private int pid;
	private String name;
	private String Speciality;
	
	public Player() {
		super();
		pid =0;
		name = null;
		Speciality = null;
	}
	
	public Player(int pid, String name, String speciality) {
		super();
		this.pid = pid;
		this.name = name;
		Speciality = speciality;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
}
