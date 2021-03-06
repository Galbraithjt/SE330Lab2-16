package com.sb.se330;

/*
 * Created by Joshua on 2/16/16.
 */
public class SLList
{

    // Reference to first Link in list
    // The last Link added to the LinkList

    public SLLNode firstLink;

    SLList()
    {
        // Here to show the first Link always starts as null

        firstLink = null;
    }

    // Returns true if LinkList is empty

    public boolean isEmpty()
    {
        return(firstLink == null);
    }

    public void insertFirstLink(String nodeNumber)
    {
        SLLNode newLink = new SLLNode(nodeNumber);
        // Connects the firstLink field to the new Link

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public void display()
    {
        SLLNode theLink = firstLink;

        // Start at the reference stored in firstLink and
        // keep getting the references stored in next for
        // every Link until next returns null

        while(theLink != null)
        {
            theLink.display();

            System.out.println("Next Link: " + theLink.next);

            theLink = theLink.next;

            System.out.println();
        }
    }

    public SLLNode find(String nodeNumber)
    {
        SLLNode theLink = firstLink;

        if(!isEmpty())
        {
            while(theLink.nodeNumber != nodeNumber)
            {
                // Checks if at the end of the LinkList

                if(theLink.next == null)
                {
                    // Got to the end of the Links in LinkList
                    // without finding a match

                    return null;
                }

                else
                {
                    // Found a matching Link in the LinkList

                    theLink = theLink.next;
                }
            }
        }

        else
        {
            System.out.println("Empty LinkList");
        }

        return theLink;
    }

    public SLLNode removeLink(String nodeNumber)
    {

        SLLNode currentLink = firstLink;
        SLLNode previousLink = firstLink;

        // Keep searching as long as a match isn't made

        while(currentLink.nodeNumber != nodeNumber)
        {
            // Check if at the last Link in the LinkList

            if(currentLink.next == null)
            {
                // nodeNumber not found so leave the method

                return null;
            }

            else
            {
                // We checked here so let's look in the
                // next Link on the list

                previousLink = currentLink;

                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink)
        {
            // If you are here that means there was a match
            // in the reference stored in firstLink in the
            // LinkList so just assign next to firstLink

            firstLink = firstLink.next;
        }

        else
        {
            // If you are here there was a match in a Link other
            // than the firstLink. Assign the value of next for
            // the Link you want to delete to the Link that's
            // next previously pointed to the reference to remove

            System.out.println("FOUND A MATCH");
            System.out.println("currentLink: " + currentLink);
            System.out.println("firstLink: " + firstLink);

            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}
