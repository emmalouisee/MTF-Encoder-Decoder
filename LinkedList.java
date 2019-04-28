public class LinkedList
{
    //Node class
    public class Node
    {
	//declare variables to store the "value" of the Node and which Node comes after it
	private String data;
	private Node next;
    }

    //create a Node that points to the first Node in the LinkedList and initialise it to null
    Node head = null;

    //method that adds a Node to the "top" of the LinkedList
    public void Add(String s)
    {
	//create a new Node
	Node newNode = new Node();
	//set it's "value" to the given string
	newNode.data = s;

	//if there's something in the list
	if(head != null)
        {
	    //make the new Node point to the first thing in the LinkedList
	    newNode.next = head;
	    //make head point to the new Node
            head = newNode;
	}
        else
	{
	    //make head point to the new Node
	    head = newNode;
	}	
    }

    //method that removes a Node from the LinkedList and puts it on the "top" of the LinkedList
    public void Move(String s)
    {
	//create a Node to store the current Node
	Node curr = new Node();
	//create a Node to temporarily store the removed Node
	Node tmp = new Node();

	//if there's something in the LinkedList
	if(head != null)
	{
	   //make curr point at the head
	   curr.next = head;
	   
	   //while there is something after the current Node
	   while(curr.next != null)
	   {
	       //if the "value" of the Node after the current
	       //Node is equal to the given value
	       if(curr.next.data.equals(s))
	       {
		  //make tmp point at the Node after the current Node
	          tmp = curr.next;
		  //make curr point to the Node after the one stored in tmp
	          curr.next = curr.next.next;
		  //add the removed node to the "top" of the LinikedList
	          Add(tmp.data);
	       }
	       else 
	       {
		  //make curr the next Node in the LinkedList
                  curr = curr.next;
	       }
	   }
	}	
    }

    //method to get the index of a word in the LinkedList
    public int GetIndex(String s)
    {
	//declare and initialise an index variable to 0
	int index = 0;
	//create a Node to store the current Node 
        Node curr = new Node();

	//if there's something in the LinkedList
	if(head != null)
        {
	    //make curr point the the head
	    curr.next = head;
	    //increase the index
            index++;

	    //while there is something after the current Node
	    while(curr.next != null)
	    {
		//if the "value" of the Node after the current
	        //Node is equal to the given value 
       	        if (curr.next.data.equals(s))
	        {
		    //return the index
		    return index;
		}
	        else
        	{
		    //make curr the next Node in the LinkedList
	            curr = curr.next;
		    //increase the index
	       	    index++; 
		}
	    }
	    //return 0 if the word is not in the LinkedList
	    return 0;
        }
	//return 0 if there's nothing in the LinkedList
        return index;
    }

    //method that returns the word at the given index in the LinkedList
    public String GetWord(int index)
    {
	//create a variable to keep track of which index we are at in the LinkedList
	int counter = 0;
	//create a Node to store the current Node
        Node curr = new Node();

	//if there's something in the LinkedList
	if(head != null)
        {
	    //make curr equal to the head
	    curr = head;
	    //increase the current index
            counter++;

	    //a loop that goes through the LinkedList and stops as soon as
	    //the given index is reached.
	    for(counter=1; counter < index; counter++)
		{
		    //if the end of the LinkedList is not next
		    if(curr.next != null)
		    {
			//make curr the next Node in the LinkedList
			curr = curr.next;
		    }
		    else
		    {
			return null;
		    }
		}
	    //return the "value" of the Node that was stopped on in the loop
	    return curr.data;	
	}
	//return null if there was nothing in the LinkedList
	return null;
    }
}

   
