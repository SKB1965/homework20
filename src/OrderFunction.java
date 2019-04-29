import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OrderFunction {
    public static void main(String[] args) {

        List<string>names = Arrays.asList("Dog","Cat","Bird","Monkey","Donkey");

        "string value".Chars().mapToObj(X -> String.valueof((char));

        List<string> stringList = new ArrayList<string>();

        stringList.add("Dog");
        stringList.add("Cat");
        stringList.add("Bird");
        stringList.add("Monkey");
        stringList.add("Donkey");

        Stream<String> Stream = StringList.stream();
        Stream.forEach(Element ->{System.out.println(element);});

    }

    public List<String> getStringList() {

    List<String>StringList = new ArrayList<String>();
    StringList.add("Dog");
    StringList.add("Cat");
    StringList.add("Bird");
    StringList.add("Monkey");
    StringList.add("Donkey");

    Stream<String>stream = stringList.stream();
    long count = stream.flatMap((value)-> {
        String[] split = value.split("");
        return (stream<String>) Arrays.asList(split).stream();
    }
    .Count();
    System.out.println{"count = " + count);

    }
    }

    public List<String> getNamesWithD() {

    List<String>namesWithD = names.stream()
            .filter(name->name.startsWith("D");
            .collect(collectors.toList());

            return namesWithD;

            }

    public Int getSum() {

    List<Integer>values=Arraya.asList("3","3","4","6","6");
        Int sum=values.stream()
        .reduce(0,(i1,i2)->i1+i2);

        return sum;
        }
        )

