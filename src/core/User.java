/**
 * 
 */
package core;
/**
 * @author iTzEinstein118Xx
 *
 */
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
			
		public School getSchool() { return _School; }
		public BeginDate getBeginDate() { return _BeginDate; }
		public EndDate getEndDate() { return _EndDate; }
		public void setSchool(School _School) { this._School = _School; }
		public void setBeginDate(BeginDate _BeginDate) { this._BeginDate = _BeginDate; }
		public void setEndDate(EndDate _EndDate) { this._EndDate = _EndDate; }
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
	@SuppressWarnings("unused")
	private Integer Mobile, ContactPhone;
	@SuppressWarnings("unused")
	private String Email, Username, Birth; 
	private double UserID;
	@SuppressWarnings("unused")
	private byte[] DaysFree;
	private SchoolHist<String, Integer, Integer> _schoolHist; //school history
	private BioInfo<Object[], String> _bio; //Array of SchoolHist values
	private ContactInfo<Integer, String, Integer> _contact;
	//INSERT HERE WHEN RESUME CLASS COMPLETE:public Resume resume;
	
	public User(String name, String dob, Integer ContactPhone, String Email) {
		Username = name;
		Birth = dob;
		UserID = Math.random(); //test implementer for User ID
		this.ContactPhone = ContactPhone;
		this.Email = Email;
	}
	
	public String getUser() { return Username; }
	public double getID() { return UserID; }
	public String getBirth() { return Birth; }
	public ContactInfo<Integer, String, Integer> getContact() { return _contact; }
	public BioInfo<Object[], String> getBio() { return _bio; }
	public SchoolHist<String, Integer, Integer> getSchoolHist() { return _schoolHist; }
	
	public void setMobile(Integer Mobile) { this.Mobile = Mobile; }
	public void setContactPhone(Integer ContactPhone) { this.ContactPhone = ContactPhone; }
	public void setEmail(String Email) { this.Email = Email; }
	public void setDaysFree(byte[] DaysFree) { this.DaysFree = DaysFree; }
	
	/**
	 * 
	 * @param Days Array of all days free
	 * @param All Optional param.
	 * @return 0 for success
	 */
	public int WorkDays(int[] Days, boolean All) {
		byte[] DayTracker = new byte[] { 0 , 0 , 0 , 0 , 0 , 0 , 0 };
		if(All == false) 
		{
			for (int n : Days) { 
				DayTracker[n] = 1;
			} setDaysFree(DayTracker);
			return 0;
		} else if (All == true) {
			for (int n : DayTracker) {
				DayTracker[n] = 1;
			} setDaysFree(DayTracker);
			return 0;
		} else return 1;
	}
}