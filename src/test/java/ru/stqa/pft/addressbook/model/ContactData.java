package ru.stqa.pft.addressbook.model;

// This is a class which contains information about the contact
public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String title;
  private final String company_name;
  private final String first_address;
  private final String homephone;
  private final String email;
  private final String website;
  private final String birth_year;
  //public String getGroup;
  private String group;

  public ContactData(String firstname, String lastname, String title, String company_name, String first_address, String homephone, String email, String website, String birth_year, String group) { /*Делаем поле в классе который хранит информацию о контакте*/
    this.firstname = firstname;
    this.lastname = lastname;
    this.title = title;
    this.company_name = company_name;
    this.first_address = first_address;
    this.homephone = homephone;
    this.email = email;
    this.website = website;
    this.birth_year = birth_year;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany_name() {
    return company_name;
  }

  public String getFirst_address() {
    return first_address;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getEmail() {
    return email;
  }

  public String getWebsite() {
    return website;
  }

  public String getBirth_year() {
    return birth_year;
  }

  public String getGroup() { /*Делаем для этого поля метод Getter который позволяет значение поля получить */
    return group;
  }
}
