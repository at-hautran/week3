package week3;

public class Person {
  String name;
  int year;
  String address;
  private String career;

  public Person() {
    
  }
  public Person(String name, int year, String address, String career) {
    this.name = name;
    this.year = year;
    this.address = address;
    this.career = career;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  public double getSalary() {
    return 0;
  }
  public String getCareer(){
    return career;
  }
  
  public void setCareer(String career) {
    this.career = career;
  }
  public void printInfor() {
  }


}
