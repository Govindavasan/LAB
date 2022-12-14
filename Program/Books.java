/*
@Author: Govinda Vasan S
Date   : 08/09/2022
Title  : A class called Author (as shown in the class diagram) is designed to model a book's author. It contains:
         Three private instance variables: name (String), email (String), and gender (char of either 'm' or 'f');
         One constructor to initialize the name, email and gender with the given values;
         public Author (String name, String email, char gender) {......}
        (There is no default constructor for Author, as there are no defaults for name, email and gender.)
         public getters/setters: getName(), getEmail(), setEmail(), and getGender();
        (There are no setters for name and gender, as these attributes cannot be changed.)
         A toString() method that returns "Author[name=?,email=?,gender=?]", e.g., "Author[name=Tan Ah Teck,email=ahTeck@somewhere.com,gender=m]".
         1.Printing the name and email of the author from a Book instance. (
         Hint: aBook.getAuthor().getName(), aBook.getAuthor().getEmail()).
         2.Introduce new methods called getAuthorName(), getAuthorEmail(), getAuthorGender() 
         in the Book class to return the name, email and gender of the author of the book. 
*/

import java.io.*;

class Author
{
	 String name;
	 String email;
	 char gender;


Author(String a, String b, char g)
{
	this.name=a;
	this.email=b;
	this.gender=g;
}

public String getName()
{
	return name;
	
}

public String getEmail()
{
	return email;
}

public char getGender()
{
	return gender;
}

public void setEmail(String e)
{
	email = e;
}

public String toString()
{
return "Author --["+ "Name= "+ name+ " , gender = M , " + "Email = "+email+"]";
}

}

public class Books
{
	String c;
	String email;
	char gender;
	Author author;
	
Books(String c, Author M)
{
 this.c=c;
 this.author=M;

System.out.println(c);

} 

public String toString()
{
	String M= author.getName()+ author.getGender() + author.getEmail(); 
    return M;	
}


public static void main(String[]args)
{
	System.out.println();
	Author obj = new Author("GOVIND"," govindavasan20@gmail.com", 'M');
	Books obj1 = new Books("-----WELCOME TO THE BOOK OF WORLD------", obj);
	
	System.out.println();
	System.out.println("---------Author's Details------------");
	
	System.out.println();
	System.out.println(obj.toString());
	
	System.out.println();
	System.out.println("........Printing........");
	
	System.out.println();
	System.out.println(obj1.toString());
	
}
}
