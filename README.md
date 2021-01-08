# Project 3 - CS 150:  Book Indexing

## Intro
The purpose of this project is to create a program that will return the index for contents of a book (in .txt format). The project utilizes HashMap, TreeMap and ArrayList to create these indexes. The project also includes a theoretical analysis of the running time creation of the index and printing of the index using each of the three data structures. Experiments are run using different input sizes. These come from .txt files of books found on Project Gutenberg. 

## Input Specification
Books are stored as .txt files, in the /Books directory (named numerically):
-	The Works of Edgar Allan Poe, Edgar Allan Poe, 4404 words
-	Macbeth, William Shakespeare, 24755 words
-	Metamorphosis, Franz Kafka, 25839 words
-	Strange Case of Dr Jekyll and Mr Hyde, Robert Louis Stevenson, 28873 words
-	The Call of The Wild, Jack London, 36232 words
-	The Powerful Wizard of Oz, Frank Baum, 45141 words
-	The Jungle Book, Ruyard Kipling, 57541 words
-	The War of the Worlds, H.G Wells, 65608 words
-	The Adventures of Tom Sawyer, Charles Dickens, 81091 words
-	The Picture of Dorian Gray, Oscar Wilde, 86303 words
-	Wuthering Heights, Emily Bronte, 126071 words
-	The Tale of Two Cities, Charles Dickens, 147375 words
-	Jane Eyre, Charlotte Bronte, 199884 words
-	Little Women, Louisa May Alcott, 201645 words
-	The Brothers Karamazov, Fyodor Dostoevsky, 375107 words

## Results
![Creation and Insertion Time](project31.PNG?raw=true "Creation Time")
![Print Time](project32.PNG?raw=true "Print Time")

As hypothesized, an index of words from a text file is most efficiently created by using HashMap. However, when it comes to returning in alphabetical order, TreeMap is more efficient than HashMap, and ListMap might be more efficient than TreeMap. However, the running time is also affected by the number of non-dictionary words in the text.
