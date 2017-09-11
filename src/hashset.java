import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by i-liuxiaofeng on 2017/8/3.
 */
public class hashset {
    public static void main(String[] args) {
        Set s = new HashSet();
     /*   s.add(4);
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(1);*/
     /*person p = new person("liu",12);
        System.out.println(p);*/
        /*Set s1 = new TreeSet();
        s1.addAll(s);
        System.out.println(s1);*/
        s.add(new person("shang",54l));
        s.add(new person("liu",12l));
        s.add(new person("li",2l));
        s.add(new person("ahang",65l));
        s.add(new person("zhang",23l));
        Set s1 = new TreeSet(new MyComparator());
        s1.addAll(s);
        System.out.println(s);
        System.out.println(s1);
        Long l = 10000l;
        System.out.println(l.intValue()+1);
    }
}
class person {
    String name;
    Long age;
    public person(String name, Long age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class MyComparator implements Comparator {

    /**
     * 比较的规则，由自己定义,这里是根据Person的score的属性进行比较的
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        person p1 = (person)o1;
        person p2 = (person)o2;
        Long l = p1.getAge() - p2.getAge();
        return (l.intValue());
    }
}