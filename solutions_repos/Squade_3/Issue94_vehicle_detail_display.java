/*
 * CORRECTION NOTES
 * Buggy snippet: Fuel: "+brand
 * Corrected snippet: Fuel: "+fuel
 * Explanation: The fuel line must print the fuel field.
 * Buggy snippet: fuel=f+"!";
 * Corrected snippet: fuel=f;
 * Explanation: The constructor should preserve the supplied fuel value.
 */
public class Issue94_vehicle_detail_display { public static void main(String[] args) { Vehicle v=new Car("Tata","Electric"); v.display(); } static class Vehicle { String brand; Vehicle(String b) { brand=b; } void display() { System.out.println("Brand: "+brand); } } static class Car extends Vehicle { String fuel; Car(String b,String f) { super(b); fuel=f; } void display() { System.out.println("Brand: "+brand); System.out.println("Fuel: "+fuel); } } }
