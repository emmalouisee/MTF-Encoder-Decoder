class MTFencoder
{
    public static void main(String [] args)
    {
	//if more than one file name is written
	if(args.length != 1)
	{
	    //display an error
	    System.err.println("Usage:   java Encoder <filename>");
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
		//get the index of the word in the LinkedList
		int wordIndex = wordList.GetIndex(word);

		//if the word is not in the LinkedList
		if (wordIndex == 0)
		{
		    //display the word with a 0 infront of it
		    System.out.println(wordIndex + " " + word);
		    //add the word to the "top" of the LinkedList
		    wordList.Add(word);
		}
		//if the word is at the "top" of the LinkedList
	        else if (wordIndex == 1)
		{
		    //display the index of the word
		    System.out.println(wordIndex);
		}
		//if the index of the word is greater than 1
		else
	        {
		    //display the index of the word
		    System.out.println(wordIndex);
		    //move the word from its index in the LinkedList to the "top" of the LinkedList
		    wordList.Move(word);
		}
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
