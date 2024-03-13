<!-- 6. Write a PHP script to display source code of a webpage. -->

<?php 
// Storing the elements of the webpage into an array 
$source_code = file('https://www.geeksforgeeks.org/'); 
  
// 1. traversing through each element of the array          2.printing their subsequent HTML entities 
foreach ($source_code as $line_number => $last_line) { 
    echo nl2br(htmlspecialchars($last_line) . "\n"); 
} 
?> 

<!-- file() : This function reads the file into an array where each element of the array represents a line from the file.-->
<!-- foreach ($source_code as $line_number => $last_line) :-
		This part of the code uses a foreach loop to traverse through each element of the $source_code array. In each iteration, it assigns the current element to the variable $last_line and the current line number to the variable $line_number. 
		
	 htmlspecialchars()  :- function is used to convert special characters in the HTML code to their respective HTML entities. This is done to prevent any potential security vulnerabilities, such as Cross-Site Scripting (XSS), by rendering HTML tags as plain text.

	nl2br()  :- function is used to insert HTML line breaks (<br>) before all newlines in the string. This ensures that the HTML formatting of the webpage is preserved when displaying it in the browser. -->
