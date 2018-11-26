/**
 * 
 */
package core;
/**
 * @author Albert Ferguson
 *
 */
@SuppressWarnings("unused")
public class User {

	/**
	 * @param <School> The school or university
	 * @param <BeginDate> Start year
	 * @param <EndDate> End year
	 */
	private static class SchoolHist<School, BeginDate, EndDate> {
		
		private School _School;
		private BeginDate _BeginDate;
		private EndDate _EndDate;
			
		public SchoolHist(School _School, BeginDate _BeginDate, EndDate _EndDate) {
			this._School = _School;
			this._BeginDate = _BeginDate;
			this._EndDate = _EndDate;
		}
	}
	
	/**
	 * @param <Schools> School array
	 * @param <Info> Biography
	 */
	private static class BioInfo<Schools, Info> {
		private Schools _schools;
		private Info _info;
		
		public BioInfo(Schools _schools, Info _info) {
			this._schools = _schools;
			this._info = _info;
		}
		
		public Schools getSchools() { return _schools; }
		public Info getInfo() { return _info; }
		public void setSchools(Schools _schools) { this._schools = _schools; }
		public void setInfo(Info _info) { this._info = _info;}
	}
	
	/**
	 * @param <Mobile> Integer Mobile Contact
	 * @param <Email> String email address
	 * @param <Phone> Integer contact or other number
	 */
	private static class ContactInfo<Mobile, Email, Phone> {
		private Mobile _mobile;
		private Email _email;
		private Phone _phone;
		
		public ContactInfo(Mobile _mobile, Email _email, Phone _phone) {
			this._mobile = _mobile;
			this._email = _email;
			this._phone = _phone;
		}
		public Mobile getMobile() { return _mobile; }
		public Email getEmail() { return _email; }
		public Phone getPhone() { return _phone; }
		public void setMobile(Mobile _mobile) { this._mobile = _mobile;}
		public void setEmail(Email _email) { this._email = _email;}
		public void setPhone(Phone _phone) { this._phone = _phone;}
	}
	
	private Integer Mobile, ContactPhone;
	private String Email, UsrName;
	private final String DOB;
	private double ID;
	private byte[] DaysFree;
	private SchoolHist<String, Integer, Integer> _schoolHist; //school history
	private BioInfo<Object[], String> _bio; //Array of SchoolHist values
	private ContactInfo<Integer, String, Integer> _contact;
	//INSERT HERE WHEN RESUME CLASS COMPLETE:private Resume resume;
	
	public User(String UsrName, String Email, String DOB, String Bio, String[] Schools,
				int Mobile, int ContactPhone, int[] Days, boolean All) {
		
		ID = Math.random(); //test implementer for User ID
		this.UsrName = UsrName;
		this.Email = Email;
		
		boolean Empty = DOB.isEmpty();
		if(Empty == false) {
			this.DOB = DOB;
		} else {
			throw new IllegalArgumentException("Date of birth cannot change!");
		}
		
		setContactInfo(Mobile, ContactPhone, Email);
		setBioInfo(Schools, Bio);
		if(Days.length > 7) {
			throw new IllegalArgumentException("Array cannot be more than total days in a week!");
		} else {
			setDaysFree(WorkDays(Days, All));
			}
		}

	public String getUser() { return UsrName; }
	public double getID() { return ID; }
	public String getBirth() { return DOB; }
	public ContactInfo<Integer, String, Integer> getContact() { return _contact; }
	public BioInfo<Object[], String> getBio() { return _bio; }
	
	public void setContactInfo(Integer Mobile, Integer ContactPhone, String Email) { 
		_contact.setMobile(Mobile);
		_contact.setPhone(ContactPhone);
		_contact.setEmail(Email);
	}
	
	public void setBioInfo(String[] Schools, String Bio) {
		
		int Start = 0, End = 0;
		int k = Schools.length;
		Object[] Hist = new Object[k];
		for (int n = 0; n <= k; n++) {
			SchoolHist<String, Integer, Integer> _schoolHist = new SchoolHist<String, Integer, Integer>(Schools[n], Start, End);
			Hist[n] = _schoolHist;
		}
		BioInfo<Object[], String> _Bio = new BioInfo<Object[], String>(Hist, Bio);
		_Bio = _bio; 
	}
	
	public void setDaysFree(byte[] DaysFree) { this.DaysFree = DaysFree; }
	
	/**
	 * 
	 * @param Days Array of all days free
	 * @param All Optional param.
	 * @return 0 for success
	 */
	private byte[] WorkDays(int[] Days, boolean All) {
		byte[] DayTracker = new byte[] { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
		if(All == false) 
		{
			for (int n : Days) { 
				DayTracker[n] = 1;
			} setDaysFree(DayTracker);
			return DayTracker;
		} else {
			for (int n : DayTracker) {
				DayTracker[n] = 1;
			} setDaysFree(DayTracker);
			return DayTracker;
		}
	}
}