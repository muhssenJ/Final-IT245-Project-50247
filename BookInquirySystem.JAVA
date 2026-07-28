import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 

/**
* IT245 Data Structures Project
* Book Inquiry System implemented with two different data structures:
* 1) ArrayList with linear search
* 2) Binary Search Tree (BST)
*/

public class BookInquirySystem { 


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
   
    void insert(String title) {
        root = insertRecursive(root, title);
    }
private BookNode insertRecursive(BookNode node, String title) { 
    if (node == null) { 
        return new BookNode(title); 
    }
    int comparison = title.compareToIgnoreCase(node.title); 
    if (comparison < 0) { 
        node.left = insertRecursive(node.left, title); 
    } else if (comparison > 0) { 
        node.right = insertRecursive(node.right, title); 
    }

    return node; 
}

String search(String targetTitle) {
    BookNode current = root;

    while (current != null) {
        int comparison = targetTitle.compareToIgnoreCase(current.title);
        if (comparison == 0) {
                return current.title;
        }        
        current = comparison < 0 ? current.left : current.right;
     }
    return null;
    }
}

    /** Builds a BST, then searches for the requested title. */ 
    public static String solutionUsingBST(List<String> books, String targetTitle) { 
        BookBST catalog = new BookBST(); 
        for (String title : books) { 
            catalog.insert(title); 
        } 
        return catalog.search(targetTitle); 
    }
