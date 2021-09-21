package object_Class_Explation;


//Java program to illustrate
//working of toString() method


public class Best_Friend1 {
	String name;
    int age;
    String college;
    String course;
    String address;
    Best_Friend1
    (String name, int age, String college, String course, String address)
    {
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }
public String toString()
    {
        return name + " " + age + " " + college + " " + course + " " + address;
    }
public static void main(String[] args)
    {
        Best_Friend1 b = 
        new Best_Friend1("Gulpreet Kaur", 21, "BIT MESRA", "B.E.", " Radha Krishnan ");
        System.out.println(b);
        System.out.println(b.toString());
    }

}


/*
 
		Output: 
		  
		Gulpreet Kaur 21 BIT MESRA M.TECH Kiriburu
		Gulpreet Kaur 21 BIT MESRA M.TECH Kiriburu
		
		NOTE:
		In all wrapper classes, all collection classes, String class, StringBuffer, StringBuilder classes
		toString() method is overriden for meaningful String representation. 
		Hence, it is highly recommended to override toString() method in our class also.
		
 */