package models;

public class InsuredData {
    private final String insuredSurname;
    private final String insuredName;
    private final String insuredBirth;
    private final String surname;
    private final String name;
    private final String middlename;
    private final String birthDate;
    private final String passportSeries;
    private final String passportNumber;
    private final String issueDate;
    private final String issuePlace;
    private final String phone;
    private final String email;
    private final String emailValid;


    public InsuredData(String insuredSurname, String insuredName, String insuredBirth, String surname, String name, String middlename, String birthDate, String passportSeries, String passportNumber, String issueDate, String issuePlace, String phone, String email, String emailValid) {
        this.insuredSurname = insuredSurname;
        this.insuredName = insuredName;
        this.insuredBirth = insuredBirth;
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.birthDate = birthDate;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.issuePlace = issuePlace;
        this.phone = phone;
        this.email = email;
        this.emailValid = emailValid;
    }


    public String getInsuredSurname() {
        return insuredSurname;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public String getInsuredBirth() {
        return insuredBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPassportSeries() {
        return passportSeries;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getIssuePlace() {
        return issuePlace;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailValid() {
        return emailValid;
    }

}
