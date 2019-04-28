class MTFdecoder
{
    public static void main(String [] args)
    {
	//if more than one file name is written
	if(args.length != 1)
	{
	    //display an error
	    System.err.println("Usage:    java Decoder <filename>");
	    return;
	}

	try
	{
	    //create a tokenizer
	    MyTokenizer tokenizer = new MyTokenizer(args[0]);
	    //create a LinkedList
	    LinkedList wordList = new LinkedList();

	    //create a variable that stores the word currently read from the file
	    String word = tokenizer.nextWord();

	    //while there is a word being read
	    while(word != null)
	    {
		//if the word is equal to the string 0
		if(word.equals("0"))
		{
		    //read the next word in the file
		    word = tokenizer.nextWord();
		    //add the word to the LinkedList
		    wordList.Add(word);
		}
		else
		{
		    //convert the word read into an integer(it will be a number)
		    int index = Integer.parseInt(word);
		    //get the word in the LinkedList at that integer
		    word = wordList.GetWord(index);
		    //move that word from its place in the LinkedList to the "top"
		    //of the LinkedList
		    wordList.Move(word);
		}

		//display the word
		System.out.println(word);
		//read the next word in the file
		word = tokenizer.nextWord();		
	    }	    
	}
	catch(Exception ex)
	{
	    //display error message
	    System.out.println(ex);
	}
    }
    
}
