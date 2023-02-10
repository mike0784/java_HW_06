import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
    //public HashMap<Integer, Laptop> array = new HashMap<>();
    public static List<Laptop> array = new ArrayList<>();
    public static void main(String[] args)
    {
        initListNotebooks();
        print(array);
        Map<String, String> paramsFilter = new HashMap<>();
        paramsFilter.put("OS", "Windows 10");
        paramsFilter.put("RAM", "4096");
        paramsFilter.put("processor", "Intel Raptor Lake");

        System.out.println("После фильтрации");
        List<Laptop> result = new ArrayList<>(filter(paramsFilter, array));
        print(result);
    }

    public static void initListNotebooks(){
        array.add(new Laptop("AMD Ryzen 7 5800X3D", 1024, 3, 540, 0));
        array.add(new Laptop("AMD Ryzen 7000", 4096, 3, 1000, 3));
        array.add(new Laptop("Intel Raptor Lake", 8192, 3, 200, 2));
        array.add(new Laptop("AMD Ryzen 6000", 2048, 3, 500, 1));
    }

    public static List<Laptop> filter(Map<String, String> params, List<Laptop> notebooks){
        List<Laptop> result = new ArrayList<>();
        for(int i = 0; i < notebooks.size(); i++)
        {
            for(Map.Entry<String, String> entry: params.entrySet())
            {
                if(entry.getKey() == "OS" && entry.getValue() == notebooks.get(i).getTypeOS())
                {
                    result.add(notebooks.get(i));
                    continue;
                }
                if(entry.getKey() == "processor" && entry.getValue() == notebooks.get(i).processor)
                {
                    result.add(notebooks.get(i));
                    continue;
                }
                if(entry.getKey() == "RAM" && Integer.parseInt(entry.getValue()) == notebooks.get(i).RAM)
                {
                    result.add(notebooks.get(i));
                    continue;
                }
            }
        }
        return result;
    }

    public static void print(List<Laptop> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println("Ноутбук " + Integer.toString(i) + ":");
            System.out.println("\t\tПроцессор: " + list.get(i).processor);
            System.out.println("\t\tТип памяти ОЗУ: " + list.get(i).getTypeRAM());
            System.out.println("\t\tОбъем ОЗУ: " + Integer.toString(list.get(i).RAM) + " Гб");
            System.out.println("\t\tОбъём HDD: " + Integer.toString(list.get(i).ROM) + " Гб");
            System.out.println("\t\tОперационная система: " + list.get(i).getTypeOS());
            System.out.println();
        }
    }
}
