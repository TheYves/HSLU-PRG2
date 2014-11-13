package ch.hslu.prg2.sw7.addressbook;

import java.util.regex.Pattern;

public class AddressEntry {

    private String givenName, familyName;
    private String zipCode;
    private String residence;
    private String phoneNumber;
    private String eMailAddress;

    public AddressEntry() {

    }

    public AddressEntry(String givenName, String familyName,
            String zipCode, String residence,
            String phoneNumber, String eMailAddress) throws InvalidEmailException {
		setGivenName(givenName);
		setFamilyName(familyName);
		setZipCode(zipCode);
		setResidence(residence);
		setPhoneNumber(phoneNumber);
		setEmailAddress(eMailAddress);
    }

    public void setGivenName(String givenName) throws IllegalArgumentException {
		if(givenName == null || givenName.length() > 20 || containsNumbers(givenName)) {
			throw new IllegalArgumentException("Invalid name");
		}
		this.givenName = givenName;
    }

    public void setFamilyName(String familyName) throws IllegalArgumentException {
		if(familyName == null) {
			throw new IllegalArgumentException("Invalid family name");
		}
		this.familyName = familyName;
    }

    public void setZipCode(String zipCode) throws IllegalArgumentException {
		if(zipCode == null || zipCode.length() != 4 || !isNumber(zipCode)) {
			throw new IllegalArgumentException(zipCode + " is not a Swiss PLZ");
		}
		this.zipCode = zipCode;
    }

    public void setResidence(String residence) {
		this.residence = residence;
    }

    public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String eMailAdresse) throws InvalidEmailException {
		if(eMailAdresse == null || !isEmailAddress(eMailAdresse)) {
			throw new InvalidEmailException(eMailAdresse + " is not a valid email address");
		}
        this.eMailAddress = eMailAdresse;
    }

	private boolean containsNumbers(String s){
		Pattern p = Pattern.compile(".*\\d.*");
		return p.matcher(s).find();
	}

	private boolean isNumber(String s){
		Pattern p = Pattern.compile("[^\\d]");
		return !p.matcher(s).find();
	}

	private boolean isEmailAddress(String s){
		Pattern p = Pattern.compile(".+@.+\\..+");
		return p.matcher(s).find();
	}
}
