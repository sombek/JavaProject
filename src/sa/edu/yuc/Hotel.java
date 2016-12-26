package sa.edu.yuc;

public class Hotel {

	private LinkedList<Account> accounts = new LinkedListImpl<Account>();
	public static final String FILENAME = "myhotel.db";

	public Hotel() {
		load();
	}

	public void addGuest(Account acc) {
		accounts.add(acc);
	
	}

	public void removeGuestById(Account id) {
		accounts.removeById(id);
		save();
	}

	public void printId(Account id) {
		try {
			System.out.println(accounts.findById(id).data);
		} catch (Exception e) {
			System.out.println("Invalid Id\n");
		}

	}

	public void removeGuestByIndex(int index) {
		accounts.removeByIndex(index);
	}

	public void display() {
		System.out.println(accounts);
	}

	public boolean save() {
		try {
			Util.save(FILENAME, accounts);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean load() {
		try {
			accounts = (LinkedListImpl<Account>) Util.load(FILENAME);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
