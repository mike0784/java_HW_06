import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Laptop {
    public String processor;    //Процессор
    public Integer RAM;         //Объём ОЗУ
    public Integer typeRAM;     //Тип ОЗУ
    public static List<String> arrayTypeRAM = Arrays.asList("DIMM", "DDR", "DDR2", "DDR3");   //Массив типов ОЗУ
    public Integer ROM;             //Объём ПЗУ
    public Integer OS;              //Тип операционной системы
    public static List<String> typeOS = Arrays.asList("Windows 7", "Windows 10", "Linux", "Debian");     //Массив типов операционных систем

    public Laptop(String proc, int RAM, int typeRam, int ROM, int OS)
    {
        this.processor = proc;
        this.RAM = RAM;
        this.typeRAM = typeRam;
        this.ROM = ROM;
        this.OS = OS;
    }
    public String getTypeRAM()
    {
        return this.arrayTypeRAM.get(this.typeRAM);
    }

    public String getTypeOS()
    {
        return this.typeOS.get(this.OS);
    }
}
