import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileAndCheck
{
	public static String addressBook = "contactList";
	public static String contacts = "D:/workspace/HUBS_16_2_Dev_SVN/Test/src/contacts.txt";

//	public static String addContact() throws IOException
//	{
//	    Path contactsPath = Paths.get(addressBook, contacts);
//		List<String> people = Files.readAllLines(contactsPath);
//
//		System.out.println("Add a new contact");
//		System.out.println("Enter Contacts Name");
//		String nameInput = in.nextLine();
//		System.out.println("Enter Contacts Number");
//		String phoneNumInput =  in.nextLine();
//		String newContact = nameInput + " | " + phoneNumInput;
//
//		if (people.contains(newContact))
//		{
//			System.out.println("There's already a contact named "+nameInput+". Do you want to overwrite it? (Yes/No)");
//            String yesNoInput = in.nextLine();
//            if(yesNoInput.equalsIgnoreCase("yes") || yesNoInput.equalsIgnoreCase("y")){
//                Files.write(
//                  Paths.get(addressBook, contacts),
//                        newContact,
//                        StandardOpenOption.APPEND
//                );
//                continueMenu();
//            }
//            continueMenu();
//        }			
//
//
//		return nameInput;
//	}

	public static String addContact1() throws IOException
	{
		Path contactsPath = Paths.get(contacts);
		List<String> people = Files.readAllLines(contactsPath);

		System.out.println(people);
		System.out.println("Add a new contact");
		System.out.println("Enter Contacts Name");
		String nameInput = "Fred Flintstone";
		// in.nextLine();
		System.out.println("Enter Contacts Number");
		String phoneNumInput = "123-123-4444";// in.nextLine();
		String newContact = nameInput + " | " + phoneNumInput;

		if (people.contains(newContact))
		{
			System.out.println("There's already a contact named " + newContact);
		}

		return nameInput;
	}

	public static void main(String[] args) throws IOException
	{
		ReadFileAndCheck.addContact1();
	}
}
