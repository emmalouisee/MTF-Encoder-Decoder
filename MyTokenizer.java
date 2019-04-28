import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class MyTokenizer
{
    //declaring a lists to store all the word tokens in a file
    private ArrayList<String>  wordList = new ArrayList<String>();

    //declare a string to store the filename 
    private String filename_;
    //declare an int to keep track on which word we are upto in the list
    private int wordCount = -1;
    
    public MyTokenizer (String filename)
    {
	//store the give filename in the filename variable
	filename_ = filename;

	try
	{
	     //create a buffered reader to read in the given file
	     BufferedReader reader = new BufferedReader(new FileReader(filename));
	     //declare a string to hold a line from the file
	     String line = reader.readLine();
	     //store the delimiters that will split the line
	     String wordDelimiters = ".,;:!?'#&\"\t\n ";

	     //while a line has been read
	     while(line != null)
	     {
		  //create a string tokenizer that splits the line into word tokens
		  StringTokenizer wordTokens = new StringTokenizer(line, wordDelimiters);

		  //while there are tokens in the string tokenizer
		  while(wordTokens.hasMoreTokens())
		  {
		     //add the token to the list
		     wordList.add(wordTokens.nextToken());
		  }
		  //read the next line in the file
		  line = reader.readLine();
	      }
	}
	catch(Exception ex)
	{
	    //print error message
	    System.out.println(ex);
	}
    }

    //method that returns the next word in the list
    public String nextWord()
    {
	//increse the index of the word we're upyo
	wordCount++;

	//if the index is in range
	if(wordCount < wordList.size())
	{
	    //return the word at that index in the list
	    return wordList.get(wordCount);
	}
	else
	{
	    return null;
	}	
    }
}
