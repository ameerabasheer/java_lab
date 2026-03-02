import java.util.Scanner;
public class CPU {
double price;
public class Processor {
double cache;
String manufacturer;
double getCache() {
return cache;
}
}
static class RAM {
double clockSpeed;
String manufacturer;
double getClockSpeed() {
return clockSpeed;
}
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the cache of processor: ");
double cache = sc.nextDouble();
System.out.print("Enter the clock speed of RAM: ");
double clockSpeed = sc.nextDouble();
CPU cpu = new CPU();
CPU.Processor processor = cpu.new Processor();
CPU.RAM ram = new CPU.RAM();
processor.cache = cache;
ram.clockSpeed = clockSpeed;
cpu.price = (processor.getCache() * 1000) + (ram.getClockSpeed() * 10);
System.out.println("Processor Cache  : " + processor.getCache() + "");
System.out.println("RAM Clock Speed  : " + ram.getClockSpeed() + "");
System.out.println("Total CPU Price  : " + cpu.price);
}
}
