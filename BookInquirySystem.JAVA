import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 

public class BookInquirySystem { 

    public static void main(String[] args) { 
    } 
} 
**/
* IT245 Data Structures Project
* Book Inquiry System implemented with two different data structures:
* 1) ArrayList with linear search
* 2) Binary Search Tree (BST)
/*
/** Searches an ArrayList sequentially. */ 
public static String solutionUsingArrayList(List<String> books, String targetTitle) { 
ArrayList<String> catalog = new ArrayList<>(books); 
for (String title : catalog) { 
if (title.equalsIgnoreCase(targetTitle)) { 
return title; 
}
}
return null; 
}
/** Node used by the Binary Search Tree. */ 
private static class BookNode {
    String title;
    BookNode left;
    BookNode right;

    BookNode(String title) {
        this.title = title;
    } 
}

/** Minimal Binary Search Tree for book titles. */ 
    private static class BookBST { 
        private BookNode root; 
    } 
