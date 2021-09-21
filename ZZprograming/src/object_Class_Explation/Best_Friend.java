package object_Class_Explation;


/*Every class in java is child of Object class either directly or indirectly.
  Object class contains toString() method.
  We can use toString() method to get string representation of an object. 
  Whenever we try to print the Object reference then internally toString() method is invoked. 
  If we did not define toString() method in your class then Object class toString() method is invoked
  otherwise our implemented/Overridden toString() method will be called. */

/*
		Syntax of Object class toString() method:
		
		public String toString()
		{
		      return getClass().getName()+"@"+Integer.toHexString(hashCode());
		}
*/

//Java program to illustrate
//working of toString() method
public class Best_Friend {
	
	String name;
    int age;
    String college;
    String course;
    String address;
    
    Best_Friend					//Constructor
    (String name, int age, String college, String course, String address)
    {
        this.name = name;
        this.age = age;
        this.college = college;
        this.course = course;
        this.address = address;
    }
	
	public static void main(String[] args) {
		Best_Friend b =  new Best_Friend("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");
		        System.out.println(b);
		        System.out.println(b.toString());

	}

}

/*
		Output:
		
		Best_Friend@232204a1
		Best_Friend@232204a1
		Explanation:
		In the above program, we create an Object of Best_Friend class and provide all the information of a friend. 
		But when we try to print the Object, then we are getting some output
		which is in the form of classname@HashCode_in_Hexadeciaml_form. 
		If we want the proper information about Best_friend object, 
		then we have to override toString() method of Object class in our Best_Friend class.
 */
