<?php
$doc = new DOMDocument();
$doc->load("book.xml");

$books = $doc->getElementsByTagName("books");

echo "<table border='1' style='border-collapse:collapse;'>";
echo "<tr><th>Book No</th><th>Book Name</th><th>Author Name</th><th>Price</th><th>Year</th></tr>";

foreach ($books as $book) {
    $bookNo = $book->getElementsByTagName("book_no")->item(0)->textContent;
    $bookName = $book->getElementsByTagName("book_name")->item(0)->textContent;
    $authorName = $book->getElementsByTagName("author_name")->item(0)->textContent;
    $price = $book->getElementsByTagName("price")->item(0)->textContent;
    $year = $book->getElementsByTagName("year")->item(0)->textContent;

    echo "<tr>";
    echo "<td>$bookNo</td>";
    echo "<td>$bookName</td>";
    echo "<td>$authorName</td>";
    echo "<td>$price</td>";
    echo "<td>$year</td>";
    echo "</tr>";
}

echo "</table>";
?>




<!--
->item(0): This part accesses the first item in the NodeList. NodeList objects are zero-indexed, so item(0) refers to the first 
            element in the list. If the NodeList is empty, or if there are no elements with the tag name "book_no" under the $book element, 
            item(0) will return null.

->textContent: This part retrieves the text content of the selected element. If the element contains text content, it returns that content as a string. 
                If the element has child elements or if it's empty, textContent will return an empty string.
-->
